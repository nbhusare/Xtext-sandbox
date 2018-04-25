/*******************************************************************************
 * Copyright (C) 2018 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.neclipse.xtext.validator.example.funcdsl.validation

import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.ClassType
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.Func
import org.neclipse.xtext.validator.example.funcdsl.funcDsl.FuncDslPackage

class FuncDslValidator extends AbstractFuncDslValidator {

@Check(CheckType.NORMAL)
def checkFunctionParams(Func func) {
	func.params.forEach [ param, index |
		if (param.dataType instanceof ClassType) {
			val dataType = param.dataType as ClassType
			if (dataType.type.isDeprecated) {
				error("Invalid param " + param.name, param, FuncDslPackage.Literals.PARAM__NAME, index)
			}
		}
	]
}

}
