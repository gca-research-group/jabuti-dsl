package br.edu.unijui.gca.jabuti.generator.entities;

public abstract class StructVar {
	private String name;
	private String tipo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
