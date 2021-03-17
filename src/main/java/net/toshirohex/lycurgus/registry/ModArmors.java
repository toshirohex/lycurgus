package net.toshirohex.lycurgus.registry;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.toshirohex.lycurgus.Lycurgus;
import net.toshirohex.lycurgus.materials.ModArmorMaterials;

public class ModArmors {
    public static final String MOD_ID = Lycurgus.MOD_ID;
    public static final Item.Settings ITEM_GROUP = new Item.Settings().group(Lycurgus.ITEM_GROUP);
    public static ArmorMaterial Materials[] = {
            ModArmorMaterials.STEEL,
            ModArmorMaterials.HANDS_COLD,
            ModArmorMaterials.ENDIUM,
            ModArmorMaterials.KNIGHT
    };
    public static EquipmentSlot Slots[] = {EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET};

    public static ArmorItem STEEL[] = {
            new ArmorItem(Materials[0], Slots[0], ITEM_GROUP),
            new ArmorItem(Materials[0], Slots[1], ITEM_GROUP),
            new ArmorItem(Materials[0], Slots[2], ITEM_GROUP),
            new ArmorItem(Materials[0], Slots[3], ITEM_GROUP)
    };

    public static ArmorItem HANDS_COLD[] = {
            new ArmorItem(Materials[1], Slots[0], ITEM_GROUP),
            new ArmorItem(Materials[1], Slots[1], ITEM_GROUP),
            new ArmorItem(Materials[1], Slots[2], ITEM_GROUP),
            new ArmorItem(Materials[1], Slots[3], ITEM_GROUP)
    };

    public static ArmorItem ENDIUM[] = {
            new ArmorItem(Materials[2], Slots[0], ITEM_GROUP),
            new ArmorItem(Materials[2], Slots[1], ITEM_GROUP),
            new ArmorItem(Materials[2], Slots[2], ITEM_GROUP),
            new ArmorItem(Materials[2], Slots[3], ITEM_GROUP)
    };

    public static ArmorItem KNIGHT[] = {
            new ArmorItem(Materials[3], Slots[0], ITEM_GROUP),
            new ArmorItem(Materials[3], Slots[1], ITEM_GROUP),
            new ArmorItem(Materials[3], Slots[2], ITEM_GROUP),
            new ArmorItem(Materials[3], Slots[3], ITEM_GROUP)
    };


    public static void registerItems(){
        String Names[] = {
                "steel_helmet", "steel_chestplate", "steel_leggings", "steel_boots",
                "hands_cold_helmet", "hands_cold_chestplate", "hands_cold_leggings", "hands_cold_boots",
                "endium_helmet", "endium_chestplate", "endium_leggings", "endium_boots",
                "knight_helmet", "knight_chestplate", "knight_leggings","knight_boots"};
        Item Armors[] = {
                STEEL[0], STEEL[0], STEEL[0], STEEL[0],
                HANDS_COLD[0], HANDS_COLD[1], HANDS_COLD[2], HANDS_COLD[3],
                ENDIUM[0], ENDIUM[1], ENDIUM[2], ENDIUM[3],
                KNIGHT[0], KNIGHT[1], KNIGHT[2], KNIGHT[3]
        };
        if(Names.length == Armors.length){
            for(int i = 0; i<Names.length; i += 1) {
                Registry.register(Registry.ITEM, new Identifier(MOD_ID, Names[i]), Armors[i]);
            }
        }
    }
}
