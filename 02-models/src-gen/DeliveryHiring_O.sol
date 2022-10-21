//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_O is EAI_Domain{
	
	Party deliverySystem;
	Party integrationProcess;
	
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(1000, MONTH, 0, 0);
	Timeout public timeout = Timeout(2, 0);
	
	event respondIntervalAndLimitevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	deliverySystem = Party("integrationProcess ", _applicationWallet);
	    integrationProcess = Party("integrationProcess", _processWallet);
	}
	
	function respondIntervalAndLimit(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(!isOperationLimitReached(_accessDateTime, operationLimit) &&
		!isTimeout(_accessDateTime, timeout.endTime) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit respondIntervalAndLimitevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
