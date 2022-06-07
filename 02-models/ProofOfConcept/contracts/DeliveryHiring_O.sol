//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;

	Timeout public timeout  = Timeout(60,0); // Normalmente o timeout é utilizado para definir um tempo de resposta, (em segundos)
	BusinessDay public businessDay = BusinessDay(MONDAY, FRIDAY);
	TimeInterval public businessTime = TimeInterval(28800,64800);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE,0,0);
	MessageContent public messageContent = MessageContent("count(//address)=1");
	
	string fail_description = "Breached condition "; 
    string success_description = "";
		
	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
	}
		
	// - discutir sobre onde sera definida a relação: Operation <-> function
	function responderOrder(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){

	   	// Setting the time limit for responding to a request
 
	   	require(_performer == deliverySystem.walletAddress, "You have no permission to perform this operation.");
	   
	   	bool isBreached=false; 
	    
		if(isTimeout(_accessDateTime, timeout.endTime)){
	        fail_description = string(abi.encodePacked(fail_description,": 'timeout' "));
	        isBreached=true;
	    }

	    if(!isBusinessDay(_accessDateTime, businessDay)){
	        fail_description = string(abi.encodePacked(fail_description,": 'Access performed out of BusinessDay' "));
	        isBreached=true;
	    }
	    	
	    if(!isIntoTimeInterval(_accessDateTime, businessTime)){
	        fail_description = string(abi.encodePacked(fail_description,": 'Access performed out of businessTime' "));
	        isBreached=true;
	    }
	    
	    if(isOperationLimitReached(_accessDateTime, operationLimit)){
			fail_description = string(abi.encodePacked(fail_description,": 'operationLimit reached' "));
	        isBreached=true;
	    }
	    

	    if (!_xPathResult){
	     	fail_description = string(abi.encodePacked(fail_description,": 'invalid content' ",_xPathContent));
	        isBreached=true;
	    }
	  	
	  	// se a clausula for violada emite um evento passando a descrição da falha 
	   	if(isBreached){
	   	    emit fail(fail_description);
	   	    return false;
	   	}

	    operationLimit.requestsPerformed+=1;
	    
	   	// emit success("Success execution in clause ");
	    return true;
	    
	}

}