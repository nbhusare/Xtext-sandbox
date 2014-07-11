/*
* generated by Xtext
*/
grammar InternalFunctionDsl;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package org.neclipse.xtext.functiondsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.neclipse.xtext.functiondsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.functiondsl.services.FunctionDslGrammarAccess;

}

@parser::members {

 	private FunctionDslGrammarAccess grammarAccess;
 	
    public InternalFunctionDslParser(TokenStream input, FunctionDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "NamespaceDefinition";	
   	}
   	
   	@Override
   	protected FunctionDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleNamespaceDefinition
entryRuleNamespaceDefinition returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamespaceDefinitionRule()); }
	 iv_ruleNamespaceDefinition=ruleNamespaceDefinition 
	 { $current=$iv_ruleNamespaceDefinition.current; } 
	 EOF 
;

// Rule NamespaceDefinition
ruleNamespaceDefinition returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0()); 
	    }
		lv_namespaceDeclaration_0_0=ruleNamespaceDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
	        }
       		set(
       			$current, 
       			"namespaceDeclaration",
        		lv_namespaceDeclaration_0_0, 
        		"NamespaceDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationImportDeclarationParserRuleCall_1_0()); 
	    }
		lv_importDeclaration_1_0=ruleImportDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
	        }
       		set(
       			$current, 
       			"importDeclaration",
        		lv_importDeclaration_1_0, 
        		"ImportDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)(
(
		{ 
	        newCompositeNode(grammarAccess.getNamespaceDefinitionAccess().getArtifactFunctionParserRuleCall_2_0()); 
	    }
		lv_artifact_2_0=ruleFunction		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNamespaceDefinitionRule());
	        }
       		set(
       			$current, 
       			"artifact",
        		lv_artifact_2_0, 
        		"Function");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleFunction
entryRuleFunction returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getFunctionRule()); }
	 iv_ruleFunction=ruleFunction 
	 { $current=$iv_ruleFunction.current; } 
	 EOF 
;

// Rule Function
ruleFunction returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getFunctionAccess().getFunctionAction_0(),
            $current);
    }
)	otherlv_1='function' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getFunctionAccess().getFunctionKeyword_1());
    }
(
(
		lv_name_2_0=RULE_ID
		{
			newLeafNode(lv_name_2_0, grammarAccess.getFunctionAccess().getNameIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getFunctionRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_2_0, 
        		"ID");
	    }

)
)	otherlv_3='(' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getFunctionAccess().getLeftParenthesisKeyword_3());
    }
((
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_0_0()); 
	    }
		lv_parameters_4_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_4_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
)(	otherlv_5=',' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getFunctionAccess().getCommaKeyword_4_1_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getParametersParameterParserRuleCall_4_1_1_0()); 
	    }
		lv_parameters_6_0=ruleParameter		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		add(
       			$current, 
       			"parameters",
        		lv_parameters_6_0, 
        		"Parameter");
	        afterParserOrEnumRuleCall();
	    }

)
))*)?	otherlv_7=')' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getFunctionAccess().getRightParenthesisKeyword_5());
    }
	otherlv_8='{' 
    {
    	newLeafNode(otherlv_8, grammarAccess.getFunctionAccess().getLeftCurlyBracketKeyword_6());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getFunctionAccess().getVariableDeclarationVariableDeclarationParserRuleCall_7_0()); 
	    }
		lv_variableDeclaration_9_0=ruleVariableDeclaration		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getFunctionRule());
	        }
       		set(
       			$current, 
       			"variableDeclaration",
        		lv_variableDeclaration_9_0, 
        		"VariableDeclaration");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_10='}' 
    {
    	newLeafNode(otherlv_10, grammarAccess.getFunctionAccess().getRightCurlyBracketKeyword_8());
    }
)
;





// Entry rule entryRuleVariableDeclaration
entryRuleVariableDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getVariableDeclarationRule()); }
	 iv_ruleVariableDeclaration=ruleVariableDeclaration 
	 { $current=$iv_ruleVariableDeclaration.current; } 
	 EOF 
;

// Rule VariableDeclaration
ruleVariableDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='var' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getVariableDeclarationAccess().getVarKeyword_0());
    }
(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getVariableDeclarationRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)	otherlv_2='=' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getVariableDeclarationAccess().getEqualsSignKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getVariableDeclarationAccess().getEntityAttributeEntityAttributeParserRuleCall_3_0()); 
	    }
		lv_entityAttribute_3_0=ruleEntityAttribute		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getVariableDeclarationRule());
	        }
       		set(
       			$current, 
       			"entityAttribute",
        		lv_entityAttribute_3_0, 
        		"EntityAttribute");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleEntityAttribute
entryRuleEntityAttribute returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getEntityAttributeRule()); }
	 iv_ruleEntityAttribute=ruleEntityAttribute 
	 { $current=$iv_ruleEntityAttribute.current; } 
	 EOF 
;

