//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI_Domain.sol";

contract ContractExample is EAI_Domain{

	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

/* --------------------------- END: commom code for all contracts ----------------------- */  

/* =========== BEGIN: codes generated based in specific jabuti contract =================== */

/*----------------- 1º STEP: ADD IMPORTS TO THE TERMS USED IN THE CONTRACT ---------------*/
 	using EAI for EAI.MessageContent_Number_S
 	using EAI for EAI.MaxNumberOfOperationByTime_S
 	using EAI for EAI.TimeInterval_S
 	using EAI for EAI.Timeout_S
 	using EAI for EAI.WeekDaysInterval_S
 	using EAI for EAI.MessageContent_Number_PerTime_S
 	using EAI for EAI.MessageContent_onlyXPath_Boolean_S
 	
/*-------------- 2º STEP: Create the variables (from variables and terms block) -------------------------*/		
	


/*---------------- 3º STEP: Identify and create variables referring to the clauses terms --------------*/  
	//---------------- Vectors of terms related to the requestScore clause. ---------------- 
	MessageContent_Number_PerTime_S[] messageContent_Number_PerTime_S_C1
	MessageContent_Number_S[] messageContent_Number_S_C1
	Timeout_S[] timeout_S_C1
	MessageContent_onlyXPath_Boolean_S[] messageContent_onlyXPath_Boolean_S_C1
	TimeInterval_S[] timeInterval_S_C1
	WeekDaysInterval_S[] weekDaysInterval_S_C1
	MaxNumberOfOperationByTime_S[] maxNumberOfOperationByTime_S_C1
	//---------------- Vectors of terms related to the requestScoreP clause. ---------------- 
	Timeout_S[] timeout_S_C2
	TimeInterval_S[] timeInterval_S_C2
	//---------------- Vectors of terms related to the responseWithScore clause. ---------------- 
	Timeout_S[] timeout_S_C3
	//---------------- Vectors of terms related to the respondIntervalAndLimit clause. ---------------- 
	//---------------- Vectors of terms related to the requestDelivery clause. ---------------- 
	//---------------- Vectors of terms related to the responseOrder clause. ---------------- 
	//---------------- Vectors of terms related to the writeSMS_R clause. ---------------- 
	//---------------- Vectors of terms related to the writeSMS_P clause. ---------------- 
	//---------------- Vectors of terms related to the requestDocuments clause. ---------------- 
	//---------------- Vectors of terms related to the responseWithDocuments clause. ---------------- 
	//---------------- Vectors of terms related to the requestUpdate clause. ---------------- 
	//---------------- Vectors of terms related to the responseWorks clause. ---------------- 
	//---------------- Vectors of terms related to the requestDocuments clause. ---------------- 

/*---------------- 4º STEP: Create the constructor method ------------------------------------------*/

	constructor(address _applicationWallet){
		activated = true;
		// Catch the date from jabuti contract 
		beginDate = 1695499200000;
		dueDate = 1695499200000;
		// Catch the name of the part for create the parties
		application = EAI.createParty("Application Name", _applicationWallet, false);             
		process = EAI.createParty("Integration Process Name", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;

// Create the terms of the clauses, (check if some of them use a variable from variable block)





/* -------------- END: codes generated based in specific jabuti contract ------------- *da		da		da			/* ========================== BEGIN: code for all contracts ====================== *da		da			   /* the process sign the contract by default, the function signContractda			   is used to get the applicationParty signature*/     da			   function signContract() public onlyApplication() returns(bool) da			   require(application.aware == false, "The contract is already signed");       da			   application.aware = true; da			   updateMapParty(msg.sender, application)da						return trueda				  da		da			   function updateMapParty(address _walletAddress, EAI.Party storage _party)internal returns(bool){      da			   mapParty[_walletAddress] = _partyda						return trueda				  da				 da				  /* It only possible to change the name and the address of the party.da				  After change the  party, the new party need to sign the contract *da				  function changeApplicationParty(string memory _name, address _walletAddress) public returns(bool) {      da			   require(process.walletAddress == msg.sender, "Only the process can execute this operation")da			   delete mapParty[application.walletAddress]da			   application = EAI.createParty(_name, _walletAddress, false);         da			   updateMapParty(_walletAddress, application)da			   return true;      da				  da				 da				  function getProcessAddress() public view onlyInvolvedParties returns(address)da			   return process.walletAddressda				  da				 da				  function getApplicationAddress() public view onlyInvolvedParties returns(address)da			   return application.walletAddressda				  da		da			   function getParty(address _walletAddress) public view onlyInvolvedParties returns(EAI.Party memory)da			   return mapParty[_walletAddress]da			   da			  da			/* ==================================== MODIFIERS ==================================== *da			   modifier onlyApplication(){       da			   require(activated, "This contract is deactivated");           da			   require(application.walletAddress == msg.sender, "Only the application can execute this operation")da			   _;       da			   da		da			   modifier onlyProcess()da			   require(activated, "This contract is deactivated")da			   require(process.walletAddress == msg.sender, "Only the process can execute this operation")da			   _da			   da		da			   modifier onlyInvolvedParties()da			   require(activated, "This contract is deactivated")da			   requireda			   (application.walletAddress == msg.sender || process.walletAddress == msg.sender ) da			   "Only the process or the application can execute this operation")da			   _da			   da		da			da			/* --------------------------- END: code for all contracts ----------------------- */			
