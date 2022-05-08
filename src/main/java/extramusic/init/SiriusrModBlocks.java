
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import extramusic.block.MusicstudioBlock;

import extramusic.SiriusrMod;

public class SiriusrModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, SiriusrMod.MODID);
	public static final RegistryObject<Block> MUSICSTUDIO = REGISTRY.register("musicstudio", () -> new MusicstudioBlock());
}
