/*
* generated by Xtext
*/
package org.neclipse.xtext.entitydsl.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.neclipse.xtext.entitydsl.services.EntityDslGrammarAccess;

public class EntityDslParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private EntityDslGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.neclipse.xtext.entitydsl.parser.antlr.internal.InternalEntityDslParser createParser(XtextTokenStream stream) {
		return new org.neclipse.xtext.entitydsl.parser.antlr.internal.InternalEntityDslParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "NamespaceDefinition";
	}
	
	public EntityDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}