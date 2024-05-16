package rasvhw.worldofcolor.recipes;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.util.RecipeEntrypoint;

import java.util.ArrayList;

import static org.apache.log4j.builders.appender.SocketAppenderBuilder.LOGGER;
import static rasvhw.worldofcolor.WorldOfColor.MOD_ID;
import static rasvhw.worldofcolor.block.WorldOfColorBlocks.*;

public class WorldOfColorRecipes implements RecipeEntrypoint {
	@Override
	public void initNamespaces() {
		Registries.ITEM_GROUPS.register("worldofcolor:glasses", Registries.stackListOf(
			Block.glass,
			glassWhitePainted,
			glassSilverPainted,
			glassGrayPainted,
			glassBlackPainted,
			glassRedPainted,
			glassBrownPainted,
			glassOrangePainted,
			glassYellowPainted,
			glassGreenPainted,
			glassLimePainted,
			glassLightBluePainted,
			glassCyanPainted,
			glassBluePainted,
			glassPurplePainted,
			glassMagentaPainted,
			glassPinkPainted
		));
	}

	@Override
	public void onRecipesReady() {
		//RecipeBuilder.Shaped(MOD_ID)
		//			.setShape("1", "2")
		//			.addInput('1', Block.blockClay)
		//			.addInput('2', Block.sand)
		//			.create("grey_soldier", new ItemStack(greyDoll, 4));


		//CRAFT STAINED GLASS BLOCKS
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,0))
			.create("black_stained_glass",new ItemStack(glassBlackPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,1))
			.create("red_stained_glass",new ItemStack(glassRedPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,2))
			.create("green_stained_glass",new ItemStack(glassGreenPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,3))
			.create("brown_stained_glass",new ItemStack(glassBrownPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,4))
			.create("blue_stained_glass",new ItemStack(glassBluePainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,5))
			.create("purple_stained_glass",new ItemStack(glassPurplePainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,6))
			.create("cyan_stained_glass",new ItemStack(glassCyanPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,7))
			.create("light_gray_stained_glass",new ItemStack(glassSilverPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,8))
			.create("gray_stained_glass",new ItemStack(glassGrayPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,9))
			.create("pink_stained_glass",new ItemStack(glassPinkPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,10))
			.create("lime_stained_glass",new ItemStack(glassLimePainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,11))
			.create("yellow_stained_glass",new ItemStack(glassYellowPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,12))
			.create("light_blue_stained_glass",new ItemStack(glassLightBluePainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,13))
			.create("magenta_stained_glass",new ItemStack(glassMagentaPainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,14))
			.create("orange_stained_glass",new ItemStack(glassOrangePainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1', "worldofcolor:glasses")
			.addInput('2', new ItemStack(Item.dye,1,15))
			.create("white_stained_glass",new ItemStack(glassWhitePainted,8));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","121","111")
			.addInput('1',"worldofcolor:glasses")
			.addInput('2',Item.bucketWater)
			.create("glass",new ItemStack(Block.glass,8));


		//CREATE STAINED GLASS TRAPDOORS
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassBlackPainted)
			.create("black_stained_glass_trapdoor",new ItemStack(trapdoorGlassBlackPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassRedPainted)
			.create("red_stained_glass_trapdoor",new ItemStack(trapdoorGlassRedPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassGreenPainted)
			.create("green_stained_glass_trapdoor",new ItemStack(trapdoorGlassGreenPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassBrownPainted)
			.create("brown_stained_glass_trapdoor",new ItemStack(trapdoorGlassBrownPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassBluePainted)
			.create("blue_stained_glass_trapdoor",new ItemStack(trapdoorGlassBluePainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassPurplePainted)
			.create("purple_stained_glass_trapdoor",new ItemStack(trapdoorGlassPurplePainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassCyanPainted)
			.create("cyan_stained_glass_trapdoor",new ItemStack(trapdoorGlassCyanPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassSilverPainted)
			.create("light_gray_stained_glass_trapdoor",new ItemStack(trapdoorGlassSilverPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassGrayPainted)
			.create("gray_stained_glass_trapdoor",new ItemStack(trapdoorGlassGrayPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassPinkPainted)
			.create("pink_stained_glass_trapdoor",new ItemStack(trapdoorGlassPinkPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassLimePainted)
			.create("lime_stained_glass_trapdoor",new ItemStack(trapdoorGlassLimePainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassYellowPainted)
			.create("yellow_stained_glass_trapdoor",new ItemStack(trapdoorGlassYellowPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassLightBluePainted)
			.create("light_blue_stained_glass_trapdoor",new ItemStack(trapdoorGlassLightBluePainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassMagentaPainted)
			.create("magenta_stained_glass_trapdoor",new ItemStack(trapdoorGlassMagentaPainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassOrangePainted)
			.create("orange_stained_glass_trapdoor",new ItemStack(trapdoorGlassOrangePainted,6));
		RecipeBuilder.Shaped(MOD_ID)
			.setShape("111","111")
			.addInput('1', glassWhitePainted)
			.create("white_stained_glass_trapdoor",new ItemStack(trapdoorGlassWhitePainted,6));
	}
}
