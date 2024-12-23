//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;
import "./libs/EAI.sol";

contract PurchaseOrderProvider {

	bool activated;
	uint32 beginDate; 
	uint32 dueDate; 	
	using EAI for EAI.Party;

	EAI.Party application;
	EAI.Party process;
	mapping(address=>EAI.Party) mapParty;

	event failEvent(string _logMessage);
	event successEvent(string _logMessage);

	using EAI for EAI.WeekDaysInterval;
	using EAI for EAI.MessageContent_Number;


	//---------------- Vectors of terms related to the writeData clause(_C1). ----------------
	EAI.WeekDaysInterval[] weekDaysInterval_C1;
	EAI.MessageContent_Number[] messageContent_Number_C1;

	constructor(address _applicationWallet){
		activated = true;		
		beginDate = 1633118400;
		dueDate = 1664636400;
		application = EAI.createParty("Supplier System Database", _applicationWallet, false);             
		process = EAI.createParty("Integration Process", msg.sender, true);    
		mapParty[msg.sender] = process;
		mapParty[_applicationWallet] = application;
		
		// Create and assign the values to variables related to the variables from jabuti and the terms of the clauses
		
		//---------------- Terms related to the writeData clause (C1). ----------------
		weekDaysInterval_C1.push(EAI.createWeekDaysInterval( EAI.MONDAY, EAI.FRIDAY ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  "//Tshirt/totalItems/text()", ">", 30 ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  "//Tshirt/totalItems/text()", "<", 50 ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  " //purchaseOrder/orderValue/text()", ">", 2000 ));
		messageContent_Number_C1.push(EAI.createMessageContent_Number(  " //purchaseOrder/orderValue/text()", "<", 5000 ));
	}
	
	function right_writeData(
		uint256[] memory messageContent_Number
		) public onlyProcess() returns(bool){
		if(
			weekDaysInterval_C1[0].isIntoWeekDaysInterval(weekDaysInterval[0]) &&
			messageContent_Number_C1[0].evaluateNumberContent(messageContent_Number[0]) &&
			messageContent_Number_C1[1].evaluateNumberContent(messageContent_Number[1]) &&
			messageContent_Number_C1[2].evaluateNumberContent(messageContent_Number[2]) &&
			messageContent_Number_C1[3].evaluateNumberContent(messageContent_Number[3])
			){
			return true;
		}else{	
			emit failEvent("orderValue or items is outside the allowed range");
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
