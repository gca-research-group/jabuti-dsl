package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class MessageContent_Number_S extends TermStruct {
  private String xpath;

  private String op;

  private int content;

  public MessageContent_Number_S(final String xpath, final String op, final int content) {
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

  public int getContent() {
    return this.content;
  }
}
