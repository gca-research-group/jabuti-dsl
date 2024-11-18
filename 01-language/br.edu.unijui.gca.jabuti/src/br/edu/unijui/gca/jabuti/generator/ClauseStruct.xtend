package br.edu.unijui.gca.jabuti.generator

import java.util.Map
import java.util.List
import java.util.ArrayList
import br.edu.unijui.gca.jabuti.jabuti.Term
import br.edu.unijui.gca.jabuti.generator.entities.terms.TermStruct
import java.util.HashMap

class ClauseStruct {
	// Número da cláusula
	val int id;
	val String type;
	val String name;
	val String rolePlayer;
	val String failMessasge;
	val String successMessage;

	val Map<String, List<TermStruct>> termsMap
	val ArrayList<String> termsLogicalOperators

	new(int id, String type, String name, String rolePlayer, String failMessage, String successMessage) {
		this.id = id
		this.type = type
		this.name = name
		this.rolePlayer = rolePlayer
		this.termsMap = new HashMap<String, List<TermStruct>>
		this.termsLogicalOperators = newArrayList
		this.failMessasge = failMessage
		this.successMessage = successMessage
	}

	def Map<String, List<TermStruct>> getTermsMap() {
		return this.termsMap
	}

	def void addTerm(String termType, TermStruct term) {
		if (!termsMap.containsKey(termType)) {
			termsMap.put(termType, newArrayList)
		}
		termsMap.get(termType).add(term)
	}

	def void addLogicalOperator(String operator) {
		this.termsLogicalOperators.add(operator)
	}

	def int getId() {
		return this.id
	}

	def String getType() {
		return this.type
	}

	def String getName() {
		return this.name
	}
	
	def getRolePlayer(){
		return this.rolePlayer
	}

	def ArrayList<String> getLogicalOperators() {
		return this.termsLogicalOperators
	}

	def List<TermStruct> getTerms(String termType) {
		termsMap.get(termType) ?: newArrayList
	}
	
	def String getFailMessage(){
		return this.failMessasge
	}
	def String getSuccessMessage(){
		return this.successMessage
	}

	override toString() {
		termsMap.entrySet.map [
			key + ": " + value.join(", ")
		].join(" | ")
		"Clause #«clauseNumber»: «examples»"
	}
}