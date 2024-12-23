//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract FlightFacade {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.WeekDaysInterval;
	using EAI for EAI.TimeInterval;
	using EAI for EAI.MaxNumberOfOperationByTime;
	using EAI for EAI.MessageContent_Number;
	using EAI for EAI.MessageContent_String;
	using EAI for EAI.Timeout;


	//---------------- Vectors of terms related to the requestRight clause(_C1). ----------------
	EAI.WeekDaysInterval[] weekDaysInterval_C1;
	EAI.TimeInterval[] timeInterval_C1;
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
	EAI.MessageContent_Number[] messageContent_Number_C1;
	EAI.MessageContent_String[] messageContent_String_C1;

	//---------------- Vectors of terms related to the requestProhibition clause(_C2). ----------------
	EAI.TimeInterval[] timeInterval_C2;
	EAI.MessageContent_Number[] messageContent_Number_C2;

	//---------------- Vectors of terms related to the responseObligation clause(_C3). ----------------
	EAI.Timeout[] timeout_C3;
	EAI.MessageContent_String[] messageContent_String_C3;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1632427200;
		dueDate = 1663945200;
		application = EAI.createParty("Flight Facade", _applicationWallet, false);             
		process = EAI.createParty("Integration Process", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		
		//---------------- Terms related to the requestRight clause (C1). ----------------
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( EAI.SUNDAY, EAI.SATURDAY ));
		timeInterval_C1.push(EAI.createTimeInterval( 21600, 82740 ));
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 100, EAI.MINUTE ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  "count(//trip/path)", "==", 1 ));
		messageContent_String_C1.push(EAI.createMessageContent_String(  "//origin/text()", "!=", "//destiny/text()" ));
		
		//---------------- Terms related to the requestProhibition clause (C2). ----------------
		timeInterval_C2.push(EAI.createTimeInterval( 0, 21540 ));
		messageContent_Number_C2.push(EAI.createMessageContent_Number(  "//trip/text()", ">", 1 ));
		
		//---------------- Terms related to the responseObligation clause (C3). ----------------
		timeout_C3.push(EAI.createTimeout( 5 ));
		messageContent_String_C3.push(EAI.createMessageContent_String(  "//flight/text()", "!=", "" ));
		messageContent_String_C3.push(EAI.createMessageContent_String(  "//destinyResponse/text()", "==", "//destinyRequest/text()" ));
		messageContent_String_C3.push(EAI.createMessageContent_String(  "//originResponse/text()", "==", "//originResponse/text()" ));
	}
	
	function right_requestRight(
		uint32 accessTime,
		uint32 accessDateTime,
		uint256[] memory messageContent_Number,
		string[] memory messageContent_String
		) public onlyProcess() returns(bool){
		if(
			weekDaysInterval_C1[0].isIntoWeekDaysInterval(weekDaysInterval[0]) &&
			timeInterval_C1[0].isIntoTimeInterval(accessTime) &&
			maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(accessDateTime) &&
			messageContent_Number_C1[0].evaluateNumberContent(messageContent_Number[0]) &&
			messageContent_String_C1[0].evaluateStringContent(messageContent_String[0])
			){
			timeout_C3[0].setEndTimeInTimeout(accessDateTime); 						
			maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime(accessDateTime);
			return true;
		}else{	
			emit failEvent("Breach of condition in the travel request");
			return false;
		}
	
	}
 		
	function prohibition_requestProhibition(
		uint32 accessTime,
		uint256[] memory messageContent_Number
		) public onlyProcess() returns(bool){
		if(
			timeInterval_C2[0].isIntoTimeInterval(accessTime) || 
			messageContent_Number_C2[0].evaluateNumberContent(messageContent_Number[0])
			){
			emit failEvent("Request made outside of allowed hours, ...");
			return false;
		}else{	
			return true;
		}
	
	}
 		
	function obligation_responseObligation(
		uint32 accessDateTime,
		string[] memory messageContent_String
		) public onlyApplication() returns(bool){
		require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
		if(
			!timeout_C3[0].isTimeoutEnded(accessDateTime) &&
			messageContent_String_C3[0].evaluateStringContent(messageContent_String[0]) &&
			messageContent_String_C3[1].evaluateStringContent(messageContent_String[1]) &&
			messageContent_String_C3[2].evaluateStringContent(messageContent_String[2])
			){
			return true;
		}else{	
			maxNumberOfOperationByTime_C1[0].increaseOneOperation_ByTime();
			emit failEvent("The timeout exceeded or inconsistent response message");
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
