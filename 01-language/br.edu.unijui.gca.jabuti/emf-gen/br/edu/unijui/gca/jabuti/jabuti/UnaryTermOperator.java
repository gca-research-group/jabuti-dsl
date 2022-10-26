/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Term Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator#getConditionTerm <em>Condition Term</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getUnaryTermOperator()
 * @model
 * @generated
 */
public interface UnaryTermOperator extends ConditionTerm
{
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getUnaryTermOperator_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Condition Term</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Term</em>' containment reference.
	 * @see #setConditionTerm(ConditionTerm)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getUnaryTermOperator_ConditionTerm()
	 * @model containment="true"
	 * @generated
	 */
	ConditionTerm getConditionTerm();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator#getConditionTerm <em>Condition Term</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Term</em>' containment reference.
	 * @see #getConditionTerm()
	 * @generated
	 */
	void setConditionTerm(ConditionTerm value);

} // UnaryTermOperator
