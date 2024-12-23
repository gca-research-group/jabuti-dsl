//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract Temp {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.Timeout;
	using EAI for EAI.MaxNumberOfOperation;
	using EAI for EAI.MaxNumberOfOperationByTime;
	using EAI for EAI.MessageContent_Boolean;
	using EAI for EAI.MessageContent_Number_PerTime;
	using EAI for EAI.MessageContent_Number;
	using EAI for EAI.MessageContent_onlyXPath_Boolean;
	using EAI for EAI.MessageContent_onlyXPath_Number;
	using EAI for EAI.MessageContent_onlyXPath_String;
	using EAI for EAI.MessageContent_String;
	using EAI for EAI.SessionInterval;
	using EAI for EAI.TimeInterval;
	using EAI for EAI.WeekDaysInterval;

	string str_aux1;
	string str_aux2;
	string str_aux3;
	EAI.Timeout timeout;

	//---------------- Vectors of terms related to the requestDelivery clause(_C1). ----------------
	EAI.MaxNumberOfOperation[] maxNumberOfOperation_C1;
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
	EAI.MessageContent_Boolean[] messageContent_Boolean_C1;
	EAI.MessageContent_Number_PerTime[] messageContent_Number_PerTime_C1;
	EAI.MessageContent_Number[] messageContent_Number_C1;
	EAI.MessageContent_onlyXPath_Boolean[] messageContent_onlyXPath_Boolean_C1;
	EAI.MessageContent_onlyXPath_Number[] messageContent_onlyXPath_Number_C1;
	EAI.MessageContent_onlyXPath_String[] messageContent_onlyXPath_String_C1;
	EAI.MessageContent_String[] messageContent_String_C1;
	EAI.SessionInterval[] sessionInterval_C1;
	EAI.TimeInterval[] timeInterval_C1;
	EAI.Timeout[] timeout_C1;
	EAI.WeekDaysInterval[] weekDaysInterval_C1;

	//---------------- Vectors of terms related to the responseDelivery clause(_C2). ----------------
	EAI.MaxNumberOfOperation[] maxNumberOfOperation_C2;
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C2;
	EAI.MessageContent_Boolean[] messageContent_Boolean_C2;
	EAI.MessageContent_Number_PerTime[] messageContent_Number_PerTime_C2;
	EAI.MessageContent_Number[] messageContent_Number_C2;
	EAI.MessageContent_onlyXPath_Boolean[] messageContent_onlyXPath_Boolean_C2;
	EAI.MessageContent_onlyXPath_Number[] messageContent_onlyXPath_Number_C2;
	EAI.MessageContent_onlyXPath_String[] messageContent_onlyXPath_String_C2;
	EAI.MessageContent_String[] messageContent_String_C2;
	EAI.SessionInterval[] sessionInterval_C2;
	EAI.TimeInterval[] timeInterval_C2;
	EAI.Timeout[] timeout_C2;
	EAI.WeekDaysInterval[] weekDaysInterval_C2;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1641034800;
		dueDate = 1672520400;
		application = EAI.createParty("deliverySystem", _applicationWallet, false);             
		process = EAI.createParty("integrationProcess", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		str_aux1 = "//body/perosonalInformation/address/cep";
		str_aux2 = "count(//body/perosonalInformation/address/cep)";
		str_aux3 = "count(//body/perosonalInformation/address/cep)<2";
		timeout = EAI.createTimeout( 30 );	
		
		//---------------- Terms related to the requestDelivery clause (C1). ----------------
		maxNumberOfOperation_C1.push(EAI.createMaxNumberOfOperation( 10 ));
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 4, EAI.MINUTE ));
		messageContent_Boolean_C1.push(EAI.createMessageContent_Boolean(  "//body/boolValue", "==", false ));
		messageContent_Number_PerTime_C1.push(EAI.createMessageContent_Number_PerTime(  "//body/addres", "==", 1, EAI.HOUR ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  "//body/package", "<=", 20 ));
		messageContent_onlyXPath_Boolean_C1.push(EAI.createMessageContent_onlyXPath_Boolean( a==b ));
		messageContent_onlyXPath_Number_C1.push(EAI.createMessageContent_onlyXPath_Number( 125 ));
		messageContent_onlyXPath_String_C1.push(EAI.createMessageContent_onlyXPath_String(  "//cpf" ));
		messageContent_String_C1.push(EAI.createMessageContent_String(  "//body/perosonalInformation/address/cep", "==", "98700000" ));
		sessionInterval_C1.push(EAI.createSessionInterval( 10, EAI.HOUR ));
		timeInterval_C1.push(EAI.createTimeInterval( 28800, 64800 ));
		timeout_C1.push(EAI.createTimeout( 3 ));
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( EAI.MONDAY, EAI.FRIDAY ));
		
		//---------------- Terms related to the responseDelivery clause (C2). ----------------
		maxNumberOfOperation_C2.push(EAI.createMaxNumberOfOperation( 10 ));
		maxNumberOfOperationByTime_C2.push(EAI.createMaxNumberOfOperationByTime( 4, EAI.MINUTE ));
		messageContent_Boolean_C2.push(EAI.createMessageContent_Boolean(  "//body/boolValue", "==", false ));
		messageContent_Number_PerTime_C2.push(EAI.createMessageContent_Number_PerTime(  "//body/addres", "==", 1, EAI.HOUR ));
		messageContent_Number_C2.push(EAI.createMessageContent_Number(  "//body/package", "<=", 20 ));
		messageContent_onlyXPath_Boolean_C2.push(EAI.createMessageContent_onlyXPath_Boolean( a==b ));
		messageContent_onlyXPath_Number_C2.push(EAI.createMessageContent_onlyXPath_Number( 125 ));
		messageContent_onlyXPath_String_C2.push(EAI.createMessageContent_onlyXPath_String(  "//cpf" ));
		messageContent_String_C2.push(EAI.createMessageContent_String(  "//body/perosonalInformation/address/cep", "==", "98700000" ));
		sessionInterval_C2.push(EAI.createSessionInterval( 10, EAI.HOUR ));
		timeInterval_C2.push(EAI.createTimeInterval( 28800, 64800 ));
		timeout_C2.push(EAI.createTimeout( 3 ));
		weekDaysInterval_C2.push(EAI.createWeekDaysInterval( EAI.MONDAY, EAI.FRIDAY ));
	}
	
	function right_requestDelivery(
		uint32 accessDateTime,
		bool[] memory messageContent_Boolean,
		uint256[] memory messageContent_Number_PerTime,
		uint256[] memory messageContent_Number,
		bool[] memory messageContent_onlyXPath_Boolean,
		bool[] memory messageContent_onlyXPath_Number,
		bool[] memory messageContent_onlyXPath_String,
		string[] memory messageContent_String,
		uint32 accessTime
		) public onlyProcess() returns(bool){
		if(
			maxNumberOfOperation_C1[0].hasAvailableOperations() &&
			maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(accessDateTime) &&
			messageContent_Boolean_C1[0].evaluateBooleanContent(messageContent_Boolean[0]) &&
			messageContent_Number_PerTime_C1[0].evaluateNumberPerTime(accessDateTime,messageContent_Number_PerTime[0]) &&
			messageContent_Number_C1[0].evaluateNumberContent(messageContent_Number[0]) &&
			messageContent_onlyXPath_Boolean[0] &&
			messageContent_onlyXPath_Number[0] &&
			messageContent_onlyXPath_String[0] &&
			messageContent_String_C1[0].evaluateStringContent(messageContent_String[0]) &&
			default - implementing &&
			timeInterval_C1[0].isIntoTimeInterval(accessTime) &&
			!timeout_C1[0].isTimeoutEnded(accessDateTime) &&
			weekDaysInterval_C1[0].isIntoWeekDaysInterval(weekDaysInterval[0])
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
 		
	function obligation_responseDelivery(
		uint32 accessDateTime,
		bool[] memory messageContent_Boolean,
		uint256[] memory messageContent_Number_PerTime,
		uint256[] memory messageContent_Number,
		bool[] memory messageContent_onlyXPath_Boolean,
		bool[] memory messageContent_onlyXPath_Number,
		bool[] memory messageContent_onlyXPath_String,
		string[] memory messageContent_String,
		uint32 accessTime
		) public onlyProcess() returns(bool){
		if(
			maxNumberOfOperation_C2[0].hasAvailableOperations() &&
			maxNumberOfOperationByTime_C2[0].hasAvailableOperations_ByTime(accessDateTime) &&
			messageContent_Boolean_C2[0].evaluateBooleanContent(messageContent_Boolean[0]) &&
			messageContent_Number_PerTime_C2[0].evaluateNumberPerTime(accessDateTime,messageContent_Number_PerTime[0]) &&
			messageContent_Number_C2[0].evaluateNumberContent(messageContent_Number[0]) &&
			messageContent_onlyXPath_Boolean[0] &&
			messageContent_onlyXPath_Number[0] &&
			messageContent_onlyXPath_String[0] &&
			messageContent_String_C2[0].evaluateStringContent(messageContent_String[0]) &&
			default - implementing &&
			timeInterval_C2[0].isIntoTimeInterval(accessTime) &&
			!timeout_C2[0].isTimeoutEnded(accessDateTime) &&
			weekDaysInterval_C2[0].isIntoWeekDaysInterval(weekDaysInterval[0])
			){
			maxNumberOfOperation_C2[0].decreaseOneOperation();
			maxNumberOfOperationByTime_C2[0].decreaseOneOperation_ByTime(accessDateTime);
			messageContent_Number_PerTime_C2[0].decreaseTheLastContentOfRestingAmount();						
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
