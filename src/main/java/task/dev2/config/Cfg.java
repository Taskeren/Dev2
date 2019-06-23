package task.dev2.config;

import net.minecraftforge.common.config.Config;
import task.dev2.Dev2;

@Config(modid = Dev2.MODID)
public class Cfg {

	public static CfgUseless  useless  = new CfgUseless();
	public static CfgFunction function = new CfgFunction();
	public static CfgAdvanced advanced = new CfgAdvanced();
	
}
