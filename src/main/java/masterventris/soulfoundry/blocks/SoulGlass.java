package masterventris.soulfoundry.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
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
	
	@SideOnly(Side.CLIENT)
	@Override
	public boolean isOpaqueCube(){
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
    public int getRenderBlockPass(){
            return 1;
	}
}
