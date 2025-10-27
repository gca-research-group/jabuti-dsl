//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract DeliveryHiring_O {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.SessionInterval;
	using EAI for EAI.WeekDaysInterval;
	using EAI for EAI.MaxNumberOfOperationByTime;
	using EAI for EAI.TimeInterval;

	string dateTimeCompra;
	string var1;
	EAI.SessionInterval sessionInterval;

	//---------------- Vectors of terms related to the respondIntervalAndLimit clause(_C1). ----------------
	EAI.WeekDaysInterval[] weekDaysInterval_C1;
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
	EAI.TimeInterval[] timeInterval_C1;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1641034800;
		dueDate = 1672520400;
		application = EAI.createParty("deliverySystem", _applicationWallet, false);             
		process = EAI.createParty("integrationProcess", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		dateTimeCompra = "//dateCompra/text()"+" "+"//HourCompra/text()";
		var1 = "//dateCompra/text()";
		sessionInterval = EAI.createSessionInterval( 1, uint8(EAI.TimeUnit.DAY) );	
		
		//---------------- Terms related to the respondIntervalAndLimit clause (C1). ----------------
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( uint8(EAI.Day.MONDAY), uint8(EAI.Day.WEDNESDAY) ));
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( uint8(EAI.Day.FRIDAY), uint8(EAI.Day.SATURDAY) ));
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 2, uint8(EAI.TimeUnit.HOUR) ));
		timeInterval_C1.push(EAI.createTimeInterval( 28800, 43200 ));
		timeInterval_C1.push(EAI.createTimeInterval( 28800, 43200 ));
	}
	
	function right_respondIntervalAndLimit(
		uint32 accessDateTime,
		uint32 accessTime
		) public onlyApplication() returns(bool){
		require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
		if(
			weekDaysInterval_C1[0].isIntoWeekDaysInterval(weekDaysInterval[0]) ||
			weekDaysInterval_C1[1].isIntoWeekDaysInterval(weekDaysInterval[1]) &&
			maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(accessDateTime) &&
			timeInterval_C1[0].isIntoTimeInterval(accessTime) &&
			timeInterval_C1[1].isIntoTimeInterval(accessTime)
			){
			maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime(accessDateTime);
			return true;
		}else{	
			emit failEvent(" resgistrar falha....");
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
