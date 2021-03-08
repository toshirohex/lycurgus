package net.toshirohex.lycurgus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.toshirohex.lycurgus.registry.ModArmors;
import net.toshirohex.lycurgus.registry.ModBlocks;
import net.toshirohex.lycurgus.registry.ModItems;

public class Lycurgus implements ModInitializer {

	public static final String MOD_ID = "lycurgus";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "general"),
			() -> new ItemStack(ModItems.Ingots[2]));
	private static final ConfiguredFeature<?, ?> STEEL_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					ModBlocks.STEEL_ORE.getDefaultState(),
					3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					64)))
			.spreadHorizontally()
			.repeat(3); // number of veins per chunk

	private static final ConfiguredFeature<?, ?> HANDS_COLD_ORE_OVERWORLD = Feature.ORE
			.configure(new OreFeatureConfig(
					OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
					ModBlocks.HANDS_COLD_ORE.getDefaultState(),
					3)) // vein size
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					64)))
			.spreadHorizontally()
			.repeat(3); // number of veins per chunk

	private static final ConfiguredFeature<?, ?> ENDIUM_ORE_END = Feature.ORE
			.configure(new OreFeatureConfig(
					new BlockMatchRuleTest(Blocks.END_STONE), // base block is endstone in the end biomes
					ModBlocks.ENDIUM_ORE.getDefaultState(),
					4))
			.decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
					0,
					0,
					64)))
			.spreadHorizontally()
			.repeat(5);

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModArmors.registerItems();

		RegistryKey<ConfiguredFeature<?, ?>> steelOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("lycurgus", "steel_ore_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, steelOreOverworld.getValue(), STEEL_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, steelOreOverworld);

		RegistryKey<ConfiguredFeature<?, ?>> handsColdOreOverworld = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("lycurgus", "hands_cold_overworld"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, handsColdOreOverworld.getValue(), HANDS_COLD_ORE_OVERWORLD);
		BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, handsColdOreOverworld);

		RegistryKey<ConfiguredFeature<?, ?>> steelOreEnd = RegistryKey.of(Registry.CONFIGURED_FEATURE_WORLDGEN,
				new Identifier("lycurgus", "endium_ore_end"));
		Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, steelOreEnd.getValue(), ENDIUM_ORE_END);
		BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(), GenerationStep.Feature.UNDERGROUND_ORES, steelOreEnd);
	}


}
