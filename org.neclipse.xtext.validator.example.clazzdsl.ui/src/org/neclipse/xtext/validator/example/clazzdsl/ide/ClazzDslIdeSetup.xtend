/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.neclipse.xtext.validator.example.clazzdsl.ClazzDslRuntimeModule
import org.neclipse.xtext.validator.example.clazzdsl.ClazzDslStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class ClazzDslIdeSetup extends ClazzDslStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new ClazzDslRuntimeModule, new ClazzDslIdeModule))
	}
	
}
