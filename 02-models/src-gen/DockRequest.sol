//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract DockRequest {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.MessageContent_onlyXPath_String;
	using EAI for EAI.MessageContent_String;
	using EAI for EAI.Timeout;
	using EAI for EAI.TimeInterval;
	using EAI for EAI.WeekDaysInterval;


	//---------------- Vectors of terms related to the requestBerthing clause(_C1). ----------------
	EAI.MessageContent_onlyXPath_String[] messageContent_onlyXPath_String_C1;
	EAI.MessageContent_String[] messageContent_String_C1;

	//---------------- Vectors of terms related to the respondToPortProposal clause(_C2). ----------------
	EAI.Timeout[] timeout_C2;
	EAI.MessageContent_String[] messageContent_String_C2;

	//---------------- Vectors of terms related to the notAllowedRequestBerthing clause(_C3). ----------------
	EAI.TimeInterval[] timeInterval_C3;
	EAI.WeekDaysInterval[] weekDaysInterval_C3;

	//---------------- Vectors of terms related to the respondToBerthingRequest clause(_C4). ----------------
	EAI.Timeout[] timeout_C4;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1643382000;
		dueDate = 1674831599;
		application = EAI.createParty("SpanishPortSystem", _applicationWallet, false);             
		process = EAI.createParty("Integration Process", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		
		//---------------- Terms related to the requestBerthing clause (C1). ----------------
		messageContent_onlyXPath_String_C1.push(EAI.createMessageContent_onlyXPath_String(  "//arriveData != """ ));
		messageContent_String_C1.push(EAI.createMessageContent_String(  "//departureData", "!=", "" ));
		messageContent_onlyXPath_String_C1.push(EAI.createMessageContent_onlyXPath_String(  "//MMSI != """ ));
		messageContent_onlyXPath_String_C1.push(EAI.createMessageContent_onlyXPath_String(  "//IMO != """ ));
		
		//---------------- Terms related to the respondToPortProposal clause (C2). ----------------
		timeout_C2.push(EAI.createTimeout( 3600 ));
		messageContent_String_C2.push(EAI.createMessageContent_String(  "//proposalID", "!=", "" ));
		messageContent_String_C2.push(EAI.createMessageContent_String(  "//portServices", "!=", "" ));
		
		//---------------- Terms related to the notAllowedRequestBerthing clause (C3). ----------------
		timeInterval_C3.push(EAI.createTimeInterval( 79200, 28800 ));
		weekDaysInterval_C3.push(EAI.createWeekDaysInterval( uint8(EAI.Day.SUNDAY), uint8(EAI.Day.SUNDAY) ));
		
		//---------------- Terms related to the respondToBerthingRequest clause (C4). ----------------
		timeout_C4.push(EAI.createTimeout( 3600 ));
	}
	
	function right_requestBerthing(
		bool[] memory messageContent_onlyXPath_String,
		string[] memory messageContent_String
		) public onlyProcess() returns(bool){
		if(
			messageContent_onlyXPath_String[0] &&
			messageContent_String_C1[0].evaluateStringContent(messageContent_String[0]) &&
			messageContent_onlyXPath_String[1] &&
			messageContent_onlyXPath_String[2]
			){
			timeout_C2[0].setEndTimeInTimeout(accessDateTime); 						
			return true;
		}else{	
			emit failEvent("Missing required data.");
			return false;
		}
	
	}
 		
	function obligation_respondToPortProposal(
		uint32 accessDateTime,
		string[] memory messageContent_String
		) public onlyApplication() returns(bool){
		require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
		if(
			!timeout_C2[0].isTimeoutEnded(accessDateTime) &&
			messageContent_String_C2[0].evaluateStringContent(messageContent_String[0]) &&
			messageContent_String_C2[1].evaluateStringContent(messageContent_String[1])
			){
			return true;
		}else{	
			emit failEvent("Timeout for replying has been exceeded");
			return false;
		}
	
	}
 		
	function prohibition_notAllowedRequestBerthing(
		uint32 accessTime
		) public onlyProcess() returns(bool){
		if(
			timeInterval_C3[0].isIntoTimeInterval(accessTime) || 
			weekDaysInterval_C3[0].isIntoWeekDaysInterval(weekDaysInterval[0])
			){
			emit failEvent("Request made outside the valid range");
			return false;
		}else{	
			return true;
		}
	
	}
 		
	function obligation_respondToBerthingRequest(
		uint32 accessDateTime
		) public onlyApplication() returns(bool){
		require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
		if(
			!timeout_C4[0].isTimeoutEnded(accessDateTime)
			){
			return true;
		}else{	
			emit failEvent("Timeout for replying has been exceeded");
			return false;
		}
	
	}
	/* the process sign the contract by default, the function signContract 
    is used to get the applicationParty signature*/      
    function signContract() public onlyApplication() returns(bool) {
        require(application.aware == false, "The contract is already signed");        
        application.aware = true;  
        updateMapParty(msg.sender, application);
		return true;
    }
 
    function updateMapParty(address _walletAddress, EAI.Party storage _party)internal returns(bool){       
        mapParty[_walletAddress] = _party;
		return true;
    }
    
    /* It only possible to change the name and the address of the party. 
    After change the  party, the new party need to sign the contract */
    function changeApplicationParty(string memory _name, address _walletAddress) public returns(bool) {       
        require(process.walletAddress == msg.sender, "Only the process can execute this operation");
        delete mapParty[application.walletAddress];
        application = EAI.createParty(_name, _walletAddress, false);          
        updateMapParty(_walletAddress, application);
        return true;       
    }
    
    function getProcessAddress() public view onlyInvolvedParties returns(address){
        return process.walletAddress;
    }
    
    function getApplicationAddress() public view onlyInvolvedParties returns(address){
        return application.walletAddress;
    }
 
    function getParty(address _walletAddress) public view onlyInvolvedParties returns(EAI.Party memory){
        return mapParty[_walletAddress];
    }
    
    modifier onlyApplication(){        
        require(activated, "This contract is deactivated");            
        require(application.walletAddress == msg.sender, "Only the application can execute this operation");
        _;        
    }
 
    modifier onlyProcess(){
        require(activated, "This contract is deactivated");
        require(process.walletAddress == msg.sender, "Only the process can execute this operation");
        _;
    }
 
    modifier onlyInvolvedParties(){
        require(activated, "This contract is deactivated");
        require(
            (application.walletAddress == msg.sender || process.walletAddress == msg.sender ) ,
            "Only the process or the application can execute this operation");
        _;
    }
    
}
