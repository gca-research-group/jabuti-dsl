//SPDX-License-Identifier:MIT
pragma solidity >0.8.4 < 0.8.14;

import "../../lib/eai/EAI.sol";

contract DeliveryHiring_RO{
	
    /* ==================================  BEGIN  ======================================== */
    /* ============================ CODES FOR ALL CONTRACTS ============================== */
 
    using EAI for EAI.Party;
   
    EAI.Party process;
    EAI.Party application;
    mapping(address=>EAI.Party) mapParty;

    uint32 beginDate; 
	uint32 dueDate; 	

    event failEvent(string _logMessage);
    event successEvent(string _logMessage);

   /* --------------------------------   END   ------------------------------------------ */




    /* ==================================  BEGIN  ======================================= */
    /* =================== CODES GENERATED BASED IN JABUTI CONTRACT ===================== */
 
 	
    // ------------------ Automated code generation - 1º step ------------------ 
    using EAI for EAI.WeekDaysInterval;
    using EAI for EAI.TimeInterval;
    using EAI for EAI.MaxNumberOfOperation;
    using EAI for EAI.MessageContent_Number;
    using EAI for EAI.MessageContent_NumberPerTime;
    using EAI for EAI.Timeout;
    


    // ------------------ Automated code generation - 2º step ------------------ 
    string numberOfAddresses = "count(//body/perosonalInformation/address/cep)";

    // ------------------ Automated code generation - 3º step ------------------ 
  
 	
    EAI.WeekDaysInterval[]  weekDaysInterval_C1; 	
	EAI.TimeInterval[] timeInterval_C1;
    EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
    EAI.MessageContent_Number[] msgContent_number_C1;
    EAI.MessageContent_NumberPerTime[] msgContent_numberPerTime_C1;

    EAI.Timeout[]  timeout_C2; 	
	EAI.MessageContent_Number[]  msgContent_number_C2;

    // ------------------ Automated code generation - 4º step ------------------ 
	constructor(address _applicationWallet){
	 	beginDate = 1672561800;
	    dueDate = 1704097800;
         
        process = EAI.createParty("Integration Process", msg.sender, true);
	    application = EAI.createParty("Delivery System", _applicationWallet, false);        
        mapParty[msg.sender] = process;
        mapParty[_applicationWallet] = application;

        // ------------------ Automated code generation - 5º step ------------------ 
        weekDaysInterval_C1.push(EAI.createWeekDaysInterval(EAI.MONDAY, EAI.FRIDAY));
        timeInterval_C1.push(EAI.createTimeInterval(30600,66600)); //TimeInterval("08:30:00" to "18:30:00")
        maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime(5, EAI.DAY));
		msgContent_number_C1.push(EAI.createMessageContent(numberOfAddresses, ">=", 1));        
        msgContent_number_C1.push(EAI.createMessageContent(numberOfAddresses, "<=", 3));        
        msgContent_numberPerTime_C1.push(EAI.createMessageContent_NumberPerTime(numberOfAddresses, "<=", 1000, EAI.MONTH));

        timeout_C2.push(EAI.createTimeout(30));	   				
		msgContent_number_C2.push(EAI.createMessageContent("//budget/id/text()", ">=", 0));   

	}
	
    // ------------------ Automated code generation - 6º step ------------------ 
    // - translate clauses to functions

    function right_requestDelivery(
        uint32 _accessDateTime, 
        uint8 _weekDay, 
        uint32 _hourOfDay, 
        int256[] memory _resultFromXpath_nc,
        uint256[] memory _resultFromXpath_npt
        ) public onlyProcess() returns(bool){
      
        if(weekDaysInterval_C1[0].isIntoWeekDaysInterval(_weekDay) &&
           timeInterval_C1[0].isIntoTimeInterval(_hourOfDay) &&
           msgContent_number_C1[0].evaluateNumberContent(_resultFromXpath_nc[0]) &&
           msgContent_number_C1[1].evaluateNumberContent(_resultFromXpath_nc[1]) &&
           msgContent_numberPerTime_C1[0].evaluateAndDecreaseNumberPerTime(_accessDateTime, uint256(_resultFromXpath_npt[2]))
        ){
            emit successEvent("Successful execution!");
            return true;
        }    
	   	emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
		return false;
    }
    

    function responderOrder(uint32 _accessDateTime, int256[] memory _resultFromXpath_nc) public onlyApplication() returns(bool){

	   	// Setting the time limit for responding to a request
	   	require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
	    
		if(!timeout_C2[0].isTimeoutEnded(_accessDateTime)  &&			
			msgContent_number_C2[0].evaluateNumberContent(_resultFromXpath_nc[0])
            )
			{			    
                emit successEvent("Successful execution!");
	        	return true;
	    	}
	    
	   	emit failEvent("Response made outside of allowed hours or distance limit exceeded");
		return false;
	}
    
   
    /* ================== CODES GENERATED BASED IN JABUTI CONTRACT ======================= */
    /* --------------------------------   END   ------------------------------------------ */












    
  
    /* ================== CODES GENERATED BASED IN JABUTI CONTRACT ======================= */
    /* --------------------------------   END   ------------------------------------------ */



    /* =================================================================================== */
    /* ============================ CODES FOR ALL CONTRACTS ============================== */
    
    /* the process sign the contract by default, the function signContract 
    is used to get the applicationParty signature*/      
    function signContract() public onlyApplication() returns(bool){
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

    /* =================================================================================== */
    /* ==================================== MODIFIERS ==================================== */
    /* ----------------------------------------------------------------------------------- */
    
    modifier onlyApplication(){
        require(application.walletAddress == msg.sender, "Only the application can execute this operation");
        _;
    }

    modifier onlyProcess(){
        require(process.walletAddress == msg.sender, "Only the process can execute this operation");
        _;
    }

    modifier onlyInvolvedParties(){
        require(
            (application.walletAddress == msg.sender || process.walletAddress == msg.sender ) ,
            "Only the process or the application can execute this operation");
        _;
    }

    /* ============================ CODES FOR ALL CONTRACTS ============================== */
    /* ----------------------------------   END   ---------------------------------------- */
}