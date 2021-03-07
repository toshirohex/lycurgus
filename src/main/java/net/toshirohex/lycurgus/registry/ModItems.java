package net.toshirohex.lycurgus.registry;

import net.minecraft.block.Material;
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
    public static final Item TOE = new Item(ITEM_GROUP);
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
    public static final BlockItem STEEL_ORE = new BlockItem(ModBlocks.STEEL_ORE, ITEM_GROUP);
    public static final BlockItem STEEL_BLOCK = new BlockItem(ModBlocks.STEEL_BLOCK, ITEM_GROUP);

    public static final BlockItem HANDS_COLD_ORE = new BlockItem(ModBlocks.HANDS_COLD_ORE, ITEM_GROUP);
    public static final BlockItem HANDS_COLD_BLOCK = new BlockItem(ModBlocks.HANDS_COLD_BLOCK, ITEM_GROUP);

    public static final BlockItem ENDIUM_ORE = new BlockItem(ModBlocks.ENDIUM_ORE, ITEM_GROUP);
    public static final BlockItem ENDIUM_BLOCK = new BlockItem(ModBlocks.ENDIUM_BLOCK, ITEM_GROUP);

    public static void registerItems() {
        String Names[] = {"steel", "hands_cold", "endium"};
        int itemsRegistered = 0;
        while(itemsRegistered < 3) {
            itemsRegistered = itemsRegistered + 1;
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, Names[itemsRegistered - 1] + "_sword"), Swords[itemsRegistered-1]);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, Names[itemsRegistered - 1] + "_pickaxe"), Pickaxes[itemsRegistered-1]);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, Names[itemsRegistered - 1] + "_shovel"), Shovels[itemsRegistered-1]);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, Names[itemsRegistered - 1] + "_axe"), Axes[itemsRegistered-1]);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, Names[itemsRegistered - 1] + "_hoe"), Hoes[itemsRegistered-1]);
        }
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_tool"), Pickaxes[3]);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_tool"), Shovels[3]);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_tool"), Axes[3]);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "greatsword"), Swords[3]);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "knightly_katana"), Swords[4]);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_ore"), STEEL_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel_block"), STEEL_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_ore"), HANDS_COLD_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold_block"), HANDS_COLD_BLOCK);

        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_ore"), ENDIUM_ORE);
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium_block"), ENDIUM_BLOCK);
    }
}