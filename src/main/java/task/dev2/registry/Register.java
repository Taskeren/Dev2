package task.dev2.registry;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Register {
	
	public static void itemReg(Item... item) {
		ForgeRegistries.ITEMS.registerAll(item);
	}
	
	@SideOnly(Side.CLIENT)
	public static void itemTextureReg(Item... item) {
		for(Item i : item)
			ModelLoader.setCustomModelResourceLocation(i, 0, new ModelResourceLocation(i.getRegistryName(), "inventory"));
	}
	
}
