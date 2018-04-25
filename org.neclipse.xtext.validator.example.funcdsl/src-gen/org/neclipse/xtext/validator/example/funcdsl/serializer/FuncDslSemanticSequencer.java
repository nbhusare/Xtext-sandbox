/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.funcdsl.serializer;

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
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.ClassType;
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.DataType;
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.Func;
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage;
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.Import;
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.Namespace;
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.Param;
import org.neclipse.xtext.validator.example.funcdsl.services.FuncDslGrammarAccess;

@SuppressWarnings("all")
public class FuncDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private FuncDslGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == FuncDslPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case FuncDslPackage.CLASS_TYPE:
				sequence_ClassType(context, (ClassType) semanticObject); 
				return; 
			case FuncDslPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case FuncDslPackage.FUNC:
				sequence_Func(context, (Func) semanticObject); 
				return; 
			case FuncDslPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case FuncDslPackage.NAMESPACE:
				sequence_Namespace(context, (Namespace) semanticObject); 
				return; 
			case FuncDslPackage.PARAM:
				sequence_Param(context, (Param) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DataType returns ClassType
	 *     ClassType returns ClassType
	 *
	 * Constraint:
	 *     type=[Clazz|ID]
	 */
	protected void sequence_ClassType(ISerializationContext context, ClassType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FuncDslPackage.Literals.CLASS_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FuncDslPackage.Literals.CLASS_TYPE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getClassTypeAccess().getTypeClazzIDTerminalRuleCall_0_1(), semanticObject.eGet(FuncDslPackage.Literals.CLASS_TYPE__TYPE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     {DataType}
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Func returns Func
	 *
	 * Constraint:
	 *     (name=ID params+=Param params+=Param*)
	 */
	protected void sequence_Func(ISerializationContext context, Func semanticObject) {
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
			if (transientValues.isValueTransient(semanticObject, FuncDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FuncDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
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
	 *     (name=QName imports+=Import* func=Func)
	 */
	protected void sequence_Namespace(ISerializationContext context, Namespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Param returns Param
	 *
	 * Constraint:
	 *     (dataType=DataType name=ID)
	 */
	protected void sequence_Param(ISerializationContext context, Param semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, FuncDslPackage.Literals.PARAM__DATA_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FuncDslPackage.Literals.PARAM__DATA_TYPE));
			if (transientValues.isValueTransient(semanticObject, FuncDslPackage.Literals.PARAM__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FuncDslPackage.Literals.PARAM__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParamAccess().getDataTypeDataTypeParserRuleCall_0_0(), semanticObject.getDataType());
		feeder.accept(grammarAccess.getParamAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
}
