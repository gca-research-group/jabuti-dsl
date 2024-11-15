package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class MessageContent_Number_PerTime_S extends TermStruct {
  private String xpath;

  private String op;

  private int amount;

  private String timeUnit;

  public MessageContent_Number_PerTime_S(final String xpath, final String op, final int amount, final String timeUnit) {
    this.xpath = xpath;
    this.op = op;
    this.amount = amount;
    this.timeUnit = timeUnit;
  }

  public String getXpath() {
    return this.xpath;
  }

  public String getOp() {
    return this.op;
  }

  public int getAmount() {
    return this.amount;
  }

  public String getTimeUnit() {
    return this.timeUnit;
  }
}
