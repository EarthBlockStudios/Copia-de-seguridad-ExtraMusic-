
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import extramusic.world.inventory.StudioMenu;
import extramusic.world.inventory.GUIindexMenu;
import extramusic.world.inventory.BardoMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SiriusrModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<StudioMenu> STUDIO = register("studio", (id, inv, extraData) -> new StudioMenu(id, inv, extraData));
	public static final MenuType<BardoMenu> BARDO = register("bardo", (id, inv, extraData) -> new BardoMenu(id, inv, extraData));
	public static final MenuType<GUIindexMenu> GU_IINDEX = register("gu_iindex", (id, inv, extraData) -> new GUIindexMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
