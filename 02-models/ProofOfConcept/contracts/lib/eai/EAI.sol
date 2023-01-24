
//SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;


// pragma experimental 'ABIEncoderV2';

library EAI{    
    
/* ========================================================================== */
/*                                   CONSTANTS                                */
/* -------------------------------------------------------------------------- */

    // weekdays

    uint8 constant SUNDAY=0;
    uint8 constant MONDAY=1;
    uint8 constant TUESDAY=2;
    uint8 constant WEDNESDAY=3;
    uint8 constant THURSDAY=4;
    uint8 constant FRIDAY=5;
    uint8 constant SATURDAY=6;

    // time
    uint8 constant SECOND = 0;
    uint8 constant MINUTE = 1;
    uint8 constant HOUR= 2;
    uint8 constant DAY= 3;
    uint8 constant WEEK= 4;
    uint8 constant MONTH= 5;
    uint8 constant YEAR= 6;

    // Interval in seconds between the min and max hour 
    // allowed to use in a contract(0 to 23:59:59)
    uint32 constant MIN_HOUR = 0;
    uint32 constant MAX_HOUR= 86399; 

    uint32 constant SECONDS_PER_DAY = 24*60*60;
    uint32 constant OFFSET19700101 = 2440588; // off,,set copiado da lib date... verificar o valor ...
    uint32 constant OFFSETWEEK = 259200; 
/* ========================================================================== */
/*                                     PARTY                                  */
/* ========================================================================== */
  
       struct Party{
        string name;
        address walletAddress;
        bool aware;
    }

    function createParty(string memory _name, address _walletAddress, bool _aware) internal pure returns(Party memory){
        return Party(_name, _walletAddress, _aware);
    }
    
    // function getParty(Party memory _party) internal pure returns(Party memory){
    //     return _party;
    // }

    function setPartyName(Party storage _party, string memory _name) internal {
        _party.name = _name;
    }

    // if the address is change, then da new party need to sign the contract 
    function setPartyAddress(Party storage _party, address _walletAddress) internal {
        _party.walletAddress = _walletAddress;
        _party.aware = false;
    }

    function becomeAware(Party storage _party) internal{
        _party.aware = true;
    }


/* ========================================================================== */
/*                             WEEK_DAYS_INTERVAL                     */
/* ========================================================================== */
  
    struct  WeekDaysInterval{
        uint8 start;
        uint8 end;
    } 

    function createWeekDaysInterval(
        uint8 _start, 
        uint8 _end
        ) internal pure onlyValidDays(_start, _end) returns ( WeekDaysInterval memory){
        return WeekDaysInterval(_start, _end);
    } 

    function setWeekDayInterval( 
        WeekDaysInterval storage _wdi,
        uint8 _start,
        uint8 _end
        ) internal onlyValidDays(_start, _end){
        _wdi.start= _start;
        _wdi.end = _end;     
    }

    function getOneWeekDaysInterval( WeekDaysInterval memory _wdi )internal pure returns(uint8 start, uint8 end){
            return (_wdi.start, _wdi.end);
    }

    function getAllWeekDaysIntervals(WeekDaysInterval[] memory _wdi) internal pure returns(WeekDaysInterval[] memory) {
        return _wdi;     
    }


   // check into a set of weekDaysIntervals
   function isIntoWeekDaysIntervals(
    uint8 _weekDay, 
    WeekDaysInterval [] memory _wdInterval
    ) internal pure onlyValidDay(_weekDay) returns(bool){
        // bool flagReturn = false;
        uint vLength = _wdInterval.length;
        for(uint i=0; i<vLength; i++){
            //    flagReturn = isIntoWeekDaysInterval(_weekDay, _wdInterval[i]); 
               if(isIntoWeekDaysInterval(_weekDay, _wdInterval[i])){                
                return true; 
               }
        }
        return false; 
    }

    // check into one weekDaysInterval
    function isIntoWeekDaysInterval(
        uint8 _weekDayAccess,
        WeekDaysInterval memory _wdInterval
        ) internal pure returns(bool){
       
        if(_wdInterval.start < _wdInterval.end ){
                if(_weekDayAccess >= _wdInterval.start &&  _weekDayAccess<= _wdInterval.end){
                return true;
            }
        }else{
             if(_weekDayAccess >= _wdInterval.start ||  _weekDayAccess<=_wdInterval.end){
                return true;
            }   
        }        
       return false;
   }

   /* ---------------------- modifiers from the weekDaysInterval ----------- */ 
    modifier onlyValidDays(uint8 _startDay, uint8 _endDay) {
        require( _startDay >= SUNDAY && _startDay <= SATURDAY, "The _startDay not represents a valid day");
        require(_endDay >= SUNDAY && _endDay <= SATURDAY,  "The _endDay not represents a valid day");
        _;
    }
    
    modifier onlyValidDay(uint8 _day) {
        require((_day >= SUNDAY && _day <= SATURDAY), "The given number/day not represents a valid day");
        _;
    }


/* ========================================================================== */
/*                                    TIME INTERVAL                            */
/* ========================================================================== */
    // the hours are storage in milliseconds
    struct  TimeInterval{
        uint32 start;
        uint32 end;
    } 

    function createTimeInterval(
        uint32 _start, 
        uint32 _end
        ) internal pure onlyValidHours(_start, _end) returns ( TimeInterval memory){
        return TimeInterval(_start, _end);
    } 

    function setTimeInterval( 
        TimeInterval storage _ti,
        uint32 _start,
        uint32 _end
        ) internal onlyValidHours(_start, _end){
        _ti.start= _start;
        _ti.end = _end;     
    }

    function getOneTimeInterval( TimeInterval memory _ti )internal pure returns(uint32 start, uint32 end){
            return (_ti.start, _ti.end);
    }
    
    function getAllTimeIntervals(TimeInterval[] memory _ti) internal pure returns(TimeInterval[] memory){
        return _ti;
    }

   // check into a set of TimeIntervals
   function isIntoTimeIntervals(
    uint32 _timeAccess, 
    TimeInterval [] memory _ti
    ) internal pure  onlyValidHour(_timeAccess)returns(bool){
        uint vLength = _ti.length;
        for(uint i=0; i<vLength; i++){
               if(isIntoTimeInterval(_timeAccess, _ti[i])){                
                return true; 
               }
        }
        return false; 
    }

    // check into one weekDaysInterval
    function isIntoTimeInterval(
        uint32 _timeAccess,
        TimeInterval memory _ti
        ) internal pure returns(bool){
       
        if(_ti.start < _ti.end ){
                if(_timeAccess >= _ti.start &&  _timeAccess <= _ti.end){
                return true;
            }
        }else{
             if(_timeAccess >= _ti.start ||  _timeAccess <=_ti.end){
                return true;
            }   
        }        
       return false;
   }

   /* ---------------------- modifiers from the weekDaysInterval ----------- */ 
    modifier onlyValidHours(uint32 _startHr, uint32 _endHr) {
        require( _startHr >= MIN_HOUR && _startHr <= MAX_HOUR, "The _startDay not represents a valid day");
        require(_endHr >= MIN_HOUR && _endHr <= MAX_HOUR,  "The _endDay not represents a valid day");
        _;
    }
    
    modifier onlyValidHour(uint32 _hour) {
        require((_hour >= MIN_HOUR && _hour <= MAX_HOUR), "The given number/day not represents a valid day");
        _;
    }

/* ========================================================================== */
/*                                    TIME OUT                                */
/* ========================================================================== */
    struct Timeout{
        uint32 endTime;
        uint32 timeIncrement;
    }

    function createTimeout(uint32 _timeIncrement) internal pure returns (Timeout memory ){
        return Timeout(0, _timeIncrement);
    }
    
    function isTimeoutEnded(Timeout memory _timeout, uint32 _accessTime) internal pure onlyValidAccessTime(_accessTime) returns(bool){        
        require(_timeout.endTime > 0, "There is no endTime set in timeout");
        return _accessTime > _timeout.endTime;
    }

    function setEndTimeInTimeout(Timeout storage _timeout, uint32 _startTime)internal onlyValidAccessTime(_startTime){      
        _timeout.endTime = _startTime + _timeout.timeIncrement; 
    }

   /* ---------------------- modifiers from the Timeout ----------- */ 

    modifier onlyValidAccessTime(uint32 _time){
        string memory strTime  = uint2String(_time);
        require(bytes(strTime).length <= 10);// epoch time in seconds
        _;
    }


/* ========================================================================== */
/*                             MAX NUMBER OF OPERATION                        */
/* ========================================================================== */

    struct MaxNumberOfOperation{
        uint32 amount;
        uint32 rest;
    }

    function createMaxNumberOfOperation(uint32 _amount) internal pure returns(MaxNumberOfOperation memory){
        return MaxNumberOfOperation(_amount, _amount);// the rest will start with the same _amount value
    }

    function decreaseNumberOfOperation(
            MaxNumberOfOperation storage _maxNumberOfOperation
        ) internal restMustBeGreaterThanZero(_maxNumberOfOperation.rest) {
        _maxNumberOfOperation.rest -=1; 
    }

    /* ------------ modifiers from the  MAX NUMBER OF OPERATION AND OPERATION BY TIME ----------- */ 

    modifier restMustBeGreaterThanZero(uint32 _rest){
        require(_rest > 0, "There are no operations available");
        _;
    }

/* ========================================================================== */
/*                      MAX NUMBER OF OPERATION BY TIME                       */
/* ========================================================================== */


    // struct MaxNumberOfOperationByTime{
    //     uint32 amount;
    //     uint32 byTime;
    //     uint32 rest;
    //     uint32 endTime;
    // }

    // function createMaxNumberOfOperationByTime(uint32 _amount, uint32 _byTime ) internal pure returns(MaxNumberOfOperationByTime memory){
    //     return MaxNumberOfOperationByTime(_amount, _byTime, 0, 0); // the rest and endTime will be set when the first decreaseNumber call is done
    // }

    // function decreaseNumberOfOperationByTime(
    //     MaxNumberOfOperationByTime storage _maxNumberOfOperationByTime,
    //     uint32 _accessDateTime
    //     )internal  {
    //         if(isAccessDatetimeOutOfOldInterval(_maxNumberOfOperationByTime, _accessDateTime)){
    //             setNewEndTimeAndRestOfOperations(_maxNumberOfOperationByTime, _accessDateTime);
    //         }
    //         require(_maxNumberOfOperationByTime.rest > 0, "There are no operations available");
    //          _maxNumberOfOperationByTime.rest -=1;
    // }

    // // identificar se um novo periodo iniciou para redefinir a propriedade byTime e o rest.
    // function isAccessDatetimeOutOfOldInterval(
    //     MaxNumberOfOperationByTime storage _maxNumberOfOperationByTime, 
    //     uint32 _accessDateTime
    //     ) internal view returns(bool) {
    //     return _accessDateTime > _maxNumberOfOperationByTime.endTime;
    // }

    // function setNewEndTimeAndRestOfOperations(
    //     MaxNumberOfOperationByTime storage _maxNumberOfOperationByTime,
    //     uint32 _accessDateTime
    //     ) private {
    //     _maxNumberOfOperationByTime.rest = _maxNumberOfOperationByTime.amount;
    //     _maxNumberOfOperationByTime.endTime = calcNextEndTime(_maxNumberOfOperationByTime, _accessDateTime);
    // }

    // function calcNextEndTime(
    //     MaxNumberOfOperationByTime memory _maxNumberOfOperationByTime,
    //     uint32 _accessDateTime
    //     ) private pure returns(uint32){

    //     uint32 mod =  uint32(_accessDateTime % _maxNumberOfOperationByTime.byTime);
    //     uint32 timeToNextEndTime = _maxNumberOfOperationByTime.byTime - mod;
    //     return _accessDateTime + timeToNextEndTime;
    // }

/* ========================================================================== */
/*                      MAX NUMBER OF OPERATION BY TIME                       */
/* ========================================================================== */

    struct MaxNumberOfOperationByTime{
        uint32 amount;
        uint8 timeUnit;
        uint32 byTime;
        uint32 rest;
        uint32 endTime;
    }

    // function createMaxNumberOfOperationByTime(
    //     uint32 _amount,
    //     uint8 _timeUnit
    //     )internal pure returns(MaxNumberOfOperationByTime memory){

    //     uint32 [] memory auxByTime;// = new uint32[](2) ;

    //     if(_timeUnit == YEAR){
    //         auxByTime = new uint32[](2);
    //         auxByTime[0]= 31536000; // 365 dias
    //         auxByTime[1] = 31622400; // 366 dias
    //     }else if(_timeUnit == MONTH){
    //         auxByTime = new uint32[](4);
    //         auxByTime[0] = 2419200; // 28 dias
    //         auxByTime[1] = 2505600; // 29 dias
    //         auxByTime[2] = 2592000; // 30 dias
    //         auxByTime[3] = 2678400; // 31 dias
    //     }else{
    //         auxByTime = new uint32[](1);
    //         auxByTime[0]= getTimeInSeconds(_timeUnit);
    //     }
    //     return MaxNumberOfOperationByTime(_amount, _timeUnit, auxByTime, 0, 0);
    // }

    function createMaxNumberOfOperationByTime(
        uint32 _amount,
        uint8 _timeUnit
        )internal pure returns(MaxNumberOfOperationByTime memory){

        uint32 auxByTime;

        if(_timeUnit <= WEEK){
            // for value equal a week or less, will be used the time in seconds to increase the endTime 
            auxByTime= getTimeInSeconds(_timeUnit);
        }else{
            // for values equal to year or month will be used the unit 1 to increase the endTime 
            auxByTime = 1; 
        }
        return MaxNumberOfOperationByTime(_amount, _timeUnit, auxByTime, _amount, 0);
    }

    function getTimeInSeconds(uint8 timeUnit) private pure returns(uint32){
        // seconds, // minute // hour // day // week
        require(timeUnit <= WEEK, "The method getTimeInSeconds doesn't work for MONTH and YEAR");

        if(timeUnit == SECOND){
            return 1;
        }else if(timeUnit == MINUTE){
            return 60;
        }else if(timeUnit == HOUR ){
            return 60*60;
        }else if(timeUnit == DAY){
            return 60*60*24;
        }else {
           return 60*60*24*7; //WEEK
        }
    }

    function decreaseNumberOfOperationByTime(
        MaxNumberOfOperationByTime storage _maxNumberOfOperationByTime,
        uint32 _accessDateTime
        )internal  {
            if(isAccessDatetimeOutOfOldInterval(_maxNumberOfOperationByTime, _accessDateTime)){
                setNewEndTimeAndRestOfOperations(_maxNumberOfOperationByTime, _accessDateTime);
            }
            require(_maxNumberOfOperationByTime.rest > 0, "There are no operations available");
             _maxNumberOfOperationByTime.rest -=1;
    }

    // identificar se um novo periodo iniciou para redefinir a propriedade byTime e o rest.
    function isAccessDatetimeOutOfOldInterval(
        MaxNumberOfOperationByTime storage _maxNumberOfOperationByTime, 
        uint32 _accessDateTime
        ) internal view returns(bool) {
        
        uint8 timeUnit = _maxNumberOfOperationByTime.timeUnit;
        if(timeUnit <= WEEK){
            return _accessDateTime >= _maxNumberOfOperationByTime.endTime;
        } else if(timeUnit == MONTH) {            
            (,uint32 month,) = timeStampToDate(_accessDateTime);    
            if((_maxNumberOfOperationByTime.endTime == 13) && (month==1)){
                return true;
            }        
            return month >= _maxNumberOfOperationByTime.endTime;
        }
        // else timeUnit == YEAR 
        (uint32 year, ,) = timeStampToDate(_accessDateTime);
        return year >= _maxNumberOfOperationByTime.endTime;
    }

    function setNewEndTimeAndRestOfOperations(
        MaxNumberOfOperationByTime storage _maxNumberOfOperationByTime,
        uint32 _accessDateTime
        ) private {
        _maxNumberOfOperationByTime.rest = _maxNumberOfOperationByTime.amount;
        _maxNumberOfOperationByTime.endTime = calcNextEndTime(
                                                _maxNumberOfOperationByTime.byTime,
                                                _maxNumberOfOperationByTime.timeUnit,
                                                _accessDateTime
                                                );
    }

    function calcNextEndTime(       
        uint32 _timeInterval,
        uint8 _timeUnit,
        uint32 _accessDateTime
        ) private pure returns(uint32){
        
        if (_timeUnit <= WEEK) {
            return calcNextEndTimeForSecMinHrDayOrWeek(
                _timeUnit, 
                _accessDateTime, 
                _timeInterval);
        }else if(_timeUnit == MONTH){
            (,uint currentMonth,) = timeStampToDate(_accessDateTime); 
             return uint32(currentMonth+1);
            // return uint32((currentMonth==12) ? 1 : currentMonth+1);
        }else{      
            (uint year,,) = timeStampToDate(_accessDateTime);
            return uint32(year + 1);
        }
    }
    
    function calcNextEndTimeForSecMinHrDayOrWeek(
        uint8 _timeUnit,
        uint32 _accessDateTime,
        uint32 _timeInterval
        ) private pure returns (uint32){

        uint32 mod =  uint32(_accessDateTime % _timeInterval);
        uint32 timeToNextEndTime  = _timeInterval - mod;            
        
        if(_timeUnit == WEEK){
            return _accessDateTime + timeToNextEndTime + OFFSETWEEK;
        }

        return _accessDateTime + timeToNextEndTime;
    }

    // function getIndexMonth(uint32 _month, uint32 _year) private pure returns(uint8){
    //     // return 0 for month with 28 day
    //     // return 1 for month with 29 day
    //     // return 2 for month with 30 day
    //     // return 3 for month with 31 day
    //     if (_month == 1 || _month == 3 || _month == 5 || _month == 7 || _month == 8 || _month == 10 || _month == 12) {
    //         return 3;
    //     } else if (_month != 2) {
    //         return 2;
    //     } else {
    //         return  isLeapYear(_year) ? 1 : 0;
    //     }
    // }

    // function getIndexYear(uint32 _year) private pure returns(uint8){
    //     if( isLeapYear(_year)){
    //         return 1;
    //     }
    //     return 0;
    // }
    
    // function isLeapYear(uint32 _year) internal pure returns(bool){
    //     uint16 anoMod400 = uint16(_year%400); 
    //     uint16 anoMod4 = uint16(_year%4); 
    //     uint16 anoMod100 = uint16(_year%100); 

    //     if( (anoMod400 == 0) || ((anoMod4 == 0) && (anoMod100 != 0))){
    //         return true;
    //     }
    //     return false;
    // }

    function timeStampToDate(uint _timestamp) internal pure returns (uint32 year, uint32 month, uint32 day) {
       
        uint32 __days = uint32(_timestamp / SECONDS_PER_DAY);

        uint32 L = __days + 68569 + OFFSET19700101;
        uint32 N = 4 * L / 146097;
        L = L - (146097 * N + 3) / 4;
        uint32 _year = 4000 * (L + 1) / 1461001;
        L = L - 1461 * _year / 4 + 31;
        uint32 _month = 80 * L / 2447;
        uint32 _day = L - 2447 * _month / 80;
        L = _month / 11;
        _month = _month + 2 - 12 * L;
        _year = 100 * (N - 49) + _year + L;

        year = uint32(_year);
        month = uint32(_month);
        day = uint32(_day);
    }
/* ========================================================================== */
/*                                MESSAGE CONTENT                            */
/* ========================================================================== */



/* ========================================================================== */
/*                                   UTILITIES                                */
/* ========================================================================== */

    function getSubstring(string memory _str, uint _left, uint _right)internal pure returns(string memory){
        string memory subStr;
        for(uint i=_left; i<=_right; i++){
            subStr = string(abi.encodePacked(subStr, bytes(_str)[i]));
        }
        return subStr;
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

     function uint2Str(uint _i) internal pure returns (string memory _uintAsString) {
        if (_i == 0) {
            return "0";
        }
        uint256 j = _i;
        uint256 len;
        while (j != 0) {
            len++;
            j /= 10;
        }
        bytes memory bstr = new bytes(len);
        uint k = len - 1;
        while (_i != 0) {
            bstr[k--] = bytes1(uint8(48 + _i % 10));
            _i /= 10;
        }
        return string(bstr);
    }

    function uint2String(uint256 value) internal pure returns (string memory) {
        
        if (value == 0) {
            return "0";
        }
        uint256 temp = value;
        uint256 digits;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        bytes memory buffer = new bytes(digits);
        while (value != 0) {
            digits -= 1;
            buffer[digits] = bytes1(uint8(48 + uint256(value % 10)));
            value /= 10;
        }
        return string(buffer);
    }

    // function getAllWeekDaysIntervals(WeekDaysInterval[] memory _wdi) internal pure returns(string memory) {
    //     uint vLength = _wdi.length;
    //     string memory aux;
    //     aux = string( abi.encodePacked(aux, uint2String(_wdi[0].start),","));
    //     aux = string( abi.encodePacked(aux, uint2String(_wdi[0].end)));

    //     for(uint i=1; i<vLength; i++){
    //         aux = string( abi.encodePacked( aux," -- ", uint2String(_wdi[i].start),","));
    //         aux = string( abi.encodePacked(aux, uint2String(_wdi[i].end)));
    //     } 
    //     return aux;
    // }

}