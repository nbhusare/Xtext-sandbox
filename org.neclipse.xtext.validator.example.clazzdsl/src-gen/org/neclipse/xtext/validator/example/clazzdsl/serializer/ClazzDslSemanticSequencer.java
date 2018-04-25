/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.serializer;

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
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz;
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.ClazzDslPackage;
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Import;
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Namespace;
import org.neclipse.xtext.validator.example.clazzdsl.services.ClazzDslGrammarAccess;

@SuppressWarnings("all")
public class ClazzDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ClazzDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ClazzDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ClazzDslPackage.CLAZZ:
				sequence_Clazz(context, (Clazz) semanticObject); 
				return; 
			case ClazzDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case ClazzDslPackage.NAMESPACE:
				sequence_Namespace(context, (Namespace) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Clazz returns Clazz
	 *
	 * Constraint:
	 *     (deprecated?='deprecated'? name=ID)
	 */
	protected void sequence_Clazz(ISerializationContext context, Clazz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Import returns Import
	 *
	 * Constraint:
	 *     importedNamespace=QNameWithWildcard
	 */
	protected void sequence_Import(ISerializationContext context, Import semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ClazzDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ClazzDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Namespace returns Namespace
	 *
	 * Constraint:
	 *     (name=QName imports+=Import* clazz=Clazz)
	 */
	protected void sequence_Namespace(ISerializationContext context, Namespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
