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

	val Map<String, List<TermStruct>> termsMap
	val ArrayList<String> termsLogicalOperators

	new(int id, String type, String name, String rolePlayer) {
		this.id = id
		this.type = type
		this.name = name
		this.rolePlayer = rolePlayer
		this.termsMap = new HashMap<String, List<TermStruct>>
		this.termsLogicalOperators = newArrayList
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

	def ArrayList<String> getLogicalOperators() {
		return this.termsLogicalOperators
	}

	def List<TermStruct> getTerms(String termType) {
		termsMap.get(termType) ?: newArrayList
	}

	override toString() {
		termsMap.entrySet.map [
			key + ": " + value.join(", ")
		].join(" | ")
		"Clause #«clauseNumber»: «examples»"
	}
}