/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage
 * @generated
 */
public interface JabutiFactory extends EFactory
{
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JabutiFactory eINSTANCE = br.edu.unijui.gca.jabuti.jabuti.impl.JabutiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	Model createModel();

	/**
	 * Returns a new object of class '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Import</em>'.
	 * @generated
	 */
	Import createImport();

	/**
	 * Returns a new object of class '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contract</em>'.
	 * @generated
	 */
	Contract createContract();

	/**
	 * Returns a new object of class '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clause</em>'.
	 * @generated
	 */
	Clause createClause();

	/**
	 * Returns a new object of class '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Party</em>'.
	 * @generated
	 */
	Party createParty();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	Application createApplication();

	/**
	 * Returns a new object of class '<em>Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Process</em>'.
	 * @generated
	 */
	Process createProcess();

	/**
	 * Returns a new object of class '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Right</em>'.
	 * @generated
	 */
	Right createRight();

	/**
	 * Returns a new object of class '<em>Obligation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obligation</em>'.
	 * @generated
	 */
	Obligation createObligation();

	/**
	 * Returns a new object of class '<em>Prohibition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prohibition</em>'.
	 * @generated
	 */
	Prohibition createProhibition();

	/**
	 * Returns a new object of class '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression</em>'.
	 * @generated
	 */
	Expression createExpression();

	/**
	 * Returns a new object of class '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Value</em>'.
	 * @generated
	 */
	NumericValue createNumericValue();

	/**
	 * Returns a new object of class '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Operator</em>'.
	 * @generated
	 */
	UnaryOperator createUnaryOperator();

	/**
	 * Returns a new object of class '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Operator</em>'.
	 * @generated
	 */
	BinaryOperator createBinaryOperator();

	/**
	 * Returns a new object of class '<em>Literal Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Value</em>'.
	 * @generated
	 */
	LiteralValue createLiteralValue();

	/**
	 * Returns a new object of class '<em>Variable Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Value</em>'.
	 * @generated
	 */
	VariableValue createVariableValue();

	/**
	 * Returns a new object of class '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Value</em>'.
	 * @generated
	 */
	StringValue createStringValue();

	/**
	 * Returns a new object of class '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function Call</em>'.
	 * @generated
	 */
	FunctionCall createFunctionCall();

	/**
	 * Returns a new object of class '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable</em>'.
	 * @generated
	 */
	Variable createVariable();

	/**
	 * Returns a new object of class '<em>Event Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Event Log</em>'.
	 * @generated
	 */
	EventLog createEventLog();

	/**
	 * Returns a new object of class '<em>On Breach</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Breach</em>'.
	 * @generated
	 */
	OnBreach createOnBreach();

	/**
	 * Returns a new object of class '<em>On Success</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>On Success</em>'.
	 * @generated
	 */
	OnSuccess createOnSuccess();

	/**
	 * Returns a new object of class '<em>Expression Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expression Term</em>'.
	 * @generated
	 */
	ExpressionTerm createExpressionTerm();

	/**
	 * Returns a new object of class '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logical Operator</em>'.
	 * @generated
	 */
	LogicalOperator createLogicalOperator();

	/**
	 * Returns a new object of class '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conditional Expression</em>'.
	 * @generated
	 */
	ConditionalExpression createConditionalExpression();

	/**
	 * Returns a new object of class '<em>Term</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Term</em>'.
	 * @generated
	 */
	Term createTerm();

	/**
	 * Returns a new object of class '<em>Unary Term Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unary Term Operator</em>'.
	 * @generated
	 */
	UnaryTermOperator createUnaryTermOperator();

	/**
	 * Returns a new object of class '<em>Binary Term Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Binary Term Operator</em>'.
	 * @generated
	 */
	BinaryTermOperator createBinaryTermOperator();

	/**
	 * Returns a new object of class '<em>Session Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Session Interval</em>'.
	 * @generated
	 */
	SessionInterval createSessionInterval();

	/**
	 * Returns a new object of class '<em>Week Days Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Week Days Interval</em>'.
	 * @generated
	 */
	WeekDaysInterval createWeekDaysInterval();

	/**
	 * Returns a new object of class '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Interval</em>'.
	 * @generated
	 */
	TimeInterval createTimeInterval();

	/**
	 * Returns a new object of class '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timeout</em>'.
	 * @generated
	 */
	Timeout createTimeout();

	/**
	 * Returns a new object of class '<em>Max Number Of Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Number Of Operation</em>'.
	 * @generated
	 */
	MaxNumberOfOperation createMaxNumberOfOperation();

	/**
	 * Returns a new object of class '<em>Message Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message Content</em>'.
	 * @generated
	 */
	MessageContent createMessageContent();

	/**
	 * Returns a new object of class '<em>Comparison Operator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Comparison Operator</em>'.
	 * @generated
	 */
	ComparisonOperator createComparisonOperator();

	/**
	 * Returns a new object of class '<em>Time Unit Spec</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Unit Spec</em>'.
	 * @generated
	 */
	TimeUnitSpec createTimeUnitSpec();

	/**
	 * Returns a new object of class '<em>Parenthesized Expression</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parenthesized Expression</em>'.
	 * @generated
	 */
	ParenthesizedExpression createParenthesizedExpression();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JabutiPackage getJabutiPackage();

} //JabutiFactory
