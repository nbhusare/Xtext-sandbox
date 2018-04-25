/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.funcdsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.neclipse.xtext.validator.example.funcdsl.parser.antlr.internal.InternalFuncDslParser;
import org.neclipse.xtext.validator.example.funcdsl.services.FuncDslGrammarAccess;

public class FuncDslParser extends AbstractAntlrParser {

	@Inject
	private FuncDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalFuncDslParser createParser(XtextTokenStream stream) {
		return new InternalFuncDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Namespace";
	}

	public FuncDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FuncDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
