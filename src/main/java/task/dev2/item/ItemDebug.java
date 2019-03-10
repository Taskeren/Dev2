package task.dev2.item;

import java.util.List;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import task.dev2.Dev2;
import task.dev2.api.CreativeTabAPI;

public class ItemDebug extends Item {

	public ItemDebug() {
		this.setRegistryName("debug");
		this.setUnlocalizedName("Debug");
		this.setFull3D();
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if(tab == Dev2.tab) {
			List<ItemStack> stacks = CreativeTabAPI.getItems();
			items.addAll(stacks);
		}
		super.getSubItems(tab, items);
	}
	
}
