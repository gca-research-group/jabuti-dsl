/*
 * generated by Xtext 2.26.0
 */
package br.edu.unijui.gca.smartce.serializer;

import br.edu.unijui.gca.smartce.services.SmartCEGrammarAccess;
import br.edu.unijui.gca.smartce.smartCE.Application;
import br.edu.unijui.gca.smartce.smartCE.BinaryOperator;
import br.edu.unijui.gca.smartce.smartCE.BusinessDay;
import br.edu.unijui.gca.smartce.smartCE.BusinessTime;
import br.edu.unijui.gca.smartce.smartCE.Clause;
import br.edu.unijui.gca.smartce.smartCE.CompositeCondition;
import br.edu.unijui.gca.smartce.smartCE.Contract;
import br.edu.unijui.gca.smartce.smartCE.FunctionCall;
import br.edu.unijui.gca.smartce.smartCE.Import;
import br.edu.unijui.gca.smartce.smartCE.LogicalOperator;
import br.edu.unijui.gca.smartce.smartCE.MessageContent;
import br.edu.unijui.gca.smartce.smartCE.Model;
import br.edu.unijui.gca.smartce.smartCE.NumericValue;
import br.edu.unijui.gca.smartce.smartCE.OnBreach;
import br.edu.unijui.gca.smartce.smartCE.Operation;
import br.edu.unijui.gca.smartce.smartCE.OperationsLimit;
import br.edu.unijui.gca.smartce.smartCE.SmartCEPackage;
import br.edu.unijui.gca.smartce.smartCE.StringValue;
import br.edu.unijui.gca.smartce.smartCE.Timeout;
import br.edu.unijui.gca.smartce.smartCE.UnaryOperator;
import br.edu.unijui.gca.smartce.smartCE.Variable;
import br.edu.unijui.gca.smartce.smartCE.VariableValue;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class SmartCESemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmartCEGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == SmartCEPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case SmartCEPackage.ACTION:
				sequence_Action(context, (br.edu.unijui.gca.smartce.smartCE.Action) semanticObject); 
				return; 
			case SmartCEPackage.APPLICATION:
				sequence_Application(context, (Application) semanticObject); 
				return; 
			case SmartCEPackage.BINARY_OPERATOR:
				sequence_Comparison_Expression_Factor_Plus(context, (BinaryOperator) semanticObject); 
				return; 
			case SmartCEPackage.BUSINESS_DAY:
				sequence_BusinessDay(context, (BusinessDay) semanticObject); 
				return; 
			case SmartCEPackage.BUSINESS_TIME:
				sequence_BusinessTime(context, (BusinessTime) semanticObject); 
				return; 
			case SmartCEPackage.CLAUSE:
				sequence_Clause(context, (Clause) semanticObject); 
				return; 
			case SmartCEPackage.COMPOSITE_CONDITION:
				sequence_CompositeCondition(context, (CompositeCondition) semanticObject); 
				return; 
			case SmartCEPackage.CONTRACT:
				sequence_Contract(context, (Contract) semanticObject); 
				return; 
			case SmartCEPackage.FUNCTION_CALL:
				sequence_FunctionCall(context, (FunctionCall) semanticObject); 
				return; 
			case SmartCEPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case SmartCEPackage.LOGICAL_OPERATOR:
				sequence_LogicalOperator(context, (LogicalOperator) semanticObject); 
				return; 
			case SmartCEPackage.MESSAGE_CONTENT:
				sequence_MessageContent(context, (MessageContent) semanticObject); 
				return; 
			case SmartCEPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case SmartCEPackage.NUMERIC_VALUE:
				sequence_NumericValue(context, (NumericValue) semanticObject); 
				return; 
			case SmartCEPackage.ON_BREACH:
				sequence_OnBreach(context, (OnBreach) semanticObject); 
				return; 
			case SmartCEPackage.OPERATION:
				sequence_Operation(context, (Operation) semanticObject); 
				return; 
			case SmartCEPackage.OPERATIONS_LIMIT:
				sequence_OperationsLimit(context, (OperationsLimit) semanticObject); 
				return; 
			case SmartCEPackage.PROCESS:
				sequence_Process(context, (br.edu.unijui.gca.smartce.smartCE.Process) semanticObject); 
				return; 
			case SmartCEPackage.STRING_VALUE:
				sequence_StringValue(context, (StringValue) semanticObject); 
				return; 
			case SmartCEPackage.TIMEOUT:
				sequence_Timeout(context, (Timeout) semanticObject); 
				return; 
			case SmartCEPackage.UNARY_OPERATOR:
				sequence_Negation_Negative(context, (UnaryOperator) semanticObject); 
				return; 
			case SmartCEPackage.VARIABLE:
				sequence_Variable(context, (Variable) semanticObject); 
				return; 
			case SmartCEPackage.VARIABLE_VALUE:
				sequence_VariableValue(context, (VariableValue) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * <pre>
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     ((name=ID parameters+=Variable parameters+=Variable*) | (name=ID parameters+=Variable parameters+=Variable*))
	 * </pre>
	 */
	protected void sequence_Action(ISerializationContext context, br.edu.unijui.gca.smartce.smartCE.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Party returns Application
	 *     Application returns Application
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 * </pre>
	 */
	protected void sequence_Application(ISerializationContext context, Application semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.PARTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.PARTY__NAME));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.PARTY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.PARTY__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getApplicationAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getApplicationAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns BusinessDay
	 *     BusinessRule returns BusinessDay
	 *     BusinessDay returns BusinessDay
	 *
	 * Constraint:
	 *     (start=WeekDay end=WeekDay)
	 * </pre>
	 */
	protected void sequence_BusinessDay(ISerializationContext context, BusinessDay semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.BUSINESS_DAY__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.BUSINESS_DAY__START));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.BUSINESS_DAY__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.BUSINESS_DAY__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBusinessDayAccess().getStartWeekDayEnumRuleCall_2_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getBusinessDayAccess().getEndWeekDayEnumRuleCall_4_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns BusinessTime
	 *     BusinessRule returns BusinessTime
	 *     BusinessTime returns BusinessTime
	 *
	 * Constraint:
	 *     (start=STRING end=STRING)
	 * </pre>
	 */
	protected void sequence_BusinessTime(ISerializationContext context, BusinessTime semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.BUSINESS_TIME__START) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.BUSINESS_TIME__START));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.BUSINESS_TIME__END) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.BUSINESS_TIME__END));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBusinessTimeAccess().getStartSTRINGTerminalRuleCall_2_0(), semanticObject.getStart());
		feeder.accept(grammarAccess.getBusinessTimeAccess().getEndSTRINGTerminalRuleCall_4_0(), semanticObject.getEnd());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Clause returns Clause
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         description=STRING 
	 *         rolePlayer=[Party|ID] 
	 *         operation=[Operation|QualifiedName] 
	 *         condition=Condition 
	 *         onBreach=OnBreach
	 *     )
	 * </pre>
	 */
	protected void sequence_Clause(ISerializationContext context, Clause semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.CLAUSE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.CLAUSE__NAME));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.CLAUSE__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.CLAUSE__DESCRIPTION));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.CLAUSE__ROLE_PLAYER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.CLAUSE__ROLE_PLAYER));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.CLAUSE__OPERATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.CLAUSE__OPERATION));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.CLAUSE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.CLAUSE__CONDITION));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.CLAUSE__ON_BREACH) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.CLAUSE__ON_BREACH));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClauseAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getClauseAccess().getDescriptionSTRINGTerminalRuleCall_5_0(), semanticObject.getDescription());
		feeder.accept(grammarAccess.getClauseAccess().getRolePlayerPartyIDTerminalRuleCall_7_0_1(), semanticObject.eGet(SmartCEPackage.Literals.CLAUSE__ROLE_PLAYER, false));
		feeder.accept(grammarAccess.getClauseAccess().getOperationOperationQualifiedNameParserRuleCall_10_0_1(), semanticObject.eGet(SmartCEPackage.Literals.CLAUSE__OPERATION, false));
		feeder.accept(grammarAccess.getClauseAccess().getConditionConditionParserRuleCall_14_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getClauseAccess().getOnBreachOnBreachParserRuleCall_17_0(), semanticObject.getOnBreach());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns BinaryOperator
	 *     Expression.BinaryOperator_1_0 returns BinaryOperator
	 *     Negation returns BinaryOperator
	 *     Comparison returns BinaryOperator
	 *     Comparison.BinaryOperator_1_0 returns BinaryOperator
	 *     Plus returns BinaryOperator
	 *     Plus.BinaryOperator_1_0 returns BinaryOperator
	 *     Factor returns BinaryOperator
	 *     Factor.BinaryOperator_1_0 returns BinaryOperator
	 *     Negative returns BinaryOperator
	 *     Primary returns BinaryOperator
	 *
	 * Constraint:
	 *     (
	 *         (left=Expression_BinaryOperator_1_0 (symbol='&&' | symbol='||') right=Negation) | 
	 *         (
	 *             left=Comparison_BinaryOperator_1_0 
	 *             (
	 *                 symbol='&lt;=' | 
	 *                 symbol='&gt;=' | 
	 *                 symbol='&gt;' | 
	 *                 symbol='&lt;' | 
	 *                 symbol='!=' | 
	 *                 symbol='==' | 
	 *                 symbol='is' | 
	 *                 symbol='as'
	 *             ) 
	 *             right=Plus
	 *         ) | 
	 *         (left=Plus_BinaryOperator_1_0 right=Factor) | 
	 *         (left=Factor_BinaryOperator_1_0 right=Negative)
	 *     )
	 * </pre>
	 */
	protected void sequence_Comparison_Expression_Factor_Plus(ISerializationContext context, BinaryOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns CompositeCondition
	 *     CompositeCondition returns CompositeCondition
	 *
	 * Constraint:
	 *     (
	 *         conditions+=BusinessRule 
	 *         logicalOperators+=LogicalOperator 
	 *         conditions+=BusinessRule 
	 *         (logicalOperators+=LogicalOperator conditions+=BusinessRule)*
	 *     )
	 * </pre>
	 */
	protected void sequence_CompositeCondition(ISerializationContext context, CompositeCondition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Contract returns Contract
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         beginDate=STRING 
	 *         dueDate=STRING 
	 *         application=Application 
	 *         process=Process 
	 *         clauses+=Clause* 
	 *         actions+=Action*
	 *     )
	 * </pre>
	 */
	protected void sequence_Contract(ISerializationContext context, Contract semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns FunctionCall
	 *     Expression.BinaryOperator_1_0 returns FunctionCall
	 *     Negation returns FunctionCall
	 *     Comparison returns FunctionCall
	 *     Comparison.BinaryOperator_1_0 returns FunctionCall
	 *     Plus returns FunctionCall
	 *     Plus.BinaryOperator_1_0 returns FunctionCall
	 *     Factor returns FunctionCall
	 *     Factor.BinaryOperator_1_0 returns FunctionCall
	 *     Negative returns FunctionCall
	 *     Primary returns FunctionCall
	 *     LiteralValue returns FunctionCall
	 *     FunctionCall returns FunctionCall
	 *
	 * Constraint:
	 *     (name=QualifiedName params+=Expression params+=Expression*)
	 * </pre>
	 */
	protected void sequence_FunctionCall(ISerializationContext context, FunctionCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 * </pre>
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     LogicalOperator returns LogicalOperator
	 *
	 * Constraint:
	 *     (name='AND' | name='OR' | name='NOT')
	 * </pre>
	 */
	protected void sequence_LogicalOperator(ISerializationContext context, LogicalOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns MessageContent
	 *     BusinessRule returns MessageContent
	 *     MessageContent returns MessageContent
	 *
	 * Constraint:
	 *     content=STRING
	 * </pre>
	 */
	protected void sequence_MessageContent(ISerializationContext context, MessageContent semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.MESSAGE_CONTENT__CONTENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.MESSAGE_CONTENT__CONTENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMessageContentAccess().getContentSTRINGTerminalRuleCall_2_0(), semanticObject.getContent());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (imports+=Import* operations+=Operation* contracts+=Contract*)
	 * </pre>
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns UnaryOperator
	 *     Expression.BinaryOperator_1_0 returns UnaryOperator
	 *     Negation returns UnaryOperator
	 *     Comparison returns UnaryOperator
	 *     Comparison.BinaryOperator_1_0 returns UnaryOperator
	 *     Plus returns UnaryOperator
	 *     Plus.BinaryOperator_1_0 returns UnaryOperator
	 *     Factor returns UnaryOperator
	 *     Factor.BinaryOperator_1_0 returns UnaryOperator
	 *     Negative returns UnaryOperator
	 *     Primary returns UnaryOperator
	 *
	 * Constraint:
	 *     ((symbol='!' expression=Comparison) | expression=Primary)
	 * </pre>
	 */
	protected void sequence_Negation_Negative(ISerializationContext context, UnaryOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns NumericValue
	 *     Expression.BinaryOperator_1_0 returns NumericValue
	 *     Negation returns NumericValue
	 *     Comparison returns NumericValue
	 *     Comparison.BinaryOperator_1_0 returns NumericValue
	 *     Plus returns NumericValue
	 *     Plus.BinaryOperator_1_0 returns NumericValue
	 *     Factor returns NumericValue
	 *     Factor.BinaryOperator_1_0 returns NumericValue
	 *     Negative returns NumericValue
	 *     Primary returns NumericValue
	 *     LiteralValue returns NumericValue
	 *     NumericValue returns NumericValue
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_NumericValue(ISerializationContext context, NumericValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.NUMERIC_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.NUMERIC_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNumericValueAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     OnBreach returns OnBreach
	 *
	 * Constraint:
	 *     (action=[Action|ID] message=Expression)
	 * </pre>
	 */
	protected void sequence_OnBreach(ISerializationContext context, OnBreach semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.ON_BREACH__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.ON_BREACH__ACTION));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.ON_BREACH__MESSAGE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.ON_BREACH__MESSAGE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOnBreachAccess().getActionActionIDTerminalRuleCall_1_0_1(), semanticObject.eGet(SmartCEPackage.Literals.ON_BREACH__ACTION, false));
		feeder.accept(grammarAccess.getOnBreachAccess().getMessageExpressionParserRuleCall_3_0(), semanticObject.getMessage());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Operation returns Operation
	 *
	 * Constraint:
	 *     name=QualifiedName
	 * </pre>
	 */
	protected void sequence_Operation(ISerializationContext context, Operation semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.OPERATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.OPERATION__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationAccess().getNameQualifiedNameParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns OperationsLimit
	 *     BusinessRule returns OperationsLimit
	 *     OperationsLimit returns OperationsLimit
	 *
	 * Constraint:
	 *     (operationsNumber=INT timeUnit=TimeUnit)
	 * </pre>
	 */
	protected void sequence_OperationsLimit(ISerializationContext context, OperationsLimit semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.OPERATIONS_LIMIT__OPERATIONS_NUMBER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.OPERATIONS_LIMIT__OPERATIONS_NUMBER));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.OPERATIONS_LIMIT__TIME_UNIT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.OPERATIONS_LIMIT__TIME_UNIT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOperationsLimitAccess().getOperationsNumberINTTerminalRuleCall_2_0(), semanticObject.getOperationsNumber());
		feeder.accept(grammarAccess.getOperationsLimitAccess().getTimeUnitTimeUnitEnumRuleCall_4_0(), semanticObject.getTimeUnit());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Party returns Process
	 *     Process returns Process
	 *
	 * Constraint:
	 *     (name=ID description=STRING)
	 * </pre>
	 */
	protected void sequence_Process(ISerializationContext context, br.edu.unijui.gca.smartce.smartCE.Process semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.PARTY__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.PARTY__NAME));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.PARTY__DESCRIPTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.PARTY__DESCRIPTION));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getProcessAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getProcessAccess().getDescriptionSTRINGTerminalRuleCall_2_0(), semanticObject.getDescription());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns StringValue
	 *     Expression.BinaryOperator_1_0 returns StringValue
	 *     Negation returns StringValue
	 *     Comparison returns StringValue
	 *     Comparison.BinaryOperator_1_0 returns StringValue
	 *     Plus returns StringValue
	 *     Plus.BinaryOperator_1_0 returns StringValue
	 *     Factor returns StringValue
	 *     Factor.BinaryOperator_1_0 returns StringValue
	 *     Negative returns StringValue
	 *     Primary returns StringValue
	 *     LiteralValue returns StringValue
	 *     StringValue returns StringValue
	 *
	 * Constraint:
	 *     value=STRING
	 * </pre>
	 */
	protected void sequence_StringValue(ISerializationContext context, StringValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.STRING_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.STRING_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Condition returns Timeout
	 *     BusinessRule returns Timeout
	 *     Timeout returns Timeout
	 *
	 * Constraint:
	 *     value=INT
	 * </pre>
	 */
	protected void sequence_Timeout(ISerializationContext context, Timeout semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.TIMEOUT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.TIMEOUT__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTimeoutAccess().getValueINTTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Expression returns VariableValue
	 *     Expression.BinaryOperator_1_0 returns VariableValue
	 *     Negation returns VariableValue
	 *     Comparison returns VariableValue
	 *     Comparison.BinaryOperator_1_0 returns VariableValue
	 *     Plus returns VariableValue
	 *     Plus.BinaryOperator_1_0 returns VariableValue
	 *     Factor returns VariableValue
	 *     Factor.BinaryOperator_1_0 returns VariableValue
	 *     Negative returns VariableValue
	 *     Primary returns VariableValue
	 *     LiteralValue returns VariableValue
	 *     VariableValue returns VariableValue
	 *
	 * Constraint:
	 *     value=QualifiedName
	 * </pre>
	 */
	protected void sequence_VariableValue(ISerializationContext context, VariableValue semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.VARIABLE_VALUE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.VARIABLE_VALUE__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableValueAccess().getValueQualifiedNameParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * <pre>
	 * Contexts:
	 *     Variable returns Variable
	 *
	 * Constraint:
	 *     (name=ID type=ID)
	 * </pre>
	 */
	protected void sequence_Variable(ISerializationContext context, Variable semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.VARIABLE__NAME));
			if (transientValues.isValueTransient(semanticObject, SmartCEPackage.Literals.VARIABLE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmartCEPackage.Literals.VARIABLE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableAccess().getTypeIDTerminalRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
}
