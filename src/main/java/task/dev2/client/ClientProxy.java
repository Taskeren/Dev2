package task.dev2.client;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import task.dev2.common.CommonProxy;

public class ClientProxy extends CommonProxy {

	@Override
	public void preinit(FMLPreInitializationEvent evt) {
		super.preinit(evt);
	}

	@Override
	public void init(FMLInitializationEvent evt) {
		super.init(evt);
	}

	@Override
	public void postinit(FMLPostInitializationEvent evt) {
		super.postinit(evt);
	}

	@Override
	public void serverstarting(FMLServerStartingEvent evt) {
		super.serverstarting(evt);
	}
	
}
