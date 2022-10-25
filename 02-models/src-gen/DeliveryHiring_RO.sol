//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_RO is EAI_Domain{
	
	Party deliverySystem;
	Party integrationProcess;
	
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(MONDAY, FRIDAY);
	TimeInterval public timeInterval = TimeInterval(08:30:00, 18:30:00);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(5, DAY, 0, 0);
	MessageContent public messageContent = MessageContent("");
	MessageContent public messageContent = MessageContent("");
	MessageContent public messageContent = MessageContent("");
	
	event requestDeliveryevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	deliverySystem = Party("integrationProcess ", _applicationWallet);
	    integrationProcess = Party("integrationProcess", _processWallet);
	}
	
	function requestDelivery(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestDeliveryevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
