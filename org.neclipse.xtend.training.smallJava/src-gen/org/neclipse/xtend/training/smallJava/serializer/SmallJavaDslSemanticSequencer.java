package org.neclipse.xtend.training.smallJava.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.neclipse.xtend.training.smallJava.services.SmallJavaDslGrammarAccess;
import org.neclipse.xtend.training.smallJava.smallJavaDsl.Attribute;
import org.neclipse.xtend.training.smallJava.smallJavaDsl.ClassType;
import org.neclipse.xtend.training.smallJava.smallJavaDsl.DataType;
import org.neclipse.xtend.training.smallJava.smallJavaDsl.Import;
import org.neclipse.xtend.training.smallJava.smallJavaDsl.Namespace;
import org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallClass;
import org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallJavaDslPackage;

@SuppressWarnings("all")
public class SmallJavaDslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == SmallJavaDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case SmallJavaDslPackage.ATTRIBUTE:
				if(context == grammarAccess.getAttributeRule()) {
					sequence_Attribute(context, (Attribute) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaDslPackage.CLASS_TYPE:
				if(context == grammarAccess.getClassTypeRule() ||
				   context == grammarAccess.getDataTypeRule()) {
					sequence_ClassType(context, (ClassType) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaDslPackage.DATA_TYPE:
				if(context == grammarAccess.getDataTypeRule()) {
					sequence_DataType(context, (DataType) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaDslPackage.IMPORT:
				if(context == grammarAccess.getImportRule()) {
					sequence_Import(context, (Import) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaDslPackage.NAMESPACE:
				if(context == grammarAccess.getNamespaceRule()) {
					sequence_Namespace(context, (Namespace) semanticObject); 
					return; 
				}
				else break;
			case SmallJavaDslPackage.SMALL_CLASS:
				if(context == grammarAccess.getSmallClassRule()) {
					sequence_SmallClass(context, (SmallClass) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (datatype=DataType array?='[]'? name=ID)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     type=[SmallClass|ID]
	 */
	protected void sequence_ClassType(EObject context, ClassType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.CLASS_TYPE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.CLASS_TYPE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getClassTypeAccess().getTypeSmallClassIDTerminalRuleCall_0_1(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {DataType}
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, SmallJavaDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=QName imports+=Import* class=SmallClass)
	 */
	protected void sequence_Namespace(EObject context, Namespace semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superClass=[SmallClass|ID]? attributes+=Attribute*)
	 */
	protected void sequence_SmallClass(EObject context, SmallClass semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
