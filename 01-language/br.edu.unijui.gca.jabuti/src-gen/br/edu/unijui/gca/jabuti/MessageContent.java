/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.MessageContent#getContent <em>Content</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.MessageContent#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.MessageContent#getBinaryOperator <em>Binary Operator</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.MessageContent#getStringValue <em>String Value</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.MessageContent#getVariableValue <em>Variable Value</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.MessageContent#getNumericValue <em>Numeric Value</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getMessageContent()
 * @model
 * @generated
 */
public interface MessageContent extends BusinessRule
{
  /**
	 * Returns the value of the '<em><b>Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Content</em>' attribute.
	 * @see #setContent(String)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getMessageContent_Content()
	 * @model
	 * @generated
	 */
  String getContent();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.MessageContent#getContent <em>Content</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content</em>' attribute.
	 * @see #getContent()
	 * @generated
	 */
  void setContent(String value);

  /**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link br.edu.unijui.gca.jabuti.TimeUnit}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getMessageContent_TimeUnit()
	 * @model
	 * @generated
	 */
  TimeUnit getTimeUnit();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.MessageContent#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
  void setTimeUnit(TimeUnit value);

  /**
	 * Returns the value of the '<em><b>Binary Operator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Operator</em>' containment reference.
	 * @see #setBinaryOperator(BinaryOperator)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getMessageContent_BinaryOperator()
	 * @model containment="true"
	 * @generated
	 */
  BinaryOperator getBinaryOperator();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.MessageContent#getBinaryOperator <em>Binary Operator</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Operator</em>' containment reference.
	 * @see #getBinaryOperator()
	 * @generated
	 */
  void setBinaryOperator(BinaryOperator value);

  /**
	 * Returns the value of the '<em><b>String Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' containment reference.
	 * @see #setStringValue(StringValue)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getMessageContent_StringValue()
	 * @model containment="true"
	 * @generated
	 */
  StringValue getStringValue();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.MessageContent#getStringValue <em>String Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' containment reference.
	 * @see #getStringValue()
	 * @generated
	 */
  void setStringValue(StringValue value);

  /**
	 * Returns the value of the '<em><b>Variable Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Value</em>' containment reference.
	 * @see #setVariableValue(VariableValue)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getMessageContent_VariableValue()
	 * @model containment="true"
	 * @generated
	 */
  VariableValue getVariableValue();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.MessageContent#getVariableValue <em>Variable Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Value</em>' containment reference.
	 * @see #getVariableValue()
	 * @generated
	 */
  void setVariableValue(VariableValue value);

  /**
	 * Returns the value of the '<em><b>Numeric Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric Value</em>' containment reference.
	 * @see #setNumericValue(NumericValue)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getMessageContent_NumericValue()
	 * @model containment="true"
	 * @generated
	 */
  NumericValue getNumericValue();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.MessageContent#getNumericValue <em>Numeric Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric Value</em>' containment reference.
	 * @see #getNumericValue()
	 * @generated
	 */
  void setNumericValue(NumericValue value);

} // MessageContent
