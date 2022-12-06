//SPDX-License-Identifier: MIT
pragma solidity  ^0.8.13;
// pragma experimental 'ABIEncoderV2';
import "../eai/EAI.sol";

contract Party_refCod{    

    using EAI for EAI.Party;
    EAI.Party process;
    EAI.Party application;

    mapping(address=>EAI.Party) public mapParty;

    constructor(address _applicationAddress){
	    process = EAI.createParty("processName", msg.sender, true);
	    application = EAI.createParty("applicationName", _applicationAddress, false);        
        mapParty[msg.sender] = process;
        mapParty[_applicationAddress] = application;
   }

    /* the process sign the contract by default, the function signContract 
    is used to get the applicationParty signature*/
    function signContract() public onlyApplication(){
        require(application.aware == false, "The contract is already signed");        
        application.aware = true;  
        updateMapParty(msg.sender, application);
       
    }

    function updateMapParty(address _walletAddress, EAI.Party storage _party)internal{       
        mapParty[_walletAddress] = _party;
    }

    /* It only possible to change the name and the address of the party. 
    After change the  party, da new party need to sign the contract */
    function changeApplicationParty(string memory _name, address _walletAddress) public onlyProcess {       
        delete mapParty[application.walletAddress];
        application = EAI.createParty(_name, _walletAddress, false);          
        updateMapParty(_walletAddress, application);              
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

    /* =================================================================================== */
    /* ==================================== MODIFIERS ==================================== */
    /* ----------------------------------------------------------------------------------- */
    
    modifier onlyApplication(){
        require(application.walletAddress == msg.sender, "Only the application can execute this operation");
        _;
    }

    modifier onlyProcess(){
        require(process.walletAddress == msg.sender, "Only the process can execute this operation");
        _;
    }

    modifier onlyInvolvedParties(){
        require(
            (application.walletAddress == msg.sender || process.walletAddress == msg.sender ) ,
            "Only the process or the application can execute this operation");
        _;
    }
}