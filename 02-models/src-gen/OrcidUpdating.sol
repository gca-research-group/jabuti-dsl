//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract OrcidUpdating is EAI_Domain{
	
	Party Orcid;
	Party Integration Process;
	MaxNumberOfOperation public maxNumberOfOperation = MaxNumberOfOperation(8, SECOND, 0, 0);
	MessageContent public messageContent = MessageContent("//author/orcid/id/text()!=''");
	MessageContent public messageContent = MessageContent("//article/title/text()!=''");
	
	
	event requestUpdateevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Orcid = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function requestUpdate(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(!isOperationLimitReached(_accessDateTime, operationLimit) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit requestUpdateevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
