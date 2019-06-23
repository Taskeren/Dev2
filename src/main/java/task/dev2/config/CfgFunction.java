package task.dev2.config;

import net.minecraftforge.common.config.Config;
import task.dev2.Dev2;

public class CfgFunction {

	@Config.Comment("True to show the registry name of items in inventory gui")
	public boolean showRegistryName;
	
	@Config.Comment("True to show the unlocalized name of items in inventory gui")
	public boolean showUnlocalizedName;
	
	@Config.Comment("True to show the information of foods in inventory gui")
	public boolean showFoodInformation;
	
	@Config.Comment("True to show the information of records in inventory gui")
	public boolean showRecordInformation;
	
	@Config.Comment("True to show the information of skulls in inventory gui")
	public boolean showSkullInformation;
	
	@Config.Comment("True to show the information of oredict of items in inventory gui")
	public boolean showOredictInformation;
	
}
