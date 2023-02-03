//SPDX-License-Identifier: MIT

pragma solidity >0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract SessionInterval_refCod{

   using EAI for EAI.SessionInterval;
    

    EAI.SessionInterval[] sessionInterval;
    //       k1                k2_v       value
    mapping(string => mapping(string=>EAI.SessionInterval)) sessionByVar;
    mapping(string => mapping(string=>bool)) exists_k1mapk2;
    string[] keys_k1;  // For storing keys 
    string[] keys_k2;  // For storing keys
    mapping (string => bool) exists_k1; // Additional Map for checking if key exists
    mapping (string => bool) exists_k2; // Additional Map for checking if key exists
    
        
    constructor(){
        
        sessionInterval.push(EAI.createSessionInteval(2, EAI.SECOND)); //[0]      

        sessionInterval.push(EAI.createSessionInteval(2, EAI.MINUTE)); //[1]

        sessionInterval.push(EAI.createSessionInteval(2, EAI.HOUR)); //[2]              

        sessionInterval.push(EAI.createSessionInteval(2, EAI.DAY)); //[3]

        keys_k1.push("nome"); // 0
        keys_k1.push("cidade");// 1
        exists_k1["nome"] = true;
        exists_k1["cidade"] = true;    
        
    }

    // a new section will open only if there is no other section open
    function startSessionByRef(uint _idSingleSession, string memory _k1, string memory _k2, uint32 _accessDateTime) public {
                 
        require(exists_k1[_k1], string(abi.encodePacked("The key ",_k1,"doesn't exist.")));
        if(!exists_k1mapk2[_k1][_k2]){
            exists_k1mapk2[_k1][_k2] = true;
            keys_k2.push(_k2);
            sessionByVar[_k1][_k2] = sessionInterval[_idSingleSession];
        }    
        sessionByVar[_k1][_k2].startNewSessionInterval(_accessDateTime);
    }

    // start a new  single section
    function startSingleSession(uint _id, uint32 _accessDateTime) public {
        sessionInterval[_id].startNewSessionInterval(_accessDateTime);
    }   

    // check if there is a session interval open. return 'OPEN' or 'CLOSED"
    function isTheSessionByRefOpen(string memory _k1, string memory _k2, uint32 _accessDateTime) public view returns(string memory) {                                           
        return   sessionByVar[_k1][_k2].isItOpen(_accessDateTime);
    }

     function isTheSessionIdOpen(uint _id, uint32 _accessDateTime) public view returns(string memory) {                                           
        return  sessionInterval[_id].isItOpen(_accessDateTime);
    }
  
    function getSessionIntervalByRef(string memory _k1, string memory _k2) public view returns (EAI.SessionInterval memory){
        return sessionByVar[_k1][_k2];
    }

    function getSessionIntervalById(uint _id) public view returns (EAI.SessionInterval memory){
        return sessionInterval[_id];
    }

    function getAllSessionIntervalByRef() public view returns (string[] memory, string[] memory, EAI.SessionInterval[] memory){             
        return (keys_k1, keys_k2, sessionInterval);
    }

    function getAllSingleSessionInterval() public view returns (EAI.SessionInterval[] memory){
        return sessionInterval;
    }

}