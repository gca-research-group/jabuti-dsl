package br.edu.unijui.gca.jabuti.generator.entities;

import java.util.ArrayList;

@SuppressWarnings("all")
public class VarExpr extends StructVar {
  private ArrayList<String> content;

  public VarExpr(final String name, final String type, final ArrayList<String> content) {
    super(name, type);
    ArrayList<String> _arrayList = new ArrayList<String>();
    this.content = _arrayList;
    this.content.addAll(content);
  }

  public ArrayList<String> getContent() {
    return this.content;
  }

  public void setContent(final String content) {
    this.setContent(content);
  }

  public void concatContent(final String content) {
    String _plus = (this.content + content);
    this.setContent(_plus);
  }

  @Override
  public String toString() {
    String _name = this.getName();
    String _plus = ("VarExpr [Name: " + _name);
    String _plus_1 = (_plus + ", Type: ");
    String _type = this.getType();
    String _plus_2 = (_plus_1 + _type);
    String _plus_3 = (_plus_2 + ", Content: ");
    String _plus_4 = (_plus_3 + this.content);
    return (_plus_4 + "]");
  }
}
