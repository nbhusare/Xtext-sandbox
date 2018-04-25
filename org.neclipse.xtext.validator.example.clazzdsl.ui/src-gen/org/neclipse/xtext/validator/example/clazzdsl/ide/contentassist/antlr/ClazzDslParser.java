/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.neclipse.xtext.validator.example.clazzdsl.ide.contentassist.antlr.internal.InternalClazzDslParser;
import org.neclipse.xtext.validator.example.clazzdsl.services.ClazzDslGrammarAccess;

public class ClazzDslParser extends AbstractContentAssistParser {

	@Inject
	private ClazzDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalClazzDslParser createParser() {
		InternalClazzDslParser result = new InternalClazzDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQNameAccess().getGroup(), "rule__QName__Group__0");
					put(grammarAccess.getQNameAccess().getGroup_1(), "rule__QName__Group_1__0");
					put(grammarAccess.getQNameWithWildcardAccess().getGroup(), "rule__QNameWithWildcard__Group__0");
					put(grammarAccess.getClazzAccess().getGroup(), "rule__Clazz__Group__0");
					put(grammarAccess.getNamespaceAccess().getNameAssignment_1(), "rule__Namespace__NameAssignment_1");
					put(grammarAccess.getNamespaceAccess().getImportsAssignment_2(), "rule__Namespace__ImportsAssignment_2");
					put(grammarAccess.getNamespaceAccess().getClazzAssignment_3(), "rule__Namespace__ClazzAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getClazzAccess().getDeprecatedAssignment_0(), "rule__Clazz__DeprecatedAssignment_0");
					put(grammarAccess.getClazzAccess().getNameAssignment_2(), "rule__Clazz__NameAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ClazzDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ClazzDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
