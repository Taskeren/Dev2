package task.dev2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.item.Item;
import task.dev2.api.CreativeTabAPI;
import task.dev2.config.Cfg;
import task.dev2.config.CfgAdvanced;

public class FunctionInit {

	private static final Logger logger = LogManager.getLogger("FunctionInit");
	
	// Add the items that are excepted to appear in the creative tab that is Dev2
	// The items is from config whose category is advanced
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
	
}
