package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class WeekDaysInterval_S extends TermStruct {
  private String start;

  private String end;

  public WeekDaysInterval_S(final String start, final String end) {
    this.start = start;
    this.end = end;
  }

  public String getStart() {
    return this.start;
  }

  public String getEnd() {
    return this.end;
  }
}
