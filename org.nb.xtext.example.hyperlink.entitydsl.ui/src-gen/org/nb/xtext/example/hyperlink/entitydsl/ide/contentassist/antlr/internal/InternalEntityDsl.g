/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
grammar InternalEntityDsl;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.nb.xtext.example.hyperlink.entitydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.nb.xtext.example.hyperlink.entitydsl.ide.contentassist.antlr.internal;

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
import org.nb.xtext.example.hyperlink.entitydsl.services.EntityDslGrammarAccess;

}
@parser::members {
	private EntityDslGrammarAccess grammarAccess;

	public void setGrammarAccess(EntityDslGrammarAccess grammarAccess) {
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

// Entry rule entryRuleEntityFile
entryRuleEntityFile
:
{ before(grammarAccess.getEntityFileRule()); }
	 ruleEntityFile
{ after(grammarAccess.getEntityFileRule()); } 
	 EOF 
;

// Rule EntityFile
ruleEntityFile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityFileAccess().getGroup()); }
		(rule__EntityFile__Group__0)
		{ after(grammarAccess.getEntityFileAccess().getGroup()); }
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

// Entry rule entryRuleQualifedName
entryRuleQualifedName
:
{ before(grammarAccess.getQualifedNameRule()); }
	 ruleQualifedName
{ after(grammarAccess.getQualifedNameRule()); } 
	 EOF 
;

// Rule QualifedName
ruleQualifedName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getQualifedNameAccess().getGroup()); }
		(rule__QualifedName__Group__0)
		{ after(grammarAccess.getQualifedNameAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEntity
entryRuleEntity
:
{ before(grammarAccess.getEntityRule()); }
	 ruleEntity
{ after(grammarAccess.getEntityRule()); } 
	 EOF 
;

// Rule Entity
ruleEntity 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEntityAccess().getGroup()); }
		(rule__Entity__Group__0)
		{ after(grammarAccess.getEntityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityFile__Group__0__Impl
	rule__EntityFile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityFileAccess().getNamespaceKeyword_0()); }
	'namespace'
	{ after(grammarAccess.getEntityFileAccess().getNamespaceKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityFile__Group__1__Impl
	rule__EntityFile__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityFileAccess().getNameAssignment_1()); }
	(rule__EntityFile__NameAssignment_1)
	{ after(grammarAccess.getEntityFileAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityFile__Group__2__Impl
	rule__EntityFile__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityFileAccess().getImportsAssignment_2()); }
	(rule__EntityFile__ImportsAssignment_2)*
	{ after(grammarAccess.getEntityFileAccess().getImportsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EntityFile__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityFileAccess().getEntityAssignment_3()); }
	(rule__EntityFile__EntityAssignment_3)
	{ after(grammarAccess.getEntityFileAccess().getEntityAssignment_3()); }
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


rule__QualifedName__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifedName__Group__0__Impl
	rule__QualifedName__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifedName__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); }
	RULE_ID
	{ after(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifedName__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifedName__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifedName__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifedNameAccess().getGroup_1()); }
	(rule__QualifedName__Group_1__0)*
	{ after(grammarAccess.getQualifedNameAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__QualifedName__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifedName__Group_1__0__Impl
	rule__QualifedName__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifedName__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); }
	'.'
	{ after(grammarAccess.getQualifedNameAccess().getFullStopKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifedName__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__QualifedName__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__QualifedName__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); }
	RULE_ID
	{ after(grammarAccess.getQualifedNameAccess().getIDTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__0__Impl
	rule__Entity__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getModelKeyword_0()); }
	'model'
	{ after(grammarAccess.getEntityAccess().getModelKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__1__Impl
	rule__Entity__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getNameAssignment_1()); }
	(rule__Entity__NameAssignment_1)
	{ after(grammarAccess.getEntityAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getGroup_2()); }
	(rule__Entity__Group_2__0)?
	{ after(grammarAccess.getEntityAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Entity__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__0__Impl
	rule__Entity__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }
	'extends'
	{ after(grammarAccess.getEntityAccess().getExtendsKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Entity__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEntityAccess().getParentAssignment_2_1()); }
	(rule__Entity__ParentAssignment_2_1)
	{ after(grammarAccess.getEntityAccess().getParentAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EntityFile__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityFileAccess().getNameQualifedNameParserRuleCall_1_0()); }
		ruleQualifedName
		{ after(grammarAccess.getEntityFileAccess().getNameQualifedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__ImportsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityFileAccess().getImportsImportParserRuleCall_2_0()); }
		ruleImport
		{ after(grammarAccess.getEntityFileAccess().getImportsImportParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EntityFile__EntityAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityFileAccess().getEntityEntityParserRuleCall_3_0()); }
		ruleEntity
		{ after(grammarAccess.getEntityFileAccess().getEntityEntityParserRuleCall_3_0()); }
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
		{ before(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameParserRuleCall_1_0()); }
		ruleQualifedName
		{ after(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Entity__ParentAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0()); }
		(
			{ before(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_2_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getEntityAccess().getParentEntityIDTerminalRuleCall_2_1_0_1()); }
		)
		{ after(grammarAccess.getEntityAccess().getParentEntityCrossReference_2_1_0()); }
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
