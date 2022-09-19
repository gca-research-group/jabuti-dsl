//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;

	Timeout[] public timeout; // Normalmente o timeout é utilizado para definir um tempo de resposta, (em segundos)
	BusinessDay[] public businessDay; 
	TimeInterval[] public timeInterval; 
	OperationLimit[] public operationLimit;  
	MessageContent[] public messageContent;
	
	event failEvent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);

		timeout.push(Timeout(180,0));
	    businessDay.push(BusinessDay(MONDAY, FRIDAY));
		timeInterval.push(TimeInterval(28800,64800));
		operationLimit.push(OperationLimit(5, DAY,0,0));
		messageContent.push(MessageContent("//budget/id/text()" != ""));
	}
		
	function responderOrder(uint32 _accessDateTime, string[] memory _xPathContent, address _performer) public returns(bool){

	   	// Setting the time limit for responding to a request
 
	   	require(_performer == deliverySystem.walletAddress, "You have no permission to perform this operation.");
	   
	   	bool isBreached=false; 
	    
		if(!isTimeout(_accessDateTime, timeout[0].endTime) &&
			isBusinessDay(_accessDateTime, businessDay[0]) &&
			isIntoTimeInterval(_accessDateTime, timeInterval[0]) &&
			!isOperationLimitReached(_accessDateTime, operationLimit[0]) &&
			evaluateMessageContent(messageContent[0], _xPathContent[0]))
			{
			    operationLimit[0].requestsPerformed+=1;// increment the request counter if the response was correctly performed
	        	return true;
	    	}
	    
	   	emit failEvent("Request made outside of allowed hours or distance limit exceeded");
		return false;
	    
	}

}