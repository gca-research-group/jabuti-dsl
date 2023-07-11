// SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract  Timeout_refCod{
    using EAI for EAI.Timeout;
    
    EAI.Timeout [] timeout;
    EAI.MaxNumberOfOperation [] maxOp;

    constructor(){
        timeout.push(EAI.createTimeout(10));
       
    }


    function responseTimeOut( uint8 idTimeOut, uint32 dateTime)public returns  (bool){
        if(timeout[idTimeOut].isTimeoutEnded(dateTime)){
            return false;
        }        
        return true;        
    }

    function setTimeoutEnd(uint _idTimeout, uint32 _startTime) public {
       timeout[_idTimeout].setEndTimeInTimeout(_startTime);
    }

    function isTimeoutEnded(uint32 _idTimeout, uint32 _accessTime)public view returns(bool){
        return  timeout[_idTimeout].isTimeoutEnded(_accessTime);
    }

    function getOneTimeout(uint _id) public view returns(EAI.Timeout memory){
        return timeout[_id];
    }
    
    function getAllTimeouts() public view returns(EAI.Timeout[] memory){
        return timeout;
    }
}