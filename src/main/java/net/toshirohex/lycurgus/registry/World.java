package net.toshirohex.lycurgus.registry;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.block.Blocks;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.HeightRangePlacementModifier;
import net.minecraft.world.gen.decorator.SquarePlacementModifier;
import net.minecraft.world.gen.feature.*;

public class World {
    private static ConfiguredFeature<?, ?> OVERWORLD_STEEL_ORE_CONFIGURED_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.STEEL_ORE.getDefaultState(),
                    9)); // vein size
    public static PlacedFeature OVERWORLD_STEEL_ORE_PLACED_FEATURE = OVERWORLD_STEEL_ORE_CONFIGURED_FEATURE.withPlacement(
            CountPlacementModifier.of(10), // number of veins per chunk
            SquarePlacementModifier.of(), // spreading horizontally
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(28))); // height

    private static ConfiguredFeature<?, ?> OVERWORLD_HANDS_COLD_ORE_CONFIGURED_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    OreConfiguredFeatures.STONE_ORE_REPLACEABLES,
                    ModBlocks.HANDS_COLD_ORE.getDefaultState(),
                    9)); // vein size
    public static PlacedFeature OVERWORLD_HANDS_COLD_ORE_PLACED_FEATURE = OVERWORLD_HANDS_COLD_ORE_CONFIGURED_FEATURE.withPlacement(
            CountPlacementModifier.of(10), // number of veins per chunk
            SquarePlacementModifier.of(), // spreading horizontally
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(28))); // height

    private static ConfiguredFeature<?, ?> END_ENDIUM_ORE_CONFIGURED_FEATURE = Feature.ORE
            .configure(new OreFeatureConfig(
                    new BlockMatchRuleTest(Blocks.END_STONE), // we use new BlockMatchRuleTest(Blocks.END_STONE) here
                    ModBlocks.ENDIUM_ORE.getDefaultState(),
                    4));

    public static PlacedFeature END_ENDIUM_ORE_PLACED_FEATURE = END_ENDIUM_ORE_CONFIGURED_FEATURE.withPlacement(
            CountPlacementModifier.of(1),
            SquarePlacementModifier.of(),
            HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(64)));

    public static void GenerateOres(){
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("lycurgus", "overworld_steel_ore"), OVERWORLD_STEEL_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("lycurgus", "overworld_steel_ore"),
                OVERWORLD_STEEL_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("lycurgus", "overworld_steel_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("lycurgus", "overworld_hands_cold_ore"), OVERWORLD_HANDS_COLD_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("lycurgus", "overworld_hands_cold_ore"),
                OVERWORLD_HANDS_COLD_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("lycurgus", "overworld_hands_cold_ore")));

        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE,
                new Identifier("tutorial", "end_wool_ore"), END_ENDIUM_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier("tutorial", "end_wool_ore"),
                END_ENDIUM_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY,
                        new Identifier("tutorial", "end_wool_ore")));

    }
}
