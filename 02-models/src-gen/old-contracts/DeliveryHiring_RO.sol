//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_RO is EAI_Domain{
	
	Party deliverySystem;
	Party integrationProcess;
	TimeInterval public timeInterval = TimeInterval(07:00:00, 18:00:00);
	MessageContent public messageContent = MessageContent("//clientID/text()");
	Timeout public timeout = Timeout(30, 0);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(50000, SECOND, 0, 0);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(10, MINUTE, 0, 0);
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(MONDAY, FRIDAY);
	MessageContent public messageContent = MessageContent("count(//item)<=10");
	MessageContent public messageContent = MessageContent("count(//item)");
	MessageContent public messageContent = MessageContent("count(//item)");
	
	
	event requestDeliveryevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	deliverySystem = Party("integrationProcess ", _applicationWallet);
	    integrationProcess = Party("integrationProcess", _processWallet);
	}
	
	function requestDelivery(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isTimeout(_accessDateTime, timeout.endTime) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isBusinessDay(_accessDateTime, businessDay) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestDeliveryevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
