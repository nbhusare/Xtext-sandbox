package org.neclipse.xtext.training.smallJava.ui.contentassist;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.neclipse.xtext.training.smallJava.services.SmallJavaDslGrammarAccess;
import org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass;

import com.google.common.base.Predicate;
import com.google.inject.Inject;

public class SmallJavaDslProposalProvider extends AbstractSmallJavaDslProposalProvider {

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	private SmallJavaDslGrammarAccess grammarAccess;

	@Override
	public void completeSmallClass_SuperClass(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		lookupCrossReference(((CrossReference) assignment.getTerminal()), context, acceptor,
				new Predicate<IEObjectDescription>() {

					@Override
					public boolean apply(IEObjectDescription eod) {
						String className = ((SmallClass) model).getName();
						return !eod.getName().equals(qualifiedNameConverter.toQualifiedName(className));
					}
				});
	}

	@Override
	public void complete_BasicType(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		final List<AbstractElement> elements = grammarAccess.getBasicTypeAccess().getAlternatives().getElements();
		for (AbstractElement abstractElement : elements) {
			final Keyword keyword = (Keyword) abstractElement;
			acceptor.accept(createCompletionProposal(keyword.getValue(), context));
		}
	}
}
