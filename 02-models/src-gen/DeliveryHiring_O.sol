//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_O is EAI_Domain{
	
	Party deliverySystem;
	Party integrationProcess;
	
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(2, HOUR, 0, 0);
	TimeInterval public timeInterval = TimeInterval(8:00:00, 12:00:00);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(5, HOUR, 0, 0);
	TimeInterval public timeInterval = TimeInterval(Start, End);
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(SATURDAY, SUNDAY);
	MessageContent public messageContent = MessageContent("Content");
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(2, HOUR, 0, 0);
	TimeInterval public timeInterval = TimeInterval(8:00:00, 12:00:00);
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(SATURDAY, SUNDAY);
	MessageContent public messageContent = MessageContent("Content");
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(2, HOUR, 0, 0);
	TimeInterval public timeInterval = TimeInterval(8:00:00, 12:00:00);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(5, HOUR, 0, 0);
	TimeInterval public timeInterval = TimeInterval(Start, End);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(5, HOUR, 0, 0);
	Timeout public timeout = Timeout(50, 0);
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(SATURDAY, SUNDAY);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(2, HOUR, 0, 0);
	
	event respondIntervalAndLimitevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	deliverySystem = Party("integrationProcess ", _applicationWallet);
	    integrationProcess = Party("integrationProcess", _processWallet);
	}
	
	function respondIntervalAndLimit(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		isBusinessDay(_accessDateTime, businessDay) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		isBusinessDay(_accessDateTime, businessDay) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		!isTimeout(_accessDateTime, timeout.endTime) &&
		isBusinessDay(_accessDateTime, businessDay) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit respondIntervalAndLimitevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
