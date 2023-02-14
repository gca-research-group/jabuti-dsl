/* ========================== BEGIN: code for all contracts ====================== */
//SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;

import "../../lib/eai/EAI.sol";

contract DeliveryHiring_P {
    
    bool activated;
 
    uint32 beginDate; 
	uint32 dueDate; 	
    using EAI for EAI.Party;
       
    EAI.Party application;
    EAI.Party process;
    mapping(address=>EAI.Party) mapParty;

    event failEvent(string _logMessage);
    event successEvent(string _logMessage);

/* --------------------------- END: code for all contracts ----------------------- */  


/* =========== BEGIN: codes generated based in specific jabuti contract =================== */
    	
//  1º STEP:  Import library to conditions/terms  ---------------------------------- 
    using EAI for EAI.WeekDaysInterval;
    using EAI for EAI.TimeInterval;
    using EAI for EAI.MaxNumberOfOperationByTime;
    using EAI for EAI.MessageContent_Number;
// ----------------------------------------------------------------------------------


// 2º STEP: Identify and create the variables  from " variable block" ---------------  
// - there are no variable block in this contracts
// ----------------------------------------------------------------------------------


// 3º STEP: Identify and create variables referring to the clauses terms ------------
 	EAI.WeekDaysInterval[]  weekDaysInterval_C1; 	
	EAI.TimeInterval[] timeInterval_C1;
    EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
    EAI.MessageContent_Number[] msgContent_number_C1;    
// -----------------------------------------------------------------------------------


// 4º STEP: Create the constructor method --------------------------------------------
constructor(address _applicationWallet){
        activated = true;
        // Catch the date from jabuti contract 
        beginDate = 1672561800;
	    dueDate = 1704097800;                
        // Catch the name of the part for creaty the parties
	    application = EAI.createParty("Delivery System", _applicationWallet, false);        
        process = EAI.createParty("Integration Process", msg.sender, true);
        mapParty[msg.sender] = process;
        mapParty[_applicationWallet] = application;

// 5º STEP: Create the terms of the clauses, (check if some of them use a variable from variable block)
        weekDaysInterval_C1.push(EAI.createWeekDaysInterval(EAI.SATURDAY, EAI.SUNDAY));
        timeInterval_C1.push(EAI.createTimeInterval(66600,30600)); //TimeInterval("18:30:00" to "08:30:00")
        maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime(5, EAI.DAY));// will be reject operation after the operation 5, that means, 6,7,8...
		msgContent_number_C1.push(EAI.createMessageContent("count(//address)", "<=", 1));               
	}
 
// 6º STEP: Translate the clauses to functions

    function prohibition_requestDelivery(
        uint8 _weekDay, 
        uint32 _hourOfDay, 
        uint32 _accessDateTime,
        int256[] memory _resultFromXpath
        ) public onlyProcess() returns(bool){

        if(
            weekDaysInterval_C1[0].isIntoWeekDaysInterval(_weekDay) ||
            timeInterval_C1[0].isIntoTimeInterval(_hourOfDay) ||
            !maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(_accessDateTime) ||
            msgContent_number_C1[0].evaluateNumberContent(_resultFromXpath[0])
        ){     
            emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
		    return false;         
        } else {
            maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime(); 
            emit successEvent("Successful execution!");
            return true;
        }

    }
  

/* -------------- END: codes generated based in specific jabuti contract ------------- */


/* ========================== BEGIN: code for all contracts ====================== */

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

     /* ==================================== MODIFIERS ==================================== */
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
/* --------------------------- END: code for all contracts ----------------------- */  


