package br.edu.unijui.gca.jabuti.generator.entities



abstract class StructVar {
	String name;
	String type;

	new (String name, String type) {		
		this.name = name;
		this.type = type;
	}
		
	def String getName() {
		return name;
	}
	def void setName(String name) {
		this.name = name;
	}
	def String getType() {
		return type;
	}
	def void setType(String type) {
		this.type = type;
	}
}
