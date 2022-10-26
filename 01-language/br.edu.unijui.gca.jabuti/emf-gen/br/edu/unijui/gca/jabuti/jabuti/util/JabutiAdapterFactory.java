/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.jabuti.util;

import br.edu.unijui.gca.jabuti.jabuti.Application;
import br.edu.unijui.gca.jabuti.jabuti.BinaryOperator;
import br.edu.unijui.gca.jabuti.jabuti.BinaryTermOperator;
import br.edu.unijui.gca.jabuti.jabuti.Clause;
import br.edu.unijui.gca.jabuti.jabuti.ComparisonOperator;
import br.edu.unijui.gca.jabuti.jabuti.CompositeCondition;
import br.edu.unijui.gca.jabuti.jabuti.Condition;
import br.edu.unijui.gca.jabuti.jabuti.ConditionTerm;
import br.edu.unijui.gca.jabuti.jabuti.ConditionalExpression;
import br.edu.unijui.gca.jabuti.jabuti.Contract;
import br.edu.unijui.gca.jabuti.jabuti.EventLog;
import br.edu.unijui.gca.jabuti.jabuti.Expression;
import br.edu.unijui.gca.jabuti.jabuti.FunctionCall;
import br.edu.unijui.gca.jabuti.jabuti.Import;
import br.edu.unijui.gca.jabuti.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.jabuti.LiteralValue;
import br.edu.unijui.gca.jabuti.jabuti.LogicalOperator;
import br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation;
import br.edu.unijui.gca.jabuti.jabuti.MessageContent;
import br.edu.unijui.gca.jabuti.jabuti.Model;
import br.edu.unijui.gca.jabuti.jabuti.NumericValue;
import br.edu.unijui.gca.jabuti.jabuti.Obligation;
import br.edu.unijui.gca.jabuti.jabuti.OnBreach;
import br.edu.unijui.gca.jabuti.jabuti.OnSuccess;
import br.edu.unijui.gca.jabuti.jabuti.Party;
import br.edu.unijui.gca.jabuti.jabuti.Prohibition;
import br.edu.unijui.gca.jabuti.jabuti.Right;
import br.edu.unijui.gca.jabuti.jabuti.SessionInterval;
import br.edu.unijui.gca.jabuti.jabuti.StringValue;
import br.edu.unijui.gca.jabuti.jabuti.Term;
import br.edu.unijui.gca.jabuti.jabuti.TimeInterval;
import br.edu.unijui.gca.jabuti.jabuti.Timeout;
import br.edu.unijui.gca.jabuti.jabuti.UnaryOperator;
import br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator;
import br.edu.unijui.gca.jabuti.jabuti.Variable;
import br.edu.unijui.gca.jabuti.jabuti.VariableValue;
import br.edu.unijui.gca.jabuti.jabuti.WeekDaysInterval;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.unijui.gca.jabuti.jabuti.JabutiPackage
 * @generated
 */
