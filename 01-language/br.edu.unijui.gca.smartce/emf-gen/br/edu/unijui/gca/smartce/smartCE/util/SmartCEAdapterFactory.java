/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE.util;

import br.edu.unijui.gca.smartce.smartCE.Action;
import br.edu.unijui.gca.smartce.smartCE.Application;
import br.edu.unijui.gca.smartce.smartCE.BinaryOperator;
import br.edu.unijui.gca.smartce.smartCE.Clause;
import br.edu.unijui.gca.smartce.smartCE.Condition;
import br.edu.unijui.gca.smartce.smartCE.Contract;
import br.edu.unijui.gca.smartce.smartCE.Expression;
import br.edu.unijui.gca.smartce.smartCE.FunctionCall;
import br.edu.unijui.gca.smartce.smartCE.Import;
import br.edu.unijui.gca.smartce.smartCE.LiteralValue;
import br.edu.unijui.gca.smartce.smartCE.Model;
import br.edu.unijui.gca.smartce.smartCE.NumericValue;
import br.edu.unijui.gca.smartce.smartCE.OnBreach;
import br.edu.unijui.gca.smartce.smartCE.Operation;
import br.edu.unijui.gca.smartce.smartCE.OperationsLimit;
import br.edu.unijui.gca.smartce.smartCE.Party;
import br.edu.unijui.gca.smartce.smartCE.SmartCEPackage;
import br.edu.unijui.gca.smartce.smartCE.Status;
import br.edu.unijui.gca.smartce.smartCE.StringValue;
import br.edu.unijui.gca.smartce.smartCE.Timeout;
import br.edu.unijui.gca.smartce.smartCE.UnaryOperator;
import br.edu.unijui.gca.smartce.smartCE.Variable;
import br.edu.unijui.gca.smartce.smartCE.VariableValue;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.edu.unijui.gca.smartce.smartCE.SmartCEPackage
 * @generated
 */
public class SmartCEAdapterFactory extends AdapterFactoryImpl
{
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SmartCEPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCEAdapterFactory()
	{
		if (modelPackage == null)
		{
			modelPackage = SmartCEPackage.eINSTANCE;
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
	protected SmartCESwitch<Adapter> modelSwitch =
		new SmartCESwitch<Adapter>()
		{
			@Override
			public Adapter caseContract(Contract object)
			{
				return createContractAdapter();
			}
			@Override
			public Adapter caseStatus(Status object)
			{
				return createStatusAdapter();
			}
			@Override
			public Adapter caseModel(Model object)
			{
				return createModelAdapter();
			}
			@Override
			public Adapter caseApplication(Application object)
			{
				return createApplicationAdapter();
			}
			@Override
			public Adapter caseProcess(br.edu.unijui.gca.smartce.smartCE.Process object)
			{
				return createProcessAdapter();
			}
			@Override
			public Adapter caseParty(Party object)
			{
				return createPartyAdapter();
			}
			@Override
			public Adapter caseClause(Clause object)
			{
				return createClauseAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object)
			{
				return createOperationAdapter();
			}
			@Override
			public Adapter caseImport(Import object)
			{
				return createImportAdapter();
			}
			@Override
			public Adapter caseExpression(Expression object)
			{
				return createExpressionAdapter();
			}
			@Override
			public Adapter caseLiteralValue(LiteralValue object)
			{
				return createLiteralValueAdapter();
			}
			@Override
			public Adapter caseNumericValue(NumericValue object)
			{
				return createNumericValueAdapter();
			}
			@Override
			public Adapter caseStringValue(StringValue object)
			{
				return createStringValueAdapter();
			}
			@Override
			public Adapter caseBinaryOperator(BinaryOperator object)
			{
				return createBinaryOperatorAdapter();
			}
			@Override
			public Adapter caseUnaryOperator(UnaryOperator object)
			{
				return createUnaryOperatorAdapter();
			}
			@Override
			public Adapter caseVariableValue(VariableValue object)
			{
				return createVariableValueAdapter();
			}
			@Override
			public Adapter caseFunctionCall(FunctionCall object)
			{
				return createFunctionCallAdapter();
			}
			@Override
			public Adapter caseOnBreach(OnBreach object)
			{
				return createOnBreachAdapter();
			}
			@Override
			public Adapter caseAction(Action object)
			{
				return createActionAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object)
			{
				return createVariableAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object)
			{
				return createConditionAdapter();
			}
			@Override
			public Adapter caseTimeout(Timeout object)
			{
				return createTimeoutAdapter();
			}
			@Override
			public Adapter caseOperationsLimit(OperationsLimit object)
			{
				return createOperationsLimitAdapter();
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
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Contract
	 * @generated
	 */
	public Adapter createContractAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Status <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Status
	 * @generated
	 */
	public Adapter createStatusAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Model
	 * @generated
	 */
	public Adapter createModelAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Process
	 * @generated
	 */
	public Adapter createProcessAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Party <em>Party</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Party
	 * @generated
	 */
	public Adapter createPartyAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Clause <em>Clause</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Clause
	 * @generated
	 */
	public Adapter createClauseAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Import <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Import
	 * @generated
	 */
	public Adapter createImportAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Expression
	 * @generated
	 */
	public Adapter createExpressionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.LiteralValue <em>Literal Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.LiteralValue
	 * @generated
	 */
	public Adapter createLiteralValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.NumericValue <em>Numeric Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.NumericValue
	 * @generated
	 */
	public Adapter createNumericValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.StringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.StringValue
	 * @generated
	 */
	public Adapter createStringValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.BinaryOperator
	 * @generated
	 */
	public Adapter createBinaryOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.UnaryOperator <em>Unary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.UnaryOperator
	 * @generated
	 */
	public Adapter createUnaryOperatorAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.VariableValue <em>Variable Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.VariableValue
	 * @generated
	 */
	public Adapter createVariableValueAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.FunctionCall
	 * @generated
	 */
	public Adapter createFunctionCallAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.OnBreach <em>On Breach</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.OnBreach
	 * @generated
	 */
	public Adapter createOnBreachAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Action
	 * @generated
	 */
	public Adapter createActionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.Timeout <em>Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.Timeout
	 * @generated
	 */
	public Adapter createTimeoutAdapter()
	{
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link br.edu.unijui.gca.smartce.smartCE.OperationsLimit <em>Operations Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see br.edu.unijui.gca.smartce.smartCE.OperationsLimit
	 * @generated
	 */
	public Adapter createOperationsLimitAdapter()
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

} //SmartCEAdapterFactory
