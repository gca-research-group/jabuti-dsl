/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.edu.unijui.gca.jabuti.jabuti.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 *
 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
	/**
	 * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
	 * The list contents are of type {@link br.edu.unijui.gca.jabuti.jabuti.Greeting}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Greetings</em>' containment reference list.
	 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage#getModel_Greetings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Greeting> getGreetings();

} // Model
