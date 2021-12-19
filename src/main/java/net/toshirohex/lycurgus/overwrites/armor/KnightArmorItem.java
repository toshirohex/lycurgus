package net.toshirohex.lycurgus.overwrites.armor;


import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.toshirohex.lycurgus.interfaces.IKnightArmor;
import net.toshirohex.lycurgus.registry.ModArmors;
import net.toshirohex.lycurgus.registry.ModItems;

public class KnightArmorItem extends ArmorItem implements IKnightArmor {

    public KnightArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    @Override
    public void tickArmor(ItemStack stack, PlayerEntity player, World world) {
        if(!world.isClient){
            if (player.getEquippedStack(EquipmentSlot.CHEST).equals(ModArmors.KNIGHT[1])) {
            }
        }

    }

    @Override
    public void onRemoved(PlayerEntity player){
            if (player.getEquippedStack(EquipmentSlot.CHEST).equals(ModArmors.KNIGHT[1])) {
            }
    }
}
