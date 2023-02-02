//SPDX-License-Identifier: MIT

pragma solidity >0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract SessionInterval_refCod{

    using EAI for EAI.SessionInterval;
    

    EAI.SessionInterval[] sessionInterval;
        
    uint mapSize;
    string[] keys;
    mapping(string => EAI.SessionInterval)  sessionIntevalByIdRef;
   
    
    constructor(){
        sessionInterval.push(EAI.createSessionInteval(2, EAI.SECOND));
        sessionInterval.push(EAI.createSessionInteval(2, EAI.MINUTE));
        sessionInterval.push(EAI.createSessionInteval(2, EAI.HOUR));
        sessionInterval.push(EAI.createSessionInteval(2, EAI.DAY));
        sessionInterval.push(EAI.createSessionInteval(2, EAI.WEEK));
    }

    // a new section will open only if there is no other section open
    function startNewSection(uint _id, uint32 _accessDateTime) public {
        sessionInterval[_id].startNewSessionInterval(_accessDateTime);
    }   
    
    // check if there is a session interval open. return 'OPEN' or 'CLOSED"
    function isTheSessionIdOpen(uint _id, uint32 _accessDateTime) public view returns(string memory) {                                           
        return  sessionInterval[_id].isItOpen(_accessDateTime);
    }

    function getSessionIntervalById(uint _id) public view returns (EAI.SessionInterval memory){
        return sessionInterval[_id];
    }

    function getAllSessionInterval() public view returns (EAI.SessionInterval[] memory){
        return sessionInterval;
    }


    function createSessionIntevalByIdRef(string memory _mapIdRef, uint _id) public{
        
        bool exist = false;

        for (uint i = 0; i < mapSize; i++) {
            if (keccak256(abi.encode(keys[i])) == keccak256(abi.encode(_mapIdRef))) {              
               exist = true;
               break;
            }
        }

        if(!exist){
            sessionIntevalByIdRef[_mapIdRef] = EAI.createSessionInterval_Copy(sessionInterval[_id]);
            keys.push(_mapIdRef);
            mapSize++;
        }
        else{
            sessionIntevalByIdRef[_mapIdRef] = EAI.createSessionInterval_Copy(sessionInterval[_id]);
        }
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

    function getAllSessionInterval_mapping() public view returns ( string[] memory, EAI.SessionInterval[] memory){
       EAI.SessionInterval[] memory sessions = new EAI.SessionInterval[](mapSize);

        for(uint i=0; i < mapSize; i++){           
            sessions[i] = sessionIntevalByIdRef[ keys[i] ];
        }

        return (keys, sessions);
    }

    function deleteSessionInterval_idRef(string memory _idRef)public returns(uint){
      
        delete sessionIntevalByIdRef[_idRef];
       
        for (uint i = 0; i < mapSize; i++) {
            if (keccak256(abi.encode(keys[i])) == keccak256(abi.encode(_idRef))) {
               delete keys[i];
               mapSize--;
               break;
            }
        }
        return mapSize;
    }




}