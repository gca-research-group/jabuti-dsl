//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_O is EAI_Domain{
	uint32 beginDate = 1641042000;
	uint32 dueDate = 1672527600;
	
	Party deliverySystem;
	Party integrationProcess;
	
	Timeout public timeout = Timeout(60, 0);
	BusinessDay public businessDay = BusinessDay(MONDAY, FRIDAY);
	TimeInterval public businessTime = TimeInterval(08:30:00, 18:31:00);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE, 0, 0);
	MessageContent public messageContent = MessageContent("count(//address)=1");
	
	event failEvent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	deliverySystem = Party("Integration process ", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
	}
	
	function responseOrder(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		require(_performer == deliverySystem.walletAddress, "You have no permission to perform this operation.");
		bool isBreached=false;
		
		if(!isTimeout(_accessDateTime, timeout.endTime) &&
		isBusinessDay(_accessDateTime, businessDay) &&
		isIntoTimeInterval(_accessDateTime, businessTime) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit failEvent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
