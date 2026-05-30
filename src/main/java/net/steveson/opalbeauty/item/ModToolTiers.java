package net.steveson.opalbeauty.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.steveson.opalbeauty.BeautifulOpalMod;

import java.util.List;

public class ModToolTiers {
    public static final Tier OPAL = TierSortingRegistry.registerTier(
            new ForgeTier(3, 1561, 8f, 3f, 10,
                    BlockTags.NEEDS_DIAMOND_TOOL, ()-> Ingredient.of(ModItems.OPAL.get())),
            new ResourceLocation(BeautifulOpalMod.MOD_ID, "opal"), List.of(Tiers.DIAMOND), List.of(Tiers.NETHERITE)
    );
}
