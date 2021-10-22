package net.toshirohex.lycurgus.interfaces;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public interface KingCotton {
    TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand, ItemStack itemStack);
    void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected);
}
