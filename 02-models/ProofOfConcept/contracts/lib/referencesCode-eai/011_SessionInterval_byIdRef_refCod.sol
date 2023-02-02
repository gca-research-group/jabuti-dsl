//SPDX-License-Identifier: MIT

pragma solidity >0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract SessionInterval_refCod{
    
    using EAI for EAI.SessionInterval;
   
    EAI.SessionInterval[] sessionInterval;

    mapping(string => EAI.SessionInterval)  sessionIntevalByIdRef;

    constructor(){
        sessionInterval.push(EAI.createSessionInteval(2, EAI.HOUR));
        sessionInterval.push(EAI.createSessionInteval(2, EAI.HOUR));
    }

        function createSessionIntevalByIdRef(string memory _mapIdRef, uint _id) public{
            sessionIntevalByIdRef[_mapIdRef] = EAI.createSessionInterval_Copy(sessionInterval[_id]);
        }

        function getSessionIntervalByIdRef(string memory _mapIdRef) public view returns(EAI.SessionInterval memory){
            return sessionIntevalByIdRef[_mapIdRef];
        }

        // a new section will open only if there is no other section open
        function startNewSessionIntervalByIdRef(string memory _idRef, uint32 _accessDateTime) public {       
            sessionIntevalByIdRef[_idRef].startNewSessionInterval(_accessDateTime);
        }   
        
        // // check if there is a session interval open. return 'OPEN' or 'CLOSED"
        function isTheSessionIdOpen(string memory _idRef, uint32 _accessDateTime) public view returns(string memory) {                                           
            return   sessionIntevalByIdRef[_idRef].isItOpen(_accessDateTime);
        }

        // function getSessionIntervalById(uint _id) public view returns (EAI.SessionInterval memory){
        //     return sessionInterval[_id];
        // }

}