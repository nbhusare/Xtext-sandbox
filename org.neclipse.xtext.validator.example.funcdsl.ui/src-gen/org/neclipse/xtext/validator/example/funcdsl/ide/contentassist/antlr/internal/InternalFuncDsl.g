/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
grammar InternalFuncDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.neclipse.xtext.validator.example.funcdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.neclipse.xtext.validator.example.funcdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.neclipse.xtext.validator.example.funcdsl.services.FuncDslGrammarAccess;

}
@parser::members {
	private FuncDslGrammarAccess grammarAccess;

	public void setGrammarAccess(FuncDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleNamespace
entryRuleNamespace
:
{ before(grammarAccess.getNamespaceRule()); }
	 ruleNamespace
{ after(grammarAccess.getNamespaceRule()); } 
	 EOF 
;

// Rule Namespace
ruleNamespace 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNamespaceAccess().getGroup()); }
		(rule__Namespace__Group__0)
		{ after(grammarAccess.getNamespaceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleImport
entryRuleImport
:
{ before(grammarAccess.getImportRule()); }
	 ruleImport
{ after(grammarAccess.getImportRule()); } 
	 EOF 
;

// Rule Import
ruleImport 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getImportAccess().getGroup()); }
		(rule__Import__Group__0)
		{ after(grammarAccess.getImportAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQName
entryRuleQName
:
{ before(grammarAccess.getQNameRule()); }
	 ruleQName
{ after(grammarAccess.getQNameRule()); } 
	 EOF 
;

// Rule QName
ruleQName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQNameAccess().getGroup()); }
		(rule__QName__Group__0)
		{ after(grammarAccess.getQNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleQNameWithWildcard
entryRuleQNameWithWildcard
:
{ before(grammarAccess.getQNameWithWildcardRule()); }
	 ruleQNameWithWildcard
{ after(grammarAccess.getQNameWithWildcardRule()); } 
	 EOF 
;

// Rule QNameWithWildcard
ruleQNameWithWildcard 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQNameWithWildcardAccess().getGroup()); }
		(rule__QNameWithWildcard__Group__0)
		{ after(grammarAccess.getQNameWithWildcardAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFunc
entryRuleFunc
:
{ before(grammarAccess.getFuncRule()); }
	 ruleFunc
{ after(grammarAccess.getFuncRule()); } 
	 EOF 
;

// Rule Func
ruleFunc 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFuncAccess().getGroup()); }
		(rule__Func__Group__0)
		{ after(grammarAccess.getFuncAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParam
entryRuleParam
:
{ before(grammarAccess.getParamRule()); }
	 ruleParam
{ after(grammarAccess.getParamRule()); } 
	 EOF 
;

// Rule Param
ruleParam 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParamAccess().getGroup()); }
		(rule__Param__Group__0)
		{ after(grammarAccess.getParamAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataType
entryRuleDataType
:
{ before(grammarAccess.getDataTypeRule()); }
	 ruleDataType
{ after(grammarAccess.getDataTypeRule()); } 
	 EOF 
;

// Rule DataType
ruleDataType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeAccess().getAlternatives()); }
		(rule__DataType__Alternatives)
		{ after(grammarAccess.getDataTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBasicType
entryRuleBasicType
:
{ before(grammarAccess.getBasicTypeRule()); }
	 ruleBasicType
{ after(grammarAccess.getBasicTypeRule()); } 
	 EOF 
;

// Rule BasicType
ruleBasicType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBasicTypeAccess().getAlternatives()); }
		(rule__BasicType__Alternatives)
		{ after(grammarAccess.getBasicTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleClassType
entryRuleClassType
:
{ before(grammarAccess.getClassTypeRule()); }
	 ruleClassType
{ after(grammarAccess.getClassTypeRule()); } 
	 EOF 
;

// Rule ClassType
ruleClassType 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClassTypeAccess().getTypeAssignment()); }
		(rule__ClassType__TypeAssignment)
		{ after(grammarAccess.getClassTypeAccess().getTypeAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeAccess().getGroup_0()); }
		(rule__DataType__Group_0__0)
		{ after(grammarAccess.getDataTypeAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); }
		ruleClassType
		{ after(grammarAccess.getDataTypeAccess().getClassTypeParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BasicType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); }
		'String'
		{ after(grammarAccess.getBasicTypeAccess().getStringKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); }
		'boolean'
		{ after(grammarAccess.getBasicTypeAccess().getBooleanKeyword_1()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); }
		'int'
		{ after(grammarAccess.getBasicTypeAccess().getIntKeyword_2()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); }
		'long'
		{ after(grammarAccess.getBasicTypeAccess().getLongKeyword_3()); }
	)
	|
	(
		{ before(grammarAccess.getBasicTypeAccess().getDoubleKeyword_4()); }
		'double'
		{ after(grammarAccess.getBasicTypeAccess().getDoubleKeyword_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Namespace__Group__0__Impl
	rule__Namespace__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); }
	'namespace'
	{ after(grammarAccess.getNamespaceAccess().getNamespaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Namespace__Group__1__Impl
	rule__Namespace__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamespaceAccess().getNameAssignment_1()); }
	(rule__Namespace__NameAssignment_1)
	{ after(grammarAccess.getNamespaceAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Namespace__Group__2__Impl
	rule__Namespace__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); }
	(rule__Namespace__ImportsAssignment_2)*
	{ after(grammarAccess.getNamespaceAccess().getImportsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Namespace__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNamespaceAccess().getFuncAssignment_3()); }
	(rule__Namespace__FuncAssignment_3)
	{ after(grammarAccess.getNamespaceAccess().getFuncAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Import__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__0__Impl
	rule__Import__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportKeyword_0()); }
	'import'
	{ after(grammarAccess.getImportAccess().getImportKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Import__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
	(rule__Import__ImportedNamespaceAssignment_1)
	{ after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QName__Group__0__Impl
	rule__QName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQNameAccess().getGroup_1()); }
	(rule__QName__Group_1__0)*
	{ after(grammarAccess.getQNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QName__Group_1__0__Impl
	rule__QName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QNameWithWildcard__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QNameWithWildcard__Group__0__Impl
	rule__QNameWithWildcard__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QNameWithWildcard__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); }
	ruleQName
	{ after(grammarAccess.getQNameWithWildcardAccess().getQNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QNameWithWildcard__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QNameWithWildcard__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QNameWithWildcard__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
	('.*')?
	{ after(grammarAccess.getQNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Func__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__0__Impl
	rule__Func__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getFuncKeyword_0()); }
	'func'
	{ after(grammarAccess.getFuncAccess().getFuncKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__1__Impl
	rule__Func__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getNameAssignment_1()); }
	(rule__Func__NameAssignment_1)
	{ after(grammarAccess.getFuncAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__2__Impl
	rule__Func__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getLeftParenthesisKeyword_2()); }
	'('
	{ after(grammarAccess.getFuncAccess().getLeftParenthesisKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__3__Impl
	rule__Func__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getParamsAssignment_3()); }
	(rule__Func__ParamsAssignment_3)
	{ after(grammarAccess.getFuncAccess().getParamsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__4__Impl
	rule__Func__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getGroup_4()); }
	(rule__Func__Group_4__0)*
	{ after(grammarAccess.getFuncAccess().getGroup_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__5__Impl
	rule__Func__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getRightParenthesisKeyword_5()); }
	')'
	{ after(grammarAccess.getFuncAccess().getRightParenthesisKeyword_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__6__Impl
	rule__Func__Group__7
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getLeftCurlyBracketKeyword_6()); }
	'{'
	{ after(grammarAccess.getFuncAccess().getLeftCurlyBracketKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__7
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group__7__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group__7__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getRightCurlyBracketKeyword_7()); }
	'}'
	{ after(grammarAccess.getFuncAccess().getRightCurlyBracketKeyword_7()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Func__Group_4__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group_4__0__Impl
	rule__Func__Group_4__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group_4__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getCommaKeyword_4_0()); }
	','
	{ after(grammarAccess.getFuncAccess().getCommaKeyword_4_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group_4__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Func__Group_4__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__Group_4__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFuncAccess().getParamsAssignment_4_1()); }
	(rule__Func__ParamsAssignment_4_1)
	{ after(grammarAccess.getFuncAccess().getParamsAssignment_4_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Param__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__0__Impl
	rule__Param__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getDataTypeAssignment_0()); }
	(rule__Param__DataTypeAssignment_0)
	{ after(grammarAccess.getParamAccess().getDataTypeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Param__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParamAccess().getNameAssignment_1()); }
	(rule__Param__NameAssignment_1)
	{ after(grammarAccess.getParamAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DataType__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group_0__0__Impl
	rule__DataType__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); }
	()
	{ after(grammarAccess.getDataTypeAccess().getDataTypeAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DataType__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DataType__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); }
	ruleBasicType
	{ after(grammarAccess.getDataTypeAccess().getBasicTypeParserRuleCall_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Namespace__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); }
		ruleQName
		{ after(grammarAccess.getNamespaceAccess().getNameQNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__ImportsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); }
		ruleImport
		{ after(grammarAccess.getNamespaceAccess().getImportsImportParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Namespace__FuncAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamespaceAccess().getFuncFuncParserRuleCall_3_0()); }
		ruleFunc
		{ after(grammarAccess.getNamespaceAccess().getFuncFuncParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Import__ImportedNamespaceAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); }
		ruleQNameWithWildcard
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getFuncAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__ParamsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_3_0()); }
		ruleParam
		{ after(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Func__ParamsAssignment_4_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_4_1_0()); }
		ruleParam
		{ after(grammarAccess.getFuncAccess().getParamsParamParserRuleCall_4_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__DataTypeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); }
		ruleDataType
		{ after(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Param__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ClassType__TypeAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClassTypeAccess().getTypeClazzCrossReference_0()); }
		(
			{ before(grammarAccess.getClassTypeAccess().getTypeClazzIDTerminalRuleCall_0_1()); }
			RULE_ID
			{ after(grammarAccess.getClassTypeAccess().getTypeClazzIDTerminalRuleCall_0_1()); }
		)
		{ after(grammarAccess.getClassTypeAccess().getTypeClazzCrossReference_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
