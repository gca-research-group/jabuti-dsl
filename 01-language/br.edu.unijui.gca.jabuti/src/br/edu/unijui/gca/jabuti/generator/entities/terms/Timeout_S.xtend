package br.edu.unijui.gca.jabuti.generator.entities.terms

class Timeout_S extends TermStruct{
	int amountTime;
	
    new(int amountTime) {
        this.amountTime = amountTime
    }

    def int getAmountTime() {
        return this.amountTime
    }
}