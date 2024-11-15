package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class MessageContent_String_S extends TermStruct {
  private String xpath;

  private String op;

  private String content;

  public MessageContent_String_S(final String xpath, final String op, final String content) {
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

  public String getContent() {
    return this.content;
  }
}
