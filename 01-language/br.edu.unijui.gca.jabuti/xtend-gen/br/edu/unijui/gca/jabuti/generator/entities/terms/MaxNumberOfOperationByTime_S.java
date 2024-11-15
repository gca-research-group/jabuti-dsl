package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class MaxNumberOfOperationByTime_S extends TermStruct {
  private int amount;

  private String timeUnit;

  public MaxNumberOfOperationByTime_S(final int amount, final String timeUnit) {
    this.amount = amount;
    this.timeUnit = timeUnit;
  }

  public int getAmout() {
    return this.amount;
  }

  public String getTimeUnit() {
    return this.timeUnit;
  }
}
