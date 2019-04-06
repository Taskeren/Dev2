package task.dev2.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

@Mod.EventBusSubscriber
public class CommonEvent {

	@SubscribeEvent
	public static void onPlayerJoin(PlayerLoggedInEvent evt) {
		EntityPlayer player = evt.player;
		player.sendMessage(new TextComponentTranslation("welcome.0"));
		player.sendMessage(new TextComponentTranslation("welcome.1"));
		player.sendMessage(new TextComponentTranslation("welcome.2"));
		player.sendMessage(new TextComponentTranslation("welcome.3"));
	}
	
}
