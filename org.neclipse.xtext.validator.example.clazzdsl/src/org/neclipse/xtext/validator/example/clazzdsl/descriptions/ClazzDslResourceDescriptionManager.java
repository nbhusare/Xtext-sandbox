/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.neclipse.xtext.validator.example.clazzdsl.descriptions;

import java.util.Collection;

import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionManager;

import com.google.inject.Singleton;

@Singleton
public class ClazzDslResourceDescriptionManager extends DefaultResourceDescriptionManager
		implements IResourceDescription.Manager.AllChangeAware {

	@Override
	public boolean isAffectedByAny(Collection<Delta> deltas, IResourceDescription candidate,
			IResourceDescriptions context) throws IllegalArgumentException {
		return isAffected(deltas, candidate, context);
	}

	@Override
	protected boolean hasChanges(Delta delta, IResourceDescription candidate) {
		return true;
	}
}
