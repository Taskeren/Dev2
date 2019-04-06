package task.dev2.util;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public class ItemUtils {
	
	public static ItemStack addEnchantment(ItemStack stack, Enchantment enchantment, int level) {
		stack.addEnchantment(enchantment, level);
		return stack;
	}
	
	public static ItemStack addEnchantments(ItemStack stack, DataPair<Enchantment, Integer>... pairs) {
		for(DataPair<Enchantment, Integer> pair : pairs) {
			stack.addEnchantment(pair.v1, pair.v2);
		}
		return stack;
	}
	
	public static NBTTagCompound getOrCreateTag(ItemStack stack) {
		if(!stack.hasTagCompound()) stack.setTagCompound(new NBTTagCompound());
		return stack.getTagCompound();
	}
	
}
