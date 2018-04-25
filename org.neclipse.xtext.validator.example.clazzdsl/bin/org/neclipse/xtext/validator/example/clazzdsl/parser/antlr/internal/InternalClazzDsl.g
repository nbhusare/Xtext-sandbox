/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
grammar InternalClazzDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.neclipse.xtext.validator.example.clazzdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.neclipse.xtext.validator.example.clazzdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.validator.example.clazzdsl.services.ClazzDslGrammarAccess;

}

@parser::members {

 	private ClazzDslGrammarAccess grammarAccess;

    public InternalClazzDslParser(TokenStream input, ClazzDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Namespace";
   	}

   	@Override
   	protected ClazzDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleNamespace
entryRuleNamespace returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNamespaceRule()); }
	iv_ruleNamespace=ruleNamespace
	{ $current=$iv_ruleNamespace.current; }
	EOF;

// Rule Namespace
ruleNamespace returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='namespace'
		{
			newLeafNode(otherlv_0, grammarAccess.getNamespaceAccess().getNamespaceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.QName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0());
				}
				lv_imports_2_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					add(
						$current,
						"imports",
						lv_imports_2_0,
						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getClazzClazzParserRuleCall_3_0());
				}
				lv_clazz_3_0=ruleClazz
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"clazz",
						lv_clazz_3_0,
						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.Clazz");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleImport
entryRuleImport returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getImportRule()); }
	iv_ruleImport=ruleImport
	{ $current=$iv_ruleImport.current; }
	EOF;

// Rule Import
ruleImport returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='import'
		{
			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQNameWithWildcard
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.QNameWithWildcard");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQName
entryRuleQName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQNameRule()); }
	iv_ruleQName=ruleQName
	{ $current=$iv_ruleQName.current.getText(); }
	EOF;

// Rule QName
ruleQName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ID_0=RULE_ID
		{
			$current.merge(this_ID_0);
		}
		{
			newLeafNode(this_ID_0, grammarAccess.getQNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleQNameWithWildcard
entryRuleQNameWithWildcard returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQNameWithWildcardRule()); }
	iv_ruleQNameWithWildcard=ruleQNameWithWildcard
	{ $current=$iv_ruleQNameWithWildcard.current.getText(); }
	EOF;

// Rule QNameWithWildcard
ruleQNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0());
		}
		this_QName_0=ruleQName
		{
			$current.merge(this_QName_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		(
			kw='.*'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
			}
		)?
	)
;

// Entry rule entryRuleClazz
entryRuleClazz returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClazzRule()); }
	iv_ruleClazz=ruleClazz
	{ $current=$iv_ruleClazz.current; }
	EOF;

// Rule Clazz
ruleClazz returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_deprecated_0_0='deprecated'
				{
					newLeafNode(lv_deprecated_0_0, grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClazzRule());
					}
					setWithLastConsumed($current, "deprecated", true, "deprecated");
				}
			)
		)?
		otherlv_1='class'
		{
			newLeafNode(otherlv_1, grammarAccess.getClazzAccess().getClassKeyword_1());
		}
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClazzRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3='{'
		{
			newLeafNode(otherlv_3, grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_3());
		}
		otherlv_4='}'
		{
			newLeafNode(otherlv_4, grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_4());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
