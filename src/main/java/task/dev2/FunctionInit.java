package task.dev2;

import java.util.Arrays;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import task.dev2.api.CreativeTabAPI;
import task.dev2.command.skull.SkullHelper;
import task.dev2.config.Cfg;

public class FunctionInit {

	private static final Logger logger = LogManager.getLogger("FunctionInit");
	
	public static void loadItems() {
		for(String id : Cfg.advanced.itemsInTab) {
			Item item = Item.getByNameOrId(id);
			if(item == null) {
				logger.warn("Failed to add {} to Creative Tab Dev2.", id);
			} else {
				CreativeTabAPI.addItem(item);
			}
		}
	}
	
	public static void loadSkulls() {
		for(String code : Cfg.advanced.skullsInTab) {
			ItemStack skull = SkullHelper.deserialize(code);
			if(skull != ItemStack.EMPTY) CreativeTabAPI.addSkull(skull);
		}
	}
	
}
