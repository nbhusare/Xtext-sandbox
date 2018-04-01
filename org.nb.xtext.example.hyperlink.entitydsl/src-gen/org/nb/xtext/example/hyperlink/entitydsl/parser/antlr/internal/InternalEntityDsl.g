/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
grammar InternalEntityDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.nb.xtext.example.hyperlink.entitydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.nb.xtext.example.hyperlink.entitydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.nb.xtext.example.hyperlink.entitydsl.services.EntityDslGrammarAccess;

}

@parser::members {

 	private EntityDslGrammarAccess grammarAccess;

    public InternalEntityDslParser(TokenStream input, EntityDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "EntityFile";
   	}

   	@Override
   	protected EntityDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleEntityFile
entryRuleEntityFile returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityFileRule()); }
	iv_ruleEntityFile=ruleEntityFile
	{ $current=$iv_ruleEntityFile.current; }
	EOF;

// Rule EntityFile
ruleEntityFile returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='namespace'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityFileAccess().getNamespaceKeyword_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityFileAccess().getNameQualifedNameParserRuleCall_1_0());
				}
				lv_name_1_0=ruleQualifedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityFileRule());
					}
					set(
						$current,
						"name",
						lv_name_1_0,
						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.QualifedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityFileAccess().getImportsImportParserRuleCall_2_0());
				}
				lv_imports_2_0=ruleImport
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityFileRule());
					}
					add(
						$current,
						"imports",
						lv_imports_2_0,
						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getEntityFileAccess().getEntityEntityParserRuleCall_3_0());
				}
				lv_entity_3_0=ruleEntity
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEntityFileRule());
					}
					set(
						$current,
						"entity",
						lv_entity_3_0,
						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.Entity");
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
					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameParserRuleCall_1_0());
				}
				lv_importedNamespace_1_0=ruleQualifedName
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getImportRule());
					}
					set(
						$current,
						"importedNamespace",
						lv_importedNamespace_1_0,
						"org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.QualifedName");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleQualifedName
entryRuleQualifedName returns [String current=null]:
	{ newCompositeNode(grammarAccess.getQualifedNameRule()); }
	iv_ruleQualifedName=ruleQualifedName
	{ $current=$iv_ruleQualifedName.current.getText(); }
	EOF;

// Rule QualifedName
ruleQualifedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
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
			newLeafNode(this_ID_0, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0());
		}
		(
			kw='.'
			{
				$current.merge(kw);
				newLeafNode(kw, grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0());
			}
			this_ID_2=RULE_ID
			{
				$current.merge(this_ID_2);
			}
			{
				newLeafNode(this_ID_2, grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1());
			}
		)*
	)
;

// Entry rule entryRuleEntity
entryRuleEntity returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEntityRule()); }
	iv_ruleEntity=ruleEntity
	{ $current=$iv_ruleEntity.current; }
	EOF;

// Rule Entity
ruleEntity returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='model'
		{
			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getModelKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEntityRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getEntityRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0());
					}
				)
			)
		)?
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
