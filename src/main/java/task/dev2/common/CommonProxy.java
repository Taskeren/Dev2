package task.dev2.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import task.dev2.FunctionInit;
import task.dev2.api.CreativeTabAPI;
import task.dev2.command.Commands;
import task.dev2.registry.Register;
import task.dev2.registry.Rs;

public class CommonProxy {
	
	public void preinit(FMLPreInitializationEvent evt) {
		Register.itemReg(Rs.ITEMS);
		CreativeTabAPI.init();
	}
	
	public void init(FMLInitializationEvent evt) {
		
	}
	
	public void postinit(FMLPostInitializationEvent evt) {
		FunctionInit.loadItems();
	}
	
	public void serverstarting(FMLServerStartingEvent evt) {
		Commands.init(evt);
	}
	
}
