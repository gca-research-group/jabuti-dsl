package br.edu.unijui.gca.jabuti.generator.entities.terms

class MessageContent_Number_PerTime_S extends TermStruct{
	    String xpath;
        String op; // // the comparison operator (op) will receive only '<' or '<='
        int amount;
        String timeUnit;
        new(String xpath, String op, int amount, String timeUnit){
        	this.xpath = xpath
        	this.op = op
        	this.amount = amount
        	this.timeUnit = timeUnit
        }
        def String getXpath(){
        	return this.xpath
        }
        def String getOp(){
        	return this.op
        }
        def int getAmount(){
        	return this.amount
        }
        def String getTimeUnit(){
        	return this.timeUnit
        }
        
}