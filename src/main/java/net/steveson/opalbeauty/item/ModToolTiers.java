package net.steveson.opalbeauty.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier OPAL = new SimpleTier(BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561, 8f, 3f, 10, ()-> Ingredient.of(ModItems.OPAL));
}
