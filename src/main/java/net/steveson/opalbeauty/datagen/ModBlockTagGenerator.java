package net.steveson.opalbeauty.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BeautifulOpalMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.OPAL_ORE.get(),
                ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                ModBlocks.END_OPAL_ORE.get(),
                ModBlocks.OPAL_BLOCK.get(),
                ModBlocks.OPAL_STAIRS.get(),
                ModBlocks.OPAL_SLAB.get()
        );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                ModBlocks.OPAL_ORE.get(),
                ModBlocks.DEEPSLATE_OPAL_ORE.get(),
                ModBlocks.END_OPAL_ORE.get(),
                ModBlocks.OPAL_BLOCK.get(),
                ModBlocks.OPAL_STAIRS.get(),
                ModBlocks.OPAL_SLAB.get()
        );


        this.tag(BlockTags.STAIRS).add(
                ModBlocks.OPAL_STAIRS.get()
        );
        this.tag(BlockTags.SLABS).add(
                ModBlocks.OPAL_SLAB.get()
        );
    }
}
