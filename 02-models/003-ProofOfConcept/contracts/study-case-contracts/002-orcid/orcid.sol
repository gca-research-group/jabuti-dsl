/* ========================== BEGIN: code for all contracts ====================== */
//SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.19;

import "../../lib/eai/EAI.sol";

contract Orcid {
 
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

    // ADD NEW CONTENT HERE, as follow example:
    using EAI for EAI.WeekDaysInterval;
    using EAI for EAI.TimeInterval;    
    using EAI for EAI.MaxNumberOfOperationByTime;
    using EAI for EAI.MessageContent_onlyXPath_Boolean;
    using EAI for EAI.Timeout;

// ----------------------------------------------------------------------------------

// 2º STEP: Identify and create the variables  from " variable block" ---------------    
    // ADD NEW CONTENT HERE IF EXIST, as follow example:
    //string numberOfAddresses = "count(//body/perosonalInformation/address/cep)"; 
// ----------------------------------------------------------------------------------


// 3º STEP: Identify and create variables referring to the clauses terms ------------
	
    // ADD NEW CONTENT HERE, as follow example:
    EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;    
    EAI.MessageContent_onlyXPath_Boolean[] msgContent_onlyPath_C1;
    
    EAI.Timeout[] timeout_C2;
    

// -----------------------------------------------------------------------------------



// 4º STEP: Create the constructor method --------------------------------------------
	constructor(address _applicationWallet){
	 	activated = true;
        // Catch the date from jabuti contract 
        beginDate = 1672560000; // UPDATE THE beginDate AND dueDate
	    dueDate = 1735603200; 
        // Catch the name of the part for creaty the parties         
	    application = EAI.createParty("Orcid API", _applicationWallet, false);  // UPDATE THE application NAME
        process = EAI.createParty("Integration Process", msg.sender, true);               // UPDATE THE process NAME
        mapParty[msg.sender] = process;
        mapParty[_applicationWallet] = application;

// 5º STEP: Create the terms of the clauses, (check if some of them use a variable from variable block)
        maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime(8,EAI.SECOND));
        msgContent_onlyPath_C1.push(EAI.createMessageContent_onlyXPath_Boolean("//author/orcid/id/text()!=''"));
        msgContent_onlyPath_C1.push(EAI.createMessageContent_onlyXPath_Boolean("//article/title/text()!=''"));

        timeout_C2.push(EAI.createTimeout(5));
                
	}
	
// 6º STEP: Translate the clauses to functions
    function right_requestUpdate(uint32 _accessTime, bool[] memory _resultFromXpath )public onlyProcess() returns(bool){

        if(maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(_accessDateTime) &&
            _resultFromXpath[0] &&
            _resultFromXpath[1]
            ){
            maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime();   
            timeout_C2[0].setEndTimeInTimeout(_accessDateTime);        
            emit successEvent("Successful execution!");
            return true;
        } else{
            emit failEvent("Conditions do not meet");
            return false;
        }               
    }

    function obligation_responseWorks(uint32 _accessDateTime)public onlyApplication() returns(bool){
        if(!timeout_C2[0].isTimeoutEnded(_accessDateTime) &&
            _resultFromXpath[0]
        ){
            maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime();
            emit successEvent("Successful execution!");
            return true;
        }else{
            emit failEvent("Conditions do not meet");
            return false;
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


