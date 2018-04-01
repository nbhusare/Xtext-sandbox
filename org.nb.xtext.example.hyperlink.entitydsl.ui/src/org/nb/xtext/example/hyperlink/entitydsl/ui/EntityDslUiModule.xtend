/*******************************************************************************
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
*******************************************************************************/
package org.nb.xtext.example.hyperlink.entitydsl.ui

import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.nb.xtext.example.hyperlink.entitydsl.ui.navigation.EntityDslHyperlinkHelper

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class EntityDslUiModule extends AbstractEntityDslUiModule {

	override bindIHyperlinkHelper() {
		return EntityDslHyperlinkHelper
	}

}
