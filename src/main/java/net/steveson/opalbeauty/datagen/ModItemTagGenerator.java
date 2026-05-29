package net.steveson.opalbeauty.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.steveson.opalbeauty.block.ModBlocks;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.item.ModItems;
import net.steveson.opalbeauty.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, BeautifulOpalMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.STAIRS).add(
                ModBlocks.OPAL_STAIRS.get().asItem()
        );
        this.tag(ItemTags.SLABS).add(
                ModBlocks.OPAL_SLAB.get().asItem()
        );


        this.tag(ModTags.Items.STORAGE_BLOCKS_OPAL).add(
                ModBlocks.OPAL_BLOCK.get().asItem()
        );
        this.tag(ModTags.Items.ORES_OPAL).add(
                ModBlocks.OPAL_ORE.get().asItem(),
                ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem(),
                ModBlocks.END_OPAL_ORE.get().asItem()
        );
        this.tag(ModTags.Items.ORES).add(
                ModBlocks.OPAL_ORE.get().asItem(),
                ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem(),
                ModBlocks.END_OPAL_ORE.get().asItem()
        );
        this.tag(ModTags.Items.ORES_IN_STONE).add(
                ModBlocks.OPAL_ORE.get().asItem()
        );
        this.tag(ModTags.Items.ORES_IN_DEEPSLATE).add(
                ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem()
        );


        this.tag(ModTags.Items.ORE_RATES_SINGULAR).add(
                ModBlocks.OPAL_ORE.get().asItem(),
                ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem(),
                ModBlocks.END_OPAL_ORE.get().asItem()
        );




        this.tag(ModTags.Items.GEMS_OPAL).add(
                ModItems.OPAL.get()
        );
        this.tag(ModTags.Items.GEMS).add(
                ModItems.OPAL.get()
        );
    }
}
