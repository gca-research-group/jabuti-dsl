package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class SessionInterval_S extends TermStruct {
  private int duration;

  private String timeUnit;

  private String xpath;

  public SessionInterval_S(final int duration, final String timeUnit, final String xpath) {
    this.duration = duration;
    this.timeUnit = timeUnit;
    this.xpath = xpath;
  }

  public int getDuration() {
    return this.duration;
  }

  public String getTimeUnit() {
    return this.timeUnit;
  }

  public String getXpath() {
    return this.xpath;
  }
}
