package br.edu.unijui.gca.jabuti.generator.entities;

@SuppressWarnings("all")
public abstract class StructVar {
  private String name;

  private String type;

  public StructVar(final String name, final String type) {
    this.name = name;
    this.type = type;
  }

  public String getName() {
    return this.name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }
}
