package net.steveson.opalbeauty.trim;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.item.ModArmorMaterials;
import net.steveson.opalbeauty.item.ModItems;

import java.util.Map;

public class ModTrimMaterials {
    public static final ResourceKey<TrimMaterial> OPAL =
            ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(BeautifulOpalMod.MOD_ID, "opal"));

    public static void bootstrap(BootstrapContext<TrimMaterial> pContext) {
        register(pContext, OPAL, ModItems.OPAL.get(), Style.EMPTY.withColor(14071543), 0.91F, Map.of(ModArmorMaterials.OPAL_ARMOR_MATERIAL, "opal_darker"));
//        register(pContext, OPAL, ModItems.OPAL.get(), Style.EMPTY.withColor(14071543), 0.91F);
    }

//    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
//                                 Style style, float itemModelIndex, Map<Holder<ArmorMaterial>, String> overrideArmorMaterials) {
//        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
//                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style));
//        context.register(trimKey, trimmaterial);
//    }

    private static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> trimKey, Item item,
                                 Style style, float itemModelIndex, Map<Holder<ArmorMaterial>, String> overrideArmorMaterials) {
        TrimMaterial trimmaterial = TrimMaterial.create(trimKey.location().getPath(), item, itemModelIndex,
                Component.translatable(Util.makeDescriptionId("trim_material", trimKey.location())).withStyle(style), overrideArmorMaterials);
        context.register(trimKey, trimmaterial);
    }
}
