// SPDX-License-Identifier: MIT 
pragma solidity >0.8.4 < 0.8.14;
import "../eai/EAI.sol";

contract WeekDaysInterval_refCod{
    using EAI for EAI.WeekDaysInterval;
    using EAI for EAI.Party;
    EAI.Party application;
    EAI.WeekDaysInterval[] public weekDaysInterval;

    constructor (){
        weekDaysInterval.push(EAI.createWeekDaysInterval(EAI.MONDAY, EAI.TUESDAY));
        weekDaysInterval.push(EAI.createWeekDaysInterval(EAI.THURSDAY, EAI.SATURDAY));
    }

    function setWeekDaysInterval(uint _wdi_id, uint8 _start, uint8 _end) public {
        EAI.setWeekDayInterval(weekDaysInterval[_wdi_id] ,_start, _end);

    }
    function getWeekDaysInterval(uint8 id_weekDaysInterval) public view returns(uint8 start, uint8 end){
        return EAI.getOneWeekDaysInterval(weekDaysInterval[id_weekDaysInterval]);
    }

    function getAllWeekDaysInterval() public view returns(EAI.WeekDaysInterval[] memory)  {        
        return EAI.getAllWeekDaysIntervals(weekDaysInterval);
    }

    // check into a set of weekDaysIntervals
    function isIntoWeekDaysIntervals( uint8 _weekDay) public view returns(bool){
        return EAI.isIntoWeekDaysIntervals(_weekDay, weekDaysInterval); 
    } 

    function getWeekDaysInterval()public view returns(EAI.WeekDaysInterval[] memory){
        return weekDaysInterval;
    } 

    function getAmountOfWeekDaysInterval() public view returns(uint8){
        return uint8(weekDaysInterval.length);
    }

    function setWeekDaysInterval() public returns(uint8 startDay, uint8 endDay){
        weekDaysInterval[0].setWeekDayInterval(3,6);
        return weekDaysInterval[0].getOneWeekDaysInterval();
    }
}