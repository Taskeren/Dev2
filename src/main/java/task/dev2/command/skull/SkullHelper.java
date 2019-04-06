package task.dev2.command.skull;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import task.dev2.util.ItemUtils;

public class SkullHelper {

	public static String getSkullOwner(ItemStack stack) {
		if(stack.getItem() == Items.SKULL && stack.getMetadata() == 3) {
			NBTTagCompound nbt = ItemUtils.getOrCreateTag(stack);
			String owner = nbt.getString("SkullOwner");
			if(owner.equals("")) {
				NBTTagCompound skullowner = (NBTTagCompound) nbt.getTag("SkullOwner");
				if(skullowner != null) owner = skullowner.getString("Name");
			}
			return owner;
		} else {
			return "";
		}
	}
	
	public static ItemStack setSkullOwner(ItemStack stack, String skullowner) {
		if(stack == null) stack = new ItemStack(Items.SKULL, 1, 3);
		if(stack.getItem() == Items.SKULL && stack.getMetadata() == 3) {
			NBTTagCompound nbt = ItemUtils.getOrCreateTag(stack);
			nbt.setString("SkullOwner", skullowner);
		}
		return stack;
	}
	
	public static ItemStack setSkullOwner(ItemStack stack, String id, String texture) {
		if(stack == null) stack = new ItemStack(Items.SKULL, 1, 3);
		if(stack.getItem() == Items.SKULL && stack.getMetadata() == 3) {
			NBTTagCompound root = ItemUtils.getOrCreateTag(stack);
			NBTTagCompound skullowner = new NBTTagCompound();
			NBTTagCompound properties = new NBTTagCompound();
			NBTTagList textures = new NBTTagList();
			NBTTagCompound value = new NBTTagCompound();
			if(root.hasKey("SkullOwner")) skullowner = (NBTTagCompound) root.getTag("SkullOwner");
			skullowner.setString("Id", id);
			value.setString("Value", texture);
			textures.appendTag(value);
			properties.setTag("textures", textures);
			skullowner.setTag("Properties", properties);
			root.setTag("SkullOwner", skullowner);
		}
		
		return stack;
	}
	
}
