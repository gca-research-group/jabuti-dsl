package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class MessageContent_onlyXPath_String_S extends TermStruct {
  private String xpath;

  public MessageContent_onlyXPath_String_S(final String xpath) {
    this.xpath = xpath;
  }

  public String getXpath() {
    return this.xpath;
  }

  public void setXpath(final String xpath) {
    this.xpath = xpath;
  }
}
