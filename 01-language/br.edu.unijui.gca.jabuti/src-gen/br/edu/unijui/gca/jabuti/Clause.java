/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.Clause#getName <em>Name</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.Clause#getOperation <em>Operation</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.Clause#getCondition <em>Condition</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.Clause#getOnBreach <em>On Breach</em>}</li>
 *   <li>{@link br.edu.unijui.gca.jabuti.Clause#getOnSuccess <em>On Success</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getClause()
 * @model
 * @generated
 */
public interface Clause extends EObject
{
  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getClause_Name()
	 * @model
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.Clause#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link br.edu.unijui.gca.jabuti.Operation}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.Operation
	 * @see #setOperation(Operation)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getClause_Operation()
	 * @model
	 * @generated
	 */
  Operation getOperation();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.Clause#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see br.edu.unijui.gca.jabuti.Operation
	 * @see #getOperation()
	 * @generated
	 */
  void setOperation(Operation value);

  /**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getClause_Condition()
	 * @model containment="true"
	 * @generated
	 */
  Condition getCondition();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.Clause#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
  void setCondition(Condition value);

  /**
	 * Returns the value of the '<em><b>On Breach</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>On Breach</em>' containment reference.
	 * @see #setOnBreach(OnBreach)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getClause_OnBreach()
	 * @model containment="true"
	 * @generated
	 */
  OnBreach getOnBreach();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.Clause#getOnBreach <em>On Breach</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Breach</em>' containment reference.
	 * @see #getOnBreach()
	 * @generated
	 */
  void setOnBreach(OnBreach value);

  /**
	 * Returns the value of the '<em><b>On Success</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the value of the '<em>On Success</em>' containment reference.
	 * @see #setOnSuccess(OnSuccess)
	 * @see br.edu.unijui.gca.jabuti.JabutiPackage#getClause_OnSuccess()
	 * @model containment="true"
	 * @generated
	 */
  OnSuccess getOnSuccess();

  /**
	 * Sets the value of the '{@link br.edu.unijui.gca.jabuti.Clause#getOnSuccess <em>On Success</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>On Success</em>' containment reference.
	 * @see #getOnSuccess()
	 * @generated
	 */
  void setOnSuccess(OnSuccess value);

} // Clause
