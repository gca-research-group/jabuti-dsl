//SPDX-License-Identifier: MIT
pragma solidity >= 0.6.0 < 0.9.0;
pragma experimental 'ABIEncoderV2';
// import "./SafeMath.sol";
// import "./DateTimeLibrary.sol";
// import "./UsefulFunctions.sol";

// contract EAI_Domain{


//uint constant SECOND = 1;
//uint constant MINUTE = 2;
//uint constant HOUR= 3;
//uint constant DAY= 4;
//uint constant WEEK= 5;
//uint constant MONTH= 6;
//uint constant YEAR= 7;


//uint constant MONDAY=1;
//uint constant TUESDAY=2;
//uint constant WEDNESDAY=3;
//uint constant THURSDAY=4;
//uint constant FRIDAY=5;
//uint constant SATURDAY=6;
//uint constant SUNDAY=7;

////////////////// Define the necessary structs to compose the contract ////////////
//    struct Party{
//        string name;
//        address walletAddress;
//    }

//    struct OperationLimit{
//        uint requestsLimit;
//        uint frequencyTime;        
//        uint timeout;
//        uint requestsPerformed;
//    }
//
//    struct DateInterval{
//        uint start;
//        uint end;
//    }

//    struct  BusinessDay{
//        uint weekDay_start;
//        uint weekDay_end;
//   } 

//    struct TimeInterval{ //  use to define a BusinessTime or NoBusinessTime
//        uint32 start;
//        uint32 end;
//    }

//    struct Timeout{
//        uint32 increment;
//        uint32 endTime;
//    }

//	struct MessageContent{
//	    string xPathQuery;
//	    string binaryOperator;
//	    string referenceValue;
// 		uint frequencyTime;
//	    
//	    uint endOfInterval;
//	    uint accumulatedValue;
//	}
 
 
//	 struct SessionInterval {
//		uint duration;
//		uint timeUint;
//		string refereceValue;	     
//	 }
//	 
//	 function isSessionActive(SessionInterval memory session, uint timeStamp )internal pure returns(bool){
//	     //TODO
//	     return true;
//	 }
	 
//    function evaluateMessageContent(MessageContent memory msgContent, string memory value ) internal pure returns (bool){
//        //TODO
//
//        return true; 
//    }
//   
//    function evaluateMessageContent(MessageContent memory msgContent, string memory value, uint accessDateTime ) internal pure returns (bool){
//        //TODO
//
//        return true; 
//    }
//
//    function setMessageContentIntervalConstraint(string memory, string memory operator, string memory value, uint startDate, uint32 timeUnit) internal returns(MessageContent memory){
//    	uint endOfTimeInterval = setEndOfInterval(startDate, timeUnit);
//		return MessageContent("count(//address)","<=","100", MONTH, endOfTimeInterval, 0); 
//    }
    
//    function setEndOfInterval(uint startTime, uint timeUnit)internal pure returns(uint){
//		uint increment = timeInSeconds(timeUnit);
//
//       return startTime+increment; // o timeout inicia zerado, será definido após a primeira chamda 
//
//    }
    

    
    /////////////////// FUNÇÕES REFERENTES A STRUCT BUSINESSDAY /////////////////////////

//    function setBusinessDay(uint32 _start, uint _end)internal pure returns (BusinessDay memory){
//      // TODO  
//        return BusinessDay(_start, _end);
//    }
//
//    function isBusinessDay(uint32 _accessDateTime, BusinessDay storage businessDay)internal pure returns(bool){
//      // TODO  
//        return true;
//    }
//    
//    ///////////////// FUNÇÕES REFERENTES A DATETIME /////////////////////
//    
//    function setDateTime(string memory _dateTime)internal pure returns(uint32){
//      // TODO  
//       return 123456789;
//    }

//     /////////////////////////// FUNÇÕES REFERENTES A STRUCT OPERATIONLIMIT ///////////////////////////////

//    function isOperationLimitReached(uint32 _accessDateTime, OperationLimit memory operationLimit) internal pure returns(bool){
//        // implementar a logica
//        return false;
//    }
//
//    function setOperationLimit(uint _operations, uint _timeUnit) internal pure returns (OperationLimit memory){
//        return OperationLimit(_operations, timeInSeconds(_timeUnit), 0, 0);
//    }
//
//   function setOperationLimit_timeout(uint _accessTime, uint _frequency )internal pure returns (uint) {
//      return _accessTime + _frequency; 
//   }
//
//    function timeInSeconds(uint _timeUnit)internal pure returns (uint){
//
//        require (_timeUnit >0 && _timeUnit<8, string(abi.encodePacked("The value: ", _timeUnit,", is invalid time unit")));
//
//        if(_timeUnit==1){ return 1 seconds; }
//        if(_timeUnit==2){ return 1 minutes; }
//        if(_timeUnit==3){ return 1 hours; }
//        if(_timeUnit==4){ return 1 days; }
//        if(_timeUnit==5){ return 1 weeks; }
//        if(_timeUnit==6){ return 30 days; }// tem que fazer a verificação do mês para obter a quantidade de dias
//        return 365 days; // tem que fazer a verificação do ano para obter o número de dias no ano corrente
//    }


/////////////////////////// FUNÇÕES REFERENTES A STRUCT TIMEOUT ///////////////////////////////
    
//    function setEndTimeInTimeOut(uint32 _dataTime,  uint32  increment)internal pure returns(uint32){
//        return _dataTime+increment; // o timeout inicia zerado, será definido após a primeira chamada
//
//    }
//
//    function isTimeout(uint32 _accessDateTime, uint32 _timeout)internal pure returns (bool) {
//       // TODO
//       return true;
//    }

/////////////////////////// FUNÇÕES REFERENTES A STRUCT TIMEINTERVAL ///////////////////////////////
//    function setTimeInterval(uint32 _start, uint32 _end) internal pure returns (TimeInterval memory){// testado e funcionado
//    //    implementar a logica 
//        return TimeInterval(_start,_end);
//    }
//
//    // funções referente a struct TimeInterval, verifica se o _accessTime estão de acordo com o intervalo definido
//    function isIntoTimeInterval(uint _accessTime, TimeInterval memory _businessTime) internal pure returns (bool) {
//    	// implementar a logica
//    	return false;            
//    }
 
// }

