/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.nb.xtext.example.hyperlink.entitydsl.parser.antlr.internal.InternalEntityDslParser;
import org.nb.xtext.example.hyperlink.entitydsl.services.EntityDslGrammarAccess;

public class EntityDslParser extends AbstractAntlrParser {

	@Inject
	private EntityDslGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEntityDslParser createParser(XtextTokenStream stream) {
		return new InternalEntityDslParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "EntityFile";
	}

	public EntityDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
