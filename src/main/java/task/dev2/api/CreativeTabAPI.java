package task.dev2.api;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import task.dev2.registry.Rs;

public class CreativeTabAPI {

	private static final List<ItemStack> items = new ArrayList<ItemStack>();
	
	public static void addItem(ItemStack stack) {
		items.add(stack);
	}
	
	public static void addItem(Item item) {
		addItem(new ItemStack(item));
	}
	
	public static void addItem(Block block) {
		addItem(new ItemStack(block));
	}
	
	public static void addItem(Item item, int meta) {
		addItem(new ItemStack(item, meta));
	}
	
	public static void addItem(Block block, int meta) {
		addItem(new ItemStack(block, meta));
	}
	
	public static List<ItemStack> getItems() {
		return items;
	}
	
	public static void init() {
		addItem(Rs.Debug);
		addItem(Blocks.COMMAND_BLOCK);
		addItem(Blocks.BARRIER);
		addItem(Blocks.DRAGON_EGG);
	}
	
}
