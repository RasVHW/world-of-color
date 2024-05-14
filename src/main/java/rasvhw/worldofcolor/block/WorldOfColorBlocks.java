package rasvhw.worldofcolor.block;

import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.BlockTrapDoor;

import static org.apache.log4j.builders.appender.SocketAppenderBuilder.LOGGER;

public class WorldOfColorBlocks {

	public static BlockGlass glassPainted;
	public static BlockTrapDoor trapdoorGlassPainted;


	public void initializeBlocks(){
		LOGGER.info("WorldOfColorBlocks initialized");
	}
}
