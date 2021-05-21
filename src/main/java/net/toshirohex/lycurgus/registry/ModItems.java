package net.toshirohex.lycurgus.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.toshirohex.lycurgus.Lycurgus;
import net.toshirohex.lycurgus.materials.ModToolMaterials;
import net.toshirohex.lycurgus.overwrites.items.GunItem;
import net.toshirohex.lycurgus.overwrites.items.Toe;
import net.toshirohex.lycurgus.overwrites.tools.Axe;
import net.toshirohex.lycurgus.overwrites.tools.Hoe;
import net.toshirohex.lycurgus.overwrites.tools.Pickaxe;

public class ModItems {
    public static final String MOD_ID = Lycurgus.MOD_ID;
    public static final Item.Settings ITEM_GROUP = new Item.Settings().group(Lycurgus.ITEM_GROUP);
    public static final ToolMaterial Materials[] = {
            ModToolMaterials.STEEL,
            ModToolMaterials.HANDS_COLD,
            ModToolMaterials.ENDIUM,
            ModToolMaterials.KNIGHT
    };
    //Item Items
    public static final Toe TOE = new Toe(new Item.Settings().group(Lycurgus.ITEM_GROUP),
            new StatusEffectInstance(StatusEffects.REGENERATION, 0, 255));
    public static final Item TOEST = new Item(new Item.Settings().group(Lycurgus.ITEM_GROUP)
            .food(FoodComponents.ENCHANTED_GOLDEN_APPLE)
            .maxDamage(100)
            .fireproof()
            .rarity(Rarity.EPIC)
    );


    public static final Item Ingots[] = {
            new Item(ITEM_GROUP),
            new Item(ITEM_GROUP),
            new Item(ITEM_GROUP)
    };
    public static final Item STEEL_INGOT = new Item(ITEM_GROUP);
    public static final Item HANDS_COLD_INGOT = new Item(ITEM_GROUP);
    public static final Item ENDIUM_INGOT = new Item(ITEM_GROUP);

    public static final SwordItem STEEL_SWORD = new SwordItem(Materials[0],+3,+0.0F,ITEM_GROUP);
    public static final Pickaxe STEEL_PICKAXE = new Pickaxe(Materials[0], +2, +1.0F, ITEM_GROUP);
    public static final ShovelItem STEEL_SHOVEL = new ShovelItem(Materials[0], +1, +1.0F, ITEM_GROUP);
    public static final Axe STEEL_AXE = new Axe(Materials[0], +5, -0.5F, ITEM_GROUP);

    public static final SwordItem HANDS_COLD_SWORD = new SwordItem(Materials[1],+3, +0.0F, ITEM_GROUP);
    public static final Pickaxe HANDS_COLD_PICKAXE = new Pickaxe(Materials[1], +2, +1.0F, ITEM_GROUP);
    public static final ShovelItem HANDS_COLD_SHOVEL = new ShovelItem(Materials[1], +1, +1.0F, ITEM_GROUP);
    public static final Axe HANDS_COLD_AXE = new Axe(Materials[1], +5, -0.5F, ITEM_GROUP);

    public static final SwordItem ENDIUM_SWORD = new SwordItem(Materials[2],+3, +0.0F, ITEM_GROUP);
    public static final Pickaxe ENDIUM_PICKAXE = new Pickaxe(Materials[2], +2, +1.0F, ITEM_GROUP);
    public static final ShovelItem ENDIUM_SHOVEL = new ShovelItem(Materials[2], +1, +1.0F, ITEM_GROUP);
    public static final Axe ENDIUM_AXE = new Axe(Materials[2], +5, -0.5F, ITEM_GROUP);

    public static final SwordItem GREATSWORD = new SwordItem(Materials[3],+3, +2, ITEM_GROUP);
    public static final SwordItem KNIGHTLY_KATANA = new SwordItem(Materials[3],+3, +0.0F, ITEM_GROUP);
    public static final Pickaxe STEEL_TOOL = new Pickaxe(Materials[3], +2, +1.0F, ITEM_GROUP);
    public static final ShovelItem HANDS_COLD_TOOL = new ShovelItem(Materials[3], +1, +1.0F, ITEM_GROUP);
    public static final Axe ENDIUM_TOOL = new Axe(Materials[3], +5, -0.5F, ITEM_GROUP);

