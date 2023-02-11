//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DockRequest is EAI_Domain{
	
	Party SpanishPortSystem;
	Party Integration Process;
	
	MessageContent public messageContent = MessageContent("//arriveData != """);
	MessageContent public messageContent = MessageContent("//departureData != """);
	MessageContent public messageContent = MessageContent("//MMSI != """);
	MessageContent public messageContent = MessageContent("//IMO != """);
	
	event requestBerthingevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	SpanishPortSystem = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function requestBerthing(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if() {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestBerthingevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
