
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.fmllegacy.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import java.util.List;
import java.util.ArrayList;

import extramusic.world.inventory.StudioMenu;
import extramusic.world.inventory.MusicMenu;
import extramusic.world.inventory.MstudioMenu;
import extramusic.world.inventory.ErteMenu;
import extramusic.world.inventory.DiscossssMenu;
import extramusic.world.inventory.Discos4Menu;
import extramusic.world.inventory.Discos3Menu;
import extramusic.world.inventory.Discos2Menu;
import extramusic.world.inventory.BardoMenu;
import extramusic.world.inventory.AMusicMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SiriusrModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<StudioMenu> STUDIO = register("studio", (id, inv, extraData) -> new StudioMenu(id, inv, extraData));
	public static final MenuType<BardoMenu> BARDO = register("bardo", (id, inv, extraData) -> new BardoMenu(id, inv, extraData));
	public static final MenuType<MusicMenu> MUSIC = register("music", (id, inv, extraData) -> new MusicMenu(id, inv, extraData));
	public static final MenuType<MstudioMenu> MSTUDIO = register("mstudio", (id, inv, extraData) -> new MstudioMenu(id, inv, extraData));
	public static final MenuType<AMusicMenu> A_MUSIC = register("a_music", (id, inv, extraData) -> new AMusicMenu(id, inv, extraData));
	public static final MenuType<DiscossssMenu> DISCOSSSS = register("discossss", (id, inv, extraData) -> new DiscossssMenu(id, inv, extraData));
	public static final MenuType<ErteMenu> ERTE = register("erte", (id, inv, extraData) -> new ErteMenu(id, inv, extraData));
	public static final MenuType<Discos3Menu> DISCOS_3 = register("discos_3", (id, inv, extraData) -> new Discos3Menu(id, inv, extraData));
	public static final MenuType<Discos4Menu> DISCOS_4 = register("discos_4", (id, inv, extraData) -> new Discos4Menu(id, inv, extraData));
	public static final MenuType<Discos2Menu> DISCOS_2 = register("discos_2", (id, inv, extraData) -> new Discos2Menu(id, inv, extraData));

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
