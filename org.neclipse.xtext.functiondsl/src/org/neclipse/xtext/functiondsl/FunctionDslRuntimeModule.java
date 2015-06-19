/*
 * generated by Xtext
 */
package org.neclipse.xtext.functiondsl;

import org.neclipse.xtext.functiondsl.scoping.FunctionImportedNamespaceAwareLocalScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class FunctionDslRuntimeModule extends
		org.neclipse.xtext.functiondsl.AbstractFunctionDslRuntimeModule {

	@Override
	public final void configureIScopeProviderDelegate(
			final com.google.inject.Binder binder) {
		binder.bind(org.eclipse.xtext.scoping.IScopeProvider.class)
				.annotatedWith(
						com.google.inject.name.Names
								.named(org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
				.to(FunctionImportedNamespaceAwareLocalScopeProvider.class);
	}
}