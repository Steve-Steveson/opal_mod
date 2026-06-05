package net.steveson.opalbeauty.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.item.ModItems;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BeautifulOpalMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.OPAL.get());

        handheldItem(ModItems.OPAL_SWORD);
        handheldItem(ModItems.OPAL_PICKAXE);
        handheldItem(ModItems.OPAL_AXE);
        handheldItem(ModItems.OPAL_SHOVEL);
        handheldItem(ModItems.OPAL_HOE);

    }


    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(BeautifulOpalMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
