
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.hicte.item.HiCTePackItem;
import net.mcreator.hicte.item.HiCTeItem;
import net.mcreator.hicte.item.HiCTe2LtItem;
import net.mcreator.hicte.HicTeMod;

public class HicTeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HicTeMod.MODID);
	public static final RegistryObject<Item> HI_C_TE = REGISTRY.register("hi_c_te", () -> new HiCTeItem());
	public static final RegistryObject<Item> HI_C_TE_PACK = REGISTRY.register("hi_c_te_pack", () -> new HiCTePackItem());
	public static final RegistryObject<Item> HI_C_TE_2_LT = REGISTRY.register("hi_c_te_2_lt", () -> new HiCTe2LtItem());
	public static final RegistryObject<Item> FUCTIONAL_BLOCK = block(HicTeModBlocks.FUCTIONAL_BLOCK);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
