/* ========================== BEGIN: code for all contracts ====================== */
//SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;

import "../../lib/eai/EAI.sol";

contract WhatsappProcessWrite {

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

    using EAI for string;
    using EAI  for EAI.MessageContent_onlyXPath_String;
    using EAI for EAI.SessionInterval;
    using EAI for EAI.WeekDaysInterval;
    using EAI for EAI.MaxNumberOfOperationByTime;    
    

// ----------------------------------------------------------------------------------

// 2º STEP: Identify and create the variables  from " variable block" ---------------  
  
    // ADD NEW CONTENT HERE IF EXIST
    // EAI.MessageContent_onlyXPath_String conversationId;
    // EAI.SessionInterval session;
    // EAI.MessageContent_onlyXPath_String conversationStarter;

// ----------------------------------------------------------------------------------


// 3º STEP: Identify and create variables referring to the clauses terms ------------
	
    // ADD NEW CONTENT HERE

    EAI.WeekDaysInterval[] weekDaysInterval_C1;    
    
    EAI.SessionInterval[] sessionInterval_C1;
    mapping(string => mapping(string=>EAI.SessionInterval)) sessionByContent;
    mapping(string => mapping(string=>bool)) exists_k1mapk2;
    string[] keys_k1;  // For storing keys 
    string[] keys_k2;  // For storing keys
    mapping (string => bool) exists_k1; // Additional Map for checking if key exists
    mapping (string => bool) exists_k2; // Additional Map for checking if key exists
    
    EAI.MessageContent_onlyXPath_String[] msgContent_onlyPath_String_C1;
    EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
    
// -----------------------------------------------------------------------------------


// 4º STEP: Create the constructor method --------------------------------------------
	constructor(address _applicationWallet){
	 	
        activated = true;
        
        // Catch the date from jabuti contract 
        beginDate = 1672560000; // "2023-01-01 08:00:00"
	    dueDate = 1704045600;  // "2023-12-31 18:00:00"
        // Catch the name of the part for creaty the parties         
	    application = EAI.createParty("Whatsapp", _applicationWallet, false);  // UPDATE THE application NAME
        process = EAI.createParty("Integration Process", msg.sender, true);               // UPDATE THE process NAME
        mapParty[msg.sender] = process;
        mapParty[_applicationWallet] = application;

// 5º STEP: Create the terms of the clauses, (check if some of them use a variable from variable block)

        // ADD NEW CONTENT HERE
        weekDaysInterval_C1.push(EAI.createWeekDaysInterval(EAI.MONDAY, EAI.FRIDAY));
        
        sessionInterval_C1.push(EAI.createSessionInteval(24, EAI.HOUR, "//conversationId/text()"));
        keys_k1.push(sessionInterval_C1[0].xpath); // 0        
        exists_k1[sessionInterval_C1[0].xpath] = true;

        msgContent_onlyPath_String_C1.push(EAI.createMessageContent_onlyXPath_String("//conversationStarter/text()"));
        maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime(10000, EAI.MONTH));

	}
	
// 6º STEP: Translate the clauses to functions


    // ADD NEW CONTENT HERE
    function rigth_sendMessage(uint8 _weekDayAccess, string memory _resultXPath_k2, uint32 _accessDateTime, string memory _resultXPath_onlyString) public onlyProcess() returns(bool){

        if(weekDaysInterval_C1[0].isIntoWeekDaysInterval(_weekDayAccess)){
            if(!exists_k1mapk2[keys_k1[0]][_resultXPath_k2]){
                exists_k1mapk2[keys_k1[0]][_resultXPath_k2] = true;
                keys_k2.push(_resultXPath_k2);
                sessionByContent[keys_k1[0]][_resultXPath_k2] = sessionInterval_C1[0];
                sessionByContent[keys_k1[0]][_resultXPath_k2].startNewSessionInterval(_accessDateTime);
            }

            if(sessionByContent[keys_k1[0]][_resultXPath_k2].sessionStatus(_accessDateTime) == EAI.CLOSED &&
               _resultXPath_onlyString.isEqual("Business-initiated")
                //EAI.isEqual(_resultXPath_onlyString, "Business-initiated")            
            ){
                if(maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(_accessDateTime)){
                    maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime();
                    return true;
                }   
            }
        }

        return false;                
 
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


