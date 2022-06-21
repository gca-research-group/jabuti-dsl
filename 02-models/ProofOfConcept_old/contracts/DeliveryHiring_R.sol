//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;
	
	BusinessDay public businessDay = BusinessDay(MONDAY, FRIDAY);
	TimeInterval public businessTime = TimeInterval(28800,64800);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE,0,0);
	MessageContent messageContent = MessageContent("count(//address)=1");
	
	string fail_description = "Breached condition:"; 
    string success_description = "";
		
	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
	}
		
	// - discutir sobre onde sera definida a relação: Operation <-> function
	function requestDelivery(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
	    
	    // Setting the days and hours to request a delivery and the maximum delivery distance
	   
	   	require(_performer == integrationProcess.walletAddress, "You have no permission to perform this operation.");
	   
	   	bool isBreached=false; 

	    if(!isBusinessDay(_accessDateTime, businessDay)){
	        fail_description = string(abi.encodePacked(fail_description,": 'Access performed out of BusinessDay'"));
	        isBreached=true;
	    }
	    	
	    if(!isIntoTimeInterval(_accessDateTime, businessTime)){
	        fail_description = string(abi.encodePacked(fail_description,": 'Access performed out of businessTime'"));
	        isBreached=true;
	    }
	    
	    if(isOperationLimitReached(_accessDateTime, operationLimit)){
			fail_description = string(abi.encodePacked(fail_description,": 'operationLimit reached'"));
	        isBreached=true;
	    }
	    
	    if (!_xPathResult){
			fail_description = string(abi.encodePacked(fail_description,": 'invalid content' ",_xPathContent));
	        isBreached=true;
	    }
	  	
	  	// se a clausula for violada emite um evento passando a descrção da falha 
	   	if(isBreached){
//	   	    Request operation performed outside of allowed hours or limit operation exceeded
//	   	    emit logMessageFail(fail_description);
	   	    return false;
	   	}

	    // operationLimit.requestsPerformed+=1;
	    
//	    emit success("Success execution in clause ");
	    return true;
	    
	}

}