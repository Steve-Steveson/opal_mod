package net.steveson.opalbeauty.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BeautifulOpalMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
//        evenSimplerBlockItem(ModBlocks.COAL_STAIRS);
//        evenSimplerBlockItem(ModBlocks.COAL_SLAB);
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(BeautifulOpalMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }
}
