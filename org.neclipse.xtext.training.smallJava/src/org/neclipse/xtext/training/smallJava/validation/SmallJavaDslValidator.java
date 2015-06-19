package org.neclipse.xtext.training.smallJava.validation;

import java.util.Set;

import org.eclipse.xtext.validation.Check;
import org.neclipse.xtext.training.smallJava.smallJavaDsl.Attribute;
import org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallClass;
import org.neclipse.xtext.training.smallJava.smallJavaDsl.SmallJavaDslPackage;

import com.google.common.collect.Sets;

public class SmallJavaDslValidator extends AbstractSmallJavaDslValidator {

	@Check
	public final void checkClassNameStartsWithCapital(
			final SmallClass smallClass) {
		if (Character.isLowerCase(smallClass.getName().charAt(0))) {
			warning("Class name should start with upper case",
					SmallJavaDslPackage.Literals.SMALL_CLASS__NAME,
					ValidationConstants.INVALID_CLASS_NAME,
					smallClass.getName());
		}
	}

	@Check
	public final void checkAttributeNameStartsWithLowerCase(
			final Attribute attribute) {
		if (Character.isUpperCase(attribute.getName().charAt(0))) {
			warning("Attribute name should start with lower case",
					SmallJavaDslPackage.Literals.ATTRIBUTE__NAME,
					ValidationConstants.INVALID_ATTRIBUTE_NAME,
					attribute.getName());
		}
	}

	@Check
	public final void checkClassForInvalidHierarchy(final SmallClass smallClass) {
		if (smallClass == smallClass.getSuperClass()) {
			error(smallClass.getName() + " cannot extend itself",
					SmallJavaDslPackage.Literals.SMALL_CLASS__SUPER_CLASS,
					ValidationConstants.INVALID_SUPER_CLASS, smallClass
							.getSuperClass().getName());
		}
	}

	@Check
	public final void checkNoCycleInEntityHierarchy(final SmallClass smallClass) {
		if (smallClass.getSuperClass() == null) {
			return;
		}

		final Set<SmallClass> visitedEntities = Sets.newHashSet();
		visitedEntities.add(smallClass);

		SmallClass current = smallClass.getSuperClass();
		while (current != null) {
			if (visitedEntities.contains(current)) {
				error("cycle in hierarchy of entity '" + current.getName()
						+ "'",
						SmallJavaDslPackage.Literals.SMALL_CLASS__SUPER_CLASS,
						ValidationConstants.HIERARCHY_CYCLE, smallClass
								.getSuperClass().getName());
				return;
			}

			visitedEntities.add(current);
			current = current.getSuperClass();
		}

	}
}
