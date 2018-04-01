/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.ui.tests;

import org.eclipse.xtext.testing.IInjectorProvider;
import org.nb.xtext.example.hyperlink.entitydsl.ui.internal.EntitydslActivator;

import com.google.inject.Injector;

public class EntityDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return EntitydslActivator.getInstance().getInjector("org.nb.xtext.example.hyperlink.entitydsl.EntityDsl");
	}
	
}
