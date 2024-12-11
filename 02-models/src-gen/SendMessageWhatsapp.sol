//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract SendMessageWhatsapp is EAI{

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
 	using EAI for EAI.MessageContent_Number;
 	using EAI for EAI.MaxNumberOfOperationByTime;
 	using EAI for EAI.MessageContent_Number_PerTime;
 	using EAI for EAI.Timeout;
 	using EAI for EAI.MessageContent_String;
 	using EAI for EAI.MessageContent_onlyXPath_String;
 	using EAI for EAI.TimeInterval;
 	using EAI for EAI.WeekDaysInterval;
 	using EAI for EAI.MessageContent_onlyXPath_Boolean;
 	using EAI for EAI.SessionInterval;
 	using EAI for EAI.MaxNumberOfOperation;
 	
/*-------------- 2º STEP: Create the variables (from variables and terms block) -------------------------*/		
	String var;
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
		dueDate = 1672570800000;
		// Catch the name of the part for create the parties
		application = EAI.createParty("Whatsapp", _applicationWallet, false);             
		process = EAI.createParty("Integration Process", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;

		// Create the terms of the clauses, (check if some of them use a variable from variable block)

		var = "teste";
		session = EAI.createSessionInterval( 24, HOUR ));	
		conversationStarter = EAI.createMessageContent_onlyXPath_String(  "//conversationStarter/text()" ));	

		//---------------- Terms related to the sendMessage clause (C1). ----------------
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( MONDAY, FRIDAY ));
	}

	function right_sendMessage(
		WeekDaysInterval[] memory weekDaysInterval
		) public returns(bool){
		
		if(
			weekDaysInterval_C1[0].isIntoWeekDaysInterval(weekDaysInterval[0])
		){
			return true;
		}else{
			emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
			return false;
		}
	}
	

/* -------------- END: codes generated based in specific jabuti contract ------------- 

/* --------------------------- END: code for all contracts ----------------------- */
