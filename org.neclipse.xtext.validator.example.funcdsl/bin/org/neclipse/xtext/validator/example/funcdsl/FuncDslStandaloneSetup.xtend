/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.funcdsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class FuncDslStandaloneSetup extends FuncDslStandaloneSetupGenerated {

	def static void doSetup() {
		new FuncDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
