package masterventris.soulfoundry;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import masterventris.soulfoundry.blocks.*;


@Mod(modid = SoulFoundry.MODID, version = SoulFoundry.VERSION, name=SoulFoundry.MODNAME)
public class SoulFoundry
{
    public static final String MODID = "soulfoundry";
    public static final String VERSION = "0.1";
    public static final String MODNAME = "Soul Foundry";
    
    // Blocks
    public static Block soulBlend;
    public static Block soulGlass;
    
    // Creative Tab
    public static CreativeTabs tabSoulFoundry = new CreativeTabsSoulFoundry("SoulFoundry");
    
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	// Register Blocks
    	soulBlend = new SoulBlend();
    	GameRegistry.registerBlock(soulBlend, "soulBlend");
    	soulGlass = new SoulGlass();
    	GameRegistry.registerBlock(soulGlass, "soulGlass");
    	
    	RecipeManager.init();
    	
    	
    	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event){
		
    }
}