/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Entity;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityFile;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import;
import org.nb.xtext.example.hyperlink.entitydsl.services.EntityDslGrammarAccess;

@SuppressWarnings("all")
public class EntityDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EntityDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EntityDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EntityDslPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case EntityDslPackage.ENTITY_FILE:
				sequence_EntityFile(context, (EntityFile) semanticObject); 
				return; 
			case EntityDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     EntityFile returns EntityFile
	 *
	 * Constraint:
	 *     (name=QualifedName imports+=Import* entity=Entity)
	 */
	protected void sequence_EntityFile(ISerializationContext context, EntityFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID parent=[Entity|ID]?)
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QualifedName
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifedNameParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
}
