//SPDX-License-Identifier: MIT
pragma solidity >= 0.6.0 < 0.9.0;
import "./SafeMath.sol";
import "./DateTimeLibrary.sol";
import "./EAI_Domain.sol";

contract CredityAgency is EAI_Domain{ 
    // https://www.epochconverter.com/
    using SafeMath for uint256;
    
    Party process;
    Party application;

    uint256 beginDate = 1641024000000; // GMT: Saturday, 1 January 2022 08:00:00
    uint256 dueDate = 1672509600000;   // GMT: Saturday, 31 December 2022 18:00:00

    OperationLimit public operationLimit = setOperationLimit(5, MINUTE);// 

    Timeout public responseTimeout = setTimeout(60);

    TimeInterval businessTime = setTimeInterval( "08:00:00", "18:30:00"); // 08:00 - 18:30


    string fail_description = ""; 
    string success_description = ""; 

    // ?? Talvez definir uma parte como proprietaria do contrato e então passar apenas o address
    // da outra parte, nos parametro do construtor.
    constructor (address _processWallet, address _applicationWallet){
        process = Party("Integration Process",_processWallet);
        application = Party("Credit Agency",_applicationWallet);
    }

    event success(string _logMessage);
    event fail(string _logMessage);

////////////////////// Defining the function that represent the clauses /////////////////////

    /////////////////////////// REQUEST SCORE RIGHT CLAUSES ///////////////////////////////
    function requestOperationClauses(uint _cpf, uint _accessTime)public returns(string memory){
        
        require(msg.sender == process.walletAddress, "You have NO PERMISSION to execute this operation.");  
       
        fail_description= "RequestOperation clause was not met:";
        success_description ="Resquest operation clauses were met.";

        bool isMet = true;

        if(!requestScore(_cpf, _accessTime)){
           isMet = false;
        }

        /// --> next clause referred to RESPONSE OPERATION, IF EXIST

       require(isMet, fail_description); 
     
       responseTimeout.timeout = _accessTime + responseTimeout.increment;

       emit success(success_description);
       return success_description;
    } 

    ////////////////////////// REQUEST SCORE - RIGHT CLAUSE - //////////////////////////////
    function requestScore(uint _cpf,uint _accessTime)internal returns(bool) {
        // "Setting the limit operation by day, and the number of user by request."
        
        bool isMet = true;

       // verificar se já começou um novo ciclo  de requisicões, caso iniciou um novo ciclo, então deve ser reiniciado o contador "requestsPerfomed"
        if(_accessTime > operationLimit.timeout){
            operationLimit.timeout = _accessTime + operationLimit.frequencyTime;
            operationLimit.requestsPerformed = 0;
        }

        // verificar se o numero de requisicões, dentro do intervalo de tempo definido, é menor que número máximo definido. 
        if(operationLimit.requestsPerformed > operationLimit.requestsLimit){
            isMet =  false;
            fail_description = string(abi.encodePacked(fail_description," Operation limit exceded."));
        }

        if(_cpf != 1){
           fail_description = string(abi.encodePacked(fail_description, " _cpf condition is not met.")); 
           isMet = false;
        }

        if(!isIntoTimeInterval(_accessTime, businessTime)){
           fail_description = string(abi.encodePacked(fail_description, " Request made outside of allowed hours."));           
           isMet =  false;        
        }

        return isMet;
    }


 // falta incrementar o contador de requisições operationLimit.requestsPerformed++;
 //  -----> falta setar o timeout *************************** 

////////////////////////// RESPONSE OPEARTION CLAUSES //////////////////////////////
    function respopnseOperationClauses(uint _responseTime, string memory _accessTime) public returns(string memory){
        require(msg.sender == application.walletAddress, "You have NO PERMISSION to execute this operation.");  

        fail_description= "Response opeartion clauses were not met:";

        bool isMet = true;

        if(!responseWithScore(_responseTime)){
           isMet = false;
        }
        /// --> next clause referred to REQUEST OPERATION
        
        require(isMet, fail_description); 

        uint accessTime = 0;//_accessTime;
        responseTimeout.timeout = accessTime + responseTimeout.increment;

       emit success(success_description);
       return success_description;

    } 

    // considera o sistema monitoring
    function responseWithScore(uint _responseTime) internal returns(bool){
        // Setting the time limit for responding to a resquest.	
		
        bool isMet = true;

		if(_responseTime > responseTimeout.timeout){
            fail_description = string(abi.encodePacked(fail_description, "Timeout for replying has been exceeded"));
            isMet = false;
        }
        return isMet;        
	}

}
    // ----------- PARTES ENVOLVIDAS NO CONTRATO --------------
    // process      : 0x5B38Da6a701c568545dCfcB03FcB875f56beddC4
    // application  : 0xAb8483F64d9C6d1EcF9b849Ae677dD3315835cb2

    // --------- TESTE FORA DO BUSINESS TIME --------------
    // uint hour_07_30 = 1652686200; // 07:30
    // uint hour_13_50 = 1652709000; // 13:50
    // uint hour_18_32 = 1652725920; // 18:32

    // -------- TESTES PARA OPEARTION LIMIT TIMEOUT -------

    // Monday, 16 May 2022 14:30:00 = 1652711400 - > fez a chamada e definiu o timout sendo adicionado mais 30 secons

    // Monday, 16 May 2022 14:30:20 = 1652711420 - > usar para fazer o primeiro acesso 1 ao 6 (ate gerar limite excedido)
    // Monday, 16 May 2022 14:30:40 = 1652711440 - > utilizar para fazer o acesso 7 ( contador limitOperation deve reiniciar e definiu novo timeout)
    // Monday, 16 May 2022 14:31:00 = 1652711460 - > solicitação autorizada até atingir o limite
    // Monday, 16 May 2022 14:32:00 = 1652711520 - > contador dever ser reiniciado
    // Monday, 16 May 2022 14:40:00 = 1652712000