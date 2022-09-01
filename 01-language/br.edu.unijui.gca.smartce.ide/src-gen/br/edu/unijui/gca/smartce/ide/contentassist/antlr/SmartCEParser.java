/*
 * generated by Xtext 2.26.0
 */
package br.edu.unijui.gca.smartce.ide.contentassist.antlr;

import br.edu.unijui.gca.smartce.ide.contentassist.antlr.internal.InternalSmartCEParser;
import br.edu.unijui.gca.smartce.services.SmartCEGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class SmartCEParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(SmartCEGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, SmartCEGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getClauseAccess().getAlternatives_0(), "rule__Clause__Alternatives_0");
			builder.put(grammarAccess.getConditionAccess().getAlternatives(), "rule__Condition__Alternatives");
			builder.put(grammarAccess.getBusinessRuleAccess().getAlternatives(), "rule__BusinessRule__Alternatives");
			builder.put(grammarAccess.getCompositeConditionAccess().getAlternatives_4_7(), "rule__CompositeCondition__Alternatives_4_7");
			builder.put(grammarAccess.getLogicalOperatorAccess().getNameAlternatives_0(), "rule__LogicalOperator__NameAlternatives_0");
			builder.put(grammarAccess.getSessionIntervalAccess().getAlternatives(), "rule__SessionInterval__Alternatives");
			builder.put(grammarAccess.getMessageContentAccess().getAlternatives(), "rule__MessageContent__Alternatives");
			builder.put(grammarAccess.getMessageContentAccess().getAlternatives_2_4(), "rule__MessageContent__Alternatives_2_4");
			builder.put(grammarAccess.getMessageContentAccess().getAlternatives_3_4(), "rule__MessageContent__Alternatives_3_4");
			builder.put(grammarAccess.getBinaryOperatorAccess().getAlternatives(), "rule__BinaryOperator__Alternatives");
			builder.put(grammarAccess.getPartyAccess().getAlternatives(), "rule__Party__Alternatives");
			builder.put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives_1_1(), "rule__Expression__Alternatives_1_1");
			builder.put(grammarAccess.getNegationAccess().getAlternatives(), "rule__Negation__Alternatives");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives_1_1(), "rule__Comparison__Alternatives_1_1");
			builder.put(grammarAccess.getPlusAccess().getAlternatives_1_1(), "rule__Plus__Alternatives_1_1");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_1(), "rule__Factor__Alternatives_1_1");
			builder.put(grammarAccess.getNegativeAccess().getAlternatives(), "rule__Negative__Alternatives");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getLiteralValueAccess().getAlternatives(), "rule__LiteralValue__Alternatives");
			builder.put(grammarAccess.getOperationAccess().getAlternatives(), "rule__Operation__Alternatives");
			builder.put(grammarAccess.getWeekDayAccess().getAlternatives(), "rule__WeekDay__Alternatives");
			builder.put(grammarAccess.getTimeUnitAccess().getAlternatives(), "rule__TimeUnit__Alternatives");
			builder.put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
			builder.put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
			builder.put(grammarAccess.getContractAccess().getGroup(), "rule__Contract__Group__0");
			builder.put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
			builder.put(grammarAccess.getClauseAccess().getGroup(), "rule__Clause__Group__0");
			builder.put(grammarAccess.getClauseAccess().getGroup_15(), "rule__Clause__Group_15__0");
			builder.put(grammarAccess.getCompositeConditionAccess().getGroup(), "rule__CompositeCondition__Group__0");
			builder.put(grammarAccess.getCompositeConditionAccess().getGroup_3(), "rule__CompositeCondition__Group_3__0");
			builder.put(grammarAccess.getCompositeConditionAccess().getGroup_4(), "rule__CompositeCondition__Group_4__0");
			builder.put(grammarAccess.getCompositeConditionAccess().getGroup_4_7_1(), "rule__CompositeCondition__Group_4_7_1__0");
			builder.put(grammarAccess.getCompositeConditionAccess().getGroup_4_7_1_3(), "rule__CompositeCondition__Group_4_7_1_3__0");
			builder.put(grammarAccess.getTimeoutAccess().getGroup(), "rule__Timeout__Group__0");
			builder.put(grammarAccess.getOperationLimitAccess().getGroup(), "rule__OperationLimit__Group__0");
			builder.put(grammarAccess.getBusinessDayAccess().getGroup(), "rule__BusinessDay__Group__0");
			builder.put(grammarAccess.getTimeIntervalAccess().getGroup(), "rule__TimeInterval__Group__0");
			builder.put(grammarAccess.getSessionIntervalAccess().getGroup_0(), "rule__SessionInterval__Group_0__0");
			builder.put(grammarAccess.getSessionIntervalAccess().getGroup_1(), "rule__SessionInterval__Group_1__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_0(), "rule__MessageContent__Group_0__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_1(), "rule__MessageContent__Group_1__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_2(), "rule__MessageContent__Group_2__0");
			builder.put(grammarAccess.getMessageContentAccess().getGroup_3(), "rule__MessageContent__Group_3__0");
			builder.put(grammarAccess.getOnSuccessAccess().getGroup(), "rule__OnSuccess__Group__0");
			builder.put(grammarAccess.getOnBreachAccess().getGroup(), "rule__OnBreach__Group__0");
			builder.put(grammarAccess.getBusinessActionAccess().getGroup(), "rule__BusinessAction__Group__0");
			builder.put(grammarAccess.getEventLogAccess().getGroup(), "rule__EventLog__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup(), "rule__Expression__Group__0");
			builder.put(grammarAccess.getExpressionAccess().getGroup_1(), "rule__Expression__Group_1__0");
			builder.put(grammarAccess.getNegationAccess().getGroup_1(), "rule__Negation__Group_1__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
			builder.put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
			builder.put(grammarAccess.getPlusAccess().getGroup(), "rule__Plus__Group__0");
			builder.put(grammarAccess.getPlusAccess().getGroup_1(), "rule__Plus__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getNegativeAccess().getGroup_1(), "rule__Negative__Group_1__0");
			builder.put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3(), "rule__FunctionCall__Group_3__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getDATEAccess().getGroup(), "rule__DATE__Group__0");
			builder.put(grammarAccess.getModelAccess().getImportsAssignment_1(), "rule__Model__ImportsAssignment_1");
			builder.put(grammarAccess.getModelAccess().getContractsAssignment_2(), "rule__Model__ContractsAssignment_2");
			builder.put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getContractAccess().getNameAssignment_1(), "rule__Contract__NameAssignment_1");
			builder.put(grammarAccess.getContractAccess().getBeginDateAssignment_5(), "rule__Contract__BeginDateAssignment_5");
			builder.put(grammarAccess.getContractAccess().getDueDateAssignment_8(), "rule__Contract__DueDateAssignment_8");
			builder.put(grammarAccess.getContractAccess().getApplicationAssignment_13(), "rule__Contract__ApplicationAssignment_13");
			builder.put(grammarAccess.getContractAccess().getProcessAssignment_16(), "rule__Contract__ProcessAssignment_16");
			builder.put(grammarAccess.getContractAccess().getVariablesAssignment_20(), "rule__Contract__VariablesAssignment_20");
			builder.put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
			builder.put(grammarAccess.getVariableAccess().getExpressionAssignment_2(), "rule__Variable__ExpressionAssignment_2");
			builder.put(grammarAccess.getClauseAccess().getNameAssignment_1(), "rule__Clause__NameAssignment_1");
			builder.put(grammarAccess.getClauseAccess().getDescriptionAssignment_5(), "rule__Clause__DescriptionAssignment_5");
			builder.put(grammarAccess.getClauseAccess().getOperationAssignment_8(), "rule__Clause__OperationAssignment_8");
			builder.put(grammarAccess.getClauseAccess().getConditionAssignment_11(), "rule__Clause__ConditionAssignment_11");
			builder.put(grammarAccess.getClauseAccess().getOnBreachAssignment_14(), "rule__Clause__OnBreachAssignment_14");
			builder.put(grammarAccess.getClauseAccess().getOnSuccessAssignment_15_1(), "rule__Clause__OnSuccessAssignment_15_1");
			builder.put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_0(), "rule__CompositeCondition__ConditionsAssignment_0");
			builder.put(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsAssignment_1(), "rule__CompositeCondition__LogicalOperatorsAssignment_1");
			builder.put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_2(), "rule__CompositeCondition__ConditionsAssignment_2");
			builder.put(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsAssignment_3_0(), "rule__CompositeCondition__LogicalOperatorsAssignment_3_0");
			builder.put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_3_1(), "rule__CompositeCondition__ConditionsAssignment_3_1");
			builder.put(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsAssignment_4_0(), "rule__CompositeCondition__LogicalOperatorsAssignment_4_0");
			builder.put(grammarAccess.getCompositeConditionAccess().getExpressionAssignment_4_3(), "rule__CompositeCondition__ExpressionAssignment_4_3");
			builder.put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_4_7_0(), "rule__CompositeCondition__ConditionsAssignment_4_7_0");
			builder.put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_4_7_1_0(), "rule__CompositeCondition__ConditionsAssignment_4_7_1_0");
			builder.put(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsAssignment_4_7_1_1(), "rule__CompositeCondition__LogicalOperatorsAssignment_4_7_1_1");
			builder.put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_4_7_1_2(), "rule__CompositeCondition__ConditionsAssignment_4_7_1_2");
			builder.put(grammarAccess.getCompositeConditionAccess().getLogicalOperatorsAssignment_4_7_1_3_0(), "rule__CompositeCondition__LogicalOperatorsAssignment_4_7_1_3_0");
			builder.put(grammarAccess.getCompositeConditionAccess().getConditionsAssignment_4_7_1_3_1(), "rule__CompositeCondition__ConditionsAssignment_4_7_1_3_1");
			builder.put(grammarAccess.getLogicalOperatorAccess().getNameAssignment(), "rule__LogicalOperator__NameAssignment");
			builder.put(grammarAccess.getTimeoutAccess().getValueAssignment_2(), "rule__Timeout__ValueAssignment_2");
			builder.put(grammarAccess.getOperationLimitAccess().getOperationsNumberAssignment_2(), "rule__OperationLimit__OperationsNumberAssignment_2");
			builder.put(grammarAccess.getOperationLimitAccess().getTimeUnitAssignment_4(), "rule__OperationLimit__TimeUnitAssignment_4");
			builder.put(grammarAccess.getBusinessDayAccess().getStartAssignment_2(), "rule__BusinessDay__StartAssignment_2");
			builder.put(grammarAccess.getBusinessDayAccess().getEndAssignment_4(), "rule__BusinessDay__EndAssignment_4");
			builder.put(grammarAccess.getTimeIntervalAccess().getStartAssignment_2(), "rule__TimeInterval__StartAssignment_2");
			builder.put(grammarAccess.getTimeIntervalAccess().getEndAssignment_4(), "rule__TimeInterval__EndAssignment_4");
			builder.put(grammarAccess.getSessionIntervalAccess().getFrequencyAssignment_0_2(), "rule__SessionInterval__FrequencyAssignment_0_2");
			builder.put(grammarAccess.getSessionIntervalAccess().getTimeUnitAssignment_0_3(), "rule__SessionInterval__TimeUnitAssignment_0_3");
			builder.put(grammarAccess.getSessionIntervalAccess().getStartAssignment_0_5(), "rule__SessionInterval__StartAssignment_0_5");
			builder.put(grammarAccess.getSessionIntervalAccess().getEndAssignment_0_7(), "rule__SessionInterval__EndAssignment_0_7");
			builder.put(grammarAccess.getSessionIntervalAccess().getFrequencyAssignment_1_2(), "rule__SessionInterval__FrequencyAssignment_1_2");
			builder.put(grammarAccess.getSessionIntervalAccess().getTimeUnitAssignment_1_3(), "rule__SessionInterval__TimeUnitAssignment_1_3");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_0_2(), "rule__MessageContent__ContentAssignment_0_2");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_1_2(), "rule__MessageContent__ContentAssignment_1_2");
			builder.put(grammarAccess.getMessageContentAccess().getTimeUnitAssignment_1_4(), "rule__MessageContent__TimeUnitAssignment_1_4");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_2_2(), "rule__MessageContent__ContentAssignment_2_2");
			builder.put(grammarAccess.getMessageContentAccess().getBinaryOperatorAssignment_2_3(), "rule__MessageContent__BinaryOperatorAssignment_2_3");
			builder.put(grammarAccess.getMessageContentAccess().getStringValueAssignment_2_4_0(), "rule__MessageContent__StringValueAssignment_2_4_0");
			builder.put(grammarAccess.getMessageContentAccess().getVariableValueAssignment_2_4_1(), "rule__MessageContent__VariableValueAssignment_2_4_1");
			builder.put(grammarAccess.getMessageContentAccess().getNumericValueAssignment_2_4_2(), "rule__MessageContent__NumericValueAssignment_2_4_2");
			builder.put(grammarAccess.getMessageContentAccess().getContentAssignment_3_2(), "rule__MessageContent__ContentAssignment_3_2");
			builder.put(grammarAccess.getMessageContentAccess().getBinaryOperatorAssignment_3_3(), "rule__MessageContent__BinaryOperatorAssignment_3_3");
			builder.put(grammarAccess.getMessageContentAccess().getStringValueAssignment_3_4_0(), "rule__MessageContent__StringValueAssignment_3_4_0");
			builder.put(grammarAccess.getMessageContentAccess().getVariableValueAssignment_3_4_1(), "rule__MessageContent__VariableValueAssignment_3_4_1");
			builder.put(grammarAccess.getMessageContentAccess().getNumericValueAssignment_3_4_2(), "rule__MessageContent__NumericValueAssignment_3_4_2");
			builder.put(grammarAccess.getMessageContentAccess().getTimeUnitAssignment_3_6(), "rule__MessageContent__TimeUnitAssignment_3_6");
			builder.put(grammarAccess.getBinaryOperatorAccess().getSymbolAssignment_0(), "rule__BinaryOperator__SymbolAssignment_0");
			builder.put(grammarAccess.getBinaryOperatorAccess().getSymbolAssignment_1(), "rule__BinaryOperator__SymbolAssignment_1");
			builder.put(grammarAccess.getBinaryOperatorAccess().getSymbolAssignment_2(), "rule__BinaryOperator__SymbolAssignment_2");
			builder.put(grammarAccess.getBinaryOperatorAccess().getSymbolAssignment_3(), "rule__BinaryOperator__SymbolAssignment_3");
			builder.put(grammarAccess.getBinaryOperatorAccess().getSymbolAssignment_4(), "rule__BinaryOperator__SymbolAssignment_4");
			builder.put(grammarAccess.getBinaryOperatorAccess().getSymbolAssignment_5(), "rule__BinaryOperator__SymbolAssignment_5");
			builder.put(grammarAccess.getApplicationAccess().getNameAssignment(), "rule__Application__NameAssignment");
			builder.put(grammarAccess.getProcessAccess().getNameAssignment(), "rule__Process__NameAssignment");
			builder.put(grammarAccess.getOnSuccessAccess().getActionAssignment_1(), "rule__OnSuccess__ActionAssignment_1");
			builder.put(grammarAccess.getOnSuccessAccess().getMessageAssignment_3(), "rule__OnSuccess__MessageAssignment_3");
			builder.put(grammarAccess.getOnBreachAccess().getActionAssignment_1(), "rule__OnBreach__ActionAssignment_1");
			builder.put(grammarAccess.getOnBreachAccess().getMessageAssignment_3(), "rule__OnBreach__MessageAssignment_3");
			builder.put(grammarAccess.getBusinessActionAccess().getNameAssignment_1(), "rule__BusinessAction__NameAssignment_1");
			builder.put(grammarAccess.getEventLogAccess().getNameAssignment_1(), "rule__EventLog__NameAssignment_1");
			builder.put(grammarAccess.getExpressionAccess().getSymbolAssignment_1_1_0(), "rule__Expression__SymbolAssignment_1_1_0");
			builder.put(grammarAccess.getExpressionAccess().getSymbolAssignment_1_1_1(), "rule__Expression__SymbolAssignment_1_1_1");
			builder.put(grammarAccess.getExpressionAccess().getRightAssignment_1_2(), "rule__Expression__RightAssignment_1_2");
			builder.put(grammarAccess.getNegationAccess().getSymbolAssignment_1_1(), "rule__Negation__SymbolAssignment_1_1");
			builder.put(grammarAccess.getNegationAccess().getExpressionAssignment_1_2(), "rule__Negation__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_0(), "rule__Comparison__SymbolAssignment_1_1_0");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_1(), "rule__Comparison__SymbolAssignment_1_1_1");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_2(), "rule__Comparison__SymbolAssignment_1_1_2");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_3(), "rule__Comparison__SymbolAssignment_1_1_3");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_4(), "rule__Comparison__SymbolAssignment_1_1_4");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_5(), "rule__Comparison__SymbolAssignment_1_1_5");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_6(), "rule__Comparison__SymbolAssignment_1_1_6");
			builder.put(grammarAccess.getComparisonAccess().getSymbolAssignment_1_1_7(), "rule__Comparison__SymbolAssignment_1_1_7");
			builder.put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
			builder.put(grammarAccess.getPlusAccess().getRightAssignment_1_2(), "rule__Plus__RightAssignment_1_2");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_2(), "rule__Factor__RightAssignment_1_2");
			builder.put(grammarAccess.getNegativeAccess().getExpressionAssignment_1_2(), "rule__Negative__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getNumericValueAccess().getValueAssignment(), "rule__NumericValue__ValueAssignment");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
			builder.put(grammarAccess.getVariableValueAccess().getValueAssignment(), "rule__VariableValue__ValueAssignment");
			builder.put(grammarAccess.getFunctionCallAccess().getNameAssignment_0(), "rule__FunctionCall__NameAssignment_0");
			builder.put(grammarAccess.getFunctionCallAccess().getParamsAssignment_2(), "rule__FunctionCall__ParamsAssignment_2");
			builder.put(grammarAccess.getFunctionCallAccess().getParamsAssignment_3_1(), "rule__FunctionCall__ParamsAssignment_3_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private SmartCEGrammarAccess grammarAccess;

	@Override
	protected InternalSmartCEParser createParser() {
		InternalSmartCEParser result = new InternalSmartCEParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public SmartCEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(SmartCEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
