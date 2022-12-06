// SPDX-License-Identifier: MIT 
pragma solidity >=0.8.13 <=0.8.17;

import "../eai/EAI.sol";

contract TimeInterval_refCod{
    using EAI for EAI.TimeInterval;

    EAI.TimeInterval[] timeInterval;

    
    constructor(){
        // 10:00:00 to 14:00:00
        timeInterval.push(EAI.createTimeInterval(36000000,50400000));
        // 22:00:00 to 02:00:00
        timeInterval.push(EAI.createTimeInterval(79200000, 7200000));
    }

    function setTimeInterval(uint  _idTi, uint32 _startHour, uint32 _endHour)public {
       EAI.setTimeInterval(timeInterval[_idTi], _startHour, _endHour); 
    }

    function getTimeInterval(uint32 _idTi) public view returns (uint32 start, uint32 end){
        return EAI.getOneTimeInterval(timeInterval[_idTi]);
    }

    function getAllTimeInterval() public view returns (EAI.TimeInterval [] memory){
        return EAI.getAllTimeIntervals(timeInterval);        
    }

    function isIntoTimeInterval(uint32 _timeAccess)public view returns(bool){
        return EAI.isIntoTimeIntervals(_timeAccess, timeInterval);
    }


}