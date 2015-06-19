/*
* generated by Xtext
*/
package org.neclipse.xtext.training.smallfunc.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.neclipse.xtext.training.smallfunc.services.SmallFuncDslGrammarAccess;

public class SmallFuncDslParser extends AbstractContentAssistParser {
	
	@Inject
	private SmallFuncDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.neclipse.xtext.training.smallfunc.ui.contentassist.antlr.internal.InternalSmallFuncDslParser createParser() {
		org.neclipse.xtext.training.smallfunc.ui.contentassist.antlr.internal.InternalSmallFuncDslParser result = new org.neclipse.xtext.training.smallfunc.ui.contentassist.antlr.internal.InternalSmallFuncDslParser(null);
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
					put(grammarAccess.getSmallFunctionAccess().getGroup(), "rule__SmallFunction__Group__0");
					put(grammarAccess.getSmallFunctionAccess().getGroup_4(), "rule__SmallFunction__Group_4__0");
					put(grammarAccess.getParamAccess().getGroup(), "rule__Param__Group__0");
					put(grammarAccess.getDataTypeAccess().getGroup_0(), "rule__DataType__Group_0__0");
					put(grammarAccess.getNamespaceAccess().getNameAssignment_1(), "rule__Namespace__NameAssignment_1");
					put(grammarAccess.getNamespaceAccess().getImportsAssignment_2(), "rule__Namespace__ImportsAssignment_2");
					put(grammarAccess.getNamespaceAccess().getFunctionAssignment_3(), "rule__Namespace__FunctionAssignment_3");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getSmallFunctionAccess().getNameAssignment_1(), "rule__SmallFunction__NameAssignment_1");
					put(grammarAccess.getSmallFunctionAccess().getParamsAssignment_3(), "rule__SmallFunction__ParamsAssignment_3");
					put(grammarAccess.getSmallFunctionAccess().getParamsAssignment_4_1(), "rule__SmallFunction__ParamsAssignment_4_1");
					put(grammarAccess.getParamAccess().getDataTypeAssignment_0(), "rule__Param__DataTypeAssignment_0");
					put(grammarAccess.getParamAccess().getNameAssignment_1(), "rule__Param__NameAssignment_1");
					put(grammarAccess.getClassTypeAccess().getTypeAssignment(), "rule__ClassType__TypeAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.neclipse.xtext.training.smallfunc.ui.contentassist.antlr.internal.InternalSmallFuncDslParser typedParser = (org.neclipse.xtext.training.smallfunc.ui.contentassist.antlr.internal.InternalSmallFuncDslParser) parser;
			typedParser.entryRuleNamespace();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SmallFuncDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SmallFuncDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}