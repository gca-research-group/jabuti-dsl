/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE;

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
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.ConditionalExpression#getConditions <em>Conditions</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.ConditionalExpression#getLogicalOperators <em>Logical Operators</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getConditionalExpression()
 * @model
 * @generated
 */
public interface ConditionalExpression extends Condition
{
	/**
	 * Returns the value of the '<em><b>Conditions</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.smartce.smartCE.Condition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conditions</em>' containment reference list.
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getConditionalExpression_Conditions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Condition> getConditions();

	/**
	 * Returns the value of the '<em><b>Logical Operators</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.smartce.smartCE.LogicalOperator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logical Operators</em>' containment reference list.
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getConditionalExpression_LogicalOperators()
	 * @model containment="true"
	 * @generated
	 */
	EList<LogicalOperator> getLogicalOperators();

} // ConditionalExpression
