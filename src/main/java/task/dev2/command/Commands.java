package task.dev2.command;

import net.minecraft.command.ICommand;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import task.dev2.command.color.Color;
import task.dev2.command.oredict.OreDict;

public class Commands {

	public static final ICommand OreDict = new OreDict();
	public static final ICommand Color = new Color();
	
	public static final ICommand[] COMMANDS = new ICommand[] {
			OreDict, Color
	};
	
	public static void init(FMLServerStartingEvent evt) {
		for(ICommand cmd : COMMANDS) {
			evt.registerServerCommand(cmd);
		}
	}
	
}
