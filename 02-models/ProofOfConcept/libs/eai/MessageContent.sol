//SPDX-License-Identifier
pragma solidity >=0.6.0 <=0.9.0;

contract MessageContent{
    
	struct MessageContent{
	    string xPathQuery;
	    string binaryOperator;
	    string referenceValue;
 		uint frequencyTime;
	    
	    uint endOfInterval;
	    uint accumulatedValue;
	} 
	
	
	function evaluateMessageContent(MessageContent memory msgContent, string memory value ) internal pure returns (bool){
        //TODO

        return true; 
    }
   
    function evaluateMessageContent(MessageContent memory msgContent, string memory value, uint accessDateTime ) internal pure returns (bool){
        //TODO

        return true; 
    }

    function setMessageContentIntervalConstraint(string memory, string memory operator, string memory value, uint startDate, uint32 timeUnit) internal returns(MessageContent memory){
    	uint endOfTimeInterval = setEndOfInterval(startDate, timeUnit);
		return MessageContent("count(//address)","<=","100", MONTH, endOfTimeInterval, 0); 
    }
    
}