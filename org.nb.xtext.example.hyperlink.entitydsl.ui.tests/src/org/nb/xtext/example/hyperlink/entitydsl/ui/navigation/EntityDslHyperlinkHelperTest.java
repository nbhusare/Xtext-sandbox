/**
 * 
 */
package org.nb.xtext.example.hyperlink.entitydsl.ui.navigation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.ui.editor.hyperlinking.IHyperlinkHelper;
import org.eclipse.xtext.util.StringInputStream;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

/**
 * @author Neeraj Bhusare
 */
@RunWith(XtextRunner.class)
@InjectWith(TestEntityDslUiInjectorProvider.class)
public class EntityDslHyperlinkHelperTest {

	@Inject
	private IHyperlinkHelper hyperlinkHelper;

	@Test
	public void testHyperlinkDetectionForImports() throws Exception {
		final XtextResourceSet resourceSet = new XtextResourceSet();

		final String firstEntity = "namespace org.ne.example.entities" + " model First";
		final Resource firstResource = resourceSet.createResource(URI.createURI("first.entity"));
		firstResource.load(new StringInputStream(firstEntity), null);

		final String secondEntity = "namespace org.ne.example.entities" + " import org.ne.example.entities.First"
				+ " model Second extends First";
		final Resource secondResource = resourceSet.createResource(URI.createURI("second.entity"));
		secondResource.load(new StringInputStream(secondEntity), null);

		IHyperlink[] hyperlinks = hyperlinkHelper.createHyperlinksByOffset((XtextResource) secondResource,
				secondEntity.indexOf("org.ne.example.entities.First"), false);
		Assert.assertEquals(1, hyperlinks.length);

		final String thirdEntity = "namespace org.ne.example.entities" + " import org.ne.example.entities.Zee"
				+ " model Second extends First";
		final Resource thirdResource = resourceSet.createResource(URI.createURI("third.entity"));
		thirdResource.load(new StringInputStream(thirdEntity), null);

		hyperlinks = hyperlinkHelper.createHyperlinksByOffset((XtextResource) thirdResource,
				thirdEntity.indexOf("org.ne.example.entities.Zee"), false);
		Assert.assertNull(hyperlinks);
	}

}
