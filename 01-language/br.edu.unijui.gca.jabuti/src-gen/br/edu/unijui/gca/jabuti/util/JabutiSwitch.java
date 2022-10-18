/**
 * generated by Xtext 2.28.0
 */
package br.edu.unijui.gca.jabuti.util;

import br.edu.unijui.gca.jabuti.Action;
import br.edu.unijui.gca.jabuti.Application;
import br.edu.unijui.gca.jabuti.BinaryOperator;
import br.edu.unijui.gca.jabuti.BusinessAction;
import br.edu.unijui.gca.jabuti.BusinessDay;
import br.edu.unijui.gca.jabuti.BusinessRule;
import br.edu.unijui.gca.jabuti.Clause;
import br.edu.unijui.gca.jabuti.CompositeCondition;
import br.edu.unijui.gca.jabuti.Condition;
import br.edu.unijui.gca.jabuti.ConditionalExpression;
import br.edu.unijui.gca.jabuti.Contract;
import br.edu.unijui.gca.jabuti.EventLog;
import br.edu.unijui.gca.jabuti.Expression;
import br.edu.unijui.gca.jabuti.FunctionCall;
import br.edu.unijui.gca.jabuti.Import;
import br.edu.unijui.gca.jabuti.JabutiPackage;
import br.edu.unijui.gca.jabuti.LiteralValue;
import br.edu.unijui.gca.jabuti.LogicalOperator;
import br.edu.unijui.gca.jabuti.MessageContent;
import br.edu.unijui.gca.jabuti.Model;
import br.edu.unijui.gca.jabuti.NewEClass33;
import br.edu.unijui.gca.jabuti.NumericValue;
import br.edu.unijui.gca.jabuti.OnBreach;
import br.edu.unijui.gca.jabuti.OnSuccess;
import br.edu.unijui.gca.jabuti.OperationLimit;
import br.edu.unijui.gca.jabuti.Party;
import br.edu.unijui.gca.jabuti.SessionInterval;
import br.edu.unijui.gca.jabuti.StringValue;
import br.edu.unijui.gca.jabuti.TimeInterval;
import br.edu.unijui.gca.jabuti.Timeout;
import br.edu.unijui.gca.jabuti.UnaryOperator;
import br.edu.unijui.gca.jabuti.Variable;
import br.edu.unijui.gca.jabuti.VariableValue;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.edu.unijui.gca.jabuti.JabutiPackage
 * @generated
 */
