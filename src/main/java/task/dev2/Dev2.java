package task.dev2;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import task.dev2.common.CommonProxy;

@Mod(modid = Dev2.MODID, name = Dev2.NAME)
public class Dev2 {

	public static final String MODID = "dev2";
	public static final String NAME = "Dev2";
	public static final String VERSION = "dev(-1)";
	
	public static final String COMMON_PROXY = "task.dev2.common.CommonProxy";
	public static final String CLIENT_PROXY = "task.dev2.client.ClientProxy";
	
	@SidedProxy(serverSide = Dev2.COMMON_PROXY, clientSide = Dev2.CLIENT_PROXY)
	public static CommonProxy proxy;
	
	@Mod.Instance
	public static Dev2 instance;
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent evt) {
		proxy.preinit(evt);
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent evt) {
		proxy.init(evt);
	}
	
	@Mod.EventHandler
	public void postinit(FMLPostInitializationEvent evt) {
		proxy.postinit(evt);
	}
	
	@Mod.EventHandler
	public void serverstarting(FMLServerStartingEvent evt) {
		proxy.serverstarting(evt);
	}
	
}
