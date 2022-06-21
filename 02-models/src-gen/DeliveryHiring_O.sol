//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring_O is EAI_Domain{
	uint32 beginDate = 1641042000;
	uint32 dueDate = 1672527600;
	
	Party deliverySystem;
	Party integrationProcess;
	
	Timeout public timeout(60);
	BusinessDay public businessDay(MONDAY, FRIDAY);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE, 0, 0);
	MessageContent public messageContent = MessageContent("count(//address)=1");
}

event failEvent(string _logMessage);

constructor(address _applicationWallet, address _processWallet){
	
    deliverySystem = Party("Integration process ", _applicationWallet);
    integrationProcess = Party("Integration process", _processWallet);
}

function responseOrder (){
	
	require(_performer == deliverySystem.walletAddress, "You have no permission to perform this operation.");
	
	bool isBreached=false;
}
