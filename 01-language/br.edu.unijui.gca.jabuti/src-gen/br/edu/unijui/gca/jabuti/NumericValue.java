/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.NumericValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getNumericValue()
 * @model
 * @generated
 */
public interface NumericValue extends LiteralValue
{
  /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getNumericValue_Value()
	 * @model
	 * @generated
	 */
  int getValue();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.NumericValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
  void setValue(int value);

} // NumericValue
