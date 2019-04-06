package task.dev2.event;

import java.util.List;

import net.minecraft.client.resources.I18n;
import net.minecraft.init.Items;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemSkull;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import task.dev2.command.oredict.OreDictHelper;
import task.dev2.command.skull.SkullHelper;
import task.dev2.util.ItemUtils;

@Mod.EventBusSubscriber(Side.CLIENT)
public class ItemTooltipHandler {

	@SubscribeEvent
	public static void addTooltip(ItemTooltipEvent evt) {
		List<String> tooltip = evt.getToolTip();
		ItemStack stack = evt.getItemStack();
		registry(tooltip, stack);
		unlocalized(tooltip, stack);
		food(tooltip, stack);
		record(tooltip, stack);
		skull(tooltip, stack);
		oredict(tooltip, stack);
	}
	
	static void registry(List<String> tooltip, ItemStack stack) {
		String registryname = stack.getItem().getRegistryName().toString();
		tooltip.add(I18n.format("information.basic.registry.title"));
		tooltip.add(I18n.format("information.basic.registry.content", registryname));
	}
	
	static void unlocalized(List<String> tooltip, ItemStack stack) {
		String unlocalizedname = stack.getUnlocalizedName();
		tooltip.add(I18n.format("information.basic.unlocalized.title"));
		tooltip.add(I18n.format("information.basic.unlocalized.content", unlocalizedname));
	}
	
	static void food(List<String> tooltip, ItemStack itemstack) {
		if(itemstack.getItem() instanceof ItemFood) {
			ItemFood food = (ItemFood) itemstack.getItem();
			int amount = food.getHealAmount(itemstack);
			float saturation = food.getSaturationModifier(itemstack);
			boolean isWolfFood = food.isWolfsFavoriteMeat();
			
			tooltip.add(I18n.format("information.food.title"));
			tooltip.add(I18n.format("information.food.amount", amount));
			tooltip.add(I18n.format("information.food.saturation", saturation));
			tooltip.add(I18n.format("information.food.wolf."+isWolfFood));
		}
	}
	
	static void record(List<String> tooltip, ItemStack stack) {
		if(stack.getItem() instanceof ItemRecord) {
			ItemRecord record = (ItemRecord) stack.getItem();
			String name = record.getRecordNameLocal();
			String sound = record.getSound().getRegistryName().toString();
			String unlocalized = record.getSound().getSoundName().toString();
			tooltip.add(I18n.format("information.record.title"));
			tooltip.add(I18n.format("information.record.name", name));
			tooltip.add(I18n.format("information.record.sound", sound));
			tooltip.add(I18n.format("information.record.unlocalized", unlocalized));
		}
	}
	
	static void skull(List<String> tooltip, ItemStack stack) {
		if(stack.getItem() == Items.SKULL) {
			ItemSkull skull = (ItemSkull) stack.getItem();
			NBTTagCompound nbt = ItemUtils.getOrCreateTag(stack);
			String owner = SkullHelper.getSkullOwner(stack);
			int metadata = stack.getMetadata();
			if(metadata == 3 && !owner.equals("")) {
				tooltip.add(I18n.format("information.skull.title"));
				tooltip.add(I18n.format("information.skull.player", owner));
			}
		}
	}
	
	static void oredict(List<String> tooltip, ItemStack stack) {
		List<String> oredicts = OreDictHelper.getOreDict(stack);
		if(oredicts.size() > 0) {
			tooltip.add(I18n.format("information.oredict.title"));
			for(String oredict : oredicts) {
				tooltip.add(I18n.format("information.oredict.content", oredict));
			}
		}
	}
	
}
