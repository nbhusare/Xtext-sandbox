/*
* generated by Xtext
*/
package org.neclipse.xtext.entitydsl.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.neclipse.xtext.parentdsl.services.ParentDslGrammarAccess;

@Singleton
public class EntityDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class NamespaceDefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NamespaceDefinition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cNamespaceDeclarationAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0 = (RuleCall)cNamespaceDeclarationAssignment_0.eContents().get(0);
		private final Assignment cImportDeclarationAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportDeclarationImportDeclarationParserRuleCall_1_0 = (RuleCall)cImportDeclarationAssignment_1.eContents().get(0);
		private final Assignment cArtifactAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cArtifactEntityParserRuleCall_2_0 = (RuleCall)cArtifactAssignment_2.eContents().get(0);
		
		//NamespaceDefinition returns parentdsl::NamespaceDefinition:
		//	namespaceDeclaration=NamespaceDeclaration importDeclaration=ImportDeclaration artifact=Entity;
		public ParserRule getRule() { return rule; }

		//namespaceDeclaration=NamespaceDeclaration importDeclaration=ImportDeclaration artifact=Entity
		public Group getGroup() { return cGroup; }

		//namespaceDeclaration=NamespaceDeclaration
		public Assignment getNamespaceDeclarationAssignment_0() { return cNamespaceDeclarationAssignment_0; }

		//NamespaceDeclaration
		public RuleCall getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0() { return cNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0; }

		//importDeclaration=ImportDeclaration
		public Assignment getImportDeclarationAssignment_1() { return cImportDeclarationAssignment_1; }

		//ImportDeclaration
		public RuleCall getImportDeclarationImportDeclarationParserRuleCall_1_0() { return cImportDeclarationImportDeclarationParserRuleCall_1_0; }

		//artifact=Entity
		public Assignment getArtifactAssignment_2() { return cArtifactAssignment_2; }

		//Entity
		public RuleCall getArtifactEntityParserRuleCall_2_0() { return cArtifactEntityParserRuleCall_2_0; }
	}

	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEntityAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cEntityKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributesAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cAttributesAttributeParserRuleCall_4_0 = (RuleCall)cAttributesAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Entity returns parentdsl::Artifact:
		//	{Entity} "Entity" name=ID "{" attributes+=Attribute* "}";
		public ParserRule getRule() { return rule; }

		//{Entity} "Entity" name=ID "{" attributes+=Attribute* "}"
		public Group getGroup() { return cGroup; }

		//{Entity}
		public Action getEntityAction_0() { return cEntityAction_0; }

		//"Entity"
		public Keyword getEntityKeyword_1() { return cEntityKeyword_1; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

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
		private final Assignment cNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cNameIDTerminalRuleCall_0_0 = (RuleCall)cNameAssignment_0.eContents().get(0);
		private final Keyword cColonKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeDataTypeParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//Attribute:
		//	name=ID ":" type=DataType;
		public ParserRule getRule() { return rule; }

		//name=ID ":" type=DataType
		public Group getGroup() { return cGroup; }

		//name=ID
		public Assignment getNameAssignment_0() { return cNameAssignment_0; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_0_0() { return cNameIDTerminalRuleCall_0_0; }

		//":"
		public Keyword getColonKeyword_1() { return cColonKeyword_1; }

		//type=DataType
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }

		//DataType
		public RuleCall getTypeDataTypeParserRuleCall_2_0() { return cTypeDataTypeParserRuleCall_2_0; }
	}

	public class DataTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DataType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringTypeParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEntityReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DataType:
		//	StringType | EntityReference;
		public ParserRule getRule() { return rule; }

		//StringType | EntityReference
		public Alternatives getAlternatives() { return cAlternatives; }

		//StringType
		public RuleCall getStringTypeParserRuleCall_0() { return cStringTypeParserRuleCall_0; }

		//EntityReference
		public RuleCall getEntityReferenceParserRuleCall_1() { return cEntityReferenceParserRuleCall_1; }
	}

	public class EntityReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EntityReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cEntityReferenceAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cEntityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cEntityEntityCrossReference_1_0 = (CrossReference)cEntityAssignment_1.eContents().get(0);
		private final RuleCall cEntityEntityIDTerminalRuleCall_1_0_1 = (RuleCall)cEntityEntityCrossReference_1_0.eContents().get(1);
		
		//EntityReference:
		//	{EntityReference} entity=[Entity];
		public ParserRule getRule() { return rule; }

		//{EntityReference} entity=[Entity]
		public Group getGroup() { return cGroup; }

		//{EntityReference}
		public Action getEntityReferenceAction_0() { return cEntityReferenceAction_0; }

		//entity=[Entity]
		public Assignment getEntityAssignment_1() { return cEntityAssignment_1; }

		//[Entity]
		public CrossReference getEntityEntityCrossReference_1_0() { return cEntityEntityCrossReference_1_0; }

		//ID
		public RuleCall getEntityEntityIDTerminalRuleCall_1_0_1() { return cEntityEntityIDTerminalRuleCall_1_0_1; }
	}

	public class StringTypeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringType");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cStringTypeAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cNameStringKeyword_1_0 = (Keyword)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cLeftParenthesisKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Keyword cLengthKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2_2 = (Keyword)cGroup_2.eContents().get(2);
		private final Assignment cLengthAssignment_2_3 = (Assignment)cGroup_2.eContents().get(3);
		private final RuleCall cLengthINTTerminalRuleCall_2_3_0 = (RuleCall)cLengthAssignment_2_3.eContents().get(0);
		private final Group cGroup_2_4 = (Group)cGroup_2.eContents().get(4);
		private final Keyword cCommaKeyword_2_4_0 = (Keyword)cGroup_2_4.eContents().get(0);
		private final Keyword cDefaultValueKeyword_2_4_1 = (Keyword)cGroup_2_4.eContents().get(1);
		private final Keyword cEqualsSignKeyword_2_4_2 = (Keyword)cGroup_2_4.eContents().get(2);
		private final Assignment cDefaultValueAssignment_2_4_3 = (Assignment)cGroup_2_4.eContents().get(3);
		private final RuleCall cDefaultValueSTRINGTerminalRuleCall_2_4_3_0 = (RuleCall)cDefaultValueAssignment_2_4_3.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_5 = (Keyword)cGroup_2.eContents().get(5);
		
		//StringType:
		//	{StringType} name="string" ("(" "length" "=" length=INT ("," "default-value" "=" defaultValue=STRING)? ")")?;
		public ParserRule getRule() { return rule; }

		//{StringType} name="string" ("(" "length" "=" length=INT ("," "default-value" "=" defaultValue=STRING)? ")")?
		public Group getGroup() { return cGroup; }

		//{StringType}
		public Action getStringTypeAction_0() { return cStringTypeAction_0; }

		//name="string"
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//"string"
		public Keyword getNameStringKeyword_1_0() { return cNameStringKeyword_1_0; }

		//("(" "length" "=" length=INT ("," "default-value" "=" defaultValue=STRING)? ")")?
		public Group getGroup_2() { return cGroup_2; }

		//"("
		public Keyword getLeftParenthesisKeyword_2_0() { return cLeftParenthesisKeyword_2_0; }

		//"length"
		public Keyword getLengthKeyword_2_1() { return cLengthKeyword_2_1; }

		//"="
		public Keyword getEqualsSignKeyword_2_2() { return cEqualsSignKeyword_2_2; }

		//length=INT
		public Assignment getLengthAssignment_2_3() { return cLengthAssignment_2_3; }

		//INT
		public RuleCall getLengthINTTerminalRuleCall_2_3_0() { return cLengthINTTerminalRuleCall_2_3_0; }

		//("," "default-value" "=" defaultValue=STRING)?
		public Group getGroup_2_4() { return cGroup_2_4; }

		//","
		public Keyword getCommaKeyword_2_4_0() { return cCommaKeyword_2_4_0; }

		//"default-value"
		public Keyword getDefaultValueKeyword_2_4_1() { return cDefaultValueKeyword_2_4_1; }

		//"="
		public Keyword getEqualsSignKeyword_2_4_2() { return cEqualsSignKeyword_2_4_2; }

		//defaultValue=STRING
		public Assignment getDefaultValueAssignment_2_4_3() { return cDefaultValueAssignment_2_4_3; }

		//STRING
		public RuleCall getDefaultValueSTRINGTerminalRuleCall_2_4_3_0() { return cDefaultValueSTRINGTerminalRuleCall_2_4_3_0; }

		//")"
		public Keyword getRightParenthesisKeyword_2_5() { return cRightParenthesisKeyword_2_5; }
	}
	
	
	private NamespaceDefinitionElements pNamespaceDefinition;
	private EntityElements pEntity;
	private AttributeElements pAttribute;
	private DataTypeElements pDataType;
	private EntityReferenceElements pEntityReference;
	private StringTypeElements pStringType;
	
	private final Grammar grammar;

	private ParentDslGrammarAccess gaParentDsl;

	@Inject
	public EntityDslGrammarAccess(GrammarProvider grammarProvider,
		ParentDslGrammarAccess gaParentDsl) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaParentDsl = gaParentDsl;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.neclipse.xtext.entitydsl.EntityDsl".equals(grammar.getName())) {
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
	

	public ParentDslGrammarAccess getParentDslGrammarAccess() {
		return gaParentDsl;
	}

	
	//NamespaceDefinition returns parentdsl::NamespaceDefinition:
	//	namespaceDeclaration=NamespaceDeclaration importDeclaration=ImportDeclaration artifact=Entity;
	public NamespaceDefinitionElements getNamespaceDefinitionAccess() {
		return (pNamespaceDefinition != null) ? pNamespaceDefinition : (pNamespaceDefinition = new NamespaceDefinitionElements());
	}
	
	public ParserRule getNamespaceDefinitionRule() {
		return getNamespaceDefinitionAccess().getRule();
	}

	//Entity returns parentdsl::Artifact:
	//	{Entity} "Entity" name=ID "{" attributes+=Attribute* "}";
	public EntityElements getEntityAccess() {
		return (pEntity != null) ? pEntity : (pEntity = new EntityElements());
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}

	//Attribute:
	//	name=ID ":" type=DataType;
	public AttributeElements getAttributeAccess() {
		return (pAttribute != null) ? pAttribute : (pAttribute = new AttributeElements());
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}

	//DataType:
	//	StringType | EntityReference;
	public DataTypeElements getDataTypeAccess() {
		return (pDataType != null) ? pDataType : (pDataType = new DataTypeElements());
	}
	
	public ParserRule getDataTypeRule() {
		return getDataTypeAccess().getRule();
	}

	//EntityReference:
	//	{EntityReference} entity=[Entity];
	public EntityReferenceElements getEntityReferenceAccess() {
		return (pEntityReference != null) ? pEntityReference : (pEntityReference = new EntityReferenceElements());
	}
	
	public ParserRule getEntityReferenceRule() {
		return getEntityReferenceAccess().getRule();
	}

	//StringType:
	//	{StringType} name="string" ("(" "length" "=" length=INT ("," "default-value" "=" defaultValue=STRING)? ")")?;
	public StringTypeElements getStringTypeAccess() {
		return (pStringType != null) ? pStringType : (pStringType = new StringTypeElements());
	}
	
	public ParserRule getStringTypeRule() {
		return getStringTypeAccess().getRule();
	}

	//NamespaceDeclaration:
	//	"namespace" name=QualifedName;
	public ParentDslGrammarAccess.NamespaceDeclarationElements getNamespaceDeclarationAccess() {
		return gaParentDsl.getNamespaceDeclarationAccess();
	}
	
	public ParserRule getNamespaceDeclarationRule() {
		return getNamespaceDeclarationAccess().getRule();
	}

	//ImportDeclaration:
	//	{ImportDeclaration} imports+=Import*;
	public ParentDslGrammarAccess.ImportDeclarationElements getImportDeclarationAccess() {
		return gaParentDsl.getImportDeclarationAccess();
	}
	
	public ParserRule getImportDeclarationRule() {
		return getImportDeclarationAccess().getRule();
	}

	//Import:
	//	"import" importedNamespace=QualifedNameWithWildcard;
	public ParentDslGrammarAccess.ImportElements getImportAccess() {
		return gaParentDsl.getImportAccess();
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}

	//QualifedName:
	//	ID ("." ID)*;
	public ParentDslGrammarAccess.QualifedNameElements getQualifedNameAccess() {
		return gaParentDsl.getQualifedNameAccess();
	}
	
	public ParserRule getQualifedNameRule() {
		return getQualifedNameAccess().getRule();
	}

	//QualifedNameWithWildcard:
	//	QualifedName ".*"?;
	public ParentDslGrammarAccess.QualifedNameWithWildcardElements getQualifedNameWithWildcardAccess() {
		return gaParentDsl.getQualifedNameWithWildcardAccess();
	}
	
	public ParserRule getQualifedNameWithWildcardRule() {
		return getQualifedNameWithWildcardAccess().getRule();
	}

	//Artifact:
	//	name=ID;
	public ParentDslGrammarAccess.ArtifactElements getArtifactAccess() {
		return gaParentDsl.getArtifactAccess();
	}
	
	public ParserRule getArtifactRule() {
		return getArtifactAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaParentDsl.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaParentDsl.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaParentDsl.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaParentDsl.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaParentDsl.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaParentDsl.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaParentDsl.getANY_OTHERRule();
	} 
}
