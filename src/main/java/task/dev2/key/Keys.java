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

import static task.dev2.command.skull.SkullHelper.isPlayerSkull;

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
			if(isPlayerSkull(mainhand)) {
				copySkullData(player, mainhand);
			}
			else if(isPlayerSkull(offhand)) {
				copySkullData(player, offhand);
			}
			else {
				player.sendMessage(new TextComponentTranslation("function.skulldata.notskull"));
			}
		}
		
	}
	
	private static void copySkullData(EntityPlayerSP player, ItemStack skull) {
		String data = SkullHelper.serialize(skull);
		if(data.startsWith("||")) {
			player.sendMessage(new TextComponentTranslation("function.skulldata.invalid"));
		} else {
			try {
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(data), null);
				player.sendMessage(new TextComponentTranslation("function.skulldata.copied"));
			} catch(Exception e) {
				player.sendMessage(new TextComponentTranslation("function.skulldata.uncopied"));
			}
		}
	}
	
}
