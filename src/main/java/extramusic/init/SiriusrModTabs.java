
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package extramusic.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class SiriusrModTabs {
	public static CreativeModeTab TAB_DISCS;

	public static void load() {
		TAB_DISCS = new CreativeModeTab("tabdiscs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(SiriusrModItems.SI.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
