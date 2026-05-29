package net.steveson.opalbeauty.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BeautifulOpalMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.OPAL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_OPAL_ORE);
        blockWithItem(ModBlocks.END_OPAL_ORE);
        blockWithItem(ModBlocks.OPAL_BLOCK);
        stairsBlock(((StairBlock) ModBlocks.OPAL_STAIRS.get()), blockTexture(ModBlocks.OPAL_BLOCK.get()));
        slabBlock(((SlabBlock) ModBlocks.OPAL_SLAB.get()), blockTexture(ModBlocks.OPAL_BLOCK.get()), blockTexture(ModBlocks.OPAL_BLOCK.get()));
    }


    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
