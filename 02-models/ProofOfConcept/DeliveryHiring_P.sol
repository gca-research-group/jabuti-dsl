//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;


	BusinessDay public businessDay = BusinessDay(SATURDAY, SUNDAY);
	TimeInterval public businessTime = TimeInterval(64800, 28800);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE,0,0);// no jabuti está definido 6,  porém, é para uma clausula de proibição, então o máximo permitido é 5.
	MessageContent public messageContent = MessageContent("count(//address)!=1");
	
    event failEvent(string  _logMessage);
    event successEvent(string _logMessage);

	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
	}

    function requestDelivery (uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){

        // Setting the prohibition regarding to the days and hours to request a delivery, the maximum request operation by minute and number of address by request"

	   	require(_performer == integrationProcess.walletAddress, "You have no permission to perform this operation.");

	    if(isBusinessDay(_accessDateTime, businessDay)|| 
	        isIntoTimeInterval(_accessDateTime, businessTime)||
	        isOperationLimitReached(_accessDateTime, operationLimit)||
	        _xPathResult)
	    	{
	   		    emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
	   		    return false;
	    	}

	   	emit successEvent("Success execution in clause ");
	    return true;
    }


}