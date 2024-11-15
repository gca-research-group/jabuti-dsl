package br.edu.unijui.gca.jabuti.generator.entities.terms

class MaxNumberOfOperation_S extends TermStruct {
	int amount
	int rest

	new(int amount){
		this.amount = amount
		this.rest = amount
	}
	
	def int getRest(){
		return this.rest
	}
	
	def int getAmount(){
		return this.amount
	}
	
	
}
