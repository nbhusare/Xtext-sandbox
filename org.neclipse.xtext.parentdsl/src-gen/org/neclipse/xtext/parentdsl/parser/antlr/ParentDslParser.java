/*
* generated by Xtext
*/
package org.neclipse.xtext.parentdsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.neclipse.xtext.parentdsl.services.ParentDslGrammarAccess;

public class ParentDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private ParentDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.neclipse.xtext.parentdsl.parser.antlr.internal.InternalParentDslParser createParser(XtextTokenStream stream) {
		return new org.neclipse.xtext.parentdsl.parser.antlr.internal.InternalParentDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "NamespaceDefinition";
	}
	
	public ParentDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ParentDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}