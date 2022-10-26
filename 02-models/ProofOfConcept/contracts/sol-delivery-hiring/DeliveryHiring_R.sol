//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

// import "../../libs/eai/WeekDaysInterval.sol";
import "../../libs/eai/TimeInterval.sol";
import "../../libs/eai/MaxNumberOfOperation.sol";
import "../../libs/eai/MessageContent.sol";
import "../../libs/eai/Party.sol";
import "../../libs/util/TimeUnit.sol";
// import "../../libs/util/WeekDays.sol";

contract DeliveryHiring{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;
	
	// variables referring to the requestDeliver clause	
	WeekDaysInterval[] public weekDaysInterval_request;
	TimeInterval[] public timeInterval_request;
	MaxNumberOfOperation[] public MaxNumberOfOperation_request;
	MessageContent[] public messageContent_request;
   
  event onBreach_01(string message);

	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
			
		weekDaysInterval_request.push(WeekDaysInterval(Monday, FRIDAY));

		timeInterval_request.push(TimeInterval(28800,64800));
		MaxNumberOfOperation_request.push(MaxNumberOfOperation(5, MONDAY, 0, 0));
		messageContent_request.push(MessageContent("count(//address)",">=","1",0,0,0));
		messageContent_request.push(MessageContent("count(//address)","<=","3",0,0,0));
		messageContent_request.push(MessageContent("count(//address)","<=","200",MONTH, setEndOfInterval(beginDate, MONTH), 0)); 
//		messageContent_request.push(setMessageContentIntervalConstraint("count(//address)","<=","200",MONTH,beginDate)); 
	}
    
		
	function requestDelivery(uint32 _accessDateTime, string[] memory _xPathContent, address _performer) public returns(bool){
	    
	    // Setting the days and hours to request a delivery and the maximum delivery distance
	   
	   	require(_performer == integrationProcess.walletAddress, "You have no permission to perform this operation.");

		if(isBusinessDay(_accessDateTime, businessDay[0]) && 
		   isIntoTimeInterval(_accessDateTime, timeInterval[0])&&
		   !isOperationLimitReached(_accessDateTime, operationLimit[0])&&
		   evaluateMessageContent(messageContent_request[0], _xPathContent[0]) &&
		   evaluateMessageContent(messageContent_request[1],_xPathContent[1], _accessDateTime))
		   {
			    return true;
		   }	
	    
	   	emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
	   	return false;
	}

}