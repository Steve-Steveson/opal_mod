package net.steveson.opalbeauty.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ORES_OPAL = commonTag("ores/opal");
        public static final TagKey<Block> STORAGE_BLOCKS_OPAL = commonTag("storage_blocks/opal");

        public static final TagKey<Block> ORES = commonTag("ores");
        public static final TagKey<Block> ORES_IN_STONE = commonTag("ores_in_ground/stone");
        public static final TagKey<Block> ORES_IN_DEEPSLATE = commonTag("ores_in_ground/deepslate");
        public static final TagKey<Block> ORE_RATES_SINGULAR = commonTag("ore_rates/singular");



        private static TagKey<Block> commonTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }

    public static class Items {
        public static final TagKey<Item> GEMS_OPAL = commonTag("gems/opal");
        public static final TagKey<Item> GEMS = commonTag("gems");

        public static final TagKey<Item> ORES_OPAL = commonTag("ores/opal");
        public static final TagKey<Item> STORAGE_BLOCKS_OPAL = commonTag("storage_blocks/opal");

        public static final TagKey<Item> ORES = commonTag("ores");
        public static final TagKey<Item> ORES_IN_STONE = commonTag("ores_in_ground/stone");
        public static final TagKey<Item> ORES_IN_DEEPSLATE = commonTag("ores_in_ground/deepslate");
        public static final TagKey<Item> ORE_RATES_SINGULAR = commonTag("ore_rates/singular");


        public static final TagKey<Item> ARMORS = commonTag("armors");
        public static final TagKey<Item> HELMETS = commonTag("armors/helmets");
        public static final TagKey<Item> CHESTPLATES = commonTag("armors/chestplates");
        public static final TagKey<Item> LEGGINGS = commonTag("armors/leggings");
        public static final TagKey<Item> BOOTS = commonTag("armors/boots");

        public static final TagKey<Item> STICKS = commonTag("rods/wooden");



        private static TagKey<Item> commonTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
