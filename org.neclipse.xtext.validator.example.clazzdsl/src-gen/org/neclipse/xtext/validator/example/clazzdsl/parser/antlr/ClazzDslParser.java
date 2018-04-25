/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.neclipse.xtext.validator.example.clazzdsl.parser.antlr.internal.InternalClazzDslParser;
import org.neclipse.xtext.validator.example.clazzdsl.services.ClazzDslGrammarAccess;

public class ClazzDslParser extends AbstractAntlrParser {

	@Inject
	private ClazzDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalClazzDslParser createParser(XtextTokenStream stream) {
		return new InternalClazzDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Namespace";
	}

	public ClazzDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ClazzDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
