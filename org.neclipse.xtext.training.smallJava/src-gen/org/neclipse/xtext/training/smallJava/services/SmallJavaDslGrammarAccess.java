/*
* generated by Xtext
*/
package org.neclipse.xtext.training.smallJava.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class SmallJavaDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class NamespaceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Namespace");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cClassAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cClassSmallClassParserRuleCall_3_0 = (RuleCall)cClassAssignment_3.eContents().get(0);
		
		//Namespace:
		//	"namespace" name=QName imports+=Import* class=SmallClass;
		public ParserRule getRule() { return rule; }

		//"namespace" name=QName imports+=Import* class=SmallClass
		public Group getGroup() { return cGroup; }

		//"namespace"
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }

		//name=QName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//QName
		public RuleCall getNameQNameParserRuleCall_1_0() { return cNameQNameParserRuleCall_1_0; }

		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }

		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }

		//class=SmallClass
		public Assignment getClassAssignment_3() { return cClassAssignment_3; }

		//SmallClass
		public RuleCall getClassSmallClassParserRuleCall_3_0() { return cClassSmallClassParserRuleCall_3_0; }
	}

	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	"import" importedNamespace=QNameWithWildcard;
		public ParserRule getRule() { return rule; }

		//"import" importedNamespace=QNameWithWildcard
		public Group getGroup() { return cGroup; }

		//"import"
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }

		//importedNamespace=QNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }

		//QNameWithWildcard
		public RuleCall getImportedNamespaceQNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQNameWithWildcardParserRuleCall_1_0; }
	}

	public class QNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QName:
		//	ID ("." ID)*;
		public ParserRule getRule() { return rule; }

		//ID ("." ID)*
		public Group getGroup() { return cGroup; }

		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }

		//("." ID)*
		public Group getGroup_1() { return cGroup_1; }

		//"."
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}

	public class QNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QNameWithWildcard:
		//	QName ".*"?;
		public ParserRule getRule() { return rule; }

		//QName ".*"?
		public Group getGroup() { return cGroup; }

		//QName
		public RuleCall getQNameParserRuleCall_0() { return cQNameParserRuleCall_0; }

		//".*"?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}

	public class SmallClassElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "SmallClass");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cClassKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cSuperClassAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cSuperClassSmallClassCrossReference_2_1_0 = (CrossReference)cSuperClassAssignment_2_1.eContents().get(0);
		private final RuleCall cSuperClassSmallClassIDTerminalRuleCall_2_1_0_1 = (RuleCall)cSuperClassSmallClassCrossReference_2_1_0.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//SmallClass:
		//	"class" name=ID ("extends" superClass=[SmallClass])? "{" attributes+=Attribute* "}";
		public ParserRule getRule() { return rule; }

		//"class" name=ID ("extends" superClass=[SmallClass])? "{" attributes+=Attribute* "}"
		public Group getGroup() { return cGroup; }

		//"class"
		public Keyword getClassKeyword_0() { return cClassKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//("extends" superClass=[SmallClass])?
		public Group getGroup_2() { return cGroup_2; }

		//"extends"
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }

		//superClass=[SmallClass]
		public Assignment getSuperClassAssignment_2_1() { return cSuperClassAssignment_2_1; }

		//[SmallClass]
		public CrossReference getSuperClassSmallClassCrossReference_2_1_0() { return cSuperClassSmallClassCrossReference_2_1_0; }

		//ID
		public RuleCall getSuperClassSmallClassIDTerminalRuleCall_2_1_0_1() { return cSuperClassSmallClassIDTerminalRuleCall_2_1_0_1; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }

		//attributes+=Attribute*
		public Assignment getAttributesAssignment_4() { return cAttributesAssignment_4; }

		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_4_0() { return cAttributesAttributeParserRuleCall_4_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}

	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cDatatypeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cDatatypeDataTypeParserRuleCall_0_0 = (RuleCall)cDatatypeAssignment_0.eContents().get(0);
		private final Assignment cArrayAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cArrayLeftSquareBracketRightSquareBracketKeyword_1_0 = (Keyword)cArrayAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		
		//Attribute:
		//	datatype=DataType array?="[]"? name=ID;
		public ParserRule getRule() { return rule; }

		//datatype=DataType array?="[]"? name=ID
		public Group getGroup() { return cGroup; }

		//datatype=DataType
		public Assignment getDatatypeAssignment_0() { return cDatatypeAssignment_0; }

		//DataType
		public RuleCall getDatatypeDataTypeParserRuleCall_0_0() { return cDatatypeDataTypeParserRuleCall_0_0; }

		//array?="[]"?
		public Assignment getArrayAssignment_1() { return cArrayAssignment_1; }

		//"[]"
		public Keyword getArrayLeftSquareBracketRightSquareBracketKeyword_1_0() { return cArrayLeftSquareBracketRightSquareBracketKeyword_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }
	}

	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cDataTypeAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final RuleCall cBasicTypeParserRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cClassTypeParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DataType:
		//	{DataType} BasicType | ClassType;
		public ParserRule getRule() { return rule; }

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
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BasicType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cStringKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cBooleanKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cIntKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cLongKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		private final Keyword cDoubleKeyword_4 = (Keyword)cAlternatives.eContents().get(4);
		
		//BasicType:
		//	"String" | "boolean" | "int" | "long" | "double";
		public ParserRule getRule() { return rule; }

		//"String" | "boolean" | "int" | "long" | "double"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"String"
		public Keyword getStringKeyword_0() { return cStringKeyword_0; }

		//"boolean"
		public Keyword getBooleanKeyword_1() { return cBooleanKeyword_1; }

		//"int"
		public Keyword getIntKeyword_2() { return cIntKeyword_2; }

		//"long"
		public Keyword getLongKeyword_3() { return cLongKeyword_3; }

		//"double"
		public Keyword getDoubleKeyword_4() { return cDoubleKeyword_4; }
	}

	public class ClassTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ClassType");
		private final Assignment cTypeAssignment = (Assignment)rule.eContents().get(1);
		private final CrossReference cTypeSmallClassCrossReference_0 = (CrossReference)cTypeAssignment.eContents().get(0);
		private final RuleCall cTypeSmallClassIDTerminalRuleCall_0_1 = (RuleCall)cTypeSmallClassCrossReference_0.eContents().get(1);
		
		//ClassType:
		//	type=[SmallClass];
		public ParserRule getRule() { return rule; }

		//type=[SmallClass]
		public Assignment getTypeAssignment() { return cTypeAssignment; }

		//[SmallClass]
		public CrossReference getTypeSmallClassCrossReference_0() { return cTypeSmallClassCrossReference_0; }

		//ID
		public RuleCall getTypeSmallClassIDTerminalRuleCall_0_1() { return cTypeSmallClassIDTerminalRuleCall_0_1; }
	}
	
	
	private final NamespaceElements pNamespace;
	private final ImportElements pImport;
	private final QNameElements pQName;
	private final QNameWithWildcardElements pQNameWithWildcard;
	private final SmallClassElements pSmallClass;
	private final AttributeElements pAttribute;
	private final DataTypeElements pDataType;
	private final BasicTypeElements pBasicType;
	private final ClassTypeElements pClassType;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public SmallJavaDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pNamespace = new NamespaceElements();
		this.pImport = new ImportElements();
		this.pQName = new QNameElements();
		this.pQNameWithWildcard = new QNameWithWildcardElements();
		this.pSmallClass = new SmallClassElements();
		this.pAttribute = new AttributeElements();
		this.pDataType = new DataTypeElements();
		this.pBasicType = new BasicTypeElements();
		this.pClassType = new ClassTypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.neclipse.xtext.training.smallJava.SmallJavaDsl".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Namespace:
	//	"namespace" name=QName imports+=Import* class=SmallClass;
	public NamespaceElements getNamespaceAccess() {
		return pNamespace;
	}
	
	public ParserRule getNamespaceRule() {
		return getNamespaceAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=QNameWithWildcard;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//QName:
	//	ID ("." ID)*;
	public QNameElements getQNameAccess() {
		return pQName;
	}
	
	public ParserRule getQNameRule() {
		return getQNameAccess().getRule();
	}

	//QNameWithWildcard:
	//	QName ".*"?;
	public QNameWithWildcardElements getQNameWithWildcardAccess() {
		return pQNameWithWildcard;
	}
	
	public ParserRule getQNameWithWildcardRule() {
		return getQNameWithWildcardAccess().getRule();
	}

	//SmallClass:
	//	"class" name=ID ("extends" superClass=[SmallClass])? "{" attributes+=Attribute* "}";
	public SmallClassElements getSmallClassAccess() {
		return pSmallClass;
	}
	
	public ParserRule getSmallClassRule() {
		return getSmallClassAccess().getRule();
	}

	//Attribute:
	//	datatype=DataType array?="[]"? name=ID;
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
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
	//	"String" | "boolean" | "int" | "long" | "double";
	public BasicTypeElements getBasicTypeAccess() {
		return pBasicType;
	}
	
	public ParserRule getBasicTypeRule() {
		return getBasicTypeAccess().getRule();
	}

	//ClassType:
	//	type=[SmallClass];
	public ClassTypeElements getClassTypeAccess() {
		return pClassType;
	}
	
	public ParserRule getClassTypeRule() {
		return getClassTypeAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
