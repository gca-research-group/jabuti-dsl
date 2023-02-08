//SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;

// import "./libs/EAI_Domain.sol";

// contract DeliveryHiring is EAI_Domain{

//     uint32 beginDate = 1641024000;
//     uint32 dueDate = 1672509600;

//     Party application;
//     Party process;
	
// 	BusinessDay[] public businessDay;
// 	OperationLimit[] public operationLimit;
	
    
//     MessageContent public conversationID = MessageContent("//conversationId/text()");
//     MessageContent public	conversationStarter = MessageContent("//conversationStarter/text()");
//     SessionInterval public session = SessionInterval(24, HOUR, conversationID.referenceValue);



//     constructor (address _applicationWallet, address _processWallet) {
//         application = Party("Delivery system", _applicationWallet);
//         process = Party("Integration process", _processWallet);
        
// 		businessDay.push(BusinessDay(MONDAY, FRIDAY));
// 		operationLimit.push(OperationLimit(1000, MONTH,0,0));

//     }


//     event EventLog(string _logMessage);

//     function requestDelivery( uint32 _accessDateTime, string[] memory _xPathContent, address _performer) public returns ( bool) {
//         require(_performer == process.walletAddress, "You have no permission to perform this operation.");

//         bool condition = (isSessionActive(session, _accessDateTime) && evaluateMessageContent(conversationStarter, _xPathContent[0]));

//         if (isBusinessDay(_accessDateTime, businessDay) && condition) {
//             operationLimit[0].requestsPerformed += 1;
//             return true;
//         }
        
// 		emit EventLog ("Request made outside of allowed hours or distance limit exceeded");
// 		return false;
// 	}
		
// }


