/*
* generated by Xtext
*/
package org.neclipse.xtend.training.smallJava.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.neclipse.xtend.training.smallJava.services.SmallJavaDslGrammarAccess;

public class SmallJavaDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.neclipse.xtend.training.smallJava.parser.antlr.internal.InternalSmallJavaDslParser createParser(XtextTokenStream stream) {
		return new org.neclipse.xtend.training.smallJava.parser.antlr.internal.InternalSmallJavaDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Namespace";
	}
	
	public SmallJavaDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SmallJavaDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
