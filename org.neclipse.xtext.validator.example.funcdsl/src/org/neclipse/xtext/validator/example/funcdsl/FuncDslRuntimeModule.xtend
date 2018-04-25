/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.funcdsl

import org.eclipse.xtext.resource.IResourceDescription
import org.neclipse.xtext.validator.example.funcdsl.descriptions.FuncDslResourceDescriptionManager

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class FuncDslRuntimeModule extends AbstractFuncDslRuntimeModule {
	
	def Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		return FuncDslResourceDescriptionManager
	}
	
}
