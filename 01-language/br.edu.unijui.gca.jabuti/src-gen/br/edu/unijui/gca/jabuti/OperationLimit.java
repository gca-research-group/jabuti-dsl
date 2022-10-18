/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Limit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.OperationLimit#getOperationsNumber <em>Operations Number</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.OperationLimit#getTimeUnit <em>Time Unit</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getOperationLimit()
 * @model
 * @generated
 */
public interface OperationLimit extends BusinessRule
{
  /**
	 * Returns the value of the '<em><b>Operations Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations Number</em>' attribute.
	 * @see #setOperationsNumber(int)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getOperationLimit_OperationsNumber()
	 * @model
	 * @generated
	 */
  int getOperationsNumber();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.OperationLimit#getOperationsNumber <em>Operations Number</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operations Number</em>' attribute.
	 * @see #getOperationsNumber()
	 * @generated
	 */
  void setOperationsNumber(int value);

  /**
	 * Returns the value of the '<em><b>Time Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link br.edu.unijui.gca.jabuti.TimeUnit}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.TimeUnit
	 * @see #setTimeUnit(TimeUnit)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getOperationLimit_TimeUnit()
	 * @model
	 * @generated
	 */
  TimeUnit getTimeUnit();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.OperationLimit#getTimeUnit <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Unit</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.TimeUnit
	 * @see #getTimeUnit()
	 * @generated
	 */
  void setTimeUnit(TimeUnit value);

} // OperationLimit
