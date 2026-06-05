package net.steveson.opalbeauty.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BeautifulOpalMod.MOD_ID);

    public static final Supplier<CreativeModeTab> OPAL_TAB = CREATIVE_MODE_TAB.register("opal_tab",
            ()-> CreativeModeTab.builder().icon(()-> new ItemStack(ModItems.OPAL.get()))
                    .title(Component.translatable("creativetab.beautiful_opals.opal_tab"))
                    .displayItems((pParameters, output) -> {
                        output.accept(ModBlocks.OPAL_ORE);
                        output.accept(ModBlocks.DEEPSLATE_OPAL_ORE);
                        output.accept(ModBlocks.END_OPAL_ORE);
                        output.accept(ModBlocks.OPAL_BLOCK);
                        output.accept(ModBlocks.OPAL_STAIRS);
                        output.accept(ModBlocks.OPAL_SLAB);
                        output.accept(ModItems.OPAL);
                        output.accept(ModItems.OPAL_SWORD);
                        output.accept(ModItems.OPAL_PICKAXE);
                        output.accept(ModItems.OPAL_AXE);
                        output.accept(ModItems.OPAL_SHOVEL);
                        output.accept(ModItems.OPAL_HOE);

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
