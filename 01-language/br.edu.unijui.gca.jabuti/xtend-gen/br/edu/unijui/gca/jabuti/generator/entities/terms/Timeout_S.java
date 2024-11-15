package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class Timeout_S extends TermStruct {
  private int amountTime;

  public Timeout_S(final int amountTime) {
    this.amountTime = amountTime;
  }

  public int getAmountTime() {
    return this.amountTime;
  }
}
