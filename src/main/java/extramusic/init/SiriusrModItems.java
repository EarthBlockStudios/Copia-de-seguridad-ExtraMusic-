
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import java.util.List;
import java.util.ArrayList;

import extramusic.item.WonderwallItem;
import extramusic.item.SweweaItem;
import extramusic.item.SultansofswingItem;
import extramusic.item.SmliktinspirtItem;
import extramusic.item.SiItem;
import extramusic.item.SevennationarmyItem;
import extramusic.item.SavetonightItem;
import extramusic.item.MusicscoresItem;
import extramusic.item.MorirodareItem;
import extramusic.item.GiothemeItem;
import extramusic.item.EnemyItem;
import extramusic.item.DuhastItem;
import extramusic.item.DiscoVItem;
import extramusic.item.CotckItem;
import extramusic.item.CometogetherItem;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class SiriusrModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item COMETOGETHER = register(new CometogetherItem());
	public static final Item ENEMY = register(new EnemyItem());
	public static final Item MUSICSTUDIO = register(SiriusrModBlocks.MUSICSTUDIO, CreativeModeTab.TAB_DECORATIONS);
	public static final Item DISCO_V = register(new DiscoVItem());
	public static final Item COTCK = register(new CotckItem());
	public static final Item BARD = register(
			new SpawnEggItem(SiriusrModEntities.BARD, -16711783, -16724788, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("bard_spawn_egg"));
	public static final Item MUSICSCORES = register(new MusicscoresItem());
	public static final Item WONDERWALL = register(new WonderwallItem());
	public static final Item SI = register(new SiItem());
	public static final Item SWEWEA = register(new SweweaItem());
	public static final Item GIOTHEME = register(new GiothemeItem());
	public static final Item SMLIKTINSPIRT = register(new SmliktinspirtItem());
	public static final Item MORIRODARE = register(new MorirodareItem());
	public static final Item SEVENNATIONARMY = register(new SevennationarmyItem());
	public static final Item SAVETONIGHT = register(new SavetonightItem());
	public static final Item SULTANSOFSWING = register(new SultansofswingItem());
	public static final Item DUHAST = register(new DuhastItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
