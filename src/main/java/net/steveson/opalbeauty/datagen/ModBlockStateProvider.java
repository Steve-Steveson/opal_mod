package net.steveson.opalbeauty.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
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
        stairsBlock(ModBlocks.OPAL_STAIRS.get(), blockTexture(ModBlocks.OPAL_BLOCK.get()));
        slabBlock(ModBlocks.OPAL_SLAB.get(), blockTexture(ModBlocks.OPAL_BLOCK.get()), blockTexture(ModBlocks.OPAL_BLOCK.get()));

        blockItem(ModBlocks.OPAL_STAIRS);
        blockItem(ModBlocks.OPAL_SLAB);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(BeautifulOpalMod.MOD_ID + ":block/" + deferredBlock.getId().getPath()));
    }

//    private void blockItem(DeferredBlock<?> deferredBlock, String appendix) {
//        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile(SolidGoldStairsMod.MOD_ID + ":block/" + deferredBlock.getId().getPath() + appendix));
//    }
}
