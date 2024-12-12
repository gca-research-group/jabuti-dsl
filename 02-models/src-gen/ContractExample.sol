//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract ContractExample {

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
 	using EAI for EAI.MaxNumberOfOperationByTime;
 	using EAI for EAI.MessageContent_Number;
 	
/*-------------- 2º STEP: Create the variables (from variables block) -------------------------*/		

/*---------------- 3º STEP: Identify and create variables referring to the clauses terms --------------*/  
	//---------------- Vectors of terms related to the requestDocuments clause(_C1). ---------------- 
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
	EAI.MessageContent_Number[] messageContent_Number_C1;

/*---------------- 4º STEP: Create the constructor method ------------------------------------------*/

	constructor(address _applicationWallet){
		activated = true;
		// Catch the date from jabuti contract 
		beginDate = 1695499200000;
		dueDate = 1727103600000;
		// Catch the name of the part for create the parties
		application = EAI.createParty("Application Name", _applicationWallet, false);             
		process = EAI.createParty("Integration Process Name", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;

		// Create the terms of the clauses, (check if some of them use a variable from variable block)


		//---------------- Terms related to the requestDocuments clause (C1). ----------------
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 2, EAI.SECOND ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  "count(//body/document)", "<=", 100 ));
	}

	function right_requestDocuments(
		uint32 accessDateTime,
		uint256[] memory messageContent_Number
		) public onlyProcess() returns(bool){
		
		if(
			maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(accessDateTime) &&
			messageContent_Number_C1[0].evaluateNumberContent(messageContent_Number[0])
		){
			maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime(accessDateTime);
			return true;
		}else{
			emit failEvent("Exceded number of documents");
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
