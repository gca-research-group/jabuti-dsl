/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.Condition#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getCondition()
 * @model abstract="true"
 * @generated
 */
public interface Condition extends EObject
{
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.smartce.smartCE.Expression}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference list.
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getCondition_Expression()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getExpression();

} // Condition
