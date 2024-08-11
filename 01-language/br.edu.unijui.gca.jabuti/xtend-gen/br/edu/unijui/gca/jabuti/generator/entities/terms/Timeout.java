package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class Timeout extends TermStruct {
  private int time;

  public Timeout(final int time) {
    this.time = time;
  }

  public int getTime() {
    return this.time;
  }

  public void setTime(final int time) {
    this.time = time;
  }
}
