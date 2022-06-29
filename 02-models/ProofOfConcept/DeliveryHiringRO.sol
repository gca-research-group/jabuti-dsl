//SPDX-License-Identifier:MIT
import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;

	// variables referring to the requestDeliver clause	
	BusinessDay public businessDay = BusinessDay(MONDAY, FRIDAY);
	TimeInterval public businessTime = TimeInterval(28800,64800);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE,0,0);
	MessageContent[] public messageContent_request;


	// variables referring to the responderOrer clause
	Timeout public timeout  = Timeout(60,0); 
	MessageContent[] public messageContent_response;
    
	event successEvent(string  message);
    event failEvent(string message);

	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
			
		messageContent_request.push(MessageContent("count(//address)=1"));
		messageContent_response.push(MessageContent("//budget/id/text()!=''")); 
		messageContent_response.push(MessageContent("//cost/text()!=''")); 		
	}

	function requestDelivery(uint32 _accessDateTime, string[] memory _xPathContent, bool[] memory _xPathResult, address _performer) public returns(bool){
	    // Setting the days and hours to request a delivery and the maximum delivery distance
	   	require(_performer == integrationProcess.walletAddress, "You have no permission to perform this operation.");
		if(isBusinessDay(_accessDateTime, businessDay) && 
		isIntoTimeInterval(_accessDateTime, businessTime)&&
		!isOperationLimitReached(_accessDateTime, operationLimit)&&
		msgContentEvaluation(_xPathContent, _xPathResult)) {
			emit successEvent("Success execution in requestDelivery clause");
			timeout.endTime = setEndTimeInTimeOut(_accessDateTime, timeout.increment);
		    return true;
		}		
	   	emit failEvent("Request operation performed outside of allowed hours or limit operation exceeded");
	   	return false;
	}

	function responderOrder(uint32 _accessDateTime, string[] memory _xPathContent, bool[] memory _xPathResult, address _performer) public returns(bool){
	   	// Setting the time limit for responding to a request
	   	require(_performer == deliverySystem.walletAddress, "You have no permission to perform this operation.");
		if(!isTimeout(_accessDateTime, timeout.endTime)&&
		msgContentEvaluation(_xPathContent, _xPathResult)){
			operationLimit.requestsPerformed+=1;// increment the request counter if the response was correctly performed
	        return true;
	    }
	   	emit failEvent("Exceeded response time or message content mismatch");
		return false;
	}
}