package net.steveson.opalbeauty.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;
import net.steveson.opalbeauty.item.ModItems;
import net.steveson.opalbeauty.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, BeautifulOpalMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.STAIRS)
                .add(ModBlocks.OPAL_STAIRS.get().asItem());
        tag(ItemTags.SLABS)
                .add(ModBlocks.OPAL_SLAB.get().asItem());

        tag(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(ModItems.OPAL.get());
        tag(ItemTags.TRIM_MATERIALS)
                .add(ModItems.OPAL.get());

        tag(ItemTags.SWORDS)
                .add(ModItems.OPAL_SWORD.get());
        tag(ItemTags.PICKAXES)
                .add(ModItems.OPAL_PICKAXE.get());
        tag(ItemTags.AXES)
                .add(ModItems.OPAL_AXE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.OPAL_SHOVEL.get());
        tag(ItemTags.HOES)
                .add(ModItems.OPAL_HOE.get());

        tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.OPAL_HELMET.get())
                .add(ModItems.OPAL_CHESTPLATE.get())
                .add(ModItems.OPAL_LEGGINGS.get())
                .add(ModItems.OPAL_BOOTS.get());
        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.OPAL_HELMET.get());
        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.OPAL_CHESTPLATE.get());
        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.OPAL_LEGGINGS.get());
        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.OPAL_BOOTS.get());



        tag(ModTags.Items.STORAGE_BLOCKS)
                .add(ModBlocks.OPAL_BLOCK.get().asItem());
        tag(ModTags.Items.STORAGE_BLOCKS_OPAL)
                .add(ModBlocks.OPAL_BLOCK.get().asItem());

        tag(ModTags.Items.ORES)
                .add(ModBlocks.OPAL_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem())
                .add(ModBlocks.END_OPAL_ORE.get().asItem());
        tag(ModTags.Items.ORES_OPAL)
                .add(ModBlocks.OPAL_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem())
                .add(ModBlocks.END_OPAL_ORE.get().asItem());
        tag(ModTags.Items.ORES_IN_STONE)
                .add(ModBlocks.OPAL_ORE.get().asItem());
        tag(ModTags.Items.ORES_IN_DEEPSLATE)
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem());
        tag(ModTags.Items.ORE_RATES_SINGULAR)
                .add(ModBlocks.OPAL_ORE.get().asItem())
                .add(ModBlocks.DEEPSLATE_OPAL_ORE.get().asItem())
                .add(ModBlocks.END_OPAL_ORE.get().asItem());

//        tag(ModTags.Items.GEMS_OPAL)
//                .add(ModItems.OPAL.get());
//        tag(ModTags.Items.GEMS)
//                .add(ModItems.OPAL.get());
    }
}
