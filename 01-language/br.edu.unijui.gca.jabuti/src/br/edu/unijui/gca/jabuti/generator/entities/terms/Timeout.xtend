package br.edu.unijui.gca.jabuti.generator.entities.terms

class Timeout extends TermStruct{
	int time;
	
    new(int time) {
        this.time = time
    }

    def int getTime() {
        return time
    }

    def void setTime(int time) {
        this.time = time
    }
}