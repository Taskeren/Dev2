package task.dev2.command.oredict;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictInHand extends CommandBase {

	@Override
	public String getName() {
		return "inhand";
	}

	@Override
	public String getUsage(ICommandSender sender) {
		return "cmd.oredict.inhand.usage";
	}

	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		
		if(!(sender.getCommandSenderEntity() instanceof EntityPlayer)) {
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.inhand.notplayer"));
			return;
		}
		
		EntityPlayer player = (EntityPlayer) sender.getCommandSenderEntity();
		ItemStack stack = player.getHeldItemMainhand();
		
		if(stack == ItemStack.EMPTY) {
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.inhand.null"));
			return;
		}
		
		int[] ids = OreDictionary.getOreIDs(stack);
		int count = ids.length;
		sender.sendMessage(new TextComponentTranslation("cmd.oredict.inhand.output", count));
		for(int id : ids) {
			sender.sendMessage(new TextComponentTranslation("cmd.oredict.inhand.output.entry", OreDictionary.getOreName(id)));
		}
		
	}

	
	
}
