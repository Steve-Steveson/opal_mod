package net.steveson.opalbeauty.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;
import net.steveson.opalbeauty.item.ModItems;
import net.steveson.opalbeauty.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }


    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK)
                .pattern("OOO")
                .pattern("OOO")
                .pattern("OOO")
                .define('O', ModTags.Items.GEMS_OPAL)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_STAIRS, 4)
                .pattern("O  ")
                .pattern("OO ")
                .pattern("OOO")
                .define('O', ModTags.Items.STORAGE_BLOCKS_OPAL)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_SLAB, 6)
                .pattern("OOO")
                .define('O', ModTags.Items.STORAGE_BLOCKS_OPAL)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ModItems.OPAL, 9)
                .requires(ModTags.Items.STORAGE_BLOCKS_OPAL)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(recipeOutput);

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModTags.Items.STORAGE_BLOCKS_OPAL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_STAIRS)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(recipeOutput, BeautifulOpalMod.MOD_ID + ":" + getItemName(ModBlocks.OPAL_STAIRS) + "_from_stonecutting" );

        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ModTags.Items.STORAGE_BLOCKS_OPAL), RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_SLAB, 2)
                .unlockedBy(getHasName(ModBlocks.OPAL_BLOCK), has(ModTags.Items.STORAGE_BLOCKS_OPAL))
                .save(recipeOutput, BeautifulOpalMod.MOD_ID + ":" + getItemName(ModBlocks.OPAL_SLAB) + "_from_stonecutting" );

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_SWORD)
                .pattern("O")
                .pattern("O")
                .pattern("S")
                .define('O', ModTags.Items.GEMS_OPAL)
                .define('S', ModTags.Items.STICKS)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_PICKAXE)
                .pattern("OOO")
                .pattern(" S ")
                .pattern(" S ")
                .define('O', ModTags.Items.GEMS_OPAL)
                .define('S', ModTags.Items.STICKS)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_AXE)
                .pattern("OO")
                .pattern("OS")
                .pattern(" S")
                .define('O', ModTags.Items.GEMS_OPAL)
                .define('S', ModTags.Items.STICKS)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_SHOVEL)
                .pattern("O")
                .pattern("S")
                .pattern("S")
                .define('O', ModTags.Items.GEMS_OPAL)
                .define('S', ModTags.Items.STICKS)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_HOE)
                .pattern("OO")
                .pattern(" S")
                .pattern(" S")
                .define('O', ModTags.Items.GEMS_OPAL)
                .define('S', ModTags.Items.STICKS)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_HELMET)
                .pattern("OOO")
                .pattern("O O")
                .define('O', ModTags.Items.GEMS_OPAL)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_CHESTPLATE)
                .pattern("O O")
                .pattern("OOO")
                .pattern("OOO")
                .define('O', ModTags.Items.GEMS_OPAL)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_LEGGINGS)
                .pattern("OOO")
                .pattern("O O")
                .pattern("O O")
                .define('O', ModTags.Items.GEMS_OPAL)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.OPAL_BOOTS)
                .pattern("O O")
                .pattern("O O")
                .define('O', ModTags.Items.GEMS_OPAL)
                .unlockedBy(getHasName(ModItems.OPAL), has(ModTags.Items.GEMS_OPAL))
                .save(recipeOutput);
    }
}
