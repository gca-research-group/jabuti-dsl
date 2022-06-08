//SPDX-License-Identifier: MIT
pragma solidity ^0.8.14;

import "./libs/EAI_Domain.sol";

contract DeliveryHiring is EAI_Domain{
	
	uint32 beginDate = 1641024000;
	uint32 dueDate = 1672509600;
	
	Party deliverySystem;
	Party integrationProcess;


	BusinessDay public businessDay = BusinessDay(SATURDAY, SUNDAY);
	TimeInterval public businessTime = TimeInterval(64800, 28800);
	OperationLimit public operationLimit = OperationLimit(5, MINUTE,0,0);// no jabuti está definido 6,  porém, é para uma clausula de proibição, então o máximo permitido é 5.
	MessageContent public messageContent = MessageContent("count(//address)!=1");
	
	string fail_description = "Breached condition "; 
    string success_description = "";
		
   
    event success(string  _logMessage);
    event logMessageFail(string _logMessage);

	constructor(address _applicationWallet, address _processWallet){
	    deliverySystem = Party("Delivery system", _applicationWallet);
	    integrationProcess = Party("Integration process", _processWallet);
	}

    function requestDelivery (uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){

        // Setting the prohibition regarding to the days and hours to request a delivery, the maximum request operation by minute and number of address by request"

	   	require(_performer == integrationProcess.walletAddress, "You have no permission to perform this operation.");

        bool isBreached = false;

        // se businessDay retornar verdadeiro é por que o dia que foi realizado o acesso estava dentro do intervalo que foi definido
        // por se tratar de uma função referente a uma clausula prohibition, então o intevalo businessDay é o intervalo no qual é proibido
        // realizar a operação, então, se o metodo isBusinessDay retornar verdadeiro, significa que a clausula foi quebrada.
	    if(isBusinessDay(_accessDateTime, businessDay)){
	        fail_description = string(abi.encodePacked(fail_description,": 'Access performed out of BusinessDay'"));
	        isBreached = true;
	    }

	    if(isIntoTimeInterval(_accessDateTime, businessTime)){
	        fail_description = string(abi.encodePacked(fail_description,": 'Access performed out of businessTime'"));
	        isBreached = true;
	    }
	    
	    if(isOperationLimitReached(_accessDateTime, operationLimit)){
			fail_description = string(abi.encodePacked(fail_description,": 'Breached condition: operationLimit reached'"));
	        isBreached = true;
	    }

	    if (_xPathResult){
			fail_description = string(abi.encodePacked(fail_description,": 'invalid content' ",_xPathContent));
	        isBreached=true;
	    }
	  	
	  	// se a clausula for violada emite um evento passando a descrção da falha 
	   	if(isBreached){
	   	    emit logMessageFail(fail_description);
	   	    return false;
	   	}

	    // operationLimit.requestsPerformed+=1;
	   	// emit success("Success execution in clause ");
	    return true;
    }


}