/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
grammar InternalClazzDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.neclipse.xtext.validator.example.clazzdsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.neclipse.xtext.validator.example.clazzdsl.ide.contentassist.antlr.internal;

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
import org.neclipse.xtext.validator.example.clazzdsl.services.ClazzDslGrammarAccess;

}
@parser::members {
	private ClazzDslGrammarAccess grammarAccess;

	public void setGrammarAccess(ClazzDslGrammarAccess grammarAccess) {
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

// Entry rule entryRuleClazz
entryRuleClazz
:
{ before(grammarAccess.getClazzRule()); }
	 ruleClazz
{ after(grammarAccess.getClazzRule()); } 
	 EOF 
;

// Rule Clazz
ruleClazz 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getClazzAccess().getGroup()); }
		(rule__Clazz__Group__0)
		{ after(grammarAccess.getClazzAccess().getGroup()); }
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
	{ before(grammarAccess.getNamespaceAccess().getClazzAssignment_3()); }
	(rule__Namespace__ClazzAssignment_3)
	{ after(grammarAccess.getNamespaceAccess().getClazzAssignment_3()); }
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


rule__Clazz__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clazz__Group__0__Impl
	rule__Clazz__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClazzAccess().getDeprecatedAssignment_0()); }
	(rule__Clazz__DeprecatedAssignment_0)?
	{ after(grammarAccess.getClazzAccess().getDeprecatedAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clazz__Group__1__Impl
	rule__Clazz__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClazzAccess().getClassKeyword_1()); }
	'class'
	{ after(grammarAccess.getClazzAccess().getClassKeyword_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clazz__Group__2__Impl
	rule__Clazz__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClazzAccess().getNameAssignment_2()); }
	(rule__Clazz__NameAssignment_2)
	{ after(grammarAccess.getClazzAccess().getNameAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clazz__Group__3__Impl
	rule__Clazz__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_3()); }
	'{'
	{ after(grammarAccess.getClazzAccess().getLeftCurlyBracketKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Clazz__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_4()); }
	'}'
	{ after(grammarAccess.getClazzAccess().getRightCurlyBracketKeyword_4()); }
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

rule__Namespace__ClazzAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNamespaceAccess().getClazzClazzParserRuleCall_3_0()); }
		ruleClazz
		{ after(grammarAccess.getNamespaceAccess().getClazzClazzParserRuleCall_3_0()); }
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

rule__Clazz__DeprecatedAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); }
		(
			{ before(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); }
			'deprecated'
			{ after(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); }
		)
		{ after(grammarAccess.getClazzAccess().getDeprecatedDeprecatedKeyword_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Clazz__NameAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_2_0()); }
		RULE_ID
		{ after(grammarAccess.getClazzAccess().getNameIDTerminalRuleCall_2_0()); }
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
