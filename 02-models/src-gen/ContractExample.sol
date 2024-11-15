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
 	using EAI for EAI.MessageContent_String;
 	using EAI for EAI.MessageContent_onlyXPath_String;
 	using EAI for EAI.Timeout;
 	using EAI for EAI.TimeInterval;
 	using EAI for EAI.WeekDaysInterval;
 	using EAI for EAI.MessageContent_Number;
 	using EAI for EAI.MaxNumberOfOperationByTime;
 	using EAI for EAI.MessageContent_Number_PerTime;
 	
/*-------------- 2º STEP: Create the variables (from variables and terms block) -------------------------*/		

/*---------------- 3º STEP: Identify and create variables referring to the clauses terms --------------*/  
	//---------------- Vectors of terms related to the requestDocuments clause. ---------------- 
	EAI.MessageContent_Number[] messageContent_Number_C1
	;
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1
	;

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


		messageContent_Number_C1.push(EAI.createMessageContent_Number( "count(//body/document)", "<=", 100 ));
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 2, SECOND ));
	}

/* -------------- END: codes generated based in specific jabuti contract ------------- 

/* --------------------------- END: code for all contracts ----------------------- */
