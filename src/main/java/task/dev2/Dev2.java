package task.dev2;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import task.dev2.command.skull.SkullHelper;
import task.dev2.common.CommonProxy;

/**
 * The Mod for Development. <br>
 * <a href="https://github.com/nitu2003/dev2">GitHub</a>
 * @author Taskeren
 */
@Mod(modid = Dev2.MODID, name = Dev2.NAME, version = Dev2.VERSION)
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
	
	public static final CreativeTabs tab = new CreativeTabs("dev2") {
		@Override
		public ItemStack getTabIconItem() {
			ItemStack icon = SkullHelper.setSkullOwner(null, "a75e3f60-2242-4429-8ece-bcde7753b064", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjM0ODdkNDU3ZjkwNjJkNzg3YTNlNmNlMWM0NjY0YmY3NDAyZWM2N2RkMTExMjU2ZjE5YjM4Y2U0ZjY3MCJ9fX0=");
			return icon;
		}
	};
	
	public static final CreativeTabs tabSkull = new CreativeTabs("dev2-skull") {
		@Override
		public ItemStack getTabIconItem() {
			ItemStack icon = SkullHelper.setSkullOwner(null, "534c47c4-d04d-416a-bf99-c3efd621d668", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvZjkxMzY1MTRmMzQyZTdjNTIwOGExNDIyNTA2YTg2NjE1OGVmODRkMmIyNDkyMjAxMzllOGJmNjAzMmUxOTMifX19");
			return icon;
		}
	};
	
}
