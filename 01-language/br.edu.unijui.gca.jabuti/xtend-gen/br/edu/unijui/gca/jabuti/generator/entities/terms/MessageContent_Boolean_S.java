package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class MessageContent_Boolean_S extends TermStruct {
  private String xpath;

  private String op;

  private boolean content;

  public MessageContent_Boolean_S(final String xpath, final String op, final boolean content) {
    this.xpath = xpath;
    this.op = op;
    this.content = content;
  }

  public String getXpath() {
    return this.xpath;
  }

  public String getOp() {
    return this.op;
  }

  public boolean getContent() {
    return this.content;
  }
}
