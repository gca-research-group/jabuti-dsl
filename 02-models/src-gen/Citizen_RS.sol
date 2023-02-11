//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract Citizen_RS is EAI_Domain{
	
	Party Citizen Database;
	Party Integration Process;
	
	TimeInterval public timeInterval = TimeInterval(00:00:00, 05:59:59);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(700, MINUTE, 0, 0);
	TimeInterval public timeInterval = TimeInterval(06:00:00, 23:59:59);
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(400, MINUTE, 0, 0);
	
	event requestPhoneNumber_revent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Citizen Database = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function requestPhoneNumber_r(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestPhoneNumber_revent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
