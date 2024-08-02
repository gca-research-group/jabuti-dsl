//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract FlightFacade is EAI_Domain{
	
	Party Flight Facade;
	Party Integration Process;
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(SUNDAY, SATURDAY);
	TimeInterval public timeInterval = TimeInterval(06:00:00, 22:59:00);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(100, MINUTE, 0, 0);
	MessageContent public messageContent = MessageContent("count(//trip/path)");
	MessageContent public messageContent = MessageContent("//origin/text()");
	
	
	event requestRightevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Flight Facade = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function requestRight(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestRightevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
