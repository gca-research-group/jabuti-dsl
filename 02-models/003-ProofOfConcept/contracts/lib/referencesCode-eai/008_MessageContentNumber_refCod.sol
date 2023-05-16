//SPDX-License-Identifier: MIT

pragma solidity > 0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract MessageContentNumber_refCod{
    
    using EAI for EAI.MessageContent_Number;

    EAI.MessageContent_Number[] msgContent;

    constructor(){
        msgContent.push(EAI.createMessageContent("count(//cep)", "!=",  1));
        msgContent.push(EAI.createMessageContent("count(//cep)", "==",  2));
        msgContent.push(EAI.createMessageContent("count(//cep)",  "<",  3));
        msgContent.push(EAI.createMessageContent("count(//cep)", "<=",  4));
        msgContent.push(EAI.createMessageContent("count(//cep)",  ">",  5));
        msgContent.push(EAI.createMessageContent("count(//cep)", ">=",  6));        
    }   

    function getAllMessageContents()public view returns(EAI.MessageContent_Number[] memory){
        return msgContent;
    }

    function getMessageContentById(uint _id) public view returns(EAI.MessageContent_Number memory){
        return msgContent[_id];
    }

    function evaluateMessageContent(uint _id, int256 content) public view returns(bool){
        return msgContent[_id].evaluateNumberContent(content);
    }
}

