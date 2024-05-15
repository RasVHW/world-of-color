package rasvhw.worldofcolor.block;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.BlockTrapDoor;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.sound.BlockSound;
import turniplabs.halplibe.helper.BlockBuilder;

import static net.minecraft.core.item.Item.itemsList;
import static org.apache.log4j.builders.appender.SocketAppenderBuilder.LOGGER;
import static rasvhw.worldofcolor.WorldOfColor.MOD_ID;

public class WorldOfColorBlocks {
	public static Block glassWhitePainted;
	public static Block glassSilverPainted;
	public static Block glassGrayPainted;
	public static Block glassBlackPainted;
	public static Block glassRedPainted;
	public static Block glassBrownPainted;
	public static Block glassOrangePainted;
	public static Block glassYellowPainted;
	public static Block glassGreenPainted;
	public static Block glassLimePainted;
	public static Block glassLightBluePainted;
	public static Block glassBluePainted;
	public static Block glassPurplePainted;
	public static Block glassMagentaPainted;
	public static Block glassPinkPainted;


	public static Block trapdoorGlassPainted;


	public void initializeBlocks(){
		glassWhitePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockGlass("glass.white.painted",2800,Material.glass,false));
		glassSilverPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_silver.png")
			.build(new BlockGlass("glass.silver.painted",2801,Material.glass,false));
		glassGrayPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_gray.png")
			.build(new BlockGlass("glass.gray.painted",2802,Material.glass,false));
		glassBlackPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_black.png")
			.build(new BlockGlass("glass.black.painted",2803,Material.glass,false));
		glassRedPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_red.png")
			.build(new BlockGlass("glass.red.painted",2804,Material.glass,false));
		glassBrownPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_brown.png")
			.build(new BlockGlass("glass.brown.painted",2805,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2806,Material.glass,false));
		glassYellowPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_yellow.png")
			.build(new BlockGlass("glass.yellow.painted",2807,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2808,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2809,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2810,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2811,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2812,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2813,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2814,Material.glass,false));
		glassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted",2815,Material.glass,false));



		LOGGER.info("WorldOfColorBlocks initialized");
	}
}
