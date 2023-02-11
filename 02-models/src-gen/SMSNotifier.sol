//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract SMSNotifier is EAI_Domain{
	
	Party SMS Notifier;
	Party Integration Process;
	
	WeekDaysInterval public weekDaysInterval = WeekDaysInterval(SUNDAY, SATURDAY);
	TimeInterval public timeInterval = TimeInterval(08:00:00, 18:00:00);
	
	event writeSMS_Revent(string _logMessage);
	
	constructor(address _applicationWallet, address _processWallet){
    	SMS Notifier = Party("Integration Process ", _applicationWallet);
	    Integration Process = Party("Integration Process", _processWallet);
	}
	
	function writeSMS_R(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
					
		
		bool isBreached=false;
		
		if(isBusinessDay(_accessDateTime, businessDay) &&
		isIntoTimeInterval(_accessDateTime, timeInterval) &&
		) {
			operationLimit.requestsPerformed+=1;
        	return true;	
		}
		
		emit writeSMS_Revent ("Request made outside of allowed hours or distance limit exceeded");
		return false;
	}
}
