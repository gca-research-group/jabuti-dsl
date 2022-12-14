// SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;
import "../eai/EAI.sol";

contract MaxNumberOfOperationByTime_refCod{   

using EAI for EAI.MaxNumberOfOperationByTime;

EAI.MaxNumberOfOperationByTime[] maxOp;

constructor (){
    maxOp.push( EAI.createMaxNumberOfOperationByTime(2, EAI.SECOND));
    maxOp.push( EAI.createMaxNumberOfOperationByTime(2, EAI.MINUTE));
    maxOp.push( EAI.createMaxNumberOfOperationByTime(2, EAI.HOUR));
    maxOp.push( EAI.createMaxNumberOfOperationByTime(2, EAI.DAY));
    maxOp.push( EAI.createMaxNumberOfOperationByTime(2, EAI.WEEK));
    maxOp.push( EAI.createMaxNumberOfOperationByTime(2, EAI.MONTH));
    maxOp.push( EAI.createMaxNumberOfOperationByTime(2, EAI.YEAR));
}

    function decreaseOperation(uint8 timeUnit, uint32 _accessTime)public {
        if(timeUnit == EAI.SECOND){
            maxOp[0].decreaseNumberOfOperationByTime(_accessTime);
        }else if(timeUnit == EAI.MINUTE){
            maxOp[1].decreaseNumberOfOperationByTime(_accessTime);
        }else if(timeUnit == EAI.HOUR ){
            maxOp[2].decreaseNumberOfOperationByTime(_accessTime);
        }else if(timeUnit == EAI.DAY){
            maxOp[3].decreaseNumberOfOperationByTime(_accessTime);            
        }else if(timeUnit == EAI.WEEK){
            maxOp[4].decreaseNumberOfOperationByTime(_accessTime);
        }else if(timeUnit == EAI.MONTH){
            maxOp[5].decreaseNumberOfOperationByTime(_accessTime);
        }else if(timeUnit == EAI.YEAR ){
            maxOp[6].decreaseNumberOfOperationByTime(_accessTime);
        }
    }

    function getMaxOp(uint _id) public view returns(EAI.MaxNumberOfOperationByTime memory){
        return maxOp[_id];
    }

    function testTimestampToDate(uint _timestamp)public pure returns(uint32 year, uint32 month, uint32 day){
        return EAI.timeStampToDate(_timestamp);
    }

}