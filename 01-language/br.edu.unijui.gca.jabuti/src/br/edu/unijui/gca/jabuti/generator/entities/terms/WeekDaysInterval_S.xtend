package br.edu.unijui.gca.jabuti.generator.entities.terms

class WeekDaysInterval_S extends TermStruct{
	    String start;
        String end;
        
        new (String start, String end){
        	this.start =  start
        	this.end =  end
        }
        
        def String getStart(){
        	return this.start
        }
        def String getEnd(){
        	return this.end
        }
	
}