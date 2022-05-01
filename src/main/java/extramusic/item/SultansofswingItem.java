
package extramusic.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import extramusic.init.SiriusrModTabs;
import extramusic.init.SiriusrModSounds;

public class SultansofswingItem extends RecordItem {
	public SultansofswingItem() {
		super(0, SiriusrModSounds.REGISTRY.get(new ResourceLocation("siriusr:sultans_of_swing-dire_straits")),
				new Item.Properties().tab(SiriusrModTabs.TAB_DISCS).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("sultansofswing");
	}
}
