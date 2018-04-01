package org.nb.xtext.example.hyperlink.entitydsl.ui.navigation;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IContainer.Manager;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ChunkedResourceDescriptions;
import org.eclipse.xtext.resource.impl.DefaultResourceDescription;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsBasedContainer;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsData;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;
import org.eclipse.xtext.ui.shared.SharedStateModule;
import org.eclipse.xtext.util.Modules2;
import org.nb.xtext.example.hyperlink.entitydsl.EntityDslRuntimeModule;
import org.nb.xtext.example.hyperlink.entitydsl.ui.EntityDslUiModule;
import org.nb.xtext.example.hyperlink.entitydsl.ui.internal.EntitydslActivator;
import org.nb.xtext.example.hyperlink.entitydsl.ui.tests.EntityDslUiInjectorProvider;

import com.google.common.collect.Maps;
import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;

public class TestEntityDslUiInjectorProvider extends EntityDslUiInjectorProvider {

	@Override
	public Injector getInjector() {
		final Module runtimeModule = new TestEntityDslRuntimeModule();
		final Module sharedStateModule = new TestSharedStateModule();
		final Module uiModule = new EntityDslUiModule(EntitydslActivator.getInstance());
		final Module mergedModule = Modules2.mixin(runtimeModule, sharedStateModule, uiModule);
		return Guice.createInjector(mergedModule);
	}

	private static class TestEntityDslRuntimeModule extends EntityDslRuntimeModule {

		@Override
		public Class<? extends Manager> bindIContainer$Manager() {
			return TestContainerManager.class;
		}
	}

	private static class TestSharedStateModule extends SharedStateModule {

		public void configureResourceDescriptionsProvider(Binder binder) {
			binder.install(new AbstractModule() {
				@Override
				protected void configure() {
					bind(ResourceDescriptionsProvider.class).to(TestResourceDescriptionsProvider.class);
				}
			});
		}
	}

	public static class TestResourceDescriptionsProvider extends ResourceDescriptionsProvider {

		@Inject
		private IDefaultResourceDescriptionStrategy resourceDescStrategy;

		@Override
		public IResourceDescriptions getResourceDescriptions(ResourceSet resourceSet) {
			final List<IResourceDescription> resourceDescriptions = resourceSet.getResources().stream()
					.map(res -> getResourceDescription(res)).collect(Collectors.toList());
			final Map<String, ResourceDescriptionsData> chunk = Maps.newHashMap();
			chunk.put("chunk", new ResourceDescriptionsData(resourceDescriptions));
			return new ChunkedResourceDescriptions(chunk);
		}

		private IResourceDescription getResourceDescription(Resource resource) {
			return new DefaultResourceDescription(resource, resourceDescStrategy);
		}

	}

	public static class TestContainerManager extends SimpleResourceDescriptionsBasedContainerManager {

		@Override
		public List<IContainer> getVisibleContainers(IResourceDescription desc,
				IResourceDescriptions resourceDescriptions) {
			return Collections.singletonList(new ResourceDescriptionsBasedContainer(resourceDescriptions));
		}
	}

}
