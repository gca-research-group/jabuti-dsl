/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.UnaryOperator#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.UnaryOperator#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getUnaryOperator()
 * @model
 * @generated
 */
public interface UnaryOperator extends Expression
{
  /**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getUnaryOperator_Symbol()
	 * @model
	 * @generated
	 */
  String getSymbol();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.UnaryOperator#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
  void setSymbol(String value);

  /**
	 * Returns the value of the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' containment reference.
	 * @see #setExpression(Expression)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getUnaryOperator_Expression()
	 * @model containment="true"
	 * @generated
	 */
  Expression getExpression();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.UnaryOperator#getExpression <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression</em>' containment reference.
	 * @see #getExpression()
	 * @generated
	 */
  void setExpression(Expression value);

} // UnaryOperator
