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
	public static Block glassCyanPainted;
	public static Block glassBluePainted;
	public static Block glassPurplePainted;
	public static Block glassMagentaPainted;
	public static Block glassPinkPainted;

	public static Block trapdoorGlassWhitePainted;
	public static Block trapdoorGlassSilverPainted;
	public static Block trapdoorGlassGrayPainted;
	public static Block trapdoorGlassBlackPainted;
	public static Block trapdoorGlassRedPainted;
	public static Block trapdoorGlassBrownPainted;
	public static Block trapdoorGlassOrangePainted;
	public static Block trapdoorGlassYellowPainted;
	public static Block trapdoorGlassGreenPainted;
	public static Block trapdoorGlassLimePainted;
	public static Block trapdoorGlassLightBluePainted;
	public static Block trapdoorGlassCyanPainted;
	public static Block trapdoorGlassBluePainted;
	public static Block trapdoorGlassPurplePainted;
	public static Block trapdoorGlassMagentaPainted;
	public static Block trapdoorGlassPinkPainted;


	public void initializeBlocks(){
		glassWhitePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockGlass("glass.white.painted", 2800, Material.glass, false));
		glassSilverPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_silver.png")
			.build(new BlockGlass("glass.silver.painted", 2801, Material.glass, false));
		glassGrayPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_gray.png")
			.build(new BlockGlass("glass.gray.painted", 2802, Material.glass, false));
		glassBlackPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_black.png")
			.build(new BlockGlass("glass.black.painted", 2803, Material.glass, false));
		glassRedPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_red.png")
			.build(new BlockGlass("glass.red.painted", 2804, Material.glass, false));
		glassBrownPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_brown.png")
			.build(new BlockGlass("glass.brown.painted", 2805, Material.glass, false));
		glassOrangePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted", 2806, Material.glass, false));
		glassYellowPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_yellow.png")
			.build(new BlockGlass("glass.yellow.painted", 2807, Material.glass, false));
		glassGreenPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_green.png")
			.build(new BlockGlass("glass.green.painted", 2808, Material.glass, false));
		glassLimePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_lime.png")
			.build(new BlockGlass("glass.lime.painted", 2809, Material.glass, false));
		glassLightBluePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_lightblue.png")
			.build(new BlockGlass("glass.light.blue.painted", 2810, Material.glass, false));
		glassCyanPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_cyan.png")
			.build(new BlockGlass("glass.cyan.painted", 2811, Material.glass, false));
		glassBluePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_blue.png")
			.build(new BlockGlass("glass.blue.painted", 2812, Material.glass, false));
		glassPurplePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_purple.png")
			.build(new BlockGlass("glass.purple.painted", 2813, Material.glass, false));
		glassMagentaPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_magenta.png")
			.build(new BlockGlass("glass.magenta.painted", 2814, Material.glass, false));
		glassPinkPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_pink.png")
			.build(new BlockGlass("glass.pink.painted", 2815, Material.glass, false));

		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.white.painted",2816,Material.glass,false));
		trapdoorGlassSilverPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_silver.png")
			.build(new BlockTrapDoor("trapdoor.glass.silver.painted",2817,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.gray.painted",2818,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.black.painted",2819,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.red.painted",2820,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.brown.painted",2821,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.orange.painted",2822,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.yellow.painted",2823,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.green.painted",2824,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.lime.painted",2825,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.light.blue.painted",2826,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.cyan.painted",2827,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.blue.painted",2828,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.purple.painted",2829,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.magenta.painted",2830,Material.glass,false));
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockTrapDoor("trapdoor.glass.pink.painted",2831,Material.glass,false));

		LOGGER.info("WorldOfColorBlocks initialized");
	}
}
