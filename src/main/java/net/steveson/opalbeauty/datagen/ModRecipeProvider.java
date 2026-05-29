package net.steveson.opalbeauty.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {



        registerStairsCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK.get(), ModBlocks.OPAL_STAIRS,consumer);
        registerSlabCraftingRecipe(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OPAL_BLOCK.get(), ModBlocks.OPAL_STAIRS,consumer);



        registerStonecuttingRecipe(ModBlocks.OPAL_BLOCK.get(), ModBlocks.OPAL_STAIRS, consumer);
        registerStonecuttingRecipe(ModBlocks.OPAL_BLOCK.get(), ModBlocks.OPAL_STAIRS, consumer, 2);

    }


    private static void registerStairsCraftingRecipe(RecipeCategory category, ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(category, output.get(),4)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .define('I', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer,  BeautifulOpalMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()));
    }

    private static void registerSlabCraftingRecipe(RecipeCategory category, ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(category, output.get(),6)
                .pattern("III")
                .define('I', input)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer,  BeautifulOpalMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()));
    }


    private static void registerWaxCraftingRecipe(RegistryObject<Block> input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output.get())
                .requires(input.get())
                .requires(Items.HONEYCOMB)
                .unlockedBy(getHasName(input.get()), has(input.get()))
                .save(consumer,  BeautifulOpalMod.MOD_ID + ":" + "crafting/" + getItemName(output.get()) + "_from_honeycomb");
    }


    private static void registerStonecuttingRecipe(ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer, int resultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output.get(), resultCount)
                .unlockedBy(getHasName(input), has(input))
                .save(consumer,  BeautifulOpalMod.MOD_ID + ":" + "stonecutting/" + getItemName(output.get()));
    }
    private static void registerStonecuttingRecipe(ItemLike input, RegistryObject<Block> output, Consumer<FinishedRecipe> consumer) {
        registerStonecuttingRecipe(input, output, consumer,1);
    }
}
