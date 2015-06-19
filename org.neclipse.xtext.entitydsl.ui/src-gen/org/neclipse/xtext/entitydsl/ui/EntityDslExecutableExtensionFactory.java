/*
 * generated by Xtext
 */
package org.neclipse.xtext.entitydsl.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.neclipse.xtext.entitydsl.ui.internal.EntityDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntityDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EntityDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EntityDslActivator.getInstance().getInjector(EntityDslActivator.ORG_NECLIPSE_XTEXT_ENTITYDSL_ENTITYDSL);
	}
	
}