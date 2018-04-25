/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.funcdsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.neclipse.xtext.validator.example.funcdsl.ide.contentassist.antlr.internal.InternalFuncDslParser;
import org.neclipse.xtext.validator.example.funcdsl.services.FuncDslGrammarAccess;

public class FuncDslParser extends AbstractContentAssistParser {

	@Inject
	private FuncDslGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalFuncDslParser createParser() {
		InternalFuncDslParser result = new InternalFuncDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDataTypeAccess().getAlternatives(), "rule__DataType__Alternatives");
					put(grammarAccess.getBasicTypeAccess().getAlternatives(), "rule__BasicType__Alternatives");
					put(grammarAccess.getNamespaceAccess().getGroup(), "rule__Namespace__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQNameAccess().getGroup(), "rule__QName__Group__0");
					put(grammarAccess.getQNameAccess().getGroup_1(), "rule__QName__Group_1__0");
					put(grammarAccess.getQNameWithWildcardAccess().getGroup(), "rule__QNameWithWildcard__Group__0");
					put(grammarAccess.getFuncAccess().getGroup(), "rule__Func__Group__0");
					put(grammarAccess.getFuncAccess().getGroup_4(), "rule__Func__Group_4__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup_0(), "rule__DataType__Group_0__0");
					put(grammarAccess.getNamespaceAccess().getNameAssignment_1(), "rule__Namespace__NameAssignment_1");
					put(grammarAccess.getNamespaceAccess().getImportsAssignment_2(), "rule__Namespace__ImportsAssignment_2");
					put(grammarAccess.getNamespaceAccess().getFuncAssignment_3(), "rule__Namespace__FuncAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getFuncAccess().getNameAssignment_1(), "rule__Func__NameAssignment_1");
					put(grammarAccess.getFuncAccess().getParamsAssignment_3(), "rule__Func__ParamsAssignment_3");
					put(grammarAccess.getFuncAccess().getParamsAssignment_4_1(), "rule__Func__ParamsAssignment_4_1");
					put(grammarAccess.getParamAccess().getDataTypeAssignment_0(), "rule__Param__DataTypeAssignment_0");
					put(grammarAccess.getParamAccess().getNameAssignment_1(), "rule__Param__NameAssignment_1");
					put(grammarAccess.getClassTypeAccess().getTypeAssignment(), "rule__ClassType__TypeAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public FuncDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(FuncDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
