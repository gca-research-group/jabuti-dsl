//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_O is EAI_Domain{
	
	Party deliverySystem;
	Party integrationProcess;
	MessageContent public messageContent = MessageContent("Content");
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(MONDAY, WEDNESDAY);
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(FRIDAY, SATURDAY);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(2, HOUR, 0, 0);
	TimeInterval public timeInterval = TimeInterval(08:00:00, 12:00:00);
	TimeInterval public timeInterval = TimeInterval(08:00:00, 12:00:00);
	
	
	event respondIntervalAndLimitevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	deliverySystem = Party("integrationProcess ", _applicationWallet);
	    integrationProcess = Party("integrationProcess", _processWallet);
	}
	
	function respondIntervalAndLimit(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		isBusinessDay(_accessDateTime, businessDay) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit respondIntervalAndLimitevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
