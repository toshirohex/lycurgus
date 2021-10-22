package net.toshirohex.lycurgus.interfaces;

import io.github.ladysnake.pal.AbilitySource;
import io.github.ladysnake.pal.Pal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.item.Vanishable;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public interface Hoe extends ItemConvertible, Vanishable {
    AbilitySource FLIGHT_CHARM = Pal.getAbilitySource("mymod", "flight_charm");  // works like an identifier

    TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand, ToolMaterial material);
}
