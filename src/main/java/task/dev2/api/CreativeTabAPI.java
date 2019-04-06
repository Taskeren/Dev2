package task.dev2.api;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import task.dev2.command.skull.SkullHelper;
import task.dev2.registry.Rs;
import task.dev2.util.DataPair;
import task.dev2.util.ItemUtils;

public class CreativeTabAPI {

	private static final List<ItemStack> items = new ArrayList<ItemStack>();
	private static final List<ItemStack> skulls = new ArrayList<ItemStack>();
	
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
	
	public static void addSkull(ItemStack skull) {
		skulls.add(skull);
	}
	
	public static List<ItemStack> getSkulls() {
		return skulls;
	}
	
	public static void init() {
		addItem(Rs.Debug);
		addItem(Blocks.COMMAND_BLOCK);
		addItem(Blocks.BARRIER);
		addItem(Blocks.DRAGON_EGG);
		addItem(ItemUtils.addEnchantments(new ItemStack(Items.STICK), 
				new DataPair<Enchantment, Integer>(Enchantments.SHARPNESS, 32765),
				new DataPair<Enchantment, Integer>(Enchantments.KNOCKBACK, 10)));
		
		addSkull(SkullHelper.setSkullOwner(null, "82f740c9-af74-4620-9c76-f6012a8c0af8", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvNmYyY2RmZjYyZjA1ZGJlN2RiN2ZkMTkxOTQ5MTgzZTI3NjRkNjhmMzc3MjZkYjM1NmFhNDYxYTU4YzU0YSJ9fX0=").setStackDisplayName("Blue Bucket of Milk"));
		addSkull(SkullHelper.setSkullOwner(null, "a75e3f60-2242-4429-8ece-bcde7753b064", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjM0ODdkNDU3ZjkwNjJkNzg3YTNlNmNlMWM0NjY0YmY3NDAyZWM2N2RkMTExMjU2ZjE5YjM4Y2U0ZjY3MCJ9fX0=").setStackDisplayName("Bread"));
		addSkull(SkullHelper.setSkullOwner(null, "534c47c4-d04d-416a-bf99-c3efd621d668", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjkxMzY1MTRmMzQyZTdjNTIwOGExNDIyNTA2YTg2NjE1OGVmODRkMmIyNDkyMjAxMzllOGJmNjAzMmUxOTMifX19").setStackDisplayName("Cake"));
		addSkull(SkullHelper.setSkullOwner(null, "0718ac7f-0e1e-4a6b-b361-3e20f5768376", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTAzZDY1OTdjYTQ0Y2JiYmRlZTdhMTM1NzRhNGNiNzkyYTc1YmU2ZWQ1OWE4OGY5OTUyMTYyZmQ5M2EyNTY3ZSJ9fX0=").setStackDisplayName("Bowl of Soup"));
		addSkull(SkullHelper.setSkullOwner(null, "f597e06f-e01a-492d-b63f-c23b9809ce01", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYzVlMjc5ODhhNjUzODAxMGVmYzBlMjQ3NTZiYzNlM2VlYTI0ZDc1MzZiMjA5MzJjMTdlMDQwNGU1Y2M1NWYifX19").setStackDisplayName("Hamburger"));
		addSkull(SkullHelper.setSkullOwner(null, "d1375075-c727-40ad-bcce-7e4277099e30", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvYTZlZjFjMjVmNTE2ZjJlN2Q2Zjc2Njc0MjBlMzNhZGNmM2NkZjkzOGNiMzdmOWE0MWE4YjM1ODY5ZjU2OWIifX19").setStackDisplayName("Hamburger"));
		addSkull(SkullHelper.setSkullOwner(null, "bf871b6c-92c7-454c-aa05-174e6cf98c45", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjA2NTU1NzA2YjY0MWZkYWY0MzZjMDc2NjNmOTIzYWZjNWVlNzIxNDZmOTAxOTVmYjMzN2I5ZGU3NjY1ODhkIn19fQ==").setStackDisplayName("Turkey"));

	}
	
}
