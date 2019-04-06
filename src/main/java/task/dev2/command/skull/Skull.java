package task.dev2.command.skull;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.text.TextComponentTranslation;

public class Skull extends CommandBase {

	@Override
	public String getName() {
		return "skull";
	}
	
	@Override
	public String getUsage(ICommandSender sender) {
		return "cmd.skull.usage";
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
		ItemStack stack = null;
		if(sender.getCommandSenderEntity() instanceof EntityPlayer) {
			EntityPlayer player = (EntityPlayer) sender.getCommandSenderEntity();
			stack = player.getHeldItemMainhand();
			if(stack.getItem() != Items.SKULL) {
				stack = player.getHeldItemOffhand();
			}
		}
		if(stack == null || stack.getItem() != Items.SKULL || stack.getMetadata() != 3) {
			sender.sendMessage(new TextComponentTranslation("cmd.skull.notskull"));
			return;
		}
		
		if(args.length > 1) {
			SkullHelper.setSkullOwner(stack, args[0], args[1]);
		}
		else if(args.length > 0) {
			SkullHelper.setSkullOwner(stack, args[0]);
		} else {
			String owner = SkullHelper.getSkullOwner(stack);
			sender.sendMessage(new TextComponentTranslation("cmd.skull.owner", owner));
		}
		
	}
	
}
