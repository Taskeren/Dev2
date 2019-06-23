package task.dev2.config;

import net.minecraftforge.common.config.Config;
import task.dev2.Dev2;

public class CfgAdvanced {

	@Config.Comment("The list of the items that are excepted to appears in the creative tab called Dev2")
	@Config.RequiresMcRestart
	public String[] itemsInTab = new String[] {
		"minecraft:command_block",
		"minecraft:chain_command_block",
		"minecraft:repeating_command_block",
		"minecraft:barrier",
		"minecraft:dragon_egg"
	};
	
}
