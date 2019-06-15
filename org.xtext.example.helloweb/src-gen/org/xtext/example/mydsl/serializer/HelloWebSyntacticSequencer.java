/*
 * generated by Xtext 2.17.0
 */
package org.xtext.example.mydsl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.example.mydsl.services.HelloWebGrammarAccess;

@SuppressWarnings("all")
public class HelloWebSyntacticSequencer extends AbstractSyntacticSequencer {

	protected HelloWebGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Main_SemicolonKeyword_0_1_q;
	protected AbstractElementAlias match_Main_SemicolonKeyword_1_0_1_q;
	protected AbstractElementAlias match_Main_SemicolonKeyword_1_1_1_q;
	protected AbstractElementAlias match_Main_SemicolonKeyword_1_2_1_q;
	protected AbstractElementAlias match_UserFunction_SemicolonKeyword_3_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (HelloWebGrammarAccess) access;
		match_Main_SemicolonKeyword_0_1_q = new TokenAlias(false, true, grammarAccess.getMainAccess().getSemicolonKeyword_0_1());
		match_Main_SemicolonKeyword_1_0_1_q = new TokenAlias(false, true, grammarAccess.getMainAccess().getSemicolonKeyword_1_0_1());
		match_Main_SemicolonKeyword_1_1_1_q = new TokenAlias(false, true, grammarAccess.getMainAccess().getSemicolonKeyword_1_1_1());
		match_Main_SemicolonKeyword_1_2_1_q = new TokenAlias(false, true, grammarAccess.getMainAccess().getSemicolonKeyword_1_2_1());
		match_UserFunction_SemicolonKeyword_3_1_q = new TokenAlias(false, true, grammarAccess.getUserFunctionAccess().getSemicolonKeyword_3_1());
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
			if (match_Main_SemicolonKeyword_0_1_q.equals(syntax))
				emit_Main_SemicolonKeyword_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Main_SemicolonKeyword_1_0_1_q.equals(syntax))
				emit_Main_SemicolonKeyword_1_0_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Main_SemicolonKeyword_1_1_1_q.equals(syntax))
				emit_Main_SemicolonKeyword_1_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Main_SemicolonKeyword_1_2_1_q.equals(syntax))
				emit_Main_SemicolonKeyword_1_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_UserFunction_SemicolonKeyword_3_1_q.equals(syntax))
				emit_UserFunction_SemicolonKeyword_3_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     commands+=Snapshot (ambiguity) (rule end)
	 *     commands+=Snapshot (ambiguity) takeoff+=Takeoff
	 */
	protected void emit_Main_SemicolonKeyword_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     takeoff+=Takeoff (ambiguity) commands+=SuperCommand
	 *     takeoff+=Takeoff (ambiguity) land+=Land
	 */
	protected void emit_Main_SemicolonKeyword_1_0_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     commands+=SuperCommand (ambiguity) commands+=SuperCommand
	 *     commands+=SuperCommand (ambiguity) land+=Land
	 */
	protected void emit_Main_SemicolonKeyword_1_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     land+=Land (ambiguity) (rule end)
	 */
	protected void emit_Main_SemicolonKeyword_1_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     func+=Command (ambiguity) '}' (rule end)
	 *     func+=Command (ambiguity) func+=Command
	 */
	protected void emit_UserFunction_SemicolonKeyword_3_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
