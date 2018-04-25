/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl

import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy
import org.eclipse.xtext.resource.IResourceDescription
import org.neclipse.xtext.validator.example.clazzdsl.descriptions.ClazzDslResourceDescriptionManager
import org.neclipse.xtext.validator.example.clazzdsl.descriptions.ClazzDslResourceDescriptionStrategy

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
class ClazzDslRuntimeModule extends AbstractClazzDslRuntimeModule {

	def Class<? extends IResourceDescription.Manager> bindIResourceDescriptionManager() {
		return ClazzDslResourceDescriptionManager
	}

//	def Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
//		return ClazzDslResourceDescriptionStrategy
//	}

}
