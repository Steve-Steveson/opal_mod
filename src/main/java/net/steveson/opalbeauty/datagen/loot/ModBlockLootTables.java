package net.steveson.opalbeauty.datagen.loot;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.block.ModBlocks;
import net.steveson.opalbeauty.item.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.OPAL_BLOCK.get());
        this.dropSelf(ModBlocks.OPAL_STAIRS.get());
        this.add(ModBlocks.OPAL_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.OPAL_SLAB.get()));

        this.add(ModBlocks.OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.OPAL_ORE.get(), ModItems.OPAL.get()));
        this.add(ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.DEEPSLATE_OPAL_ORE.get(), ModItems.OPAL.get()));
        this.add(ModBlocks.END_OPAL_ORE.get(),
                block -> createOreDrop(ModBlocks.END_OPAL_ORE.get(), ModItems.OPAL.get()));

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
