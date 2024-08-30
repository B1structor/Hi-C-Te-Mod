
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.hicte.item.HiCTeItem;
import net.mcreator.hicte.HicTeMod;

public class HicTeModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, HicTeMod.MODID);
	public static final RegistryObject<Item> HI_C_TE = REGISTRY.register("hi_c_te", () -> new HiCTeItem());
	// Start of user code block custom items
	// End of user code block custom items
}
