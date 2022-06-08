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
	
	event failEvent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
	}
		
	function responderOrder(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){

	   	// Setting the time limit for responding to a request
 
	   	require(_performer == deliverySystem.walletAddress, "You have no permission to perform this operation.");
	   
	   	bool isBreached=false; 
	    
		if(!isTimeout(_accessDateTime, timeout.endTime) &&
			isBusinessDay(_accessDateTime, businessDay)&&
			isIntoTimeInterval(_accessDateTime, businessTime)&&
			!isOperationLimitReached(_accessDateTime, operationLimit))
			{
			    operationLimit.requestsPerformed+=1;// increment the request counter if the response was correctly performed
	        	return true;
	    	}
	    
	   	emit failEvent("Request made outside of allowed hours or distance limit exceeded");
		return true;
	    
	}

}