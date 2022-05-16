/*
 * generated by Xtext 2.25.0
 */
package br.edu.unijui.gca.smartce.serializer;

import br.edu.unijui.gca.smartce.services.SmartCEGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class SmartCESyntacticSequencer extends AbstractSyntacticSequencer {

	protected SmartCEGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BusinessTime_EndKeyword_0_1_or_StartKeyword_0_0;
	protected AbstractElementAlias match_Clause_ObligationKeyword_0_2_or_ProhibitionKeyword_0_1_or_RightKeyword_0_0;
	protected AbstractElementAlias match_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1;
	protected AbstractElementAlias match_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_Primary_LeftParenthesisKeyword_1_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (SmartCEGrammarAccess) access;
		match_BusinessTime_EndKeyword_0_1_or_StartKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getBusinessTimeAccess().getEndKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getBusinessTimeAccess().getStartKeyword_0_0()));
		match_Clause_ObligationKeyword_0_2_or_ProhibitionKeyword_0_1_or_RightKeyword_0_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getClauseAccess().getObligationKeyword_0_2()), new TokenAlias(false, false, grammarAccess.getClauseAccess().getProhibitionKeyword_0_1()), new TokenAlias(false, false, grammarAccess.getClauseAccess().getRightKeyword_0_0()));
		match_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getFactorAccess().getAsteriskKeyword_1_1_0()), new TokenAlias(false, false, grammarAccess.getFactorAccess().getSolidusKeyword_1_1_1()));
		match_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPlusAccess().getHyphenMinusKeyword_1_1_1()), new TokenAlias(false, false, grammarAccess.getPlusAccess().getPlusSignKeyword_1_1_0()));
		match_Primary_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
		match_Primary_LeftParenthesisKeyword_1_0_p = new TokenAlias(true, false, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_BusinessTime_EndKeyword_0_1_or_StartKeyword_0_0.equals(syntax))
				emit_BusinessTime_EndKeyword_0_1_or_StartKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Clause_ObligationKeyword_0_2_or_ProhibitionKeyword_0_1_or_RightKeyword_0_0.equals(syntax))
				emit_Clause_ObligationKeyword_0_2_or_ProhibitionKeyword_0_1_or_RightKeyword_0_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1.equals(syntax))
				emit_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0.equals(syntax))
				emit_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Primary_LeftParenthesisKeyword_1_0_p.equals(syntax))
				emit_Primary_LeftParenthesisKeyword_1_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'start' | 'end'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' expression=Expression
	 */
	protected void emit_BusinessTime_EndKeyword_0_1_or_StartKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'Right' | 'Prohibition' | 'Obligation'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) name=ID
	 */
	protected void emit_Clause_ObligationKeyword_0_2_or_ProhibitionKeyword_0_1_or_RightKeyword_0_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '*' | '/'
	 *
	 * This ambiguous syntax occurs at:
	 *     {BinaryOperator.left=} (ambiguity) right=Negative
	 */
	protected void emit_Factor_AsteriskKeyword_1_1_0_or_SolidusKeyword_1_1_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '+' | '-'
	 *
	 * This ambiguous syntax occurs at:
	 *     {BinaryOperator.left=} (ambiguity) right=Factor
	 */
	protected void emit_Plus_HyphenMinusKeyword_1_1_1_or_PlusSignKeyword_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' expression=Primary
	 *     (rule start) (ambiguity) name=QualifiedName
	 *     (rule start) (ambiguity) symbol='!'
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) value=QualifiedName
	 *     (rule start) (ambiguity) value=STRING
	 *     (rule start) (ambiguity) {BinaryOperator.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '-' expression=Primary
	 *     (rule start) (ambiguity) symbol='!'
	 *     (rule start) (ambiguity) {BinaryOperator.left=}
	 */
	protected void emit_Primary_LeftParenthesisKeyword_1_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
