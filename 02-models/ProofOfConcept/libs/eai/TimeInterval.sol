//SPDX-License-Identifier
pragma solidity >=0.6.0 <=0.9.0;

contract TimeInterval {
     uint32 start;
        uint32 end;    
        
    function setTimeInterval(uint32 _start, uint32 _end) internal pure returns (TimeInterval memory){// testado e funcionado
    //    implementar a logica 
        return TimeInterval(_start,_end);
    }

    // funções referente a struct TimeInterval, verifica se o _accessTime estão de acordo com o intervalo definido
    function isIntoTimeInterval(uint _accessTime, TimeInterval memory _businessTime) internal pure returns (bool) {
    	// implementar a logica
    	return false;            
    }
}