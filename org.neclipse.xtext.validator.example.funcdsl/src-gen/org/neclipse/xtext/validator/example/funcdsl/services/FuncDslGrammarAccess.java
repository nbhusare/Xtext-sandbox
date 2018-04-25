/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.funcdsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
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
public class FuncDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class NamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Namespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cFuncAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cFuncFuncParserRuleCall_3_0 = (RuleCall)cFuncAssignment_3.eContents().get(0);
		
		//Namespace:
		//	'namespace' name=QName
		//	imports+=Import*
		//	func=Func;
		@Override public ParserRule getRule() { return rule; }
		
		//'namespace' name=QName imports+=Import* func=Func
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
		
		//func=Func
		public Assignment getFuncAssignment_3() { return cFuncAssignment_3; }
		
		//Func
		public RuleCall getFuncFuncParserRuleCall_3_0() { return cFuncFuncParserRuleCall_3_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Import");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.QName");
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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.QNameWithWildcard");
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
	public class FuncElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Func");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cFuncKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cParamsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cParamsParamParserRuleCall_3_0 = (RuleCall)cParamsAssignment_3.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cCommaKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cParamsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cParamsParamParserRuleCall_4_1_0 = (RuleCall)cParamsAssignment_4_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Keyword cLeftCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cRightCurlyBracketKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Func:
		//	'func' name=ID '(' params+=Param (',' params+=Param)* ')' '{'
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'func' name=ID '(' params+=Param (',' params+=Param)* ')' '{' '}'
		public Group getGroup() { return cGroup; }
		
		//'func'
		public Keyword getFuncKeyword_0() { return cFuncKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }
		
		//params+=Param
		public Assignment getParamsAssignment_3() { return cParamsAssignment_3; }
		
		//Param
		public RuleCall getParamsParamParserRuleCall_3_0() { return cParamsParamParserRuleCall_3_0; }
		
		//(',' params+=Param)*
		public Group getGroup_4() { return cGroup_4; }
		
		//','
		public Keyword getCommaKeyword_4_0() { return cCommaKeyword_4_0; }
		
		//params+=Param
		public Assignment getParamsAssignment_4_1() { return cParamsAssignment_4_1; }
		
		//Param
		public RuleCall getParamsParamParserRuleCall_4_1_0() { return cParamsParamParserRuleCall_4_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_5() { return cRightParenthesisKeyword_5; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_6() { return cLeftCurlyBracketKeyword_6; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_7() { return cRightCurlyBracketKeyword_7; }
	}
	public class ParamElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.Param");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDataTypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDataTypeDataTypeParserRuleCall_0_0 = (RuleCall)cDataTypeAssignment_0.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		
		//Param:
		//	dataType=DataType name=ID;
		@Override public ParserRule getRule() { return rule; }
		
		//dataType=DataType name=ID
		public Group getGroup() { return cGroup; }
		
		//dataType=DataType
		public Assignment getDataTypeAssignment_0() { return cDataTypeAssignment_0; }
		
		//DataType
		public RuleCall getDataTypeDataTypeParserRuleCall_0_0() { return cDataTypeDataTypeParserRuleCall_0_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
	}
	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cDataTypeAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cBasicTypeParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cClassTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DataType:
		//	{DataType} BasicType | ClassType;
		@Override public ParserRule getRule() { return rule; }
		
		//{DataType} BasicType | ClassType
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{DataType} BasicType
		public Group getGroup_0() { return cGroup_0; }
		
		//{DataType}
		public Action getDataTypeAction_0_0() { return cDataTypeAction_0_0; }
		
		//BasicType
		public RuleCall getBasicTypeParserRuleCall_0_1() { return cBasicTypeParserRuleCall_0_1; }
		
		//ClassType
		public RuleCall getClassTypeParserRuleCall_1() { return cClassTypeParserRuleCall_1; }
	}
	public class BasicTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.BasicType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cIntKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cLongKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cDoubleKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//BasicType:
		//	'String' | 'boolean' | 'int' | 'long' | 'double';
		@Override public ParserRule getRule() { return rule; }
		
		//'String' | 'boolean' | 'int' | 'long' | 'double'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'String'
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }
		
		//'boolean'
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }
		
		//'int'
		public Keyword getIntKeyword_2() { return cIntKeyword_2; }
		
		//'long'
		public Keyword getLongKeyword_3() { return cLongKeyword_3; }
		
		//'double'
		public Keyword getDoubleKeyword_4() { return cDoubleKeyword_4; }
	}
	public class ClassTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.neclipse.xtext.validator.example.funcdsl.FuncDsl.ClassType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeClazzCrossReference_0 = (CrossReference)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeClazzIDTerminalRuleCall_0_1 = (RuleCall)cTypeClazzCrossReference_0.eContents().get(1);
		
		//ClassType:
		//	type=[clazz::Clazz];
		@Override public ParserRule getRule() { return rule; }
		
		//type=[clazz::Clazz]
		public Assignment getTypeAssignment() { return cTypeAssignment; }
		
		//[clazz::Clazz]
		public CrossReference getTypeClazzCrossReference_0() { return cTypeClazzCrossReference_0; }
		
		//ID
		public RuleCall getTypeClazzIDTerminalRuleCall_0_1() { return cTypeClazzIDTerminalRuleCall_0_1; }
	}
	
	
	private final NamespaceElements pNamespace;
	private final ImportElements pImport;
	private final QNameElements pQName;
	private final QNameWithWildcardElements pQNameWithWildcard;
	private final FuncElements pFunc;
	private final ParamElements pParam;
	private final DataTypeElements pDataType;
	private final BasicTypeElements pBasicType;
	private final ClassTypeElements pClassType;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public FuncDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNamespace = new NamespaceElements();
		this.pImport = new ImportElements();
		this.pQName = new QNameElements();
		this.pQNameWithWildcard = new QNameWithWildcardElements();
		this.pFunc = new FuncElements();
		this.pParam = new ParamElements();
		this.pDataType = new DataTypeElements();
		this.pBasicType = new BasicTypeElements();
		this.pClassType = new ClassTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.neclipse.xtext.validator.example.funcdsl.FuncDsl".equals(grammar.getName())) {
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
	//	func=Func;
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
	
	//Func:
	//	'func' name=ID '(' params+=Param (',' params+=Param)* ')' '{'
	//	'}';
	public FuncElements getFuncAccess() {
		return pFunc;
	}
	
	public ParserRule getFuncRule() {
		return getFuncAccess().getRule();
	}
	
	//Param:
	//	dataType=DataType name=ID;
	public ParamElements getParamAccess() {
		return pParam;
	}
	
	public ParserRule getParamRule() {
		return getParamAccess().getRule();
	}
	
	//DataType:
	//	{DataType} BasicType | ClassType;
	public DataTypeElements getDataTypeAccess() {
		return pDataType;
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}
	
	//BasicType:
	//	'String' | 'boolean' | 'int' | 'long' | 'double';
	public BasicTypeElements getBasicTypeAccess() {
		return pBasicType;
	}
	
	public ParserRule getBasicTypeRule() {
		return getBasicTypeAccess().getRule();
	}
	
	//ClassType:
	//	type=[clazz::Clazz];
	public ClassTypeElements getClassTypeAccess() {
		return pClassType;
	}
	
	public ParserRule getClassTypeRule() {
		return getClassTypeAccess().getRule();
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
