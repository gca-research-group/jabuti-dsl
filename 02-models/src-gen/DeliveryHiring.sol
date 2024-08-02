//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
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
	    	
	//  1º STEP:  Import library to conditions/terms  ----------------------------------             
	    
	    
	      



