/*
 * generated by Xtext
 */
package org.neclipse.xtend.training.smallJava.validation

import org.eclipse.xtext.validation.Check
import org.neclipse.xtend.training.smallJava.smallJavaDsl.Attribute
import org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallClass
import org.neclipse.xtend.training.smallJava.smallJavaDsl.SmallJavaDslPackage

import static extension java.lang.Character.isLowerCase
import static extension java.lang.Character.isUpperCase

//import org.eclipse.xtext.validation.Check
/**
 * Custom validation rules.
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class SmallJavaDslValidator extends AbstractSmallJavaDslValidator {

	@Check
	def checkClassNameStartsWithCapital(SmallClass smallClass) {
		if (smallClass.name.charAt(0).lowerCase) {
			warning("Class name should start with upper case", SmallJavaDslPackage::Literals.SMALL_CLASS__NAME);
		}
	}

	@Check
	def checkAttributeNameStartsWithLowerCase(Attribute attribute) {
		if (attribute.name.charAt(0).upperCase) {
			warning("Attribute name should start with lower case", SmallJavaDslPackage::Literals.ATTRIBUTE__NAME);
		}
	}

	@Check
	def checkNoCycleInEntityHierarchy(SmallClass smallClass) {
		if(smallClass.superClass == null) return

		val visitedEntities = newArrayList() => [
			add(smallClass)
		]

		var current = smallClass.superClass
		while (current != null) {
			if (visitedEntities.contains(current)) {
				error("cycle in hierarchy of entity '" + current.getName() + "'",
					SmallJavaDslPackage.Literals.SMALL_CLASS__SUPER_CLASS);
				return;
			}

			visitedEntities += current
			current = current.getSuperClass
		}
	}

}