// SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;
// pragma experimental 'ABIEncoderV2';
import "../eai/EAI.sol";

contract MaxNumberOfOperation_refCod{   

using EAI for EAI.MaxNumberOfOperation;

EAI.MaxNumberOfOperation[] maxOp;

constructor (){
    maxOp.push(EAI.createMaxNumberOfOperation(5));
}

    function decreaseOperation()public {
        maxOp[0].decreaseNumberOfOperation();
    }

    function getMaxOp(uint _id) public view returns(EAI.MaxNumberOfOperation memory){
        return maxOp[_id];
    }
}