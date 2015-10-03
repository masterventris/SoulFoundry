package masterventris.soulfoundry;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

public class RecipeManager {
	public static void init(){
		
		// Blocks
		GameRegistry.addRecipe(new ItemStack(SoulFoundry.soulBlend, 6), new Object[]{
			    "ABA",
			    "BAB",
			    "ABA",
			    'A', Blocks.soul_sand, 'B', new ItemStack(Items.quartz, 1)});
		
		
		// Smelting
		GameRegistry.addSmelting(SoulFoundry.soulBlend, new ItemStack(SoulFoundry.soulGlass), 0.1f);
	}
}