public class JabutiAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JabutiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JabutiAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = JabutiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object)
	{
		if (object == modelPackage)
		{
			return true;
		}
		if (object instanceof EObject)
		{
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JabutiSwitch<Adapter> modelSwitch =
		new JabutiSwitch<Adapter>()
		{
			@Override
			public Adapter caseModel(Model object)
			{
				return createModelAdapter();
			}
			@Override
			public Adapter caseImport(Import object)
			{
				return createImportAdapter();
			}
			@Override
			public Adapter caseContract(Contract object)
			{
				return createContractAdapter();
			}
			@Override
			public Adapter caseClause(Clause object)
			{
				return createClauseAdapter();
			}
			@Override
			public Adapter caseParty(Party object)
			{
				return createPartyAdapter();
			}
			@Override
			public Adapter caseApplication(Application object)
			{
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseProcess(br.edu.unijui.gca.jabuti.jabuti.Process object)
			{
				return createProcessAdapter();
			}
			@Override
			public Adapter caseRight(Right object)
			{
				return createRightAdapter();
			}
			@Override
			public Adapter caseObligation(Obligation object)
			{
				return createObligationAdapter();
			}
			@Override
			public Adapter caseProhibition(Prohibition object)
			{
				return createProhibitionAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object)
			{
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseNumericValue(NumericValue object)
			{
				return createNumericValueAdapter();
			}
			@Override
			public Adapter caseUnaryOperator(UnaryOperator object)
			{
				return createUnaryOperatorAdapter();
			}
			@Override
			public Adapter caseBinaryOperator(BinaryOperator object)
			{
				return createBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseLiteralValue(LiteralValue object)
			{
				return createLiteralValueAdapter();
			}
			@Override
			public Adapter caseVariableValue(VariableValue object)
			{
				return createVariableValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object)
			{
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object)
			{
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object)
			{
				return createVariableAdapter();
			}
			@Override
			public Adapter caseEventLog(EventLog object)
			{
				return createEventLogAdapter();
			}
			@Override
			public Adapter caseOnBreach(OnBreach object)
			{
				return createOnBreachAdapter();
			}
			@Override
			public Adapter caseOnSuccess(OnSuccess object)
			{
				return createOnSuccessAdapter();
			}
			@Override
			public Adapter caseConditionTerm(ConditionTerm object)
			{
				return createConditionTermAdapter();
			}
			@Override
			public Adapter caseLogicalOperator(LogicalOperator object)
			{
				return createLogicalOperatorAdapter();
			}
			@Override
			public Adapter caseConditionalExpression(ConditionalExpression object)
			{
				return createConditionalExpressionAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object)
			{
				return createConditionAdapter();
			}
			@Override
			public Adapter caseCompositeCondition(CompositeCondition object)
			{
				return createCompositeConditionAdapter();
			}
			@Override
			public Adapter caseTerm(Term object)
			{
				return createTermAdapter();
			}
			@Override
			public Adapter caseUnaryTermOperator(UnaryTermOperator object)
			{
				return createUnaryTermOperatorAdapter();
			}
			@Override
			public Adapter caseBinaryTermOperator(BinaryTermOperator object)
			{
				return createBinaryTermOperatorAdapter();
			}
			@Override
			public Adapter caseSessionInterval(SessionInterval object)
			{
				return createSessionIntervalAdapter();
			}
			@Override
			public Adapter caseWeekDaysInterval(WeekDaysInterval object)
			{
				return createWeekDaysIntervalAdapter();
			}
			@Override
			public Adapter caseTimeInterval(TimeInterval object)
			{
				return createTimeIntervalAdapter();
			}
			@Override
			public Adapter caseTimeout(Timeout object)
			{
				return createTimeoutAdapter();
			}
			@Override
			public Adapter caseMaxNumberOfOperation(MaxNumberOfOperation object)
			{
				return createMaxNumberOfOperationAdapter();
			}
			@Override
			public Adapter caseMessageContent(MessageContent object)
			{
				return createMessageContentAdapter();
			}
			@Override
			public Adapter caseComparisonOperator(ComparisonOperator object)
			{
				return createComparisonOperatorAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object)
			{
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target)
	{
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Model
	 * @generated
	 */
	public Adapter createModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Import
	 * @generated
	 */
	public Adapter createImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Contract
	 * @generated
	 */
	public Adapter createContractAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Party
	 * @generated
	 */
	public Adapter createPartyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Process
	 * @generated
	 */
	public Adapter createProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Right <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Right
	 * @generated
	 */
	public Adapter createRightAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Obligation <em>Obligation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Obligation
	 * @generated
	 */
	public Adapter createObligationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Prohibition <em>Prohibition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Prohibition
	 * @generated
	 */
	public Adapter createProhibitionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.NumericValue
	 * @generated
	 */
	public Adapter createNumericValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.LiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.LiteralValue
	 * @generated
	 */
	public Adapter createLiteralValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.VariableValue
	 * @generated
	 */
	public Adapter createVariableValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.EventLog <em>Event Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.EventLog
	 * @generated
	 */
	public Adapter createEventLogAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.OnBreach <em>On Breach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.OnBreach
	 * @generated
	 */
	public Adapter createOnBreachAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.OnSuccess <em>On Success</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.OnSuccess
	 * @generated
	 */
	public Adapter createOnSuccessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.ConditionTerm <em>Condition Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.ConditionTerm
	 * @generated
	 */
	public Adapter createConditionTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.LogicalOperator <em>Logical Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.LogicalOperator
	 * @generated
	 */
	public Adapter createLogicalOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.ConditionalExpression <em>Conditional Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.ConditionalExpression
	 * @generated
	 */
	public Adapter createConditionalExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.CompositeCondition <em>Composite Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.CompositeCondition
	 * @generated
	 */
	public Adapter createCompositeConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Term
	 * @generated
	 */
	public Adapter createTermAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator <em>Unary Term Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.UnaryTermOperator
	 * @generated
	 */
	public Adapter createUnaryTermOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.BinaryTermOperator <em>Binary Term Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.BinaryTermOperator
	 * @generated
	 */
	public Adapter createBinaryTermOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.SessionInterval <em>Session Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.SessionInterval
	 * @generated
	 */
	public Adapter createSessionIntervalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.WeekDaysInterval <em>Week Days Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.WeekDaysInterval
	 * @generated
	 */
	public Adapter createWeekDaysIntervalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.TimeInterval
	 * @generated
	 */
	public Adapter createTimeIntervalAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.Timeout
	 * @generated
	 */
	public Adapter createTimeoutAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation <em>Max Number Of Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.MaxNumberOfOperation
	 * @generated
	 */
	public Adapter createMaxNumberOfOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.MessageContent <em>Message Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.MessageContent
	 * @generated
	 */
	public Adapter createMessageContentAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.jabuti.jabuti.ComparisonOperator <em>Comparison Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.jabuti.jabuti.ComparisonOperator
	 * @generated
	 */
	public Adapter createComparisonOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter()
	{
		return null;
	}

} //JabutiAdapterFactory
