package org.neclipse.xtext.parentdsl.scoping;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;
import org.eclipse.xtext.util.SimpleAttributeResolver;
import org.neclipse.xtext.parentdsl.parentDsl.Import;
import org.neclipse.xtext.parentdsl.parentDsl.ImportDeclaration;
import org.neclipse.xtext.parentdsl.parentDsl.NamespaceDefinition;

import com.google.common.collect.Lists;

public class ParentImportedNamespaceAwareLocalScopeProvider extends
		ImportedNamespaceAwareLocalScopeProvider {

	@Override
	protected List<ImportNormalizer> getImplicitImports(boolean ignoreCase) {
		final List<ImportNormalizer> implicitImports = Lists.newArrayList();

		implicitImports.add(new ImportNormalizer(QualifiedName
				.create(new String[] { "org", "neclipse", "models"}), true,
				ignoreCase));

		return implicitImports;
	}

	@Override
	protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(
			EObject context, boolean ignoreCase) {
		final List<ImportNormalizer> importedNamespaceResolvers = Lists
				.newArrayList();

		if (!(context instanceof NamespaceDefinition)) {
			return importedNamespaceResolvers;
		}

		final NamespaceDefinition namespaceDefinition = (NamespaceDefinition) context;
		
		final SimpleAttributeResolver<EObject, String> importResolver = SimpleAttributeResolver
				.newResolver(String.class, "importedNamespace");

		for (final EObject child : namespaceDefinition.eContents()) {
			if (child instanceof ImportDeclaration) {
				for (final Import imp : ((ImportDeclaration) child)
						.getImports()) {
					final String value = importResolver.getValue(imp);
					final ImportNormalizer resolver = createImportedNamespaceResolver(
							value, ignoreCase);
					if (resolver != null) {
						importedNamespaceResolvers.add(resolver);
					}
				}
			}
		}

		return importedNamespaceResolvers;
	}
	
	@Override
	protected QualifiedName getQualifiedNameOfLocalElement(EObject context) {
		// TODO Auto-generated method stub
		return super.getQualifiedNameOfLocalElement(context);
	}
	
}
