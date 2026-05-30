package net.steveson.opalbeauty.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;
import net.steveson.opalbeauty.item.ModItems;
import net.steveson.opalbeauty.util.ModTags;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK.get())
                .pattern("OOO")
                .pattern("OOO")
                .pattern("OOO")
                .define('O', ModTags.Items.GEMS_OPAL)
                .unlockedBy(getHasName(ModItems.OPAL.get()), has(ModTags.Items.GEMS_OPAL))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_STAIRS.get(),4)
                .pattern("O  ")
                .pattern("OO ")
                .pattern("OOO")
                .define('O', ModTags.Items.STORAGE_BLOCKS_OPAL)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK.get()), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_SLAB.get(),6)
                .pattern("OOO")
                .define('O', ModTags.Items.STORAGE_BLOCKS_OPAL)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK.get()), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.OPAL.get(), 9)
                .requires(ModTags.Items.STORAGE_BLOCKS_OPAL)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK.get()), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(consumer);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModTags.Items.STORAGE_BLOCKS_OPAL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_STAIRS.get())
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK.get()), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(consumer,  BeautifulOpalMod.MOD_ID + ":" + getItemName(ModBlocks.OPAL_STAIRS.get()) + "_from_stonecutting" );

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModTags.Items.STORAGE_BLOCKS_OPAL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_SLAB.get(), 2)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK.get()), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(consumer,  BeautifulOpalMod.MOD_ID + ":" + getItemName(ModBlocks.OPAL_SLAB.get()) + "_from_stonecutting" );





//        oreBlasting(consumer, ModTags.Items.ORES_OPAL, RecipeCategory.MISC, ModItems.OPAL.get(), 0.1f, 100, "opal");
    }


//    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
//        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
//    }
//
//    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
//        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
//    }
//
//    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
//        for(ItemLike itemlike : pIngredients) {
//            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory,
//                    pResult, pExperience, pCookingTime, pCookingSerializer).group(pGroup)
//                    .unlockedBy(getHasName(itemlike), has(itemlike))
//                    .save(pFinishedRecipeConsumer, BeautifulOpalMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
//        }
//    }

}
