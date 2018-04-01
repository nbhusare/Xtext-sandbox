/**
 * Copyright (C) 2017 Neeraj Bhusare (https://nbhusare.github.io/)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.nb.xtext.example.hyperlink.entitydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.nb.xtext.example.hyperlink.entitydsl.EntityDslRuntimeModule;
import org.nb.xtext.example.hyperlink.entitydsl.EntityDslStandaloneSetup;
import org.nb.xtext.example.hyperlink.entitydsl.ide.EntityDslIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class EntityDslIdeSetup extends EntityDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    EntityDslRuntimeModule _entityDslRuntimeModule = new EntityDslRuntimeModule();
    EntityDslIdeModule _entityDslIdeModule = new EntityDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_entityDslRuntimeModule, _entityDslIdeModule));
  }
}
