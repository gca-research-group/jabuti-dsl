package br.edu.unijui.gca.jabuti.generator;

import br.edu.unijui.gca.jabuti.generator.entities.terms.TermStruct;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class ClauseStruct {
  private final int id;

  private final String type;

  private final String name;

  private final String rolePlayer;

  private final String failMessasge;

  private final String successMessage;

  private final ArrayList<TermStruct> termsList;

  private final ArrayList<String> termsLogicalOperators;

  public ClauseStruct(final int id, final String type, final String name, final String rolePlayer, final String failMessage, final String successMessage) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.rolePlayer = rolePlayer;
    ArrayList<TermStruct> _arrayList = new ArrayList<TermStruct>();
    this.termsList = _arrayList;
    this.termsLogicalOperators = CollectionLiterals.<String>newArrayList();
    this.failMessasge = failMessage;
    this.successMessage = successMessage;
  }

  public ArrayList<TermStruct> getTermsMap() {
    return this.termsList;
  }

  public void addTerm(final TermStruct term) {
    this.termsList.add(term);
  }

  public void addLogicalOperator(final String operator) {
    this.termsLogicalOperators.add(operator);
  }

  public int getId() {
    return this.id;
  }

  public String getType() {
    return this.type;
  }

  public String getName() {
    return this.name;
  }

  public String getRolePlayer() {
    return this.rolePlayer;
  }

  public ArrayList<String> getLogicalOperators() {
    return this.termsLogicalOperators;
  }

  public List<TermStruct> getTermsList() {
    return this.termsList;
  }

  public String getFailMessage() {
    return this.failMessasge;
  }

  public String getSuccessMessage() {
    return this.successMessage;
  }
}
