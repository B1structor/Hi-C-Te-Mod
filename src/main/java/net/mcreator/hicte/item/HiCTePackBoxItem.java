
package net.mcreator.hicte.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class HiCTePackBoxItem extends Item {
	public HiCTePackBoxItem() {
		super(new Item.Properties().stacksTo(16).rarity(Rarity.UNCOMMON));
	}
}
