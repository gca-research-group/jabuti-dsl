//SPDX-License-Identifier
pragma solidity >=0.6.0 <=0.9.0;

contract MaxNumberOfOperation{
    
        uint requestsLimit;
        uint frequencyTime;        
        uint timeout;
        uint requestsPerformed;
    
    constructor(uint _operations, uint _timeUnit, uint _currentTime){
        requestsLimit = _operations;
        frequencyTime = _timeUnit ;
        timeout = _currentTime + timeInSeconds(_timeUnit);
        requestsPerformed=0;
    }
    
    function setMaxNumberOfOperation(uint _operations, uint _timeUnit, uint _currentTime) internal{
        requestsLimit = _operations;
        frequencyTime = _timeUnit ;
        timeout = _currentTime + timeInSeconds(_timeUnit);
        requestsPerformed=0;

        return OperationLimit(_operations, timeInSeconds(_timeUnit), 0, 0);
    }

    function isOperationLimitReached(uint32 _accessDateTime, MaxNumberOfOperation operationLimit) internal pure returns(bool){
        // implementar a logica
        return false;
    }

 

   function setOperationLimit_timeout(uint _accessTime, uint _frequency )internal pure returns (uint) {
      return _accessTime + _frequency; 
   }

    function timeInSeconds(uint _timeUnit)internal pure returns (uint){

        require (_timeUnit >0 && _timeUnit<8, string(abi.encodePacked("The value: ", _timeUnit,", is invalid time unit")));

        if(_timeUnit==0){ return 1 seconds; }
        if(_timeUnit==1){ return 1 minutes; }
        if(_timeUnit==2){ return 1 hours; }
        if(_timeUnit==3){ return 1 days; }
        if(_timeUnit==4){ return 1 weeks; }
        if(_timeUnit==5){ return 30 days; }// tem que fazer a verificação do mês para obter a quantidade de dias
        return 365 days; // tem que fazer a verificação do ano para obter o número de dias no ano corrente
    }
        
        
}
