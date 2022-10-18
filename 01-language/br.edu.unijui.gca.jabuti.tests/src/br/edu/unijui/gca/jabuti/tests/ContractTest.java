/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.tests;

import br.edu.unijui.gca.jabuti.Contract;
import br.edu.unijui.gca.jabuti.JabutiFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ContractTest extends TestCase {

	/**
	 * The fixture for this Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contract fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ContractTest.class);
	}

	/**
	 * Constructs a new Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Contract fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Contract getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(JabutiFactory.eINSTANCE.createContract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //ContractTest
