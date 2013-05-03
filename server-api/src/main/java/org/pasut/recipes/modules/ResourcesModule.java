package org.pasut.recipes.modules;

import org.pasut.recipes.resources.IngredientResource;

import com.google.inject.AbstractModule;

public class ResourcesModule extends AbstractModule {

	@Override
	protected void configure() {
		bind(IngredientResource.class);
	}

}
