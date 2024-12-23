//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract DeliveryHiring_RO {

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
	using EAI for EAI.SessionInterval;
	using EAI for EAI.Timeout;
	using EAI for EAI.MaxNumberOfOperation;
	using EAI for EAI.MaxNumberOfOperationByTime;
	using EAI for EAI.WeekDaysInterval;
	using EAI for EAI.MessageContent_onlyXPath_Boolean;
	using EAI for EAI.MessageContent_Number;
	using EAI for EAI.MessageContent_Number_PerTime;

	string a;
	string b;
	uint32 c;
	uint32 d;
	bool expression_01;
	uint32 expression_02;
	bool expression_03;

	//---------------- Vectors of terms related to the requestDelivery clause(_C1). ----------------
	EAI.TimeInterval[] timeInterval_C1;
	EAI.SessionInterval[] sessionInterval_C1;
	EAI.Timeout[] timeout_C1;
	EAI.MaxNumberOfOperation[] maxNumberOfOperation_C1;
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
	EAI.WeekDaysInterval[] weekDaysInterval_C1;
	EAI.MessageContent_onlyXPath_Boolean[] messageContent_onlyXPath_Boolean_C1;
	EAI.MessageContent_Number[] messageContent_Number_C1;
	EAI.MessageContent_Number_PerTime[] messageContent_Number_PerTime_C1;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1641034800;
		dueDate = 1672520400;
		application = EAI.createParty("deliverySystem", _applicationWallet, false);             
		process = EAI.createParty("integrationProcess", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		a = "text_01";
		b = "text_02";
		c = 2;
		d = 1;
		expression_01 = a!=bANDb=="text_02";
		expression_02 = c*((c-d)+2);
		expression_03 = c+d<=3AND(a=="text_02"ORa!=b);
		
		//---------------- Terms related to the requestDelivery clause (C1). ----------------
		timeInterval_C1.push(EAI.createTimeInterval( 25200, 64800 ));
		sessionInterval_C1.push(EAI.createSessionInterval( 30, EAI.MINUTE ));
		timeout_C1.push(EAI.createTimeout( 30 ));
		maxNumberOfOperation_C1.push(EAI.createMaxNumberOfOperation( 50000 ));
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 10, EAI.MINUTE ));
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( EAI.MONDAY, EAI.FRIDAY ));
		messageContent_onlyXPath_Boolean_C1.push(EAI.createMessageContent_onlyXPath_Boolean(  "count(//item)<=10" ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  "count(//item)", "<=", 10 ));
		messageContent_Number_PerTime_C1.push(EAI.createMessageContent_Number_PerTime(  "count(//item)", "<=", 1000, EAI.MONTH ));
	}
	
	function right_requestDelivery(
		uint32 accessTime,
		uint32 accessDateTime,
		bool[] memory messageContent_onlyXPath_Boolean,
		uint256[] memory messageContent_Number,
		uint256[] memory messageContent_Number_PerTime
		) public onlyProcess() returns(bool){
		if(
			timeInterval_C1[0].isIntoTimeInterval(accessTime) &&
			default - implementing &&
			!timeout_C1[0].isTimeoutEnded(accessDateTime) &&
			maxNumberOfOperation_C1[0].hasAvailableOperations() &&
			maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(accessDateTime) &&
			weekDaysInterval_C1[0].isIntoWeekDaysInterval(weekDaysInterval[0]) &&
			messageContent_onlyXPath_Boolean[0] &&
			messageContent_Number_C1[0].evaluateNumberContent(messageContent_Number[0]) &&
			messageContent_Number_PerTime_C1[0].evaluateNumberPerTime(accessDateTime,messageContent_Number_PerTime[0])
			){
			maxNumberOfOperation_C1[0].decreaseOneOperation();
			maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime(accessDateTime);
			messageContent_Number_PerTime_C1[0].decreaseTheLastContentOfRestingAmount();						
			return true;
		}else{	
			emit failEvent("Request operation did not meet all requirements");
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
