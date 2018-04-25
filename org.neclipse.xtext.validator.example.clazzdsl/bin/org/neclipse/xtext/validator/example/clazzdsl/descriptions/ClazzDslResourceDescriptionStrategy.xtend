/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.descriptions

import com.google.common.collect.ImmutableMap
import com.google.common.collect.ImmutableMap.Builder
import org.apache.log4j.Logger
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy
import org.eclipse.xtext.util.IAcceptor
import org.neclipse.xtext.validator.example.clazzdsl.clazzDsl.Clazz

class ClazzDslResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	private final static Logger LOG = Logger.getLogger(ClazzDslResourceDescriptionStrategy)

	private static val DEPRECATED = "deprecated"

	override createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (qualifiedNameProvider !== null) {
			try {
				val qualifiedName = qualifiedNameProvider.getFullyQualifiedName(eObject)
				if (qualifiedName !== null) {
					acceptor.accept(EObjectDescription.create(qualifiedName, eObject, createUserData(eObject)));
					return true
				}
			} catch (Exception exc) {
				LOG.error(exc.getMessage(), exc);
			}
		}
		return false
	}

	def createUserData(EObject eObject) {
		val Builder<String, String> userData = ImmutableMap.builder()
		if (eObject instanceof Clazz) {
			userData.put(DEPRECATED, Boolean.toString(eObject.isDeprecated))
		}
		return userData.build
	}
}
