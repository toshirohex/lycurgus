package net.toshirohex.lycurgus.overwrites.armor;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerAbilities;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.toshirohex.lycurgus.interfaces.IKnightArmor;

public class KnightArmorItem extends ArmorItem implements IKnightArmor {
    public KnightArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }
    
    @Override
    public void tickArmor(ItemStack stack, PlayerEntity player){
        if(this.slot==EquipmentSlot.CHEST){
            player.getAbilities().allowFlying = true;
        }
    }
    @Override
    public void onRemoved(PlayerEntity player){
        if(this.slot==EquipmentSlot.CHEST){
            if(!player.isCreative()){
                player.getAbilities().allowFlying = false;
            }
        }
    }
}
