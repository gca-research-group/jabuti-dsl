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

    function verifyCep(string memory _cep) public view returns(bool){
        return  msgContent[0].evaluateMessageContent(_cep);        
    }
    
    function verifyName (string memory _name) public view returns(bool){
        return  msgContent[1].evaluateMessageContent(_name);       
    }

    function getAllMessageContent()public view returns(EAI.MessageContent_String[] memory){
        return msgContent;
    }
    
    function getMessageContent_byId(uint _id) public view returns(EAI.MessageContent_String memory){
        return msgContent[_id];
    }

}
