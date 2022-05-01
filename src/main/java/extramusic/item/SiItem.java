
package extramusic.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SiItem extends Item {
	public SiItem() {
		super(new Item.Properties().tab(null).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("si");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
