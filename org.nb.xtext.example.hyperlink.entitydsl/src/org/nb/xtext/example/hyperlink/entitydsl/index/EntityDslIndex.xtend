/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.index

import com.google.inject.Inject
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.emf.ecore.EClass
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage

/**
 * @author Neeraj Bhusare - Initial contribution and API
 * https://nbhusare.github.io/main/2017/08/07/enriching-xtext-index-api.htmls
 */
class EntityDslIndex {

	@Inject
	private ResourceDescriptionsProvider resourceDescriptionsProvider

	@Inject
	private IContainer.Manager containerManager

	public def getEntity(QualifiedName qualifiedName, EObject context) {
		context.getVisibleEObjectsByType(EntityDslPackage.Literals.ENTITY).findFirst[it.qualifiedName == qualifiedName]
	}

	public def getVisibleEObjectsByType(EObject context, EClass type) {
		context.visibleContainers.map[getExportedObjectsByType(type)].flatten
	}

	private def getVisibleContainers(EObject context) {
		val resource = context.eResource
		val resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(resource)
		val resourceDescription = resourceDescriptions.getResourceDescription(resource.URI)
		return containerManager.getVisibleContainers(resourceDescription, resourceDescriptions)
	}

}
