package br.edu.unijui.gca.jabuti.generator.entities.terms

class MessageContent_Number_S extends TermStruct {
	String xpath
	String op // comparison operator
	int content

	new(String xpath, String op, int content) {
		this.xpath = xpath
		this.op = op
		this.content = content
	}

	def String getXpath() {
		return this.xpath
	}

	def String getOp() {
		return this.op
	}

	def int getContent() {
		return this.content
	}
}
