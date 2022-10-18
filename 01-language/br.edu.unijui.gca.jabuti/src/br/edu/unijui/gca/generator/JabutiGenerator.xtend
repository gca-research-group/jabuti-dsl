/*
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import java.sql.Timestamp
import br.edu.unijui.gca.jabuti.Contract
import br.edu.unijui.gca.jabuti.Condition
import br.edu.unijui.gca.jabuti.BusinessDay
import br.edu.unijui.gca.jabuti.OperationLimit
import br.edu.unijui.gca.jabuti.MessageContent
import br.edu.unijui.gca.jabuti.TimeInterval
import br.edu.unijui.gca.jabuti.Timeout

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class JabutiGenerator extends AbstractGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		for (c : resource.allContents.filter(Contract).toIterable) {
			fsa.generateFile(c.name + '.sol', generateSolCode(c))
		}
	}

	def generateSolCode(Contract c) {
		'''
			//SPDX-License-Identifier: MIT
			pragma solidity ^0.8.14;
			
			import "./libs/EAI_Domain.sol";
			
			contract �c.name� is EAI_Domain{
				
				Party �c.application.name�;
				Party �c.process.name�;
				
				�getConditions(c.clauses.get(0).condition)�
				
				event �c.clauses.get(0).onBreach.action.name�(string _logMessage);
				
				constructor(address _applicationWallet, address _processWallet){
			    	�c.application.name� = Party("�c.application.name� ", _applicationWallet);
				    �c.process.name� = Party("�c.process.name�", _processWallet);
				}
				
				function �c.clauses.get(0).name�(uint32 _accessDateTime, string memory _xPathContent, bool _xPathResult, address _performer) public returns(bool){
								
					
					bool isBreached=false;
					
					if(�getConditionals(c.clauses.get(0).condition)�) {
						operationLimit.requestsPerformed+=1;
			        	return true;	
					}
					
					emit �c.clauses.get(0).onBreach.action.name� ("Request made outside of allowed hours or distance limit exceeded");
					return false;
				}
			}
		'''
	}

	def getTS(String date){
		return (Timestamp.valueOf(date).getTime()/1000);
	}
	
	def getConditions(Condition condition){
		'''
			�FOR c: condition.eAllContents.toIterable�
				�IF(c instanceof Timeout)�
					Timeout public timeout = Timeout(�c.value�, 0);
				�ELSEIF(c instanceof BusinessDay)�
					BusinessDay public businessDay = BusinessDay(�c.start�, �c.end�);
				�ELSEIF(c instanceof TimeInterval)�
					TimeInterval public timeInterval = TimeInterval(�c.start�, �c.end�);
				�ELSEIF(c instanceof OperationLimit)�
					OperationLimit public operationLimit = OperationLimit(�c.operationsNumber�, �c.timeUnit�, 0, 0);
				�ELSEIF(c instanceof MessageContent)�
					MessageContent public messageContent = MessageContent("�c.content�");
				�ENDIF�
			�ENDFOR�
		'''
	}
	
	def getConditionals(Condition condition){
		'''	
		�FOR c: condition.eAllContents.toIterable�
			�IF(c instanceof Timeout)�
				!isTimeout(_accessDateTime, timeout.endTime) &&
			�ELSEIF(c instanceof BusinessDay)�
				isBusinessDay(_accessDateTime, businessDay) &&
			�ELSEIF(c instanceof TimeInterval)�
				isIntoTimeInterval(_accessDateTime, timeInterval) &&
			�ELSEIF(c instanceof OperationLimit)�
				!isOperationLimitReached(_accessDateTime, operationLimit) &&
			�ENDIF�
		�ENDFOR�
		'''
	}
}



