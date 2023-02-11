//SPDX-License-Identifier: MIT

pragma solidity >0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract MessageContent_NumberPerTime_refCod{
   
    using EAI for EAI.MessageContent_NumberPerTime;

    EAI.MessageContent_NumberPerTime[] msgContent;

    constructor(){

        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//address)", "<", 3, EAI.SECOND));
        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//cep)", "<=", 3, EAI.MINUTE));
        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//address)", "<", 5, EAI.HOUR));
        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//address)", "<=", 4, EAI.DAY));
        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//address)", "<", 4, EAI.WEEK));
        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//address)", "<=", 5, EAI.MONTH));
        msgContent.push(EAI.createMessageContent_NumberPerTime("count(//address)", "<=", 2, EAI.YEAR));
    }

    function getAllmsgContent()public view returns(EAI.MessageContent_NumberPerTime[] memory){
        return msgContent;
    }

    function getMessageContentById(uint _id) public view returns(EAI.MessageContent_NumberPerTime memory){
        return msgContent[_id];
    }

    function decreaseMsgContentResultXpathFromAmount(uint _id, 
        uint32 _accessTime, 
        uint32 _resultFromXpath
        )public returns(EAI.MessageContent_NumberPerTime memory){                        
        msgContent[_id].evaluateAndDecreaseNumberPerTime(_accessTime, _resultFromXpath);
        return msgContent[_id];

    }

}