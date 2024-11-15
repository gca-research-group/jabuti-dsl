package br.edu.unijui.gca.jabuti.generator.entities.terms

class MessageContent_Boolean_S extends TermStruct{
	    String xpath
        String op // comparison operator
       	boolean content
       	
       	new (String xpath, String op, boolean content){
       		this.xpath = xpath
       		this.op = op
       		this.content = content
       	}
       	
       	def String getXpath(){
       		return this.xpath
       	}
       	
       	def String getOp(){
       		return this.op
       	}
       	
       	def boolean getContent(){
       		return this.content
       	}
       	
}