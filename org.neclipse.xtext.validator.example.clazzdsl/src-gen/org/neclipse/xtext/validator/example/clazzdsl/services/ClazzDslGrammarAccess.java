/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class ClazzDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class NamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.Namespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cClazzAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClazzClazzParserRuleCall_3_0 = (RuleCall)cClazzAssignment_3.eContents().get(0);
		
		//Namespace:
		//	'namespace' name=QName
		//	imports+=Import*
		//	clazz=Clazz;
		@Override public ParserRule getRule() { return rule; }
		
		//'namespace' name=QName imports+=Import* clazz=Clazz
		public Group getGroup() { return cGroup; }
		
		//'namespace'
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }
		
		//name=QName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QName
		public RuleCall getNameQNameParserRuleCall_1_0() { return cNameQNameParserRuleCall_1_0; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }
		
		//clazz=Clazz
		public Assignment getClazzAssignment_3() { return cClazzAssignment_3; }
		
		//Clazz
		public RuleCall getClazzClazzParserRuleCall_3_0() { return cClazzClazzParserRuleCall_3_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=QNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QNameWithWildcard
		public RuleCall getImportedNamespaceQNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQNameWithWildcardParserRuleCall_1_0; }
	}
	public class QNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.QName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class QNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.QNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QNameWithWildcard:
		//	QName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QName
		public RuleCall getQNameParserRuleCall_0() { return cQNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class ClazzElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl.Clazz");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDeprecatedAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Keyword cDeprecatedDeprecatedKeyword_0_0 = (Keyword)cDeprecatedAssignment_0.eContents().get(0);
		private final Keyword cClassKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Clazz:
		//	deprecated?='deprecated'? 'class' name=ID '{'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//deprecated?='deprecated'? 'class' name=ID '{' '}'
		public Group getGroup() { return cGroup; }
		
		//deprecated?='deprecated'?
		public Assignment getDeprecatedAssignment_0() { return cDeprecatedAssignment_0; }
		
		//'deprecated'
		public Keyword getDeprecatedDeprecatedKeyword_0_0() { return cDeprecatedDeprecatedKeyword_0_0; }
		
		//'class'
		public Keyword getClassKeyword_1() { return cClassKeyword_1; }
		
		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	
	
	private final NamespaceElements pNamespace;
	private final ImportElements pImport;
	private final QNameElements pQName;
	private final QNameWithWildcardElements pQNameWithWildcard;
	private final ClazzElements pClazz;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public ClazzDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNamespace = new NamespaceElements();
		this.pImport = new ImportElements();
		this.pQName = new QNameElements();
		this.pQNameWithWildcard = new QNameWithWildcardElements();
		this.pClazz = new ClazzElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.neclipse.xtext.validator.example.clazzdsl.ClazzDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Namespace:
	//	'namespace' name=QName
	//	imports+=Import*
	//	clazz=Clazz;
	public NamespaceElements getNamespaceAccess() {
		return pNamespace;
	}
	
	public ParserRule getNamespaceRule() {
		return getNamespaceAccess().getRule();
	}
	
	//Import:
	//	'import' importedNamespace=QNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QName:
	//	ID ('.' ID)*;
	public QNameElements getQNameAccess() {
		return pQName;
	}
	
	public ParserRule getQNameRule() {
		return getQNameAccess().getRule();
	}
	
	//QNameWithWildcard:
	//	QName '.*'?;
	public QNameWithWildcardElements getQNameWithWildcardAccess() {
		return pQNameWithWildcard;
	}
	
	public ParserRule getQNameWithWildcardRule() {
		return getQNameWithWildcardAccess().getRule();
	}
	
	//Clazz:
	//	deprecated?='deprecated'? 'class' name=ID '{'
	//	'}';
	public ClazzElements getClazzAccess() {
		return pClazz;
	}
	
	public ParserRule getClazzRule() {
		return getClazzAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
