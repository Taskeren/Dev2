package task.dev2.key;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import net.minecraftforge.fml.relauncher.Side;
import task.dev2.command.skull.SkullHelper;

@Mod.EventBusSubscriber(value = Side.CLIENT)
public class Keys {

	public static KeyBinding copySkullData = new KeyBinding("key.dev2.skull", Keyboard.KEY_Y, "key.dev2.category");
	
	public static void init() {
		ClientRegistry.registerKeyBinding(copySkullData);
	}
	
	@SubscribeEvent
	public static void onKeyInput(InputEvent.KeyInputEvent evt) {
		if(copySkullData.isPressed()) {
			EntityPlayerSP player = Minecraft.getMinecraft().player;
			ItemStack mainhand = player.getHeldItemMainhand();
			ItemStack offhand = player.getHeldItemOffhand();
			if(mainhand.getItem() == Items.SKULL) {
				copySkullData(player, mainhand);
			}
			else if(offhand.getItem() == Items.SKULL) {
				copySkullData(player, offhand);
			}
			else {
				player.sendMessage(new TextComponentTranslation("function.skulldata.notskull"));
			}
		}
		
	}
	
	private static void copySkullData(EntityPlayerSP player, ItemStack skull) {
		String data = SkullHelper.serialize(skull);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(data), null);
		player.sendMessage(new TextComponentTranslation("function.skulldata.copied"));
	}
	
}
