//SPDX-License-Identifier: MIT

pragma solidity >0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract MessageContent_NumberPerTime_refCod{
   
    using EAI for EAI.MessageContent_NumberPerTime;

    EAI.MessageContent_NumberPerTime[] msgContent;

    constructor(){
        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//address)", "<=", 2, EAI.MINUTE));
    }

    function getAllmsgContent()public view returns(EAI.MessageContent_NumberPerTime[] memory){
        return msgContent;
    }

    function decreaseMsgContentResultXpathFromAmount(uint _id, 
        uint32 _accessTime, 
        uint32 _resultFromXpath
        )public returns(EAI.MessageContent_NumberPerTime memory){
        msgContent[_id].decreaseNumberPerTime(_accessTime, _resultFromXpath);
        return msgContent[_id];
    }

}