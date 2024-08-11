package br.edu.unijui.gca.jabuti.generator.entities.terms

class MessageContent_onlyXPath_String extends TermStruct{
	String xpath;
	
	new(String xpath) {
		this.xpath = xpath
	}
	
	def String getXpath() {
        return xpath
    }
    
    def void setXpath(String xpath) {
        this.xpath = xpath
    }
}