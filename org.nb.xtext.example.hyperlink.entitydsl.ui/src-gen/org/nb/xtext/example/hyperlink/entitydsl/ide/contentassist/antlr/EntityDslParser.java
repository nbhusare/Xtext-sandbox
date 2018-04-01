/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.nb.xtext.example.hyperlink.entitydsl.ide.contentassist.antlr.internal.InternalEntityDslParser;
import org.nb.xtext.example.hyperlink.entitydsl.services.EntityDslGrammarAccess;

public class EntityDslParser extends AbstractContentAssistParser {

	@Inject
	private EntityDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEntityDslParser createParser() {
		InternalEntityDslParser result = new InternalEntityDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEntityFileAccess().getGroup(), "rule__EntityFile__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifedNameAccess().getGroup(), "rule__QualifedName__Group__0");
					put(grammarAccess.getQualifedNameAccess().getGroup_1(), "rule__QualifedName__Group_1__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_2(), "rule__Entity__Group_2__0");
					put(grammarAccess.getEntityFileAccess().getNameAssignment_1(), "rule__EntityFile__NameAssignment_1");
					put(grammarAccess.getEntityFileAccess().getImportsAssignment_2(), "rule__EntityFile__ImportsAssignment_2");
					put(grammarAccess.getEntityFileAccess().getEntityAssignment_3(), "rule__EntityFile__EntityAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_1(), "rule__Entity__NameAssignment_1");
					put(grammarAccess.getEntityAccess().getParentAssignment_2_1(), "rule__Entity__ParentAssignment_2_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EntityDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
