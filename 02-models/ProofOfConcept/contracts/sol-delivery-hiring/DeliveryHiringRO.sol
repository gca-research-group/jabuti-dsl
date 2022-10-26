//SPDX-License-Identifier:MIT
import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;

	// variables referring to the requestDeliver clause	
	BusinessDay[] public businessDay;

	TimeInterval[] public timeInterval;
	OperationLimit[] public operationLimit;
	MessageContent[] public messageContent_request;

	// variables referring to the responderOrer clause
	Timeout[] public timeout; 
	MessageContent[] public messageContent_response;
   
	event successEvent(string  message);
    event failEvent(string message);

	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
			
		businessDay.push(BusinessDay(MONDAY, FRIDAY));

		timeInterval.push(TimeInterval(28800,64800));
		operationLimit.push(OperationLimit(5, DAY,0,0));
		messageContent_request.push(MessageContent("count(//address)",">=","1",0,0,0));
		messageContent_request.push(MessageContent("count(//address)","<=","3",0,0,0));
		messageContent_request.push(MessageContent("count(//address)","<=","200",MONTH, setEndOfInterval(beginDate, MONTH), 0)); 
//		messageContent_request.push(setMessageContentIntervalConstraint("count(//address)","<=","200",MONTH,beginDate)); 

		timeout.push(Timeout(180,0));
		messageContent_response.push(MessageContent("//budget/id/text()", "!=", "",0,0,0));
	}

	 /// @notice Setting the days and hours to request a delivery and the maximum delivery distance
	function requestDelivery(uint32 _accessDateTime, string[] memory _xPathContent, address _performer) public returns(bool){
	   	require(_performer == integrationProcess.walletAddress, "You have no permission to perform this operation.");
		if(isBusinessDay(_accessDateTime, businessDay[0]) && 
		isIntoTimeInterval(_accessDateTime, timeInterval[0])&&
		!isOperationLimitReached(_accessDateTime, operationLimit[0])&&
		evaluateMessageContent(messageContent_request[0], _xPathContent[0])&&
		evaluateMessageContent(messageContent_request[1], _xPathContent[1])&&
		evaluateMessageContent(messageContent_request[2], _xPathContent[2],_accessDateTime))
		{
			timeout[0].endTime = setEndTimeInTimeOut(_accessDateTime, timeout[0].increment);
		    return true;
		}		
	   	emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
	   	return false;
	}
	
	  /// @notice Setting the time limit for responding to a request
	function responderOrder(uint32 _accessDateTime, string[] memory _xPathContent, bool[] memory _xPathResult, address _performer) public returns(bool){
	   	require(_performer == deliverySystem.walletAddress, "You have no permission to perform this operation.");
		if(!isTimeout(_accessDateTime, timeout[0].endTime)&&
		evaluateMessageContent(messageContent_response[0], _xPathContent[0]))
		{
			operationLimit[0].requestsPerformed+=1;// increment the request counter if the response was correctly performed
	        return true;
	    }
	   	emit failEvent("Exceeded response time or message content mismatch");
		return false;
	}
}