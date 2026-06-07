package net.steveson.opalbeauty.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.BlockMatchTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;
import net.steveson.opalbeauty.BeautifulOpalMod;
import net.steveson.opalbeauty.block.ModBlocks;

import java.util.List;

public class ModConfiguredFeatures {
    public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_OPAL_ORE_KEY = registerKey("opal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_OPAL_ORE_KEY = registerKey("end_opal_ore");
    public static final ResourceKey<ConfiguredFeature<?, ?>> END_OPAL_ORE_LOWER_KEY = registerKey("end_opal_ore_lower");

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceable = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest endReplaceable = new BlockMatchTest(Blocks.END_STONE);

        List<OreConfiguration.TargetBlockState> overworldOpalOres = List.of(
                OreConfiguration.target(stoneReplaceable, ModBlocks.OPAL_ORE.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceable, ModBlocks.DEEPSLATE_OPAL_ORE.get().defaultBlockState()));

        register(context, OVERWORLD_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(overworldOpalOres, 3, 1.0F));
        register(context, END_OPAL_ORE_KEY, Feature.ORE, new OreConfiguration(endReplaceable,
                ModBlocks.END_OPAL_ORE.get().defaultBlockState(), 7));
        register(context, END_OPAL_ORE_LOWER_KEY, Feature.ORE, new OreConfiguration(endReplaceable,
                ModBlocks.END_OPAL_ORE.get().defaultBlockState(), 12));
    }

    public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(BeautifulOpalMod.MOD_ID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
