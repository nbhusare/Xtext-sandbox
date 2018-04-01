/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
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
public class EntityDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class EntityFileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.EntityFile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cNamespaceKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cEntityAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEntityEntityParserRuleCall_3_0 = (RuleCall)cEntityAssignment_3.eContents().get(0);
		
		//EntityFile:
		//	'namespace' name=QualifedName
		//	imports+=Import*
		//	entity=Entity;
		@Override public ParserRule getRule() { return rule; }
		
		//'namespace' name=QualifedName imports+=Import* entity=Entity
		public Group getGroup() { return cGroup; }
		
		//'namespace'
		public Keyword getNamespaceKeyword_0() { return cNamespaceKeyword_0; }
		
		//name=QualifedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifedName
		public RuleCall getNameQualifedNameParserRuleCall_1_0() { return cNameQualifedNameParserRuleCall_1_0; }
		
		//imports+=Import*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }
		
		//Import
		public RuleCall getImportsImportParserRuleCall_2_0() { return cImportsImportParserRuleCall_2_0; }
		
		//entity=Entity
		public Assignment getEntityAssignment_3() { return cEntityAssignment_3; }
		
		//Entity
		public RuleCall getEntityEntityParserRuleCall_3_0() { return cEntityEntityParserRuleCall_3_0; }
	}
	public class ImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.Import");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifedNameParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//Import:
		//	'import' importedNamespace=QualifedName;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifedName
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifedName
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifedName
		public RuleCall getImportedNamespaceQualifedNameParserRuleCall_1_0() { return cImportedNamespaceQualifedNameParserRuleCall_1_0; }
	}
	public class QualifedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.QualifedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifedName:
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
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.nb.xtext.example.hyperlink.entitydsl.EntityDsl.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModelKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cExtendsKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final Assignment cParentAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final CrossReference cParentEntityCrossReference_2_1_0 = (CrossReference)cParentAssignment_2_1.eContents().get(0);
		private final RuleCall cParentEntityIDTerminalRuleCall_2_1_0_1 = (RuleCall)cParentEntityCrossReference_2_1_0.eContents().get(1);
		
		//Entity:
		//	'model' name=ID ('extends' parent=[Entity])?;
		@Override public ParserRule getRule() { return rule; }
		
		//'model' name=ID ('extends' parent=[Entity])?
		public Group getGroup() { return cGroup; }
		
		//'model'
		public Keyword getModelKeyword_0() { return cModelKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//('extends' parent=[Entity])?
		public Group getGroup_2() { return cGroup_2; }
		
		//'extends'
		public Keyword getExtendsKeyword_2_0() { return cExtendsKeyword_2_0; }
		
		//parent=[Entity]
		public Assignment getParentAssignment_2_1() { return cParentAssignment_2_1; }
		
		//[Entity]
		public CrossReference getParentEntityCrossReference_2_1_0() { return cParentEntityCrossReference_2_1_0; }
		
		//ID
		public RuleCall getParentEntityIDTerminalRuleCall_2_1_0_1() { return cParentEntityIDTerminalRuleCall_2_1_0_1; }
	}
	
	
	private final EntityFileElements pEntityFile;
	private final ImportElements pImport;
	private final QualifedNameElements pQualifedName;
	private final EntityElements pEntity;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public EntityDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pEntityFile = new EntityFileElements();
		this.pImport = new ImportElements();
		this.pQualifedName = new QualifedNameElements();
		this.pEntity = new EntityElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.nb.xtext.example.hyperlink.entitydsl.EntityDsl".equals(grammar.getName())) {
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

	
	//EntityFile:
	//	'namespace' name=QualifedName
	//	imports+=Import*
	//	entity=Entity;
	public EntityFileElements getEntityFileAccess() {
		return pEntityFile;
	}
	
	public ParserRule getEntityFileRule() {
		return getEntityFileAccess().getRule();
	}
	
	//Import:
	//	'import' importedNamespace=QualifedName;
	public ImportElements getImportAccess() {
		return pImport;
	}
	
	public ParserRule getImportRule() {
		return getImportAccess().getRule();
	}
	
	//QualifedName:
	//	ID ('.' ID)*;
	public QualifedNameElements getQualifedNameAccess() {
		return pQualifedName;
	}
	
	public ParserRule getQualifedNameRule() {
		return getQualifedNameAccess().getRule();
	}
	
	//Entity:
	//	'model' name=ID ('extends' parent=[Entity])?;
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
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
