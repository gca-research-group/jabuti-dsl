package br.edu.unijui.gca.jabuti.generator.entities.terms

class SessionInterval_S extends TermStruct{
	int duration;
    String timeUnit;           
    String xpath;       
    
    new (int duration, String timeUnit, String xpath){
    	this.duration =  duration
    	this.timeUnit = timeUnit
    	this.xpath =  xpath
    } 
    
	def int getDuration() {
		return this.duration
	}
	
	def String getTimeUnit() {
		return this.timeUnit
	}

	def String getXpath() {
		return this.xpath
	}
	
}