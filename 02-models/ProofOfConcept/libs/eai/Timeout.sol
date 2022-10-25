//SPDX-License-Identifier
pragma solidity >=0.6.0 <=0.9.0;

contract Timeout{
            uint32 increment;
        uint32 endTime;



    function setEndTimeInTimeOut(uint32 _dataTime,  uint32  increment)internal pure returns(uint32){
        return _dataTime+increment; // o timeout inicia zerado, será definido após a primeira chamada

    }

    function isTimeout(uint32 _accessDateTime, uint32 _timeout)internal pure returns (bool) {
       // TODO
       return true;
    }

}