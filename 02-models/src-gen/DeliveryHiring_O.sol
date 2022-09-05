//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_O is EAI_Domain{
	
	Party Name of application;
	Party Name of process;
	
	BusinessDay public businessDay = BusinessDay(FRIDAY, SUNDAY);
	OperationLimit public operationLimit = OperationLimit(1000, MONTH, 0, 0);
	
	event action(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Name of application = Party(" ", _applicationWallet);
	    Name of process = Party("", _processWallet);
	}
	
	function right(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit action ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