// Rule EntityAttribute
ruleEntityAttribute returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getEntityAttributeAccess().getEntityAttributeAction_0(),
            $current);
    }
)(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityAttributeRule());
	        }
        }
	otherlv_1=RULE_ID
	{
		newLeafNode(otherlv_1, grammarAccess.getEntityAttributeAccess().getEntityReferenceParameterCrossReference_1_0()); 
	}

)
)((
    {
        $current = forceCreateModelElementAndSet(
            grammarAccess.getEntityAttributeAccess().getEntityAttributeRefAction_2_0(),
            $current);
    }
)	otherlv_3='.' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getEntityAttributeAccess().getFullStopKeyword_2_1());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getEntityAttributeRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getEntityAttributeAccess().getAttributeAttributeCrossReference_2_2_0()); 
	}

)
))*)
;





// Entry rule entryRuleParameter
entryRuleParameter returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getParameterRule()); }
	 iv_ruleParameter=ruleParameter 
	 { $current=$iv_ruleParameter.current; } 
	 EOF 
;

// Rule Parameter
ruleParameter returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getParameterAccess().getParameterAction_0(),
            $current);
    }
)(
(
		lv_name_1_0=RULE_ID
		{
			newLeafNode(lv_name_1_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"ID");
	    }

)
)(
(
		lv_array_2_0=	'[]' 
    {
        newLeafNode(lv_array_2_0, grammarAccess.getParameterAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_2_0());
    }
 
	    {
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
       		setWithLastConsumed($current, "array", true, "[]");
	    }

)
)?	otherlv_3=':' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getParameterAccess().getColonKeyword_3());
    }
(
(
		{
			if ($current==null) {
	            $current = createModelElement(grammarAccess.getParameterRule());
	        }
        }
	otherlv_4=RULE_ID
	{
		newLeafNode(otherlv_4, grammarAccess.getParameterAccess().getDataTypeEntityCrossReference_4_0()); 
	}

)
))
;





// Entry rule entryRuleNamespaceDeclaration
entryRuleNamespaceDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getNamespaceDeclarationRule()); }
	 iv_ruleNamespaceDeclaration=ruleNamespaceDeclaration 
	 { $current=$iv_ruleNamespaceDeclaration.current; } 
	 EOF 
;

// Rule NamespaceDeclaration
ruleNamespaceDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='namespace' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getNamespaceDeclarationAccess().getNamespaceKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getNamespaceDeclarationAccess().getNameQualifedNameParserRuleCall_1_0()); 
	    }
		lv_name_1_0=ruleQualifedName		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getNamespaceDeclarationRule());
	        }
       		set(
       			$current, 
       			"name",
        		lv_name_1_0, 
        		"QualifedName");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleImportDeclaration
entryRuleImportDeclaration returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportDeclarationRule()); }
	 iv_ruleImportDeclaration=ruleImportDeclaration 
	 { $current=$iv_ruleImportDeclaration.current; } 
	 EOF 
;

// Rule ImportDeclaration
ruleImportDeclaration returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
    {
        $current = forceCreateModelElement(
            grammarAccess.getImportDeclarationAccess().getImportDeclarationAction_0(),
            $current);
    }
)(
(
		{ 
	        newCompositeNode(grammarAccess.getImportDeclarationAccess().getImportsImportParserRuleCall_1_0()); 
	    }
		lv_imports_1_0=ruleImport		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportDeclarationRule());
	        }
       		add(
       			$current, 
       			"imports",
        		lv_imports_1_0, 
        		"Import");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	 iv_ruleImport=ruleImport 
	 { $current=$iv_ruleImport.current; } 
	 EOF 
;

// Rule Import
ruleImport returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='import' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameWithWildcardParserRuleCall_1_0()); 
	    }
		lv_importedNamespace_1_0=ruleQualifedNameWithWildcard		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImportRule());
	        }
       		set(
       			$current, 
       			"importedNamespace",
        		lv_importedNamespace_1_0, 
        		"QualifedNameWithWildcard");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleQualifedName
entryRuleQualifedName returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifedNameRule()); } 
	 iv_ruleQualifedName=ruleQualifedName 
	 { $current=$iv_ruleQualifedName.current.getText(); }  
	 EOF 
;

// Rule QualifedName
ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_ID_0=RULE_ID    {
		$current.merge(this_ID_0);
    }

    { 
    newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); 
    }
(
	kw='.' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); 
    }
    this_ID_2=RULE_ID    {
		$current.merge(this_ID_2);
    }

    { 
    newLeafNode(this_ID_2, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); 
    }
)*)
    ;





// Entry rule entryRuleQualifedNameWithWildcard
entryRuleQualifedNameWithWildcard returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getQualifedNameWithWildcardRule()); } 
	 iv_ruleQualifedNameWithWildcard=ruleQualifedNameWithWildcard 
	 { $current=$iv_ruleQualifedNameWithWildcard.current.getText(); }  
	 EOF 
;

// Rule QualifedNameWithWildcard
ruleQualifedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getQualifedNameWithWildcardAccess().getQualifedNameParserRuleCall_0()); 
    }
    this_QualifedName_0=ruleQualifedName    {
		$current.merge(this_QualifedName_0);
    }

    { 
        afterParserOrEnumRuleCall();
    }
(
	kw='.*' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getQualifedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
    }
)?)
    ;







RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


