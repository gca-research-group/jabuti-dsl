//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;
	
	BusinessDay public businessDay = BusinessDay(MONDAY, FRIDAY);
	TimeInterval public businessTime = TimeInterval(28800,64800);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE,0,0);
	MessageContent messageContent = MessageContent("count(//address)=1");
	
    event successEvent(string  _logMessage);
    event failEvent(string _logMessage);

    
	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
	}
		
	function requestDelivery(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
	    
	    // Setting the days and hours to request a delivery and the maximum delivery distance
	   
	   	require(_performer == integrationProcess.walletAddress, "You have no permission to perform this operation.");

		if(isBusinessDay(_accessDateTime, businessDay) && 
		   isIntoTimeInterval(_accessDateTime, businessTime)&&
		   !isOperationLimitReached(_accessDateTime, operationLimit)&&
		   _xPathResult )
		   {
			    emit successEvent("Success execution in clause");
			    return true;
		   }	
	  
	    
	   	emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
	   	return false;
	}

}