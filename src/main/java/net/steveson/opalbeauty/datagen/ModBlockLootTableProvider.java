package net.steveson.opalbeauty.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.steveson.opalbeauty.block.ModBlocks;
import net.steveson.opalbeauty.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.OPAL_BLOCK.get());
        dropSelf(ModBlocks.OPAL_STAIRS.get());
        add(ModBlocks.OPAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OPAL_SLAB.get()));

        add(ModBlocks.OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.OPAL_ORE.get(), ModItems.OPAL.get()));
        add(ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_OPAL_ORE.get(), ModItems.OPAL.get()));
        add(ModBlocks.END_OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.END_OPAL_ORE.get(), ModItems.OPAL.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
