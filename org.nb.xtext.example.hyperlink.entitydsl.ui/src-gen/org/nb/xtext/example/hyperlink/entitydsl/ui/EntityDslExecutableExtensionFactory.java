/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.ui;

import com.google.inject.Injector;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.nb.xtext.example.hyperlink.entitydsl.ui.internal.EntitydslActivator;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class EntityDslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return EntitydslActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return EntitydslActivator.getInstance().getInjector(EntitydslActivator.ORG_NB_XTEXT_EXAMPLE_HYPERLINK_ENTITYDSL_ENTITYDSL);
	}
	
}
