package task.dev2.command.oredict;

import net.minecraft.command.ICommandSender;
import net.minecraftforge.server.command.CommandTreeBase;

public class OreDict extends CommandTreeBase {

	public static final OreDictSearch OreDictSearch = new OreDictSearch();
	public static final OreDictInHand OreDictInHand = new OreDictInHand();
	
	public OreDict() {
		this.addSubcommand(OreDictSearch);
		this.addSubcommand(OreDictInHand);
	}
	
	@Override
	public String getName() {
		return "oredict";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "cmd.oredict.usage";
	}
	
}
