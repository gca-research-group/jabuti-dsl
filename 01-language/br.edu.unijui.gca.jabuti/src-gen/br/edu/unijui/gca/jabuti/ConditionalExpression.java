/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.ConditionalExpression#getConditions <em>Conditions</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.ConditionalExpression#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends Condition
{
  /**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.jabuti.Condition}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getConditionalExpression_Conditions()
	 * @model containment="true"
	 * @generated
	 */
  EList<Condition> getConditions();

  /**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.jabuti.Expression}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getConditionalExpression_Expression()
	 * @model containment="true"
	 * @generated
	 */
  EList<Expression> getExpression();

} // ConditionalExpression
