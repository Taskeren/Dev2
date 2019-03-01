package task.dev2.common;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import task.dev2.command.Commands;

public class CommonProxy {
	
	public void preinit(FMLPreInitializationEvent evt) {
		
	}
	
	public void init(FMLInitializationEvent evt) {
		
	}
	
	public void postinit(FMLPostInitializationEvent evt) {
		
	}
	
	public void serverstarting(FMLServerStartingEvent evt) {
		Commands.init(evt);
	}
	
}
