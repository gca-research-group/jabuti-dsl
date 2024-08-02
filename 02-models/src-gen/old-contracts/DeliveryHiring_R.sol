//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_R is EAI_Domain{
	
	Party deliverySystem;
	Party integrationProcess;
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(3, MINUTE, 0, 0);
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
		
		if(!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestDeliveryevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
