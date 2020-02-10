/*
 * generated by Xtext 2.20.0
 */
package org.xtext.example.mydsl.tests

import com.google.inject.Inject
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.resource.XtextResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.util.StringInputStream
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.example.mydsl.myDsl.Model
import org.xtext.example.mydsl.myDsl.MyDslFactory

@RunWith(XtextRunner)
@InjectWith(MyDslInjectorProvider)
class MyDslParsingTest {

	@Test
	def void simpleTest() {
		val resourceSet = new ResourceSetImpl

		val FACTORY = MyDslFactory.eINSTANCE

		// Save ModelA in the ResourceA
		val modelA = FACTORY.createModel
		val greetingA = FACTORY.createGreeting
		greetingA.name = "A"
		modelA.greetings.add(greetingA)
		val resourceA = resourceSet.createResource(URI.createURI("resourceA.mydsl", false))
		resourceA.contents.add(modelA)
		resourceA.save(Collections.emptyMap)

		// Save ModelB in the ResourceB
		val modelB = FACTORY.createModel
		val greetingB = FACTORY.createGreeting
		greetingB.name = "B"
		greetingB.from = greetingA
		modelB.greetings.add(greetingB)
		val resourceB = resourceSet.createResource(URI.createURI("resourceB.mydsl", false))
		resourceB.contents.add(modelB)
		resourceB.save(Collections.emptyMap)

		// Save ModelC in the ResourceC
		val modelC = FACTORY.createModel
		val greetingC = FACTORY.createGreeting
		greetingC.name = "C"
		greetingC.from = greetingB
		modelC.greetings.add(greetingC)
		val resourceC = resourceSet.createResource(URI.createURI("resourceC.mydsl", false))
		resourceC.contents.add(modelC)
		resourceC.save(Collections.emptyMap)
	}

	@Test
	def void simpleTest02() {
		val resourceSet = new XtextResourceSet

		val resourceA = resourceSet.createResource(URI.createURI("resourceA.mydsl", false))
		resourceA.load(new StringInputStream("Hello A!"), Collections.emptyMap)
		resourceA.save(Collections.emptyMap)

		val resourceB = resourceSet.createResource(URI.createURI("resourceB.mydsl", false))
		resourceB.load(new StringInputStream("Hello B from A!"), Collections.emptyMap)
		resourceB.save(Collections.emptyMap)

		val resourceC = resourceSet.createResource(URI.createURI("resourceC.mydsl", false))
		resourceC.load(new StringInputStream("Hello C from B!"), Collections.emptyMap)
		resourceC.save(Collections.emptyMap)
	}

	@Inject
	ParseHelper<Model> parseHelper

	@Test
	def void simpleTest03() {
		val resourceSet = new XtextResourceSet

		val resultA = parseHelper.parse('''
			Hello A!
		''')
		Assert.assertNotNull(resultA)
		val resourceA = resourceSet.createResource(URI.createPlatformResourceURI("resourceA.mydsl", false))
		resourceA.contents.add(resultA)
		resourceA.save(Collections.emptyMap)

		val resultB = parseHelper.parse('''
			Hello B from A!
		''')
		Assert.assertNotNull(resultB)
		val resourceB = resourceSet.createResource(URI.createPlatformResourceURI("resourceB.mydsl", false))
		resourceB.contents.add(resultB)
		resourceB.save(Collections.emptyMap)

		val resultC = parseHelper.parse('''
			Hello C from B!
		''')
		Assert.assertNotNull(resultC)
		val resourceC = resourceSet.createResource(URI.createPlatformResourceURI("resourceC.mydsl", false))
		resourceC.contents.add(resultC)
		resourceC.save(Collections.emptyMap)
	}
}
