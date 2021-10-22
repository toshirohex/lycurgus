package net.toshirohex.lycurgus.interfaces;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Wearable;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public interface IKnightArmor extends Wearable {
    //huge thanks to modmuss and the other techreborn devs for the implementation method.
    void tickArmor(ItemStack stack, PlayerEntity player, World world);

    void onRemoved(PlayerEntity player);
}