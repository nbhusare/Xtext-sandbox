/**
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.nb.xtext.example.hyperlink.entitydsl.index;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage;

/**
 * @author Neeraj Bhusare - Initial contribution and API
 * https://nbhusare.github.io/main/2017/08/07/enriching-xtext-index-api.htmls
 */
@SuppressWarnings("all")
public class EntityDslIndex {
  @Inject
  private ResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  private IContainer.Manager containerManager;
  
  public IEObjectDescription getEntity(final QualifiedName qualifiedName, final EObject context) {
    final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
      QualifiedName _qualifiedName = it.getQualifiedName();
      return Boolean.valueOf(Objects.equal(_qualifiedName, qualifiedName));
    };
    return IterableExtensions.<IEObjectDescription>findFirst(this.getVisibleEObjectsByType(context, EntityDslPackage.Literals.ENTITY), _function);
  }
  
  public Iterable<IEObjectDescription> getVisibleEObjectsByType(final EObject context, final EClass type) {
    final Function1<IContainer, Iterable<IEObjectDescription>> _function = (IContainer it) -> {
      return it.getExportedObjectsByType(type);
    };
    return Iterables.<IEObjectDescription>concat(ListExtensions.<IContainer, Iterable<IEObjectDescription>>map(this.getVisibleContainers(context), _function));
  }
  
  private List<IContainer> getVisibleContainers(final EObject context) {
    final Resource resource = context.eResource();
    final IResourceDescriptions resourceDescriptions = this.resourceDescriptionsProvider.getResourceDescriptions(resource);
    final IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(resource.getURI());
    return this.containerManager.getVisibleContainers(resourceDescription, resourceDescriptions);
  }
}
