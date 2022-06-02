//SPDX-License-Identifier: MIT
pragma solidity >= 0.6.0 < 0.9.0;
pragma experimental 'ABIEncoderV2';
import "./SafeMath.sol";
import "./DateTimeLibrary.sol";
import "./UsefulFunctions.sol";

contract EAI_Domain{


uint constant SECOND = 1;
uint constant MINUTE = 2;
uint constant HOUR= 3;
uint constant DAY= 4;
uint constant WEEK= 5;
uint constant MONTH= 6;
uint constant YEAR= 7;


uint constant MONDAY=1;
uint constant TUESDAY=2;
uint constant WEDNESDAY=3;
uint constant THURSDAY=4;
uint constant FRIDAY=5;
uint constant SATURDAY=6;
uint constant SUNDAY=7;

////////////////// Define the necessary structs to compose the contract ////////////
    struct Party{
        string name;
        address walletAddress;
    }

    struct OperationLimit{
        uint requestsLimit;
        uint frequencyTime;        
        uint requestsPerformed;
        uint timeout;
    }

    struct DateInterval{
        uint start;
        uint end;
    }

    struct  BusinessDay{
        uint weekDay_start;
        uint weekDay_end;
   } 

    struct TimeInterval{ //  use to define a BusinessTime or NoBusinessTime
        uint start_hr;
        uint start_min;
        uint start_sec;
        uint end_hr;
        uint end_min;
        uint end_sec;
    }

    struct Timeout{
        uint increment;
        uint timeout;
    }

    struct DateTime{
        uint year;
        uint month;
        uint day;
        uint hour;
        uint minute;
        uint second;
    }



    
    ////////////// Modifiers to define the contrains to execute a give function ////////////////
  
    modifier onlyByProcess(address _processAddress){
       require(msg.sender == _processAddress, "Only PROCESS have the permission to execute this operation.");  
       _;
    }
    
    modifier onlyByApplication(address _applicationAddress){
       require(msg.sender == _applicationAddress, "Only APPLICATION has the permission to execute this operation.");  
       _;
    }
    
    ////////////// Events to register the summary of a given function ////////////////
   
    event success(string  _logMessage);
    event fail(string _logMessage);

    
    /////////////////// Funções referentes a struct BusinessDay /////////////////////////

    function setBusinessDay(uint _start, uint _end)internal pure returns (BusinessDay memory){
       // verifiar se os dias recebidos por parametros são validos. 
        return BusinessDay(_start, _end);
    }

    function isBusinessDay(string memory _accessDateTime, BusinessDay storage businessDay)internal returns(bool){
        // implementar a logica 
        return true;
    }

    //////////////////// Funções referentes à struct TimeInterval ///////////////////

    function  isIntoTimeInterval(string memory _accessDateTime, TimeInterval memory businessTime) internal returns(bool){
        // implementar a logica
        return true;
    }


    ///////////////// Funcões referentes à struct DateTime /////////////////////
    
    function setDateTime(string memory _dateTime)internal pure returns(DateTime memory){
        (uint year, uint month, uint day, uint hour, uint minute, uint second) = DateTimeLibrary.splitStringDateTimeInto6uint(_dateTime);
         DateTime memory dateTime = DateTime(year, month, day, hour, minute, second);
        //DateTime memory dateTime = DateTime(1, 2, 3 , 4, 5 ,6 );
       return dateTime;
    }

//     // comparar datas,( anos, meses, dias) e horas (hora, minutos e segundos)


//     /////////////////////////// Funções referentes à struct OperationLimit ///////////////////////////////

    function isOperationLimitExceeded(string memory _accessDateTime, OperationLimit memory operationLimit) internal pure returns(bool){
        // implementar a logica
        return false;
    }

    function setOperationLimit(uint _operations, uint _timeUnit) internal pure returns (OperationLimit memory){
        return OperationLimit(_operations, timeInSeconds(_timeUnit), 0, 0);
    }

   function setOperationLimit_timeout(uint _accessTime, uint _frequency )internal pure returns (uint) {
      return _accessTime + _frequency; 
   }

    function timeInSeconds(uint _timeUnit)internal pure returns (uint){

        require (_timeUnit >0 && _timeUnit<8, string(abi.encodePacked("The value: ", _timeUnit,", is invalid time unit")));

        if(_timeUnit==1){ return 1 seconds; }
        if(_timeUnit==2){ return 1 minutes; }
        if(_timeUnit==3){ return 1 hours; }
        if(_timeUnit==4){ return 1 days; }
        if(_timeUnit==5){ return 1 weeks; }
        if(_timeUnit==6){ return 30 days; }
        return 365 days; 
    }

/////////////////////////// Funções referentes à struct Timeout ///////////////////////////////
    function setTimeout(uint time)internal pure returns(Timeout memory){
       return Timeout(time, 0); // o timeout inicia zerado, será definido após a primeira chamda 

    }

/////////////////////////// Funções referentes à struct TimeInterval ///////////////////////////////

    function setTimeInterval(string memory _start, string memory _end) internal pure returns (TimeInterval memory){// testado e funcionado
        ( uint hr_start, uint min_start, uint sec_start) = DateTimeLibrary.splitStringTimeInto3uint(_start);
        (uint hr_end, uint min_end, uint sec_end) = DateTimeLibrary.splitStringTimeInto3uint(_end);
        return TimeInterval( hr_start, min_start, sec_start, hr_end, min_end, sec_end);
    }

    // função referente a struct TimeInterval, verifica se o _accessTime está de acordo com o intervalo definido
    function isIntoTimeInterval(uint _accessTime, TimeInterval memory _businessTime) internal pure returns (bool) {
        uint hr = DateTimeLibrary.getHour(_accessTime);
        uint min = DateTimeLibrary.getMinute(_accessTime);

        // if start hr is > que end hr, então se for maior que start e menor que end
        if( _businessTime.start_hr < _businessTime.end_hr){
             // example 08:30 -> 18:30
            // a hora deve ser maior que a hora de inicio, ou se a hora for igual, os minutos devem ser maior ou igual aos minutos de inicio 
            if(hr > _businessTime.start_hr || (hr == _businessTime.start_hr && min >= _businessTime.start_min)){
                 // a hora deve ser menor que hora final  ou se for for igual os minuto devem ser menor ou igual ao minuto final 
                if(hr < _businessTime.end_hr || (hr == _businessTime.end_hr && min < _businessTime.end_min)){
                    return true;                    
                }
            }
            return false;
        }else{
            // example 18:30 -> 06:30
            // a hora deve ser maior que a hora de inicio, ou se a hora for igual, os minutos devem ser maior ou igual aos minutos de inicio 
            if(hr > _businessTime.start_hr || (hr == _businessTime.start_hr && min >= _businessTime.start_min)){
                return true;
            }else if(hr < _businessTime.end_hr || (hr == _businessTime.end_hr && min < _businessTime.end_min)){
                return true;                                    
            }
            return false;            
        }
    }
 
  
}