    public static final Hoe STEEL_HOE = new Hoe(Materials[0], +0, +0.0F, ITEM_GROUP);
    public static final Hoe HANDS_COLD_HOE = new Hoe(Materials[1], +0, +0.0F, ITEM_GROUP);
    public static final Hoe ENDIUM_HOE = new Hoe(Materials[2], +0, +0.0F, ITEM_GROUP);
    public static final Hoe PixelZeraora = new Hoe(ToolMaterials.WOOD, -100, -100.0F, ITEM_GROUP); //don't question

    public static final GunItem PISTOL = new GunItem(ITEM_GROUP);

    //Block Items
    public static final BlockItem STEEL_ORE = new BlockItem(ModBlocks.STEEL_ORE, new Item.Settings()
            .group(Lycurgus.ITEM_GROUP)
            .maxCount(64));
    public static final BlockItem STEEL_BLOCK = new BlockItem(ModBlocks.STEEL_BLOCK, new Item.Settings()
            .group(Lycurgus.ITEM_GROUP)
            .maxCount(64));

    public static final BlockItem HANDS_COLD_ORE = new BlockItem(ModBlocks.HANDS_COLD_ORE, new Item.Settings()
            .group(Lycurgus.ITEM_GROUP)
            .maxCount(64));
    public static final BlockItem HANDS_COLD_BLOCK = new BlockItem(ModBlocks.HANDS_COLD_BLOCK, new Item.Settings()
            .group(Lycurgus.ITEM_GROUP)
            .maxCount(64));

    public static final BlockItem ENDIUM_ORE = new BlockItem(ModBlocks.ENDIUM_ORE, new Item.Settings()
            .group(Lycurgus.ITEM_GROUP)
            .maxCount(64));
    public static final BlockItem ENDIUM_BLOCK = new BlockItem(ModBlocks.ENDIUM_BLOCK, new Item.Settings()
            .group(Lycurgus.ITEM_GROUP)
            .maxCount(64));

    //public static void
    public static String Names[] = {"toe", "toest", "steel_ingot", "hands_cold_ingot", "endium_ingot",
            "steel_sword", "steel_pickaxe", "steel_shovel", "steel_axe", "steel_hoe",
            "hands_cold_sword", "hands_cold_pickaxe", "hands_cold_shovel", "hands_cold_axe", "hands_cold_hoe",
            "endium_sword", "endium_pickaxe", "endium_shovel", "endium_axe", "endium_hoe",
            "greatsword", "knightly_katana", "steel_tool", "hands_cold_tool", "endium_tool",
            "pistol"};
    public static void registerItems() {
        Item Items[] = {TOE, TOEST, STEEL_INGOT, HANDS_COLD_INGOT, ENDIUM_INGOT,
                STEEL_SWORD, STEEL_PICKAXE, STEEL_SHOVEL, STEEL_AXE, STEEL_HOE,
                HANDS_COLD_SWORD, HANDS_COLD_PICKAXE, HANDS_COLD_SHOVEL, HANDS_COLD_AXE, HANDS_COLD_HOE,
                ENDIUM_SWORD, ENDIUM_PICKAXE, ENDIUM_SHOVEL, ENDIUM_AXE,
                GREATSWORD, KNIGHTLY_KATANA, STEEL_TOOL, HANDS_COLD_TOOL, ENDIUM_TOOL, ENDIUM_HOE,
                PISTOL
        };
        if (Names.length == Items.length) {
            for (int i = 0; i < Items.length; i += 1) {
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, Names[i]), Items[i]);
            }
        }
        //block items
        Item Blocks[] = {STEEL_ORE, STEEL_BLOCK, HANDS_COLD_ORE, HANDS_COLD_BLOCK, ENDIUM_ORE, ENDIUM_BLOCK};
        String bNames[] = {"steel_ore", "steel_block", "hands_cold_ore", "hands_cold_block", "endium_ore", "endium_block"};
        if (Blocks.length == bNames.length) {
            for (int o = 0; o < Blocks.length; o += 1) {
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, bNames[o]), Blocks[o]);
            }
        }
    }
}