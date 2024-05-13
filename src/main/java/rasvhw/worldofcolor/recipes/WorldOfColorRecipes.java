package rasvhw.worldofcolor.recipes;

import turniplabs.halplibe.util.RecipeEntrypoint;

import static org.apache.log4j.builders.appender.SocketAppenderBuilder.LOGGER;

public class WorldOfColorRecipes implements RecipeEntrypoint {
	@Override
	public void onRecipesReady() {

	}

	@Override
	public void initNamespaces() {

	}

	public void initializeRecipes(){
		onRecipesReady();
		initNamespaces();
		LOGGER.info("World of Color recipes initialized.");
	}
}
