//SPDX-License-Identifier
pragma solidity >=0.6.0 <=0.9.0;

contract WeekDaysInterval{
    
    enum weekDay{
		uint constant MONDAY=1;
		uint constant TUESDAY=2;
		uint constant WEDNESDAY=3;
		uint constant THURSDAY=4;
		uint constant FRIDAY=5;
		uint constant SATURDAY=6;
		uint constant SUNDAY=7;
	}

    uint weekDay_start;
 	uint weekDay_end;
        
    function setBusinessDay(uint32 _start, uint _end)internal pure returns (WeekDaysInterval memory){
      // TODO  
        return WeekDaysInterval(_start, _end);
    }

    function isWeekDaysInterval(uint32 _accessDateTime, WeekDaysInterval storage businessDay)internal pure returns(bool){
      // TODO  
        return true;
    }
    
    ///////////////// FUNÇÕES REFERENTES A DATETIME /////////////////////
    
    function setDateTime(string memory _dateTime)internal pure returns(uint32){
      // TODO  
       return 123456789;
    }
}