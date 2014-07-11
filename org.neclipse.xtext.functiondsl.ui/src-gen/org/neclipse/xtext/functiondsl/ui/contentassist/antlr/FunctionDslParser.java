/*
* generated by Xtext
*/
package org.neclipse.xtext.functiondsl.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.neclipse.xtext.functiondsl.services.FunctionDslGrammarAccess;

public class FunctionDslParser extends AbstractContentAssistParser {
	
	@Inject
	private FunctionDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.neclipse.xtext.functiondsl.ui.contentassist.antlr.internal.InternalFunctionDslParser createParser() {
		org.neclipse.xtext.functiondsl.ui.contentassist.antlr.internal.InternalFunctionDslParser result = new org.neclipse.xtext.functiondsl.ui.contentassist.antlr.internal.InternalFunctionDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNamespaceDefinitionAccess().getGroup(), "rule__NamespaceDefinition__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup(), "rule__Function__Group__0");
					put(grammarAccess.getFunctionAccess().getGroup_4(), "rule__Function__Group_4__0");
					put(grammarAccess.getFunctionAccess().getGroup_4_1(), "rule__Function__Group_4_1__0");
					put(grammarAccess.getVariableDeclarationAccess().getGroup(), "rule__VariableDeclaration__Group__0");
					put(grammarAccess.getEntityAttributeAccess().getGroup(), "rule__EntityAttribute__Group__0");
					put(grammarAccess.getEntityAttributeAccess().getGroup_2(), "rule__EntityAttribute__Group_2__0");
					put(grammarAccess.getParameterAccess().getGroup(), "rule__Parameter__Group__0");
					put(grammarAccess.getNamespaceDeclarationAccess().getGroup(), "rule__NamespaceDeclaration__Group__0");
					put(grammarAccess.getImportDeclarationAccess().getGroup(), "rule__ImportDeclaration__Group__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getQualifedNameAccess().getGroup(), "rule__QualifedName__Group__0");
					put(grammarAccess.getQualifedNameAccess().getGroup_1(), "rule__QualifedName__Group_1__0");
					put(grammarAccess.getQualifedNameWithWildcardAccess().getGroup(), "rule__QualifedNameWithWildcard__Group__0");
					put(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationAssignment_0(), "rule__NamespaceDefinition__NamespaceDeclarationAssignment_0");
					put(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationAssignment_1(), "rule__NamespaceDefinition__ImportDeclarationAssignment_1");
					put(grammarAccess.getNamespaceDefinitionAccess().getArtifactAssignment_2(), "rule__NamespaceDefinition__ArtifactAssignment_2");
					put(grammarAccess.getFunctionAccess().getNameAssignment_2(), "rule__Function__NameAssignment_2");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_4_0(), "rule__Function__ParametersAssignment_4_0");
					put(grammarAccess.getFunctionAccess().getParametersAssignment_4_1_1(), "rule__Function__ParametersAssignment_4_1_1");
					put(grammarAccess.getFunctionAccess().getVariableDeclarationAssignment_7(), "rule__Function__VariableDeclarationAssignment_7");
					put(grammarAccess.getVariableDeclarationAccess().getNameAssignment_1(), "rule__VariableDeclaration__NameAssignment_1");
					put(grammarAccess.getVariableDeclarationAccess().getEntityAttributeAssignment_3(), "rule__VariableDeclaration__EntityAttributeAssignment_3");
					put(grammarAccess.getEntityAttributeAccess().getEntityReferenceAssignment_1(), "rule__EntityAttribute__EntityReferenceAssignment_1");
					put(grammarAccess.getEntityAttributeAccess().getAttributeAssignment_2_2(), "rule__EntityAttribute__AttributeAssignment_2_2");
					put(grammarAccess.getParameterAccess().getNameAssignment_1(), "rule__Parameter__NameAssignment_1");
					put(grammarAccess.getParameterAccess().getArrayAssignment_2(), "rule__Parameter__ArrayAssignment_2");
					put(grammarAccess.getParameterAccess().getDataTypeAssignment_4(), "rule__Parameter__DataTypeAssignment_4");
					put(grammarAccess.getNamespaceDeclarationAccess().getNameAssignment_1(), "rule__NamespaceDeclaration__NameAssignment_1");
					put(grammarAccess.getImportDeclarationAccess().getImportsAssignment_1(), "rule__ImportDeclaration__ImportsAssignment_1");
					put(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1(), "rule__Import__ImportedNamespaceAssignment_1");
					put(grammarAccess.getArtifactAccess().getNameAssignment(), "rule__Artifact__NameAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.neclipse.xtext.functiondsl.ui.contentassist.antlr.internal.InternalFunctionDslParser typedParser = (org.neclipse.xtext.functiondsl.ui.contentassist.antlr.internal.InternalFunctionDslParser) parser;
			typedParser.entryRuleNamespaceDefinition();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public FunctionDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(FunctionDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
