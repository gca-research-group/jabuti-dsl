// SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;
import "../eai/EAI.sol";

contract MessageContentString_refCod{   

    using EAI for EAI.MessageContent_String;

    EAI.MessageContent_String[] msgContent;

    constructor (){
        msgContent.push(EAI.createMessageContent("//cep/text()", "==", "98700000"));
        msgContent.push(EAI.createMessageContent("//nome/text()", "!=", "Eldair"));
    }

    function evaluateStringContent(uint _id, string memory _content) public view returns(bool){
        return  msgContent[_id].evaluateStringContent(_content);        
    }    

    function getMessageContent_byId(uint _id) public view returns(EAI.MessageContent_String memory){
        return msgContent[_id];
    }

    function getAllMessageContent()public view returns(EAI.MessageContent_String[] memory){
        return msgContent;
    }
    
}
