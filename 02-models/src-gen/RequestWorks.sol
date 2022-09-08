//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract RequestWorks is EAI_Domain{
	
	Party Orcid;
	Party integrationProcess;
	
	BusinessDay public businessDay = BusinessDay(MONDAY, SUNDAY);
	TimeInterval public timeInterval = TimeInterval(00:00:00, 23:59:59);
	OperationLimit public operationLimit = OperationLimit(24, SECOND, 0, 0);
	
	event EventLog(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Orcid = Party(" ", _applicationWallet);
	    integrationProcess = Party("", _processWallet);
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
		
		emit EventLog ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
