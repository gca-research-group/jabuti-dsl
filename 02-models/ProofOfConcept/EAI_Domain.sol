//SPDX-License-Identifier: MIT
pragma solidity >= 0.6.0 < 0.9.0;
pragma experimental 'ABIEncoderV2';
import "./SafeMath.sol";
import "./DateTimeLibrary.sol";

abstract contract EAI_Domain{


uint constant SECOND = 1;
uint constant MINUTE = 2;
uint constant HOUR= 3;
uint constant DAY= 4;
uint constant WEEK= 5;
uint constant MONTH= 6;
uint constant YEAR= 7;


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

/////////////////////////// Funções referentes à struct OperationLimit ///////////////////////////////

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

    function stringDateToTimestamp(string memory _dateAndTime) public pure returns(uint){
        uint dateTime;
        uint year;
        bool isValid;
        ( year, isValid) = stringToUint(string(abi.encodePacked(bytes(_dateAndTime)[0],
                                                            bytes(_dateAndTime)[1], 
                                                            bytes(_dateAndTime)[2], 
                                                            bytes(_dateAndTime)[3])));
        return dateTime;
    }

    function setTimeInterval(string memory _start, string memory _end) public pure returns (TimeInterval memory){// testado e funcionado
        uint hr_start; uint min_start; uint sec_start; uint hr_end; uint min_end; uint sec_end; bool hasError;

        (hr_start,hasError) = stringToUint(string(abi.encodePacked(bytes(_start)[0], bytes(_start)[1])));
        require(hasError == false && hr_start <24, "Invalid start hour");
        (min_start,hasError) = stringToUint(string(abi.encodePacked(bytes(_start)[3], bytes(_start)[4])));
        require(hasError == false && min_start <60, "Invalid start minute");
        (sec_start,hasError) = stringToUint(string(abi.encodePacked(bytes(_start)[6], bytes(_start)[7])));
        require(hasError == false && sec_start<60, "Invalid start second");
        
        (hr_end, hasError) = stringToUint(string(abi.encodePacked(bytes(_end)[0],bytes(_end)[1])));
        require(hasError == false && hr_end<60, "Invalid end hour");
        (min_end,hasError) = stringToUint(string(abi.encodePacked(bytes(_end)[3], bytes(_end)[4])));
        require(hasError == false && min_end <60, "Invalid end minute");
        (sec_end,hasError) = stringToUint(string(abi.encodePacked(bytes(_end)[6], bytes(_end)[7])));
        require(hasError == false && sec_end<60, "Invalid end second");
        // falta fazer as verificações se horas é menor que 24, minutos e segundos menor que 60 
        
        return TimeInterval( hr_start, min_start, sec_start, hr_end, min_end, sec_end);
    }

    function stringToUint(string memory _s) internal pure returns (uint, bool) { // testado e funcionado
        bool hasError = false;
        bytes memory b =  bytes(_s);
        uint256 result = 0;
        uint256 oldResult = 0;
        for (uint i = 0; i < b.length; i++) { // c = b[i] was not needed
            if (uint8(bytes(b)[i]) >= 48 && uint8(bytes(b)[i]) <= 57) {
                // store old value so we can check for overflows
                oldResult = result;
                result = result * 10 + (uint8(b[i]) - 48); // bytes and int are not compatible with the operator -.
                // prevent overflows
                if(oldResult > result ) {
                    // we can only get here if the result overflowed and is smaller than last stored value
                    hasError = true;
                }
            } else {
                hasError = true;
            }
        }
        return (result, hasError); 
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