package rasvhw.worldofcolor;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rasvhw.worldofcolor.block.WorldOfColorBlocks;
import rasvhw.worldofcolor.recipes.WorldOfColorRecipes;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;


public class WorldOfColor implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
    public static final String MOD_ID = "worldofcolor";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("WorldOfColor initialized.");
    }

	@Override
	public void beforeGameStart() {
		new WorldOfColorBlocks().initializeBlocks();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		new WorldOfColorRecipes().initializeRecipes();
	}

	@Override
	public void initNamespaces() {

	}
}
