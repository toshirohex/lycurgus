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
        int itemsRegistered = 0;
        String Names[] = {"_helmet", "_chestplate", "_leggings", "_boots"};
        while(itemsRegistered<4){
            itemsRegistered += 1;
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "steel" + Names[itemsRegistered-1]), STEEL[itemsRegistered-1]);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "hands_cold" + Names[itemsRegistered-1]), HANDS_COLD[itemsRegistered-1]);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "endium" + Names[itemsRegistered-1]), ENDIUM[itemsRegistered-1]);
            Registry.register(Registry.ITEM, new Identifier(MOD_ID, "knight" + Names[itemsRegistered-1]), KNIGHT[itemsRegistered-1]);
        }
    }
}
