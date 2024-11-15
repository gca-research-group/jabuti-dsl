package br.edu.unijui.gca.jabuti.generator.entities.terms

class TimeInterval_S extends TermStruct{
	    long start;
        long end;
        
        new (long start, long end){
        	this.start =  start
        	this.end =  end
        }
        
        def long getStart(){
        	return this.start
        }
        def long getEnd(){
        	return this.end
        }
}
