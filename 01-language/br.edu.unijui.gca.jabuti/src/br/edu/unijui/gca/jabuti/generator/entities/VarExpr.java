package br.edu.unijui.gca.jabuti.generator.entities;

public class VarExpr extends StructVar {
	private String content;
	
	public String getContent() {
		return this.content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void concatContent(String content) {
		this.content= this.content+content;
	}
}
