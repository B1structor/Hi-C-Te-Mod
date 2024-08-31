
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

import net.mcreator.hicte.item.HiCTex3Item;
import net.mcreator.hicte.item.HiCTeinBoxItem;
import net.mcreator.hicte.item.HiCTePackItem;
import net.mcreator.hicte.item.HiCTePackBoxItem;
import net.mcreator.hicte.item.HiCTe2LtItem;
import net.mcreator.hicte.item.HiCTe2LtEmptyItem;
import net.mcreator.hicte.item.CardboardItem;
import net.mcreator.hicte.item.CarboardBoxItem;
import net.mcreator.hicte.HicTeMod;

public class HicTeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HicTeMod.MODID);
	public static final RegistryObject<Item> FUCTIONAL_BLOCK = block(HicTeModBlocks.FUCTIONAL_BLOCK);
	public static final RegistryObject<Item> HI_C_TEIN_BOX = REGISTRY.register("hi_c_tein_box", () -> new HiCTeinBoxItem());
	public static final RegistryObject<Item> HI_C_TEX_3 = REGISTRY.register("hi_c_tex_3", () -> new HiCTex3Item());
	public static final RegistryObject<Item> HI_C_TE_PACK_BOX = REGISTRY.register("hi_c_te_pack_box", () -> new HiCTePackBoxItem());
	public static final RegistryObject<Item> HI_C_TE_PACK = REGISTRY.register("hi_c_te_pack", () -> new HiCTePackItem());
	public static final RegistryObject<Item> HI_C_TE_2_LT_EMPTY = REGISTRY.register("hi_c_te_2_lt_empty", () -> new HiCTe2LtEmptyItem());
	public static final RegistryObject<Item> HI_C_TE_2_LT = REGISTRY.register("hi_c_te_2_lt", () -> new HiCTe2LtItem());
	public static final RegistryObject<Item> CARBOARD_BOX = REGISTRY.register("carboard_box", () -> new CarboardBoxItem());
	public static final RegistryObject<Item> CARDBOARD = REGISTRY.register("cardboard", () -> new CardboardItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
