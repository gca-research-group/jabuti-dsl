//SPDX-License-Identifier: MIT
pragma solidity >= 0.6.0 < 0.9.0;
pragma experimental 'ABIEncoderV2';

import "./EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{ 
 
    Party process;
    Party application;

    // uint256 beginDate = 1641024000000;
    
    DateTime public  beginDate = setDateTime("2022-01-01 08:00:00"); // converter string para inteiro e depois converter para timestamp
    DateTime public dueDate = setDateTime("2022-12-31 18:25:10");
    
    BusinessDay public businessDay = setBusinessDay(MONDAY, FRIDAY);
    OperationLimit public operationLimit = setOperationLimit(5, MINUTE);
    TimeInterval public businessTime = setTimeInterval("08:30:00", "18:30:00"); 

    string fail_description = ""; 
    string success_description = "";

    constructor (address _processWallet, address _applicationWallet){
        process = Party("Integration Process",_processWallet);
        application = Party("Credit Agency",_applicationWallet);
    }

    function requestDelivery(string memory _accessDateTime) public  returns(string memory){
        bool isMet = true;
        fail_description="no fail"; 
        if(!isBusinessDay(_accessDateTime, businessDay)){
           fail_description = string(abi.encodePacked(fail_description, " | Access out of businessDay"));
           isMet = false;
        }
        
      //   if(!isIntoTimeInterval(_accessDateTime, businessTime)){
      //      fail_description = string(abi.encodePacked(fail_description, " | Access out of businessTime"));
      //      isMet = false;
      //   } 

      //   if(isOperationLimitExceeded(_accessDateTime, operationLimit)){
      //      fail_description = string(abi.encodePacked(fail_description, " | Exceeded operationLimit"));
      //      isMet = false;
      //   }

    //    if(isMet){
    //        emit success("success message");
    //        return isMet;
    //    } 
    //    emit fail(fail_description);
       return fail_description;
    }

} 
 