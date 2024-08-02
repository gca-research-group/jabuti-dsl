//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract SendMessageWhatsapp is EAI_Domain{
	
	Party Whatsapp;
	Party Integration Process;
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(10000, MONTH, 0, 0);
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(MONDAY, FRIDAY);
	MessageContent public messageContent = MessageContent("");
	
	
	event sendMessageevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Whatsapp = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function sendMessage(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(!isOperationLimitReached(_accessDateTime, operationLimit) &&
		isBusinessDay(_accessDateTime, businessDay) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit sendMessageevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
