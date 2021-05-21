package net.toshirohex.lycurgus.interfaces;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;

public interface IKnightArmor extends ItemConvertible, Wearable{
    void tickArmor(ItemStack stack, PlayerEntity player);
    void onRemoved(PlayerEntity player);
}