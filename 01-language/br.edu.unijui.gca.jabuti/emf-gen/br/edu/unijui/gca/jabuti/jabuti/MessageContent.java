/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getComparisonOperator <em>Comparison Operator</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getContent <em>Content</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getExpression <em>Expression</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getVariable <em>Variable</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getPerTime <em>Per Time</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMessageContent()
 * @model
 * @generated
 */
public interface MessageContent extends Term
{
	/**
	 * Returns the value of the '<em><b>Comparison Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Comparison Operator</em>' containment reference.
	 * @see #setComparisonOperator(ComparisonOperator)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMessageContent_ComparisonOperator()
	 * @model containment="true"
	 * @generated
	 */
	ComparisonOperator getComparisonOperator();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getComparisonOperator <em>Comparison Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comparison Operator</em>' containment reference.
	 * @see #getComparisonOperator()
	 * @generated
	 */
	void setComparisonOperator(ComparisonOperator value);

	/**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMessageContent_Content()
	 * @model
	 * @generated
	 */
	String getContent();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
	void setContent(String value);

	/**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMessageContent_Expression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getExpression();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
	void setExpression(Expression value);

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMessageContent_Variable()
	 * @model
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link br.edu.unijui.gca.jabuti.jabuti.DataType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.jabuti.DataType
	 * @see #setReturnType(DataType)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMessageContent_ReturnType()
	 * @model
	 * @generated
	 */
	DataType getReturnType();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.jabuti.DataType
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataType value);

	/**
	 * Returns the value of the '<em><b>Per Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Per Time</em>' containment reference.
	 * @see #setPerTime(TimeUnitSpec)
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getMessageContent_PerTime()
	 * @model containment="true"
	 * @generated
	 */
	TimeUnitSpec getPerTime();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent#getPerTime <em>Per Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Per Time</em>' containment reference.
	 * @see #getPerTime()
	 * @generated
	 */
	void setPerTime(TimeUnitSpec value);

} // MessageContent
