package rasvhw.worldofcolor.block;

import net.minecraft.client.render.block.model.BlockModelRenderBlocks;
import net.minecraft.core.block.*;
import net.minecraft.core.block.material.Material;
import net.minecraft.core.block.tag.BlockTags;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.block.ItemBlockPainted;
import net.minecraft.core.item.block.ItemBlockSlab;
import net.minecraft.core.sound.BlockSound;
import net.minecraft.core.sound.BlockSounds;
import turniplabs.halplibe.helper.BlockBuilder;

import static net.minecraft.core.item.Item.itemsList;
import static org.apache.log4j.builders.appender.SocketAppenderBuilder.LOGGER;
import static rasvhw.worldofcolor.WorldOfColor.MOD_ID;

public class WorldOfColorBlocks {
	//glass
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

	//glass trapdoors
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

	//bricks
	public static Block brickClayWhitePainted;
	public static Block stairsBrickClayWhitePainted;
	public static Block slabBrickClayWhitePainted;
	public static Block brickClaySilverPainted;
	public static Block stairsBrickClaySilverPainted;
	public static Block slabBrickClaySilverPainted;
	public static Block brickClayGrayPainted;
	public static Block stairsBrickClayGrayPainted;
	public static Block slabBrickClayGrayPainted;
	public static Block brickClayBlackPainted;
	public static Block stairsBrickClayBlackPainted;
	public static Block slabBrickClayBlackPainted;
	public static Block brickClayRedPainted;
	public static Block stairsBrickClayRedPainted;
	public static Block slabBrickClayRedPainted;
	public static Block brickClayBrownPainted;
	public static Block stairsBrickClayBrownPainted;
	public static Block slabBrickClayBrownPainted;
	public static Block brickClayOrangePainted;
	public static Block stairsBrickClayOrangePainted;
	public static Block slabBrickClayOrangePainted;
	public static Block brickClayYellowPainted;
	public static Block stairsBrickClayYellowPainted;
	public static Block slabBrickClayYellowPainted;
	public static Block brickClayGreenPainted;
	public static Block stairsBrickClayGreenPainted;
	public static Block slabBrickClayGreenPainted;
	public static Block brickClayLimePainted;
	public static Block stairsBrickClayLimePainted;
	public static Block slabBrickClayLimePainted;
	public static Block brickClayLightBluePainted;
	public static Block stairsBrickClayLightBluePainted;
	public static Block slabBrickClayLightBluePainted;
	public static Block brickClayCyanPainted;
	public static Block stairsBrickClayCyanPainted;
	public static Block slabBrickClayCyanPainted;
	public static Block brickClayBluePainted;
	public static Block stairsBrickClayBluePainted;
	public static Block slabBrickClayBluePainted;
	public static Block brickClayPurplePainted;
	public static Block stairsBrickClayPurplePainted;
	public static Block slabBrickClayPurplePainted;
	public static Block brickClayMagentaPainted;
	public static Block stairsBrickClayMagentaPainted;
	public static Block slabBrickClayMagentaPainted;
	public static Block brickClayPinkPainted;
	public static Block stairsBrickClayPinkPainted;
	public static Block slabBrickClayPinkPainted;

	BlockBuilder slab = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
		.setHardness(1.0f)
		.setResistance(10.0f)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setItemBlock(ItemBlockSlab::new)
		.setTags(BlockTags.MINEABLE_BY_PICKAXE);

	BlockBuilder stairs = new BlockBuilder(MOD_ID)
		.setBlockSound(new BlockSound("step.stone", "step.stone", 1.0f, 1.0f))
		.setHardness(1.0f)
		.setResistance(10.0f)
		.setUseInternalLight()
		.setVisualUpdateOnMetadata()
		.setBlockModel(new BlockModelRenderBlocks(10))
		.setTags(BlockTags.MINEABLE_BY_PICKAXE);


	static int id=2799;
	public static int nextId(){
		id+=1;
		return id;
	}

