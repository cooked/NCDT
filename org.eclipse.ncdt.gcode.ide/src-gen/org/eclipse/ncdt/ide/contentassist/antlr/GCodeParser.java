/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.ncdt.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.ncdt.ide.contentassist.antlr.internal.InternalGCodeParser;
import org.eclipse.ncdt.services.GCodeGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

public class GCodeParser extends AbstractContentAssistParser {

	@Inject
	private GCodeGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalGCodeParser createParser() {
		InternalGCodeParser result = new InternalGCodeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getBlockAccess().getAlternatives(), "rule__Block__Alternatives");
					put(grammarAccess.getArgumentAccess().getAlternatives(), "rule__Argument__Alternatives");
					put(grammarAccess.getGBlockAccess().getGroup(), "rule__GBlock__Group__0");
					put(grammarAccess.getMBlockAccess().getGroup(), "rule__MBlock__Group__0");
					put(grammarAccess.getModelAccess().getBlocksAssignment(), "rule__Model__BlocksAssignment");
					put(grammarAccess.getGBlockAccess().getNameAssignment_0(), "rule__GBlock__NameAssignment_0");
					put(grammarAccess.getGBlockAccess().getArgumentsAssignment_1(), "rule__GBlock__ArgumentsAssignment_1");
					put(grammarAccess.getMBlockAccess().getNameAssignment_0(), "rule__MBlock__NameAssignment_0");
					put(grammarAccess.getMBlockAccess().getArgumentsAssignment_1(), "rule__MBlock__ArgumentsAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalGCodeParser typedParser = (InternalGCodeParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_SL_COMMENT" };
	}

	public GCodeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(GCodeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
