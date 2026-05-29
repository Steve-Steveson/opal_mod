package net.steveson.opalbeauty.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeautifulOpalMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> OPAL_TAB = CREATIVE_MODE_TABS.register("opal_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.OPAL.get()))
                    .title(Component.translatable("creativetab.opal_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.OPAL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_OPAL_ORE.get());
                        pOutput.accept(ModBlocks.END_OPAL_ORE.get());
                        pOutput.accept(ModBlocks.OPAL_BLOCK.get());
                        pOutput.accept(ModBlocks.OPAL_STAIRS.get());
                        pOutput.accept(ModBlocks.OPAL_SLAB.get());
                        pOutput.accept(ModItems.OPAL.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
