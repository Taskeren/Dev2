package task.dev2.event;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import task.dev2.Dev2;

@Mod.EventBusSubscriber
public class ConfigSyncHandler {

	@SubscribeEvent
	public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent evt) {
		if(evt.getModID().equals(Dev2.MODID)) {
			ConfigManager.sync(Dev2.MODID, Config.Type.INSTANCE);
		}
	}
	
}
