package masterventris.soulfoundry.blocks;

import masterventris.soulfoundry.SoulFoundry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class SoulGlass extends Block{
	public SoulGlass(){
		super(Material.glass);
		setBlockName(SoulFoundry.MODID + "." + "soulGlass");
		setCreativeTab(SoulFoundry.tabSoulFoundry);
		setBlockTextureName(SoulFoundry.MODID + ":" + "soulGlass");
	}
}
