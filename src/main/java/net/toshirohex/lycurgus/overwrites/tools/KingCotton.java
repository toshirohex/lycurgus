package net.toshirohex.lycurgus.overwrites.tools;


import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class KingCotton extends Hoe implements net.toshirohex.lycurgus.interfaces.KingCotton {
    public KingCotton(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if(!world.isClient){
            if(entity instanceof PlayerEntity){
                PlayerEntity player = (PlayerEntity)entity;
                if(!((PlayerEntity) entity).isHolding(this)) {
                }
            }
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand, ItemStack itemStack) {
        if (!world.isClient) {
            if (user.isHolding(this)){
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }




}