	public void initializeBlocks(){
		//glass
		glassWhitePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.build(new BlockGlass("glass.white.painted", nextId(), Material.glass, false));
		glassSilverPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_silver.png")
			.build(new BlockGlass("glass.silver.painted", nextId(), Material.glass, false));
		glassGrayPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_gray.png")
			.build(new BlockGlass("glass.gray.painted", nextId(), Material.glass, false));
		glassBlackPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_black.png")
			.build(new BlockGlass("glass.black.painted", nextId(), Material.glass, false));
		glassRedPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_red.png")
			.build(new BlockGlass("glass.red.painted", nextId(), Material.glass, false));
		glassBrownPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_brown.png")
			.build(new BlockGlass("glass.brown.painted", nextId(), Material.glass, false));
		glassOrangePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.build(new BlockGlass("glass.orange.painted", nextId(), Material.glass, false));
		glassYellowPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_yellow.png")
			.build(new BlockGlass("glass.yellow.painted", nextId(), Material.glass, false));
		glassGreenPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_green.png")
			.build(new BlockGlass("glass.green.painted", nextId(), Material.glass, false));
		glassLimePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_lime.png")
			.build(new BlockGlass("glass.lime.painted", nextId(), Material.glass, false));
		glassLightBluePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_lightblue.png")
			.build(new BlockGlass("glass.light.blue.painted", nextId(), Material.glass, false));
		glassCyanPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_cyan.png")
			.build(new BlockGlass("glass.cyan.painted", nextId(), Material.glass, false));
		glassBluePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_blue.png")
			.build(new BlockGlass("glass.blue.painted", nextId(), Material.glass, false));
		glassPurplePainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_purple.png")
			.build(new BlockGlass("glass.purple.painted", nextId(), Material.glass, false));
		glassMagentaPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_magenta.png")
			.build(new BlockGlass("glass.magenta.painted", nextId(), Material.glass, false));
		glassPinkPainted = new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_pink.png")
			.build(new BlockGlass("glass.pink.painted", nextId(), Material.glass, false));

		//glass trapdoors
		trapdoorGlassWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_white.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.white.painted",nextId(),Material.glass,false));
		trapdoorGlassSilverPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_silver.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.silver.painted",nextId(),Material.glass,false));
		trapdoorGlassGrayPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_gray.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.gray.painted",nextId(),Material.glass,false));
		trapdoorGlassBlackPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_black.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.black.painted",nextId(),Material.glass,false));
		trapdoorGlassRedPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_red.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.red.painted",nextId(),Material.glass,false));
		trapdoorGlassBrownPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_brown.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.brown.painted",nextId(),Material.glass,false));
		trapdoorGlassOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_orange.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.orange.painted",nextId(),Material.glass,false));
		trapdoorGlassYellowPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_yellow.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.yellow.painted",nextId(),Material.glass,false));
		trapdoorGlassGreenPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_green.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.green.painted",nextId(),Material.glass,false));
		trapdoorGlassLimePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_lime.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.lime.painted",nextId(),Material.glass,false));
		trapdoorGlassLightBluePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_lightblue.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.light.blue.painted",nextId(),Material.glass,false));
		trapdoorGlassCyanPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_cyan.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.cyan.painted",nextId(),Material.glass,false));
		trapdoorGlassBluePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_blue.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.blue.painted",nextId(),Material.glass,false));
		trapdoorGlassPurplePainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_purple.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.purple.painted",nextId(),Material.glass,false));
		trapdoorGlassMagentaPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_magenta.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.magenta.painted",nextId(),Material.glass,false));
		trapdoorGlassPinkPainted=new BlockBuilder(MOD_ID)
			.setTextures("glass_painted_pink.png")
			.setBlockSound(BlockSounds.GLASS)
			.build(new BlockTrapDoor("trapdoor.glass.pink.painted",nextId(),Material.glass,false));

		//bricks
		brickClayWhitePainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_white.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.white.painted",nextId(),Material.stone));
		stairsBrickClayWhitePainted=stairs
			.setTextures("brick_painted_white.png")
			.build(new BlockStairs(brickClayWhitePainted,nextId()));
		slabBrickClayWhitePainted=slab
			.setTextures("brick_painted_white.png")
			.build(new BlockSlab(brickClayWhitePainted,nextId()));
		brickClaySilverPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_silver.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.silver.painted",nextId(),Material.stone));
		stairsBrickClaySilverPainted=stairs
			.setTextures("brick_painted_silver.png")
			.build(new BlockStairs(brickClaySilverPainted,nextId()));
		slabBrickClaySilverPainted=slab
			.setTextures("brick_painted_silver.png")
			.build(new BlockSlab(brickClaySilverPainted,nextId()));
		brickClayGrayPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_gray.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.gray.painted",nextId(),Material.stone));
		stairsBrickClayGrayPainted=stairs
			.setTextures("brick_painted_gray.png")
			.build(new BlockStairs(brickClayGrayPainted,nextId()));
		slabBrickClayGrayPainted=slab
			.setTextures("brick_painted_gray.png")
			.build(new BlockSlab(brickClayGrayPainted,nextId()));
		brickClayBlackPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_black.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.black.painted",nextId(),Material.stone));
		stairsBrickClayBlackPainted=stairs
			.setTextures("brick_painted_black.png")
			.build(new BlockStairs(brickClayBlackPainted,nextId()));
		slabBrickClayBlackPainted=slab
			.setTextures("brick_painted_black.png")
			.build(new BlockSlab(brickClayBlackPainted,nextId()));
		brickClayRedPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_red.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.red.painted",nextId(),Material.stone));
		stairsBrickClayRedPainted=stairs
			.setTextures("brick_painted_red.png")
			.build(new BlockStairs(brickClayRedPainted,nextId()));
		slabBrickClayRedPainted=slab
			.setTextures("brick_painted_red.png")
			.build(new BlockSlab(brickClayRedPainted,nextId()));
		brickClayBrownPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_brown.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.brown.painted",nextId(),Material.stone));
		stairsBrickClayBrownPainted=stairs
			.setTextures("brick_painted_brown.png")
			.build(new BlockStairs(brickClayBrownPainted,nextId()));
		slabBrickClayBrownPainted=slab
			.setTextures("brick_painted_brown.png")
			.build(new BlockSlab(brickClayBrownPainted,nextId()));
		brickClayOrangePainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_orange.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.orange.painted",nextId(),Material.stone));
		stairsBrickClayOrangePainted=stairs
			.setTextures("brick_painted_orange.png")
			.build(new BlockStairs(brickClayOrangePainted,nextId()));
		slabBrickClayOrangePainted=slab
			.setTextures("brick_painted_orange.png")
			.build(new BlockSlab(brickClayOrangePainted,nextId()));
		brickClayYellowPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_yellow.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.yellow.painted",nextId(),Material.stone));
		stairsBrickClayYellowPainted=stairs
			.setTextures("brick_painted_yellow.png")
			.build(new BlockStairs(brickClayYellowPainted,nextId()));
		slabBrickClayYellowPainted=slab
			.setTextures("brick_painted_yellow.png")
			.build(new BlockSlab(brickClayYellowPainted,nextId()));
		brickClayGreenPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_green.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.green.painted",nextId(),Material.stone));
		stairsBrickClayGreenPainted=stairs
			.setTextures("brick_painted_green.png")
			.build(new BlockStairs(brickClayGreenPainted,nextId()));
		slabBrickClayGreenPainted=slab
			.setTextures("brick_painted_green.png")
			.build(new BlockSlab(brickClayGreenPainted,nextId()));
		brickClayLimePainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_lime.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.lime.painted",nextId(),Material.stone));
		stairsBrickClayLimePainted=stairs
			.setTextures("brick_painted_lime.png")
			.build(new BlockStairs(brickClayLimePainted,nextId()));
		slabBrickClayLimePainted=slab
			.setTextures("brick_painted_lime.png")
			.build(new BlockSlab(brickClayLimePainted,nextId()));
		brickClayLightBluePainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_lightblue.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.lightblue.painted",nextId(),Material.stone));
		stairsBrickClayLightBluePainted=stairs
			.setTextures("brick_painted_lightblue.png")
			.build(new BlockStairs(brickClayLightBluePainted,nextId()));
		slabBrickClayLightBluePainted=slab
			.setTextures("brick_painted_lightblue.png")
			.build(new BlockSlab(brickClayLightBluePainted,nextId()));
		brickClayCyanPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_cyan.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.cyan.painted",nextId(),Material.stone));
		stairsBrickClayCyanPainted=stairs
			.setTextures("brick_painted_cyan.png")
			.build(new BlockStairs(brickClayCyanPainted,nextId()));
		slabBrickClayCyanPainted=slab
			.setTextures("brick_painted_cyan.png")
			.build(new BlockSlab(brickClayCyanPainted,nextId()));
		brickClayBluePainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_blue.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.blue.painted",nextId(),Material.stone));
		stairsBrickClayBluePainted=stairs
			.setTextures("brick_painted_blue.png")
			.build(new BlockStairs(brickClayBluePainted,nextId()));
		slabBrickClayBluePainted=slab
			.setTextures("brick_painted_blue.png")
			.build(new BlockSlab(brickClayBluePainted,nextId()));
		brickClayPurplePainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_purple.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.purple.painted",nextId(),Material.stone));
		stairsBrickClayPurplePainted=stairs
			.setTextures("brick_painted_purple.png")
			.build(new BlockStairs(brickClayPurplePainted,nextId()));
		slabBrickClayPurplePainted=slab
			.setTextures("brick_painted_purple.png")
			.build(new BlockSlab(brickClayPurplePainted,nextId()));
		brickClayMagentaPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_magenta.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.magenta.painted",nextId(),Material.stone));
		stairsBrickClayMagentaPainted=stairs
			.setTextures("brick_painted_magenta.png")
			.build(new BlockStairs(brickClayMagentaPainted,nextId()));
		slabBrickClayMagentaPainted=slab
			.setTextures("brick_painted_magenta.png")
			.build(new BlockSlab(brickClayMagentaPainted,nextId()));
		brickClayPinkPainted=new BlockBuilder(MOD_ID)
			.setTextures("brick_painted_pink.png")
			.setHardness(3.0F)
			.setResistance(10.0F)
			.setTags(BlockTags.MINEABLE_BY_PICKAXE)
			.build(new Block("brick.clay.pink.painted",nextId(),Material.stone));
		stairsBrickClayPinkPainted=stairs
			.setTextures("brick_painted_pink.png")
			.build(new BlockStairs(brickClayPinkPainted,nextId()));
		slabBrickClayPinkPainted=slab
			.setTextures("brick_painted_pink.png")
			.build(new BlockSlab(brickClayPinkPainted,nextId()));

		LOGGER.info("WorldOfColorBlocks initialized");
	}
}
