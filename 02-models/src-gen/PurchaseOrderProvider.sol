//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract PurchaseOrderProvider is EAI_Domain{
	
	Party Supplier System Database;
	Party Integration Process;
	
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(MONDAY, FRIDAY);
	MessageContent public messageContent = MessageContent("//Tshirt/totalItems/text()");
	MessageContent public messageContent = MessageContent("//Tshirt/totalItems/text()");
	MessageContent public messageContent = MessageContent(" //purchaseOrder/orderValue/text()");
	MessageContent public messageContent = MessageContent(" //purchaseOrder/orderValue/text()");
	
	event writeDataevent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	Supplier System Database = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function writeData(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit writeDataevent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
