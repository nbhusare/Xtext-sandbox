/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
grammar InternalFuncDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.neclipse.xtext.validator.example.funcdsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.neclipse.xtext.validator.example.funcdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.neclipse.xtext.validator.example.funcdsl.services.FuncDslGrammarAccess;

}

@parser::members {

 	private FuncDslGrammarAccess grammarAccess;

    public InternalFuncDslParser(TokenStream input, FuncDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Namespace";
   	}

   	@Override
   	protected FuncDslGrammarAccess getGrammarAccess() {
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
						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.QName");
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
						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Import");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getNamespaceAccess().getFuncFuncParserRuleCall_3_0());
				}
				lv_func_3_0=ruleFunc
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNamespaceRule());
					}
					set(
						$current,
						"func",
						lv_func_3_0,
						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Func");
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
						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.QNameWithWildcard");
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

// Entry rule entryRuleFunc
entryRuleFunc returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFuncRule()); }
	iv_ruleFunc=ruleFunc
	{ $current=$iv_ruleFunc.current; }
	EOF;

// Rule Func
ruleFunc returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='func'
		{
			newLeafNode(otherlv_0, grammarAccess.getFuncAccess().getFuncKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getFuncAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getFuncRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getFuncAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_3_0());
				}
				lv_params_3_0=ruleParam
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFuncRule());
					}
					add(
						$current,
						"params",
						lv_params_3_0,
						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Param");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getFuncAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_4_1_0());
					}
					lv_params_5_0=ruleParam
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFuncRule());
						}
						add(
							$current,
							"params",
							lv_params_5_0,
							"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Param");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getFuncAccess().getRightParenthesisKeyword_5());
		}
		otherlv_7='{'
		{
			newLeafNode(otherlv_7, grammarAccess.getFuncAccess().getLeftCurlyBracketKeyword_6());
		}
		otherlv_8='}'
		{
			newLeafNode(otherlv_8, grammarAccess.getFuncAccess().getRightCurlyBracketKeyword_7());
		}
	)
;

// Entry rule entryRuleParam
entryRuleParam returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParamRule()); }
	iv_ruleParam=ruleParam
	{ $current=$iv_ruleParam.current; }
	EOF;

// Rule Param
ruleParam returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0());
				}
				lv_dataType_0_0=ruleDataType
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParamRule());
					}
					set(
						$current,
						"dataType",
						lv_dataType_0_0,
						"org.neclipse.xtext.validator.example.funcdsl.FuncDsl.DataType");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getParamRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					$current = forceCreateModelElement(
						grammarAccess.getDataTypeAccess().getDataTypeAction_0_0(),
						$current);
				}
			)
			{
				newCompositeNode(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1());
			}
			ruleBasicType
			{
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1());
		}
		this_ClassType_2=ruleClassType
		{
			$current = $this_ClassType_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBasicType
entryRuleBasicType returns [String current=null]:
	{ newCompositeNode(grammarAccess.getBasicTypeRule()); }
	iv_ruleBasicType=ruleBasicType
	{ $current=$iv_ruleBasicType.current.getText(); }
	EOF;

// Rule BasicType
ruleBasicType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='String'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getStringKeyword_0());
		}
		    |
		kw='boolean'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getBooleanKeyword_1());
		}
		    |
		kw='int'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getIntKeyword_2());
		}
		    |
		kw='long'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getLongKeyword_3());
		}
		    |
		kw='double'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getBasicTypeAccess().getDoubleKeyword_4());
		}
	)
;

// Entry rule entryRuleClassType
entryRuleClassType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClassTypeRule()); }
	iv_ruleClassType=ruleClassType
	{ $current=$iv_ruleClassType.current; }
	EOF;

// Rule ClassType
ruleClassType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				if ($current==null) {
					$current = createModelElement(grammarAccess.getClassTypeRule());
				}
			}
			otherlv_0=RULE_ID
			{
				newLeafNode(otherlv_0, grammarAccess.getClassTypeAccess().getTypeClazzCrossReference_0());
			}
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
