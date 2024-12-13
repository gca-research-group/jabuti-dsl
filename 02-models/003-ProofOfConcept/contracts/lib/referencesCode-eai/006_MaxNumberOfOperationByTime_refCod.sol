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
        bool isTrue = false;
        if(timeUnit == EAI.SECOND){
            isTrue = maxOp[0].decreaseOneOperation_ByTime(_accessTime);            
            require( isTrue, "There are no operations available" );
        }else if(timeUnit == EAI.MINUTE){
            isTrue = maxOp[1].decreaseOneOperation_ByTime(_accessTime);
            require( isTrue, "There are no operations available" );
        }else if(timeUnit == EAI.HOUR ){
            isTrue = maxOp[2].decreaseOneOperation_ByTime(_accessTime);
            require( isTrue, "There are no operations available" );
        }else if(timeUnit == EAI.DAY){
            isTrue = maxOp[3].decreaseOneOperation_ByTime(_accessTime);     
            require( isTrue, "There are no operations available" );       
        }else if(timeUnit == EAI.WEEK){
            isTrue = maxOp[4].decreaseOneOperation_ByTime(_accessTime);
            require( isTrue, "There are no operations available" );
        }else if(timeUnit == EAI.MONTH){
            isTrue = maxOp[5].decreaseOneOperation_ByTime(_accessTime);
            require( isTrue, "There are no operations available" );
        }else if(timeUnit == EAI.YEAR ){
            isTrue = maxOp[6].decreaseOneOperation_ByTime(_accessTime);
            require( isTrue, "There are no operations available" );
        }
    }

    function getMaxOpByTime(uint _id) public view returns(EAI.MaxNumberOfOperationByTime memory){
        return maxOp[_id];
    }

    function testTimestampToDate(uint _timestamp)public pure returns(uint32 year, uint32 month, uint32 day){
        return EAI.timeStampToDate(_timestamp);
    }

    function getAllMaxOpByTime() public view returns(EAI.MaxNumberOfOperationByTime[] memory){
        return maxOp;
    }

    function checkIfHasAvailableOperation() public view returns(bool){
        return maxOp[0].hasAvailableOperationByTime(120);
    }
    
}