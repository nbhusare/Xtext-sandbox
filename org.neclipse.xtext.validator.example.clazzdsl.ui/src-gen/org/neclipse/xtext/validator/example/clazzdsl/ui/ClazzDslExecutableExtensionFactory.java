/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.neclipse.xtext.validator.example.clazzdsl.ui.internal.ClazzdslActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class ClazzDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return ClazzdslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return ClazzdslActivator.getInstance().getInjector(ClazzdslActivator.ORG_NECLIPSE_XTEXT_VALIDATOR_EXAMPLE_CLAZZDSL_CLAZZDSL);
	}
	
}
