package net.toshirohex.lycurgus;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.toshirohex.lycurgus.registry.ModArmors;
import net.toshirohex.lycurgus.registry.ModBlocks;
import net.toshirohex.lycurgus.registry.ModItems;

public class Lycurgus implements ModInitializer {

	public static final String MOD_ID = "lycurgus";

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
			new Identifier(MOD_ID, "general"),
			() -> new ItemStack(ModItems.TOE));

	@Override
	public void onInitialize() {
		ModItems.registerItems();
		ModBlocks.registerBlocks();
		ModArmors.registerItems();
	}
}
