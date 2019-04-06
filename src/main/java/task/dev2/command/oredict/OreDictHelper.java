package task.dev2.command.oredict;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictHelper {

	public static List<ItemStack> search(String orenameIn) {
		
		List<ItemStack> ret = new ArrayList<ItemStack>();
		String[] orenames = OreDictionary.getOreNames();
		for(String orename : orenames) {
			if(orename.contains(orenameIn)) {
				ret.addAll(OreDictionary.getOres(orename));
			}
		}
		return ret;
		
	}
	
	public static List<String> getOreDict(ItemStack stack) {
		List<String> oredicts = new ArrayList<String>();
		int[] ids = OreDictionary.getOreIDs(stack);
		for(int id : ids) {
			String oredict = OreDictionary.getOreName(id);
			oredicts.add(oredict);
		}
		return oredicts;
	}
	
}
