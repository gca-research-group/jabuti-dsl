//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract Citizen_RS {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.TimeInterval;
	using EAI for EAI.MaxNumberOfOperationByTime;
	using EAI for EAI.MessageContent_onlyXPath_String;
	using EAI for EAI.WeekDaysInterval;
	using EAI for EAI.Timeout;


	//---------------- Vectors of terms related to the requestPhoneNumber_r clause(_C1). ----------------
	EAI.TimeInterval[] timeInterval_C1;
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;

	//---------------- Vectors of terms related to the requestPhoneNumber_p clause(_C2). ----------------
	EAI.MessageContent_onlyXPath_String[] messageContent_onlyXPath_String_C2;

	//---------------- Vectors of terms related to the reponseWithPhoneNumber clause(_C3). ----------------
	EAI.WeekDaysInterval[] weekDaysInterval_C3;
	EAI.TimeInterval[] timeInterval_C3;
	EAI.Timeout[] timeout_C3;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1633118400;
		dueDate = 1664636400;
		application = EAI.createParty("Citizen Database", _applicationWallet, false);             
		process = EAI.createParty("Integration Process", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		
		//---------------- Terms related to the requestPhoneNumber_r clause (C1). ----------------
		timeInterval_C1.push(EAI.createTimeInterval( 0, 21599 ));
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 700, EAI.MINUTE ));
		timeInterval_C1.push(EAI.createTimeInterval( 21600, 86399 ));
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 400, EAI.MINUTE ));
		
		//---------------- Terms related to the requestPhoneNumber_p clause (C2). ----------------
		messageContent_onlyXPath_String_C2.push(EAI.createMessageContent_onlyXPath_String( XPATH_EXPRESSION ));
		
		//---------------- Terms related to the reponseWithPhoneNumber clause (C3). ----------------
		weekDaysInterval_C3.push(EAI.createWeekDaysInterval( EAI.SUNDAY, EAI.SATURDAY ));
		timeInterval_C3.push(EAI.createTimeInterval( 0, 86399 ));
		timeout_C3.push(EAI.createTimeout( 1 ));
	}
	
	function right_requestPhoneNumber_r(
		uint32 accessTime,
		uint32 accessDateTime
		) public onlyProcess() returns(bool){
		if(
			timeInterval_C1[0].isIntoTimeInterval(accessTime) &&
			maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(accessDateTime) ||
			timeInterval_C1[1].isIntoTimeInterval(accessTime) &&
			maxNumberOfOperationByTime_C1[1].hasAvailableOperations_ByTime(accessDateTime)
			){
			timeout_C3[0].setEndTimeInTimeout(accessDateTime); 						
			maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime(accessDateTime);
			maxNumberOfOperationByTime_C1[1].decreaseOneOperation_ByTime(accessDateTime);
			return true;
		}else{	
			emit failEvent("Service suspended for 8 hours due to operation limit exceeded");
			return false;
		}
	
	}
 		
	function prohibition_requestPhoneNumber_p(
		bool[] memory messageContent_onlyXPath_String
		) public onlyProcess() returns(bool){
		if(
			messageContent_onlyXPath_String[0]
			){
			emit failEvent("It's not allowed more then one cpf by request");
			return false;
		}else{	
			return true;
		}
	
	}
 		
	function obligation_reponseWithPhoneNumber(
		uint32 accessTime,
		uint32 accessDateTime
		) public onlyApplication() returns(bool){
		require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
		if(
			weekDaysInterval_C3[0].isIntoWeekDaysInterval(weekDaysInterval[0]) &&
			timeInterval_C3[0].isIntoTimeInterval(accessTime) &&
			!timeout_C3[0].isTimeoutEnded(accessDateTime)
			){
			return true;
		}else{	
			maxNumberOfOperationByTime_C1[0].increaseOneOperation_ByTime();
			maxNumberOfOperationByTime_C1[1].increaseOneOperation_ByTime();
			emit failEvent("Server not available error");
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
