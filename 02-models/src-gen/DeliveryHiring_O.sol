//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract DeliveryHiring_O {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.Timeout;
	using EAI for EAI.MessageContent_Number;

	string teste;

	//---------------- Vectors of terms related to the responseOrder clause(_C1). ----------------
	EAI.Timeout[] timeout_C1;
	EAI.MessageContent_Number[] messageContent_Number_C1;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1672572600;
		dueDate = 1672572601;
		application = EAI.createParty("deliverySystem", _applicationWallet, false);             
		process = EAI.createParty("integrationProcess", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		teste = "teste";
		
		//---------------- Terms related to the responseOrder clause (C1). ----------------
		timeout_C1.push(EAI.createTimeout( 20 ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  "//budget/deliveryTime/text()", "<", 15 ));
	}
	
	function obligation_responseOrder(
		uint32 accessDateTime,
		uint256[] memory messageContent_Number
		) public onlyApplication() returns(bool){
		require(mapParty[msg.sender].isAware(), "The Application party should sign the contract before interact with it.");	   	 
		if(
			!timeout_C1[0].isTimeoutEnded(accessDateTime) &&
			messageContent_Number_C1[0].evaluateNumberContent(messageContent_Number[0])
			){
			return true;
		}else{	
			emit failEvent("Request made outside of allowed hours or distance limit exceeded");
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
