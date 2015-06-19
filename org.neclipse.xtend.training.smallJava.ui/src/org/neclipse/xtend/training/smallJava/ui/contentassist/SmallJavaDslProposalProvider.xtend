/*
 * generated by Xtext
 */
package org.neclipse.xtend.training.smallJava.ui.contentassist

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.CrossReference
import org.eclipse.xtext.RuleCall
import org.eclipse.xtext.naming.IQualifiedNameConverter
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.neclipse.xtend.training.smallJava.services.SmallJavaDslGrammarAccess
import org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallClass
import org.eclipse.xtext.Keyword

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to customize content assistant
 */
class SmallJavaDslProposalProvider extends AbstractSmallJavaDslProposalProvider {

	@Inject
	private extension IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;

	override completeSmallClass_SuperClass(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(assignment.getTerminal() as CrossReference, context, acceptor, [eod |
			val className = (model as SmallClass).name
			!eod.name.equals(className.toQualifiedName)
		]);
	}

	override complete_BasicType(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val elements = grammarAccess.basicTypeAccess.alternatives.elements
		elements.forEach[element |
			val keyword = element as Keyword
			acceptor.accept(createCompletionProposal(keyword.getValue, context));
		]
	}

}