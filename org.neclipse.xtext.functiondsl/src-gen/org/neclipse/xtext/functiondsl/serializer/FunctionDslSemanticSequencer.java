package org.neclipse.xtext.functiondsl.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.neclipse.xtext.functiondsl.functionDsl.EntityAttribute;
import org.neclipse.xtext.functiondsl.functionDsl.Function;
import org.neclipse.xtext.functiondsl.functionDsl.FunctionDslPackage;
import org.neclipse.xtext.functiondsl.functionDsl.Parameter;
import org.neclipse.xtext.functiondsl.functionDsl.VariableDeclaration;
import org.neclipse.xtext.functiondsl.services.FunctionDslGrammarAccess;
import org.neclipse.xtext.parentdsl.parentDsl.Artifact;
import org.neclipse.xtext.parentdsl.parentDsl.Import;
import org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration;
import org.neclipse.xtext.parentdsl.parentDsl.NamespaceDeclaration;
import org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition;
import org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage;
import org.neclipse.xtext.parentdsl.serializer.ParentDslSemanticSequencer;

@SuppressWarnings("all")
public class FunctionDslSemanticSequencer extends ParentDslSemanticSequencer {

	@Inject
	private FunctionDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == FunctionDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case FunctionDslPackage.ENTITY_ATTRIBUTE:
				if(context == grammarAccess.getEntityAttributeRule() ||
				   context == grammarAccess.getEntityAttributeAccess().getEntityAttributeRefAction_2_0()) {
					sequence_EntityAttribute(context, (EntityAttribute) semanticObject); 
					return; 
				}
				else break;
			case FunctionDslPackage.FUNCTION:
				if(context == grammarAccess.getFunctionRule()) {
					sequence_Function(context, (Function) semanticObject); 
					return; 
				}
				else break;
			case FunctionDslPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case FunctionDslPackage.VARIABLE_DECLARATION:
				if(context == grammarAccess.getVariableDeclarationRule()) {
					sequence_VariableDeclaration(context, (VariableDeclaration) semanticObject); 
					return; 
				}
				else break;
			}
		else if(semanticObject.eClass().getEPackage() == ParentDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ParentDslPackage.ARTIFACT:
				if(context == grammarAccess.getArtifactRule()) {
					sequence_Artifact(context, (Artifact) semanticObject); 
					return; 
				}
				else break;
			case ParentDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case ParentDslPackage.IMPORT_DECLARATION:
				if(context == grammarAccess.getImportDeclarationRule()) {
					sequence_ImportDeclaration(context, (ImportDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ParentDslPackage.NAMESPACE_DECLARATION:
				if(context == grammarAccess.getNamespaceDeclarationRule()) {
					sequence_NamespaceDeclaration(context, (NamespaceDeclaration) semanticObject); 
					return; 
				}
				else break;
			case ParentDslPackage.NAMESPACE_DEFINITION:
				if(context == grammarAccess.getNamespaceDefinitionRule()) {
					sequence_NamespaceDefinition(context, (NamespaceDefinition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((ref=EntityAttribute_EntityAttribute_2_0 attribute=[Attribute|ID]) | entityReference=[Parameter|ID])
	 */
	protected void sequence_EntityAttribute(EObject context, EntityAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (parameters+=Parameter parameters+=Parameter*)? variableDeclaration=VariableDeclaration)
	 */
	protected void sequence_Function(EObject context, Function semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namespaceDeclaration=NamespaceDeclaration importDeclaration=ImportDeclaration artifact=Function)
	 */
	protected void sequence_NamespaceDefinition(EObject context, NamespaceDefinition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, ParentDslPackage.Literals.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParentDslPackage.Literals.NAMESPACE_DEFINITION__NAMESPACE_DECLARATION));
			if(transientValues.isValueTransient(semanticObject, ParentDslPackage.Literals.NAMESPACE_DEFINITION__IMPORT_DECLARATION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParentDslPackage.Literals.NAMESPACE_DEFINITION__IMPORT_DECLARATION));
			if(transientValues.isValueTransient(semanticObject, ParentDslPackage.Literals.NAMESPACE_DEFINITION__ARTIFACT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ParentDslPackage.Literals.NAMESPACE_DEFINITION__ARTIFACT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceDefinitionAccess().getNamespaceDeclarationNamespaceDeclarationParserRuleCall_0_0(), semanticObject.getNamespaceDeclaration());
		feeder.accept(grammarAccess.getNamespaceDefinitionAccess().getImportDeclarationImportDeclarationParserRuleCall_1_0(), semanticObject.getImportDeclaration());
		feeder.accept(grammarAccess.getNamespaceDefinitionAccess().getArtifactFunctionParserRuleCall_2_0(), semanticObject.getArtifact());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID array?='[]'? dataType=[Entity|ID])
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entityAttribute=EntityAttribute)
	 */
	protected void sequence_VariableDeclaration(EObject context, VariableDeclaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, FunctionDslPackage.Literals.VARIABLE_DECLARATION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FunctionDslPackage.Literals.VARIABLE_DECLARATION__NAME));
			if(transientValues.isValueTransient(semanticObject, FunctionDslPackage.Literals.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, FunctionDslPackage.Literals.VARIABLE_DECLARATION__ENTITY_ATTRIBUTE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getVariableDeclarationAccess().getEntityAttributeEntityAttributeParserRuleCall_3_0(), semanticObject.getEntityAttribute());
		feeder.finish();
	}
}
