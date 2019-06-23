package task.dev2.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import task.dev2.Dev2;
import task.dev2.api.CreativeTabAPI;

public class ItemDebug extends Item {

	public ItemDebug() {
		this.setRegistryName("debug");
		this.setTranslationKey("Debug");
		this.setFull3D();
		this.setHasSubtypes(true);
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if(tab == Dev2.tab) {
			items.addAll(CreativeTabAPI.getItems());
		}
		if(tab == Dev2.tabSkull) {
			items.addAll(CreativeTabAPI.getSkulls());
		}
		super.getSubItems(tab, items);
	}
	
}
