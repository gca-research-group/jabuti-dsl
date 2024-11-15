package br.edu.unijui.gca.jabuti.generator.entities.terms

class MessageContent_String_S extends TermStruct {
	String xpath
	String op // comparison operator
	String content

	new(String xpath, String op, String content) {
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

	def String getContent() {
		return this.content
	}
}
