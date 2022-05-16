/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Business Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.BusinessTime#getStart <em>Start</em>}</li>
 *   <li>{@link br.edu.unijui.gca.smartce.smartCE.BusinessTime#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getBusinessTime()
 * @model
 * @generated
 */
public interface BusinessTime extends Condition
{
	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(Expression)
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getBusinessTime_Start()
	 * @model containment="true"
	 * @generated
	 */
	Expression getStart();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.smartce.smartCE.BusinessTime#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Expression value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(Expression)
	 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage#getBusinessTime_End()
	 * @model containment="true"
	 * @generated
	 */
	Expression getEnd();

	/**
	 * Sets the value of the '{@link br.edu.unijui.gca.smartce.smartCE.BusinessTime#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Expression value);

} // BusinessTime