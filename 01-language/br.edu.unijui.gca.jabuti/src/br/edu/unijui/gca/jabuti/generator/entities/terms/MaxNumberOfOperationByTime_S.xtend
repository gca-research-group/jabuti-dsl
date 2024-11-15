package br.edu.unijui.gca.jabuti.generator.entities.terms

class MaxNumberOfOperationByTime_S extends TermStruct {
	int amount;
	String timeUnit;

	new(int amount, String timeUnit) {
		this.amount = amount
		this.timeUnit = timeUnit
	}

	def int getAmout(){
		return this.amount
	}
	
	def String getTimeUnit(){
		return this.timeUnit
	}
}
