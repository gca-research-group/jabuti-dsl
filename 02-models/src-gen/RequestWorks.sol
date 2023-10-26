//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract RequestWorks is EAI_Domain{
	
	Party Orcid;
	Party Integration Process;
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(MONDAY, SUNDAY);
	TimeInterval public timeInterval = TimeInterval(00:00:00, 23:59:59);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(24, SECOND, 0, 0);
	
	
	event requestAllWorksevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Orcid = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function requestAllWorks(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestAllWorksevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
