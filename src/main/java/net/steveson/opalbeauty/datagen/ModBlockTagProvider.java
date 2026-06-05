package net.steveson.opalbeauty.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;
import net.steveson.opalbeauty.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BeautifulOpalMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get())
                .add(ModBlocks.END_OPAL_ORE.get())
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_STAIRS.get())
                .add(ModBlocks.OPAL_SLAB.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get())
                .add(ModBlocks.END_OPAL_ORE.get())
                .add(ModBlocks.OPAL_BLOCK.get())
                .add(ModBlocks.OPAL_STAIRS.get())
                .add(ModBlocks.OPAL_SLAB.get());


        tag(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.OPAL_BLOCK.get());
        tag(BlockTags.STAIRS)
                .add(ModBlocks.OPAL_STAIRS.get());
        tag(BlockTags.SLABS)
                .add(ModBlocks.OPAL_SLAB.get());



        tag(ModTags.Blocks.STORAGE_BLOCKS)
                .add(ModBlocks.OPAL_BLOCK.get());
        tag(ModTags.Blocks.STORAGE_BLOCKS_OPAL)
                .add(ModBlocks.OPAL_BLOCK.get());

        tag(ModTags.Blocks.ORES)
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get())
                .add(ModBlocks.END_OPAL_ORE.get());
        tag(ModTags.Blocks.ORES_OPAL)
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get())
                .add(ModBlocks.END_OPAL_ORE.get());
        tag(ModTags.Blocks.ORES_IN_STONE)
                .add(ModBlocks.OPAL_ORE.get());
        tag(ModTags.Blocks.ORES_IN_DEEPSLATE)
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get());
        tag(ModTags.Blocks.ORE_RATES_SINGULAR)
                .add(ModBlocks.OPAL_ORE.get())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get())
                .add(ModBlocks.END_OPAL_ORE.get());
    }
}
