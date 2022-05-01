
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import extramusic.client.gui.StudioScreen;
import extramusic.client.gui.MusicScreen;
import extramusic.client.gui.MstudioScreen;
import extramusic.client.gui.ErteScreen;
import extramusic.client.gui.DiscossssScreen;
import extramusic.client.gui.Discos4Screen;
import extramusic.client.gui.Discos3Screen;
import extramusic.client.gui.Discos2Screen;
import extramusic.client.gui.BardoScreen;
import extramusic.client.gui.AMusicScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SiriusrModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(SiriusrModMenus.STUDIO, StudioScreen::new);
			MenuScreens.register(SiriusrModMenus.BARDO, BardoScreen::new);
			MenuScreens.register(SiriusrModMenus.MUSIC, MusicScreen::new);
			MenuScreens.register(SiriusrModMenus.MSTUDIO, MstudioScreen::new);
			MenuScreens.register(SiriusrModMenus.A_MUSIC, AMusicScreen::new);
			MenuScreens.register(SiriusrModMenus.DISCOSSSS, DiscossssScreen::new);
			MenuScreens.register(SiriusrModMenus.ERTE, ErteScreen::new);
			MenuScreens.register(SiriusrModMenus.DISCOS_3, Discos3Screen::new);
			MenuScreens.register(SiriusrModMenus.DISCOS_4, Discos4Screen::new);
			MenuScreens.register(SiriusrModMenus.DISCOS_2, Discos2Screen::new);
		});
	}
}
