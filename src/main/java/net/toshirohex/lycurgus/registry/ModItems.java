package net.toshirohex.lycurgus.registry;

import jdk.nashorn.internal.ir.Block;
import net.minecraft.block.Material;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.toshirohex.lycurgus.Lycurgus;
import net.toshirohex.lycurgus.materials.tools.ModToolMaterials;
import net.toshirohex.lycurgus.overwrites.tools.Axe;
import net.toshirohex.lycurgus.overwrites.tools.Hoe;
import net.toshirohex.lycurgus.overwrites.tools.Pickaxe;

public class ModItems {
    public static final String MOD_ID = Lycurgus.MOD_ID;
    public static final ItemGroup ITEM_GROUP = Lycurgus.ITEM_GROUP;
    public static final ToolMaterial STEEL = ModToolMaterials.STEEL;
    public static final ToolMaterial HANDS_COLD = ModToolMaterials.HANDS_COLD;
    public static final ToolMaterial ENDIUM = ModToolMaterials.ENDIUM;
    public static final ToolMaterial KNIGHT = ModToolMaterials.KNIGHT;
    //Item Items
    public static final Item TOE = new Item(new Item.Settings().group(ITEM_GROUP));
    public static final Item TOEST = new Item(new Item.Settings().group(ITEM_GROUP)
            .food(FoodComponents.ENCHANTED_GOLDEN_APPLE)
            .maxDamage(100)
            .fireproof()
            .rarity(Rarity.EPIC)
    );

    public static final Item STEEL_INGOT = new Item(new Item.Settings().group(ITEM_GROUP));
    public static final SwordItem STEEL_SWORD = new SwordItem(STEEL, +3, +0.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Pickaxe STEEL_PICKAXE = new Pickaxe(STEEL, +2, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final ShovelItem STEEL_SHOVEL = new ShovelItem(STEEL, +1, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Axe STEEL_AXE = new Axe(STEEL, +5, -0.5F, new Item.Settings().group(ITEM_GROUP));
    public static final Hoe STEEL_HOE = new Hoe(STEEL, +0, +0.0F, new Item.Settings().group(ITEM_GROUP));

    public static final Item HANDS_COLD_INGOT = new Item(new Item.Settings().group(ITEM_GROUP));
    public static final SwordItem HANDS_COLD_SWORD = new SwordItem(HANDS_COLD, +3, +0.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Pickaxe HANDS_COLD_PICKAXE = new Pickaxe(HANDS_COLD, +2, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final ShovelItem HANDS_COLD_SHOVEL = new ShovelItem(HANDS_COLD, +1, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Axe HANDS_COLD_AXE = new Axe(HANDS_COLD, +5, -0.5F, new Item.Settings().group(ITEM_GROUP));
    public static final Hoe HANDS_COLD_HOE = new Hoe(HANDS_COLD, +0, +0.0F, new Item.Settings().group(ITEM_GROUP));

    public static final Item ENDIUM_INGOT = new Item(new Item.Settings().group(ITEM_GROUP));
    public static final SwordItem ENDIUM_SWORD = new SwordItem(ENDIUM, +3, +0.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Pickaxe ENDIUM_PICKAXE = new Pickaxe(ENDIUM, +2, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final ShovelItem ENDIUM_SHOVEL = new ShovelItem(ENDIUM, +1, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Axe ENDIUM_AXE = new Axe(ENDIUM, +5, -0.5F, new Item.Settings().group(ITEM_GROUP));
    public static final Hoe ENDIUM_HOE = new Hoe(ENDIUM, +0, +0.0F, new Item.Settings().group(ITEM_GROUP));

    public static final SwordItem GREATSWORD = new SwordItem(ModToolMaterials.KNIGHT, +4, +2, new Item.Settings().group(ITEM_GROUP));
    public static final SwordItem KNIGHTLY_KATANA = new SwordItem(KNIGHT, +3, +0.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Pickaxe STEEL_TOOL = new Pickaxe(KNIGHT, +2, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final ShovelItem HANDS_COLD_TOOL = new ShovelItem(KNIGHT, +1, +1.0F, new Item.Settings().group(ITEM_GROUP));
    public static final Axe ENDIUM_TOOL = new Axe(KNIGHT, +5, -0.5F, new Item.Settings().group(ITEM_GROUP));
    public static final Hoe SXBLACKWOLF = new Hoe(ToolMaterials.WOOD,+0, +0.0F, new Item.Settings().group(ITEM_GROUP)); //this is an inside joke, dm Boboluto#2556 on discord if you want context.  I have zero plans of adding this into thc registry.
    public static final Hoe PIXELZERAORA = new Hoe(ToolMaterials.WOOD, -100, -100.0F, new Item.Settings().group(ITEM_GROUP));

    //Block Items
    public static final BlockItem STEEL_ORE = new BlockItem(ModBlocks.STEEL_ORE, new Item.Settings().group(ITEM_GROUP));
    public static final BlockItem STEEL_BLOCK = new BlockItem(ModBlocks.STEEL_BLOCK, new Item.Settings().group(ITEM_GROUP));

    public static final BlockItem HANDS_COLD_ORE = new BlockItem(ModBlocks.HANDS_COLD_ORE, new Item.Settings().group(ITEM_GROUP));
    public static final BlockItem HANDS_COLD_BLOCK = new BlockItem(ModBlocks.HANDS_COLD_BLOCK, new Item.Settings().group(ITEM_GROUP));

    public static final BlockItem ENDIUM_ORE = new BlockItem(ModBlocks.ENDIUM_ORE, new Item.Settings().group(ITEM_GROUP));
    public static final BlockItem ENDIUM_BLOCK = new BlockItem(ModBlocks.ENDIUM_BLOCK, new Item.Settings().group(ITEM_GROUP));

    public static void registerItems() {
        //Item Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "toe"), TOE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "toest"), TOEST);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ingot"), STEEL_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_sword"), STEEL_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_pickaxe"), STEEL_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_shovel"), STEEL_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_axe"), STEEL_AXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_hoe"), STEEL_HOE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_ingot"), HANDS_COLD_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_sword"), HANDS_COLD_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_pickaxe"), HANDS_COLD_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_shovel"), HANDS_COLD_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_axe"), HANDS_COLD_AXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_hoe"), HANDS_COLD_HOE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_ingot"), ENDIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_sword"), ENDIUM_SWORD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_pickaxe"), ENDIUM_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_shovel"), ENDIUM_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_axe"), ENDIUM_AXE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_hoe"), ENDIUM_HOE);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_ingot"), GREATSWORD);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_sword"), KNIGHTLY_KATANA);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_pickaxe"), STEEL_TOOL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_shovel"), HANDS_COLD_TOOL);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_axe"), ENDIUM_TOOL);


        //Block Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ore"), STEEL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_block"), STEEL_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_ore"), HANDS_COLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_block"), HANDS_COLD_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_ore"), ENDIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_block"), ENDIUM_BLOCK);
    }
}