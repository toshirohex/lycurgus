package net.toshirohex.lycurgus.registry;

import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Toe extends Item {
    protected StatusEffectInstance statusEffectInstance;

    public Toe(Settings settings, StatusEffectInstance instance) {
        super(settings);
        statusEffectInstance = new StatusEffectInstance(instance);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);

        if(!world.isClient){
            if(entity instanceof PlayerEntity){
                PlayerEntity player = (PlayerEntity)entity;
                player.addStatusEffect(new StatusEffectInstance(statusEffectInstance));
            }
        }
    }
}