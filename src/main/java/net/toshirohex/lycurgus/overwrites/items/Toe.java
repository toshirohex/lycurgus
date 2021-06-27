package net.toshirohex.lycurgus.overwrites.items;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Toe extends Item {
    protected StatusEffectInstance statusEffectInstance;

    public Toe(Settings settings, StatusEffectInstance instance) {
        super(settings);
        this.statusEffectInstance = new StatusEffectInstance(instance);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if(!world.isClient){
            if(entity instanceof PlayerEntity){
                PlayerEntity player = (PlayerEntity)entity;
                if(((PlayerEntity) entity).isHolding(this)) {
                    player.addStatusEffect(new StatusEffectInstance(statusEffectInstance));
                }
            }
        }
    }
}