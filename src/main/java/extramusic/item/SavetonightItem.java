
package extramusic.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import extramusic.init.SiriusrModTabs;
import extramusic.init.SiriusrModSounds;

public class SavetonightItem extends RecordItem {
	public SavetonightItem() {
		super(0, SiriusrModSounds.REGISTRY.get(new ResourceLocation("siriusr:save_tonight-eagle_eye_cherry")),
				new Item.Properties().tab(SiriusrModTabs.TAB_DISCS).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("savetonight");
	}
}
