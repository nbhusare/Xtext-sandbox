package org.neclipse.xtext.entitydsl.serializer;

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
import org.neclipse.xtext.entitydsl.entityDsl.Attribute;
import org.neclipse.xtext.entitydsl.entityDsl.Entity;
import org.neclipse.xtext.entitydsl.entityDsl.EntityDslPackage;
import org.neclipse.xtext.entitydsl.entityDsl.EntityReference;
import org.neclipse.xtext.entitydsl.entityDsl.StringType;
import org.neclipse.xtext.entitydsl.services.EntityDslGrammarAccess;
import org.neclipse.xtext.parentdsl.parentDsl.Artifact;
import org.neclipse.xtext.parentdsl.parentDsl.Import;
import org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration;
import org.neclipse.xtext.parentdsl.parentDsl.NamespaceDeclaration;
import org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition;
import org.neclipse.xtext.parentdsl.parentDsl.ParentDslPackage;
import org.neclipse.xtext.parentdsl.serializer.ParentDslSemanticSequencer;

@SuppressWarnings("all")
public class EntityDslSemanticSequencer extends ParentDslSemanticSequencer {

	@Inject
	private EntityDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EntityDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EntityDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.ENTITY:
				if(context == grammarAccess.getEntityRule()) {
					sequence_Entity(context, (Entity) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.ENTITY_REFERENCE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getEntityReferenceRule()) {
					sequence_EntityReference(context, (EntityReference) semanticObject); 
					return; 
				}
				else break;
			case EntityDslPackage.STRING_TYPE:
				if(context == grammarAccess.getDataTypeRule() ||
				   context == grammarAccess.getStringTypeRule()) {
					sequence_StringType(context, (StringType) semanticObject); 
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
	 *     (name=ID type=DataType)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeDataTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     entity=[Entity|ID]
	 */
	protected void sequence_EntityReference(EObject context, EntityReference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EntityDslPackage.Literals.ENTITY_REFERENCE__ENTITY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EntityDslPackage.Literals.ENTITY_REFERENCE__ENTITY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEntityReferenceAccess().getEntityEntityIDTerminalRuleCall_1_0_1(), semanticObject.getEntity());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=Attribute*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (namespaceDeclaration=NamespaceDeclaration importDeclaration=ImportDeclaration artifact=Entity)
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
		feeder.accept(grammarAccess.getNamespaceDefinitionAccess().getArtifactEntityParserRuleCall_2_0(), semanticObject.getArtifact());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name='string' (length=INT defaultValue=STRING?)?)
	 */
	protected void sequence_StringType(EObject context, StringType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