public class JabutiSwitch<T> extends Switch<T>
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static JabutiPackage modelPackage;

  /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public JabutiSwitch()
  {
		if (modelPackage == null) {
			modelPackage = JabutiPackage.eINSTANCE;
		}
	}

  /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
		return ePackage == modelPackage;
	}

  /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
		switch (classifierID) {
			case JabutiPackage.MODEL: {
				Model model = (Model)theEObject;
				T result = caseModel(model);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.IMPORT: {
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.CONTRACT: {
				Contract contract = (Contract)theEObject;
				T result = caseContract(contract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.VARIABLE: {
				Variable variable = (Variable)theEObject;
				T result = caseVariable(variable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.CLAUSE: {
				Clause clause = (Clause)theEObject;
				T result = caseClause(clause);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.BUSINESS_RULE: {
				BusinessRule businessRule = (BusinessRule)theEObject;
				T result = caseBusinessRule(businessRule);
				if (result == null) result = caseCondition(businessRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.COMPOSITE_CONDITION: {
				CompositeCondition compositeCondition = (CompositeCondition)theEObject;
				T result = caseCompositeCondition(compositeCondition);
				if (result == null) result = caseCondition(compositeCondition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.CONDITIONAL_EXPRESSION: {
				ConditionalExpression conditionalExpression = (ConditionalExpression)theEObject;
				T result = caseConditionalExpression(conditionalExpression);
				if (result == null) result = caseCondition(conditionalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.LOGICAL_OPERATOR: {
				LogicalOperator logicalOperator = (LogicalOperator)theEObject;
				T result = caseLogicalOperator(logicalOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.TIMEOUT: {
				Timeout timeout = (Timeout)theEObject;
				T result = caseTimeout(timeout);
				if (result == null) result = caseBusinessRule(timeout);
				if (result == null) result = caseCondition(timeout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.OPERATION_LIMIT: {
				OperationLimit operationLimit = (OperationLimit)theEObject;
				T result = caseOperationLimit(operationLimit);
				if (result == null) result = caseBusinessRule(operationLimit);
				if (result == null) result = caseCondition(operationLimit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.BUSINESS_DAY: {
				BusinessDay businessDay = (BusinessDay)theEObject;
				T result = caseBusinessDay(businessDay);
				if (result == null) result = caseBusinessRule(businessDay);
				if (result == null) result = caseCondition(businessDay);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.TIME_INTERVAL: {
				TimeInterval timeInterval = (TimeInterval)theEObject;
				T result = caseTimeInterval(timeInterval);
				if (result == null) result = caseBusinessRule(timeInterval);
				if (result == null) result = caseCondition(timeInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.SESSION_INTERVAL: {
				SessionInterval sessionInterval = (SessionInterval)theEObject;
				T result = caseSessionInterval(sessionInterval);
				if (result == null) result = caseBusinessRule(sessionInterval);
				if (result == null) result = caseCondition(sessionInterval);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.MESSAGE_CONTENT: {
				MessageContent messageContent = (MessageContent)theEObject;
				T result = caseMessageContent(messageContent);
				if (result == null) result = caseBusinessRule(messageContent);
				if (result == null) result = caseCondition(messageContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.BINARY_OPERATOR: {
				BinaryOperator binaryOperator = (BinaryOperator)theEObject;
				T result = caseBinaryOperator(binaryOperator);
				if (result == null) result = caseExpression(binaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.PARTY: {
				Party party = (Party)theEObject;
				T result = caseParty(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.APPLICATION: {
				Application application = (Application)theEObject;
				T result = caseApplication(application);
				if (result == null) result = caseParty(application);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.PROCESS: {
				br.edu.unijui.gca.jabuti.Process process = (br.edu.unijui.gca.jabuti.Process)theEObject;
				T result = caseProcess(process);
				if (result == null) result = caseParty(process);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.ON_SUCCESS: {
				OnSuccess onSuccess = (OnSuccess)theEObject;
				T result = caseOnSuccess(onSuccess);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.ON_BREACH: {
				OnBreach onBreach = (OnBreach)theEObject;
				T result = caseOnBreach(onBreach);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.BUSINESS_ACTION: {
				BusinessAction businessAction = (BusinessAction)theEObject;
				T result = caseBusinessAction(businessAction);
				if (result == null) result = caseAction(businessAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.EVENT_LOG: {
				EventLog eventLog = (EventLog)theEObject;
				T result = caseEventLog(eventLog);
				if (result == null) result = caseAction(eventLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.EXPRESSION: {
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.LITERAL_VALUE: {
				LiteralValue literalValue = (LiteralValue)theEObject;
				T result = caseLiteralValue(literalValue);
				if (result == null) result = caseExpression(literalValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.NUMERIC_VALUE: {
				NumericValue numericValue = (NumericValue)theEObject;
				T result = caseNumericValue(numericValue);
				if (result == null) result = caseLiteralValue(numericValue);
				if (result == null) result = caseExpression(numericValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.STRING_VALUE: {
				StringValue stringValue = (StringValue)theEObject;
				T result = caseStringValue(stringValue);
				if (result == null) result = caseLiteralValue(stringValue);
				if (result == null) result = caseExpression(stringValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.VARIABLE_VALUE: {
				VariableValue variableValue = (VariableValue)theEObject;
				T result = caseVariableValue(variableValue);
				if (result == null) result = caseLiteralValue(variableValue);
				if (result == null) result = caseExpression(variableValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.FUNCTION_CALL: {
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = caseLiteralValue(functionCall);
				if (result == null) result = caseExpression(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.UNARY_OPERATOR: {
				UnaryOperator unaryOperator = (UnaryOperator)theEObject;
				T result = caseUnaryOperator(unaryOperator);
				if (result == null) result = caseExpression(unaryOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JabutiPackage.NEW_ECLASS33: {
				NewEClass33 newEClass33 = (NewEClass33)theEObject;
				T result = caseNewEClass33(newEClass33);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseModel(Model object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseImport(Import object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseContract(Contract object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariable(Variable object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clause</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseClause(Clause object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCondition(Condition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Business Rule</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBusinessRule(BusinessRule object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseCompositeCondition(CompositeCondition object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseConditionalExpression(ConditionalExpression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLogicalOperator(LogicalOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timeout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTimeout(Timeout object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Operation Limit</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation Limit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOperationLimit(OperationLimit object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Business Day</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Day</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBusinessDay(BusinessDay object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseTimeInterval(TimeInterval object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Session Interval</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Interval</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseSessionInterval(SessionInterval object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Message Content</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseMessageContent(MessageContent object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Binary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBinaryOperator(BinaryOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseParty(Party object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseApplication(Application object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Process</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseProcess(br.edu.unijui.gca.jabuti.Process object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>On Success</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Success</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOnSuccess(OnSuccess object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>On Breach</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>On Breach</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseOnBreach(OnBreach object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseAction(Action object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Business Action</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Business Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseBusinessAction(BusinessAction object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Event Log</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseEventLog(EventLog object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseExpression(Expression object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseLiteralValue(LiteralValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeric Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseNumericValue(NumericValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseStringValue(StringValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseVariableValue(VariableValue object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseFunctionCall(FunctionCall object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unary Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
  public T caseUnaryOperator(UnaryOperator object)
  {
		return null;
	}

  /**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass33</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass33</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewEClass33(NewEClass33 object) {
		return null;
	}

		/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
  @Override
  public T defaultCase(EObject object)
  {
		return null;
	}

} //JabutiSwitch
