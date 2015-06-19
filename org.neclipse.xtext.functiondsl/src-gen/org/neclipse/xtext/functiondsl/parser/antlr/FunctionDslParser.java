/*
* generated by Xtext
*/
package org.neclipse.xtext.functiondsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.neclipse.xtext.functiondsl.services.FunctionDslGrammarAccess;

public class FunctionDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private FunctionDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.neclipse.xtext.functiondsl.parser.antlr.internal.InternalFunctionDslParser createParser(XtextTokenStream stream) {
		return new org.neclipse.xtext.functiondsl.parser.antlr.internal.InternalFunctionDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "NamespaceDefinition";
	}
	
	public FunctionDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FunctionDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}