package task.dev2.command.oredict;

import java.util.List;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictSearch extends CommandBase {

	@Override
	public String getName() {
		return "search";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "cmd.oredict.search.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		
		if(args.length < 1) {
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.null"));
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.example"));
		}
		else if(args.length == 1) {
			search(sender, args[0], true);
		}
		else {
			search(sender, args[0], Boolean.parseBoolean(args[1]));
		}
		
	}

	public static void search(ICommandSender sender, String orename, boolean isForce) {
		
		if(isForce) {
			
			NonNullList<ItemStack> ores = OreDictionary.getOres(orename);
			int count = ores.size();
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output.force", count, orename));
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output.warning"));
			for(ItemStack ore : ores) {
				try {
					sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output.entry", ore.getDisplayName(), ore.getItem().getRegistryName()));
				} catch(Exception e) {
					sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output.failure", ore.getClass().toString()));
				}
			}
			
		} else {
			
			List<ItemStack> ores = OreDictHelper.search(orename);
			int count = ores.size();
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output", count, orename));
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output.warning"));
			for(ItemStack ore : ores) {
				try {
					sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output.entry", ore.getDisplayName(), ore.getItem().getRegistryName()));
				} catch(Exception e) {
					sender.sendMessage(new TextComponentTranslation("cmd.oredict.search.output.failure", ore.getClass().toString()));
				}
			}
		}
		
	}
	
}
