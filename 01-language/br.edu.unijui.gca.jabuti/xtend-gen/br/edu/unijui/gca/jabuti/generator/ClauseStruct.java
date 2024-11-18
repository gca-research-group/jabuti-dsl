package br.edu.unijui.gca.jabuti.generator;

import br.edu.unijui.gca.jabuti.generator.entities.terms.TermStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class ClauseStruct {
  private final int id;

  private final String type;

  private final String name;

  private final String rolePlayer;

  private final String failMessasge;

  private final String successMessage;

  private final Map<String, List<TermStruct>> termsMap;

  private final ArrayList<String> termsLogicalOperators;

  public ClauseStruct(final int id, final String type, final String name, final String rolePlayer, final String failMessage, final String successMessage) {
    this.id = id;
    this.type = type;
    this.name = name;
    this.rolePlayer = rolePlayer;
    HashMap<String, List<TermStruct>> _hashMap = new HashMap<String, List<TermStruct>>();
    this.termsMap = _hashMap;
    this.termsLogicalOperators = CollectionLiterals.<String>newArrayList();
    this.failMessasge = failMessage;
    this.successMessage = successMessage;
  }

  public Map<String, List<TermStruct>> getTermsMap() {
    return this.termsMap;
  }

  public void addTerm(final String termType, final TermStruct term) {
    boolean _containsKey = this.termsMap.containsKey(termType);
    boolean _not = (!_containsKey);
    if (_not) {
      this.termsMap.put(termType, CollectionLiterals.<TermStruct>newArrayList());
    }
    this.termsMap.get(termType).add(term);
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

  public List<TermStruct> getTerms(final String termType) {
    List<TermStruct> _elvis = null;
    List<TermStruct> _get = this.termsMap.get(termType);
    if (_get != null) {
      _elvis = _get;
    } else {
      ArrayList<TermStruct> _newArrayList = CollectionLiterals.<TermStruct>newArrayList();
      _elvis = _newArrayList;
    }
    return _elvis;
  }

  public String getFailMessage() {
    return this.failMessasge;
  }

  public String getSuccessMessage() {
    return this.successMessage;
  }

  @Override
  public String toString() {
    String _xblockexpression = null;
    {
      final Function1<Map.Entry<String, List<TermStruct>>, String> _function = (Map.Entry<String, List<TermStruct>> it) -> {
        String _key = it.getKey();
        String _plus = (_key + ": ");
        String _join = IterableExtensions.join(it.getValue(), ", ");
        return (_plus + _join);
      };
      IterableExtensions.join(IterableExtensions.<Map.Entry<String, List<TermStruct>>, String>map(this.termsMap.entrySet(), _function), " | ");
      _xblockexpression = "Clause #«clauseNumber»: «examples»";
    }
    return _xblockexpression;
  }
}
