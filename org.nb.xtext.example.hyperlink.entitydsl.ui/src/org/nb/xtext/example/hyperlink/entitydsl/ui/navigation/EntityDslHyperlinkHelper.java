/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.ui.navigation;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.common.types.xtext.ui.TypeAwareHyperlinkHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkAcceptor;
import org.eclipse.xtext.util.ITextRegion;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.EntityDslPackage;
import org.nb.xtext.example.hyperlink.entitydsl.entityDsl.Import;
import org.nb.xtext.example.hyperlink.entitydsl.index.EntityDslIndex;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import com.google.inject.Inject;

/**
 * @author Neeraj Bhusare - Initial contribution and API
 */
public class EntityDslHyperlinkHelper extends TypeAwareHyperlinkHelper {

	private static final Logger LOG = Logger.getLogger(EntityDslHyperlinkHelper.class);

	@Inject
	private IQualifiedNameConverter.DefaultImpl qNameConvertor;

	@Inject
	private EntityDslIndex entityDslIndex;

	@Override
	public void createHyperlinksByOffset(XtextResource resource, int offset, IHyperlinkAcceptor acceptor) {
		final EObject eObject = getEObjectAtOffsetHelper().resolveElementAt(resource, offset);
		if (eObject instanceof Import) {
			final ImportWrapper iImport = new ImportWrapper((Import) eObject);
			if (!iImport.isWildcard()) {
				final Optional<ITextRegion> textRegion = getTextRegion(iImport.getiImport(), offset);
				if (textRegion.isPresent()) {
					final Region region = new Region(textRegion.get().getOffset(), textRegion.get().getLength());
					final Optional<EObject> importedEntity = iImport.getImportedEntity();
					if (importedEntity.isPresent())
						this.createHyperlinksTo(resource, region, importedEntity.get(), acceptor);
					return;
				}
			}
		}
		super.createHyperlinksByOffset(resource, offset, acceptor);
	}

	protected Optional<ITextRegion> getTextRegion(Import iImport, final int offset) {
		final List<INode> nodes = NodeModelUtils.findNodesForFeature(iImport,
				EntityDslPackage.Literals.IMPORT__IMPORTED_NAMESPACE);
		return nodes.stream().map(INode::getTextRegion).filter(textRegion -> textRegion.contains(offset)).findFirst();
	}

	private class ImportWrapper {

		private final Import iImport;

		public ImportWrapper(final Import iImport) {
			this.iImport = iImport;
		}

		public Import getiImport() {
			return iImport;
		}

		protected boolean isWildcard() {
			final QualifiedName qualifiedImport = qNameConvertor.toQualifiedName(iImport.getImportedNamespace());
			return qualifiedImport.getLastSegment().equals("*");
		}

		protected Optional<EObject> getImportedEntity() {
			final QualifiedName entityQName = qNameConvertor.toQualifiedName(iImport.getImportedNamespace());
			final IEObjectDescription importedEod = entityDslIndex.getEntity(entityQName, iImport);
			if (importedEod == null)
				return Optional.empty();

			final EObject eObject = importedEod.getEObjectOrProxy();
			final EObject resolved = eObject.eIsProxy()
					? EcoreUtil.resolve(eObject, iImport.eResource().getResourceSet())
					: eObject;
			return Optional.of(resolved);
		}

	}
}
