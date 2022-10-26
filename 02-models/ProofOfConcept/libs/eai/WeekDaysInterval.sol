//SPDX-License-Identifier
pragma solidity >=0.6.0 <=0.9.0;

import "../util/WeekDays.sol";

contract WeekDaysInterval{
   
	uint weekDay_start;
	uint weekDay_end;
  
	constructor(uint _start, uint _end){
		weekDay_end = _end;
		weekDay_start = _start; 
	}
	function setWeekDaysInterval(uint _start, uint _end)internal {
		weekDay_start = _start;
		weekDay_end = _end;
	}

  function isWeekDaysInterval(uint32 _accessDateTime, WeekDaysInterval businessDay)internal pure returns(bool){
    // TODO  
      return true;
  }
    
}