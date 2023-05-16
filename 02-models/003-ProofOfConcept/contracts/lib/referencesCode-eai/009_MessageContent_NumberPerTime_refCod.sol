//SPDX-License-Identifier: MIT

pragma solidity >0.8.4 < 0.8.14;

import "../eai/EAI.sol";

contract MessageContent_NumberPerTime_refCod{
   
    using EAI for EAI.MessageContent_Number_PerTime;

    EAI.MessageContent_Number_PerTime[] msgContent;

    constructor(){
        msgContent.push(EAI.createMessageContent("count(//address)", "<", 3, EAI.SECOND));
        msgContent.push(EAI.createMessageContent("count(//cep)", "<=", 3, EAI.MINUTE));
        msgContent.push(EAI.createMessageContent("count(//address)", "<", 5, EAI.HOUR));
        msgContent.push(EAI.createMessageContent("count(//address)", "<=", 4, EAI.DAY));
        msgContent.push(EAI.createMessageContent("count(//address)", "<", 4, EAI.WEEK));
        msgContent.push(EAI.createMessageContent("count(//address)", "<=", 5, EAI.MONTH));
        msgContent.push(EAI.createMessageContent("count(//address)", "<=", 2, EAI.YEAR));
    }

    function getAllmsgContent()public view returns(EAI.MessageContent_Number_PerTime[] memory){
        return msgContent;
    }

    function getMessageContentById(uint _id) public view returns(EAI.MessageContent_Number_PerTime memory){
        return msgContent[_id];
    }

    function decreaseMsgContentResultXpathFromAmount(uint _id, 
        uint32 _accessTime, 
        uint32 _resultFromXpath
        )public returns(EAI.MessageContent_Number_PerTime memory){                        
        //msgContent[_id].evaluateAndDecreaseNumberPerTime(_accessTime, _resultFromXpath);
        bool isOk = msgContent[_id].evaluateNumberPerTime(_accessTime, _resultFromXpath);   
       
        if(isOk){
            msgContent[_id].decreaseTheLastContentOfRestingAmount();                    
        }else{
            string memory revertMessage =  string(abi.encodePacked(
                 "You have only ", EAI.uint2String(msgContent[_id].rest), 
                 " from ", EAI.uint2String(msgContent[_id].amount)," resting, and the message content xpath result is ", EAI.uint2String(msgContent[_id].lastContent)));
                       
            require( msgContent[_id].rest>_resultFromXpath, revertMessage );
        }  

        return msgContent[_id];
    }

}