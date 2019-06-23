package task.dev2.command.color;

import org.apache.commons.lang3.StringUtils;

import net.minecraft.client.resources.I18n;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;

public class Color extends CommandBase {

	@Override
	public String getName() {
		return "color";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "cmd.color.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {

		if (args.length < 1) {
			for(int i=0; i<8; i++)
				sender.sendMessage(new TextComponentTranslation("color."+i));
		} else {
			String output = merge(args);
			sender.sendMessage(new TextComponentString(output));
		}

	}

	public static String merge(String[] str) {
		String re = "";
		for(String s : str) {
			re += s + " ";
		}
		return StringUtils.replace(re, "&", I18n.format("cmd.color.prefix"));
	}

}
