package net.steveson.opalbeauty.trim;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.item.ModArmorMaterials;
import net.steveson.opalbeauty.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> OPAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, new ResourceLocation(BeautifulOpalMod.MOD_ID, "opal"));

    public static void bootstrap(BootstapContext<TrimMaterial> pContext) {
//        register(pContext, OPAL, ModItems.OPAL.get(), Style.EMPTY.withColor(14071543), 0.91F, Map.of(ModArmorMaterials.OPAL, "opal_darker"));
        register(pContext, OPAL, ModItems.OPAL.get(), Style.EMPTY.withColor(14071543), 0.91F);
    }



//    private static void register(BootstapContext<TrimMaterial> pContext, ResourceKey<TrimMaterial> pMaterialKey, Item pIngredient,
//                                 Style pStyle, float pItemModelIndex) {
//        register(pContext, pMaterialKey, pIngredient, pStyle, pItemModelIndex, Map.of());
//    }
//
//    private static void register(BootstapContext<TrimMaterial> pContext, ResourceKey<TrimMaterial> pMaterialKey, Item pIngredient,
//                                 Style pStyle, float pItemModelIndex, Map<ModArmorMaterials, String> pOverrideArmorMaterials) {
//        TrimMaterial trimmaterial = TrimMaterial.create(pMaterialKey.location().getPath(), pIngredient, pItemModelIndex,
//                Component.translatable(Util.makeDescriptionId("trim_material", pMaterialKey.location())).withStyle(pStyle), pOverrideArmorMaterials);
//        pContext.register(pMaterialKey, trimmaterial);
//    }

    private static void register(BootstapContext<TrimMaterial> pContext, ResourceKey<TrimMaterial> pMaterialKey, Item pIngredient,
                                 Style pStyle, float pItemModelIndex) {
        TrimMaterial trimmaterial = TrimMaterial.create(pMaterialKey.location().getPath(), pIngredient, pItemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", pMaterialKey.location())).withStyle(pStyle), Map.of());
        pContext.register(pMaterialKey, trimmaterial);
    }

}
