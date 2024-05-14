package rasvhw.worldofcolor.block;

import net.minecraft.core.block.BlockGlass;
import net.minecraft.core.block.material.Material;

public class BlockGlassPainted extends BlockGlass {
	int color=0;
	public BlockGlassPainted(String key, int id, Material material, boolean renderInside, int meta) {
		super(key, id, material, renderInside);
		color=meta;
		assignColor();
	}

	public String assignColor(){
		switch(color){
			case(0) : //White
				return "block/glass_painted_white";
			case(1) : //Orange
				return "block/glass_painted_orange";
			case(2): //Magenta
				return "block/glass_painted_magenta";
			case(3): //Light Blue
				return "block/glass_painted_light_blue";
			case(4): //Yellow
				return "block/glass_painted_yellow";
			case(5): //Lime
				return "block/glass_painted_lime";
			case(6): //Pink
				return "block/glass_painted_pink";
			case(7): //Gray
				return "block/glass_painted_gray";
			case(8): //Light Gray
				return "block/glass_painted_light_gray";
			case(9): //Cyan
				return "block/glass_painted_cyan";
			case(10): //Purple
				return "block/glass_painted_purple";
			case(11): //Blue
				return "block/glass_painted_blue";
			case(12): //Brown
				return "block/glass_painted_brown";
			case(13): //Green
				return "block/glass_painted_green";
			case(14): //Red
				return "block/glass_painted_red";
			case(15): //Black
				return "block/glass_painted_black";
		}
		return null;
	}

}
