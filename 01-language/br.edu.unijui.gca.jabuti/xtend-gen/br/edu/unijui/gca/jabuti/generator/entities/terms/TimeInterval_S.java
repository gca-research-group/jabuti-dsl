package br.edu.unijui.gca.jabuti.generator.entities.terms;

@SuppressWarnings("all")
public class TimeInterval_S extends TermStruct {
  private long start;

  private long end;

  public TimeInterval_S(final long start, final long end) {
    this.start = start;
    this.end = end;
  }

  public long getStart() {
    return this.start;
  }

  public long getEnd() {
    return this.end;
  }
}
