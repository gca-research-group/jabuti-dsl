// SPDX-License-Identifier: MIT
pragma solidity >0.8.4 < 0.8.14;
// pragma experimental 'ABIEncoderV2';
import "../eai/EAI.sol";

contract MaxNumberOfOperation_refCod {   

using EAI for EAI.MaxNumberOfOperation;

EAI.MaxNumberOfOperation[] public maxOp;

constructor (){
    maxOp.push(EAI.createMaxNumberOfOperation(5));
    maxOp.push(EAI.createMaxNumberOfOperation(3));
}

    function decreaseOperation()public {
        maxOp[0].decreaseNumberOfOperation();
    }

    function getMaxOperationById(uint _id) public view returns(EAI.MaxNumberOfOperation memory){
        return maxOp[_id];
    }

    function getAllMaxOperation() public view returns (EAI.MaxNumberOfOperation[] memory){
        return maxOp;
    }

}