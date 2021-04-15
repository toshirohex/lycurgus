package net.toshirohex.lycurgus.registry;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.toshirohex.lycurgus.Lycurgus;
import net.toshirohex.lycurgus.materials.ModToolMaterials;
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
            new StatusEffectInstance(StatusEffects.GLOWING));
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

    public static final SwordItem Swords[] = {
            new SwordItem(Materials[0], +3, +0.0F, ITEM_GROUP), //Steel Sword
            new SwordItem(Materials[1], +3, +0.0F, ITEM_GROUP), //Hands Cold Sword
            new SwordItem(Materials[2], +3, +0.0F, ITEM_GROUP), //Endium Sword
            new SwordItem(Materials[3], +4, +2, ITEM_GROUP), //Greatsword
            new SwordItem(Materials[3], +3, +0.0F, ITEM_GROUP) //Knightly Katana
    };

    public static final Pickaxe Pickaxes[] = {
            new Pickaxe(Materials[0], +2, +1.0F, ITEM_GROUP), //Steel Pickaxe
            new Pickaxe(Materials[1], +2, +1.0F, ITEM_GROUP), //Hands Cold Pickaxe
            new Pickaxe(Materials[2], +2, +1.0F, ITEM_GROUP), //Endium Pickaxe
            new Pickaxe(Materials[3], +2, +1.0F, ITEM_GROUP)  //Steel Tool
    };

    public static final ShovelItem Shovels[] = {
            new ShovelItem(Materials[0], +1, +1.0F, ITEM_GROUP), //Steel Shovel
            new ShovelItem(Materials[1], +1, +1.0F, ITEM_GROUP), //Hands Cold Shovel
            new ShovelItem(Materials[2], +1, +1.0F, ITEM_GROUP),  //Endium Shovel
            new ShovelItem(Materials[3], +1, +1.0F, ITEM_GROUP) //Hands Cold Tool
    };

    public static final Axe Axes[] = {
            new Axe(Materials[0], +5, -0.5F, ITEM_GROUP), //Steel Axe
            new Axe(Materials[1], +5, -0.5F, ITEM_GROUP), //Hands Cold Axe
            new Axe(Materials[2], +5, -0.5F, ITEM_GROUP),  //Endium Axe
            new Axe(Materials[3], +5, -0.5F, ITEM_GROUP)  //Endium Tool
    };

    public static final Hoe Hoes[] = {
            new Hoe(Materials[0], +0, +0.0F, ITEM_GROUP), //Steel Hoe
            new Hoe(Materials[1], +0, +0.0F, ITEM_GROUP), //Hands Cold Hoe
            new Hoe(Materials[2], +0, +0.0F, ITEM_GROUP)  //Endium Hoe
    };

    public static final Hoe PixelZeraora = new Hoe(ToolMaterials.WOOD, -100, -100.0F, ITEM_GROUP); //don't question

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

    public static void registerItems() {
        String Names[] = {"toe", "toest", "steel_ingot", "hands_cold_ingot", "endium_ingot",
                "steel_sword", "hands_cold_sword", "endium_sword", "greatsword", "knightly_katana",
                "steel_pickaxe", "hands_cold_pickaxe", "endium_pickaxe", "steel_tool",
                "steel_shovel", "hands_cold_shovel", "endium_shovel", "hands_cold_tool",
                "steel_axe", "hands_cold_axe", "endium_axe", "endium_tool",
                "steel_hoe", "hands_cold_hoe", "endium_hoe"};
        Item Items[] = {TOE, TOEST, Ingots[0], Ingots[1], Ingots[2],
                Swords[0], Swords[1], Swords[2], Swords[3], Swords[4],
                Pickaxes[0], Pickaxes[1], Pickaxes[2], Pickaxes[3],
                Shovels[0], Shovels[1], Shovels[2], Shovels[3],
                Axes[0], Axes[1], Axes[2], Axes[3],
                Hoes[0], Hoes[1], Hoes[2]};
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