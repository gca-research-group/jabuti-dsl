/* ========================== BEGIN: code for all contracts ====================== */
//SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;

import "../../lib/eai/EAI.sol";

contract WebOfScience {
 
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

    // ADD NEW CONTENT HERE

// ----------------------------------------------------------------------------------

// 2º STEP: Identify and create the variables  from " variable block" ---------------  
  
    // ADD NEW CONTENT HERE IF EXIST

// ----------------------------------------------------------------------------------


// 3º STEP: Identify and create variables referring to the clauses terms ------------
	
    // ADD NEW CONTENT HERE

// -----------------------------------------------------------------------------------


// 4º STEP: Create the constructor method --------------------------------------------
	constructor(address _applicationWallet){
	 	
        // Catch the date from jabuti contract 
        beginDate = 11111111; // UPDATE THE beginDate AND dueDate
	    dueDate = 11111111; 
        // Catch the name of the part for creaty the parties         
	    application = EAI.createParty("*****************", _applicationWallet, false);  // UPDATE THE application NAME
        process = EAI.createParty("*****************", msg.sender, true);               // UPDATE THE process NAME
        mapParty[msg.sender] = process;
        mapParty[_applicationWallet] = application;

// 5º STEP: Create the terms of the clauses, (check if some of them use a variable from variable block)

         // ADD NEW CONTENT HERE

	}
	
// 6º STEP: Translate the clauses to functions


    // ADD NEW CONTENT HERE


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

}
/* --------------------------- END: code for all contracts ----------------------- */  


