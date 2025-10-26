//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract DeliveryHiring {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.MaxNumberOfOperationByTime;
	using EAI for EAI.MessageContent_Number;
	using EAI for EAI.Timeout;

	string numberOfAddresses;
	string weight;

	//---------------- Vectors of terms related to the requestDelivery clause(_C1). ----------------
	EAI.MaxNumberOfOperationByTime[] maxNumberOfOperationByTime_C1;
	EAI.MessageContent_Number[] messageContent_Number_C1;

	//---------------- Vectors of terms related to the responseOrder clause(_C2). ----------------
	EAI.Timeout[] timeout_C2;
	EAI.MessageContent_Number[] messageContent_Number_C2;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1641034800;
		dueDate = 1672520400;
		application = EAI.createParty("deliverySystem", _applicationWallet, false);             
		process = EAI.createParty("integrationProcess", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		numberOfAddresses = "count(//body/perosonalInformation/address/cep)";
		weight = "//body/package/weight/text()";
		
		//---------------- Terms related to the requestDelivery clause (C1). ----------------
		maxNumberOfOperationByTime_C1.push(EAI.createMaxNumberOfOperationByTime( 3, uint8(EAI.TimeUnit.MINUTE) ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number( numberOfAddresses, "==", 1 ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number( weight, "==", 100 ));
		
		//---------------- Terms related to the responseOrder clause (C2). ----------------
		timeout_C2.push(EAI.createTimeout( 20 ));
		messageContent_Number_C2.push(EAI.createMessageContent_Number(  "//budget/deliveryTime/text()", "<", 15 ));
	}
	
	function right_requestDelivery(
		uint32 accessDateTime,
		uint256[] memory messageContent_Number
		) public onlyProcess() returns(bool){
		if(
			maxNumberOfOperationByTime_C1[0].hasAvailableOperations_ByTime(accessDateTime) &&
			messageContent_Number_C1[0].evaluateNumberContent(messageContent_Number[0]) &&
			messageContent_Number_C1[1].evaluateNumberContent(messageContent_Number[1])
			){
			timeout_C2[0].setEndTimeInTimeout(accessDateTime); 						
			maxNumberOfOperationByTime_C1[0].decreaseOneOperation_ByTime(accessDateTime);
			return true;
		}else{	
			emit failEvent("Request operation did not meet all requirements");
			return false;
		}
	
	}
 		
	function obligation_responseOrder(
		uint32 accessDateTime,
		uint256[] memory messageContent_Number
		) public onlyApplication() returns(bool){
		require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
		if(
			!timeout_C2[0].isTimeoutEnded(accessDateTime) &&
			messageContent_Number_C2[0].evaluateNumberContent(messageContent_Number[0])
			){
			return true;
		}else{	
			maxNumberOfOperationByTime_C1[0].increaseOneOperation_ByTime();
			emit failEvent("response performed outside of time limit or delivery time too long");
			return false;
		}
	
	}
	/* the process sign the contract by default, the function signContract 
    is used to get the applicationParty signature*/      
    function signContract() public onlyApplication() returns(bool) {
        require(application.aware == false, "The contract is already signed");        
        application.aware = true;  
        updateMapParty(msg.sender, application);
		return true;
    }
 
    function updateMapParty(address _walletAddress, EAI.Party storage _party)internal returns(bool){       
        mapParty[_walletAddress] = _party;
		return true;
    }
    
    /* It only possible to change the name and the address of the party. 
    After change the  party, the new party need to sign the contract */
    function changeApplicationParty(string memory _name, address _walletAddress) public returns(bool) {       
        require(process.walletAddress == msg.sender, "Only the process can execute this operation");
        delete mapParty[application.walletAddress];
        application = EAI.createParty(_name, _walletAddress, false);          
        updateMapParty(_walletAddress, application);
        return true;       
    }
    
    function getProcessAddress() public view onlyInvolvedParties returns(address){
        return process.walletAddress;
    }
    
    function getApplicationAddress() public view onlyInvolvedParties returns(address){
        return application.walletAddress;
    }
 
    function getParty(address _walletAddress) public view onlyInvolvedParties returns(EAI.Party memory){
        return mapParty[_walletAddress];
    }
    
    modifier onlyApplication(){        
        require(activated, "This contract is deactivated");            
        require(application.walletAddress == msg.sender, "Only the application can execute this operation");
        _;        
    }
 
    modifier onlyProcess(){
        require(activated, "This contract is deactivated");
        require(process.walletAddress == msg.sender, "Only the process can execute this operation");
        _;
    }
 
    modifier onlyInvolvedParties(){
        require(activated, "This contract is deactivated");
        require(
            (application.walletAddress == msg.sender || process.walletAddress == msg.sender ) ,
            "Only the process or the application can execute this operation");
        _;
    }
    
}
