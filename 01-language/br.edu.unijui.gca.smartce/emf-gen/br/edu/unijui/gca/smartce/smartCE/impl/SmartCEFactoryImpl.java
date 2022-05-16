/**
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.smartCE.impl;

import br.edu.unijui.gca.smartce.smartCE.Action;
import br.edu.unijui.gca.smartce.smartCE.Application;
import br.edu.unijui.gca.smartce.smartCE.BinaryOperator;
import br.edu.unijui.gca.smartce.smartCE.BusinessDay;
import br.edu.unijui.gca.smartce.smartCE.BusinessTime;
import br.edu.unijui.gca.smartce.smartCE.Clause;
import br.edu.unijui.gca.smartce.smartCE.CompositeCondition;
import br.edu.unijui.gca.smartce.smartCE.Contract;
import br.edu.unijui.gca.smartce.smartCE.Expression;
import br.edu.unijui.gca.smartce.smartCE.FunctionCall;
import br.edu.unijui.gca.smartce.smartCE.Import;
import br.edu.unijui.gca.smartce.smartCE.LiteralValue;
import br.edu.unijui.gca.smartce.smartCE.MessageContent;
import br.edu.unijui.gca.smartce.smartCE.Model;
import br.edu.unijui.gca.smartce.smartCE.NumericValue;
import br.edu.unijui.gca.smartce.smartCE.OnBreach;
import br.edu.unijui.gca.smartce.smartCE.Operation;
import br.edu.unijui.gca.smartce.smartCE.OperationsLimit;
import br.edu.unijui.gca.smartce.smartCE.Party;
import br.edu.unijui.gca.smartce.smartCE.SmartCEFactory;
import br.edu.unijui.gca.smartce.smartCE.SmartCEPackage;
import br.edu.unijui.gca.smartce.smartCE.Status;
import br.edu.unijui.gca.smartce.smartCE.StringValue;
import br.edu.unijui.gca.smartce.smartCE.Timeout;
import br.edu.unijui.gca.smartce.smartCE.UnaryOperator;
import br.edu.unijui.gca.smartce.smartCE.UnitTime;
import br.edu.unijui.gca.smartce.smartCE.Variable;
import br.edu.unijui.gca.smartce.smartCE.VariableValue;
import br.edu.unijui.gca.smartce.smartCE.WeekDays;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartCEFactoryImpl extends EFactoryImpl implements SmartCEFactory
{
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartCEFactory init()
	{
		try
		{
			SmartCEFactory theSmartCEFactory = (SmartCEFactory)EPackage.Registry.INSTANCE.getEFactory(SmartCEPackage.eNS_URI);
			if (theSmartCEFactory != null)
			{
				return theSmartCEFactory;
			}
		}
		catch (Exception exception)
		{
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartCEFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartCEFactoryImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass)
	{
		switch (eClass.getClassifierID())
		{
			case SmartCEPackage.CONTRACT: return createContract();
			case SmartCEPackage.STATUS: return createStatus();
			case SmartCEPackage.MODEL: return createModel();
			case SmartCEPackage.APPLICATION: return createApplication();
			case SmartCEPackage.PROCESS: return createProcess();
			case SmartCEPackage.PARTY: return createParty();
			case SmartCEPackage.CLAUSE: return createClause();
			case SmartCEPackage.OPERATION: return createOperation();
			case SmartCEPackage.IMPORT: return createImport();
			case SmartCEPackage.EXPRESSION: return createExpression();
			case SmartCEPackage.LITERAL_VALUE: return createLiteralValue();
			case SmartCEPackage.NUMERIC_VALUE: return createNumericValue();
			case SmartCEPackage.STRING_VALUE: return createStringValue();
			case SmartCEPackage.BINARY_OPERATOR: return createBinaryOperator();
			case SmartCEPackage.UNARY_OPERATOR: return createUnaryOperator();
			case SmartCEPackage.VARIABLE_VALUE: return createVariableValue();
			case SmartCEPackage.FUNCTION_CALL: return createFunctionCall();
			case SmartCEPackage.ON_BREACH: return createOnBreach();
			case SmartCEPackage.ACTION: return createAction();
			case SmartCEPackage.VARIABLE: return createVariable();
			case SmartCEPackage.TIMEOUT: return createTimeout();
			case SmartCEPackage.OPERATIONS_LIMIT: return createOperationsLimit();
			case SmartCEPackage.BUSINESS_DAY: return createBusinessDay();
			case SmartCEPackage.BUSINESS_TIME: return createBusinessTime();
			case SmartCEPackage.MESSAGE_CONTENT: return createMessageContent();
			case SmartCEPackage.COMPOSITE_CONDITION: return createCompositeCondition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue)
	{
		switch (eDataType.getClassifierID())
		{
			case SmartCEPackage.WEEK_DAYS:
				return createWeekDaysFromString(eDataType, initialValue);
			case SmartCEPackage.UNIT_TIME:
				return createUnitTimeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue)
	{
		switch (eDataType.getClassifierID())
		{
			case SmartCEPackage.WEEK_DAYS:
				return convertWeekDaysToString(eDataType, instanceValue);
			case SmartCEPackage.UNIT_TIME:
				return convertUnitTimeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contract createContract()
	{
		ContractImpl contract = new ContractImpl();
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Status createStatus()
	{
		StatusImpl status = new StatusImpl();
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model createModel()
	{
		ModelImpl model = new ModelImpl();
		return model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Application createApplication()
	{
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public br.edu.unijui.gca.smartce.smartCE.Process createProcess()
	{
		ProcessImpl process = new ProcessImpl();
		return process;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Party createParty()
	{
		PartyImpl party = new PartyImpl();
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Clause createClause()
	{
		ClauseImpl clause = new ClauseImpl();
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation()
	{
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Import createImport()
	{
		ImportImpl import_ = new ImportImpl();
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression createExpression()
	{
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LiteralValue createLiteralValue()
	{
		LiteralValueImpl literalValue = new LiteralValueImpl();
		return literalValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NumericValue createNumericValue()
	{
		NumericValueImpl numericValue = new NumericValueImpl();
		return numericValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringValue createStringValue()
	{
		StringValueImpl stringValue = new StringValueImpl();
		return stringValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryOperator createBinaryOperator()
	{
		BinaryOperatorImpl binaryOperator = new BinaryOperatorImpl();
		return binaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryOperator createUnaryOperator()
	{
		UnaryOperatorImpl unaryOperator = new UnaryOperatorImpl();
		return unaryOperator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableValue createVariableValue()
	{
		VariableValueImpl variableValue = new VariableValueImpl();
		return variableValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionCall createFunctionCall()
	{
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnBreach createOnBreach()
	{
		OnBreachImpl onBreach = new OnBreachImpl();
		return onBreach;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction()
	{
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Variable createVariable()
	{
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Timeout createTimeout()
	{
		TimeoutImpl timeout = new TimeoutImpl();
		return timeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OperationsLimit createOperationsLimit()
	{
		OperationsLimitImpl operationsLimit = new OperationsLimitImpl();
		return operationsLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessDay createBusinessDay()
	{
		BusinessDayImpl businessDay = new BusinessDayImpl();
		return businessDay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BusinessTime createBusinessTime()
	{
		BusinessTimeImpl businessTime = new BusinessTimeImpl();
		return businessTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MessageContent createMessageContent()
	{
		MessageContentImpl messageContent = new MessageContentImpl();
		return messageContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CompositeCondition createCompositeCondition()
	{
		CompositeConditionImpl compositeCondition = new CompositeConditionImpl();
		return compositeCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WeekDays createWeekDaysFromString(EDataType eDataType, String initialValue)
	{
		WeekDays result = WeekDays.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWeekDaysToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitTime createUnitTimeFromString(EDataType eDataType, String initialValue)
	{
		UnitTime result = UnitTime.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitTimeToString(EDataType eDataType, Object instanceValue)
	{
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SmartCEPackage getSmartCEPackage()
	{
		return (SmartCEPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartCEPackage getPackage()
	{
		return SmartCEPackage.eINSTANCE;
	}

} //SmartCEFactoryImpl
