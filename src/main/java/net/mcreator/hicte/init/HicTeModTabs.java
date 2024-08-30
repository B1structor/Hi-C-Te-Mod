
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.hicte.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.hicte.HicTeMod;

public class HicTeModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, HicTeMod.MODID);
	public static final RegistryObject<CreativeModeTab> HI_C_TE_MOD = REGISTRY.register("hi_c_te_mod",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.hic_te.hi_c_te_mod")).icon(() -> new ItemStack(HicTeModItems.HI_C_TE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(HicTeModItems.HI_C_TE.get());
			}).withSearchBar().build());
}
