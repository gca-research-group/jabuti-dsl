package br.edu.unijui.gca.jabuti.generator.entities;

import br.edu.unijui.gca.jabuti.generator.entities.terms.TermStruct;

@SuppressWarnings("all")
public class VarTerm extends StructVar {
  private TermStruct term;

  public VarTerm(final String name, final String type, final TermStruct term) {
    super(name, type);
    this.term = term;
  }

  public TermStruct getTerm() {
    return this.term;
  }

  public void setTerm(final TermStruct term) {
    this.term = term;
  }
}
