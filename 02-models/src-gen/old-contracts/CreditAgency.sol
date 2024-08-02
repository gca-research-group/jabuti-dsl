//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract CreditAgency is EAI_Domain{
	
	Party creditAgency;
	Party integrationProcess;
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(1000, SECOND, 0, 0);
	MessageContent public messageContent = MessageContent("count(//CPF)");
	
	
	event requestScoreevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	creditAgency = Party("integrationProcess ", _applicationWallet);
	    integrationProcess = Party("integrationProcess", _processWallet);
	}
	
	function requestScore(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestScoreevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
