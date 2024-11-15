package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class MaxNumberOfOperation_S extends TermStruct {
  private int amount;

  private int rest;

  public MaxNumberOfOperation_S(final int amount) {
    this.amount = amount;
    this.rest = amount;
  }

  public int getRest() {
    return this.rest;
  }

  public int getAmount() {
    return this.amount;
  }
}
