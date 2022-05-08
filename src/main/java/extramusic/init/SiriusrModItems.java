
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

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

import extramusic.SiriusrMod;

public class SiriusrModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SiriusrMod.MODID);
	public static final RegistryObject<Item> COMETOGETHER = REGISTRY.register("cometogether", () -> new CometogetherItem());
	public static final RegistryObject<Item> ENEMY = REGISTRY.register("enemy", () -> new EnemyItem());
	public static final RegistryObject<Item> MUSICSTUDIO = block(SiriusrModBlocks.MUSICSTUDIO, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> DISCO_V = REGISTRY.register("disco_v", () -> new DiscoVItem());
	public static final RegistryObject<Item> COTCK = REGISTRY.register("cotck", () -> new CotckItem());
	public static final RegistryObject<Item> BARD = REGISTRY.register("bard_spawn_egg",
			() -> new ForgeSpawnEggItem(SiriusrModEntities.BARD, -16711783, -16724788, new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
	public static final RegistryObject<Item> MUSICSCORES = REGISTRY.register("musicscores", () -> new MusicscoresItem());
	public static final RegistryObject<Item> WONDERWALL = REGISTRY.register("wonderwall", () -> new WonderwallItem());
	public static final RegistryObject<Item> SI = REGISTRY.register("si", () -> new SiItem());
	public static final RegistryObject<Item> SWEWEA = REGISTRY.register("swewea", () -> new SweweaItem());
	public static final RegistryObject<Item> GIOTHEME = REGISTRY.register("giotheme", () -> new GiothemeItem());
	public static final RegistryObject<Item> SMLIKTINSPIRT = REGISTRY.register("smliktinspirt", () -> new SmliktinspirtItem());
	public static final RegistryObject<Item> MORIRODARE = REGISTRY.register("morirodare", () -> new MorirodareItem());
	public static final RegistryObject<Item> SEVENNATIONARMY = REGISTRY.register("sevennationarmy", () -> new SevennationarmyItem());
	public static final RegistryObject<Item> SAVETONIGHT = REGISTRY.register("savetonight", () -> new SavetonightItem());
	public static final RegistryObject<Item> SULTANSOFSWING = REGISTRY.register("sultansofswing", () -> new SultansofswingItem());
	public static final RegistryObject<Item> DUHAST = REGISTRY.register("duhast", () -> new DuhastItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
