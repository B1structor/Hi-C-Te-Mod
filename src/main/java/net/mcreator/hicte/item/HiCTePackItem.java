
package net.mcreator.hicte.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HiCTePackItem extends Item {
	public HiCTePackItem() {
		super(new Item.Properties().stacksTo(8).rarity(Rarity.RARE).food((new FoodProperties.Builder()).nutrition(8).saturationMod(0.6f).alwaysEat().build()));
	}
}
