/*
 * generated by Xtext
 */
package org.neclipse.xtend.training.smallJava.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.neclipse.xtend.training.smallJava.ui.internal.SmallJavaDslActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SmallJavaDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SmallJavaDslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SmallJavaDslActivator.getInstance().getInjector(SmallJavaDslActivator.ORG_NECLIPSE_XTEND_TRAINING_SMALLJAVA_SMALLJAVADSL);
	}
	
}
