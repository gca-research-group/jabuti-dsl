//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract SendMessageWhatsapp {

	bool activated;
	uint64 beginDate; 
	uint64 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

/* --------------------------- END: commom code for all contracts ----------------------- */  

/* =========== BEGIN: codes generated based in specific jabuti contract =================== */

/*----------------- 1º STEP: ADD IMPORTS TO THE TERMS USED IN THE CONTRACT ---------------*/
 	using EAI for EAI.SessionInterval;
 	using EAI for EAI.MessageContent_onlyXPath_String;
 	using EAI for EAI.WeekDaysInterval;
 	
/*-------------- 2º STEP: Create the variables (from variables block) -------------------------*/		
	string var;
	EAI.SessionInterval session;
	EAI.MessageContent_onlyXPath_String conversationStarter;

/*---------------- 3º STEP: Identify and create variables referring to the clauses terms --------------*/  
	//---------------- Vectors of terms related to the sendMessage clause(_C1). ---------------- 
	EAI.WeekDaysInterval[] weekDaysInterval_C1;

/*---------------- 4º STEP: Create the constructor method ------------------------------------------*/

	constructor(address _applicationWallet){
		activated = true;
		// Catch the date from jabuti contract 
		beginDate = 1672570800000;
		dueDate = 1704056400000;
		// Catch the name of the part for create the parties
		application = EAI.createParty("Whatsapp", _applicationWallet, false);             
		process = EAI.createParty("Integration Process", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;

		// Create the terms of the clauses, (check if some of them use a variable from variable block)

		var = "teste";
		session = EAI.createSessionInterval( 24, EAI.HOUR );	
		conversationStarter = EAI.createMessageContent_onlyXPath_String(  "//conversationStarter/text()" );	

		//---------------- Terms related to the sendMessage clause (C1). ----------------
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( EAI.MONDAY, EAI.FRIDAY ));
	}

	function right_sendMessage(
		) public onlyProcess() returns(bool){
		
		if(
			weekDaysInterval_C1[0].isIntoWeekDaysInterval(weekDaysInterval[0])
		){
			case true: write - right
	
			return true;
		}else{

			emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
			return false;
		}
	}
	

/* -------------- END: codes generated based in specific jabuti contract ------------- 

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
/* --------------------------- END: code for all contracts ----------------------- */
}
