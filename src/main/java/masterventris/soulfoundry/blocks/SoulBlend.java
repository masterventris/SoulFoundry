package masterventris.soulfoundry.blocks;

import masterventris.soulfoundry.SoulFoundry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class SoulBlend extends Block {
	public SoulBlend(){
		super(Material.sand);
		setBlockName(SoulFoundry.MODID + "." + "soulBlend");
		setCreativeTab(SoulFoundry.tabSoulFoundry);
		setBlockTextureName(SoulFoundry.MODID + ":" + "soulBlend");
	}

}
