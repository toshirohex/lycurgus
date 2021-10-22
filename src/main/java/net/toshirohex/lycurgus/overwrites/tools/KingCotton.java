package net.toshirohex.lycurgus.overwrites.tools;

import io.github.ladysnake.pal.AbilitySource;
import io.github.ladysnake.pal.Pal;
import io.github.ladysnake.pal.VanillaAbilities;
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
    public static final AbilitySource KING_COTTON = Pal.getAbilitySource("lycurgus", "king_cotton");

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        super.inventoryTick(stack, world, entity, slot, selected);
        if(!world.isClient){
            if(entity instanceof PlayerEntity){
                PlayerEntity player = (PlayerEntity)entity;
                if(!((PlayerEntity) entity).isHolding(this)) {
                    KING_COTTON.revokeFrom(player, VanillaAbilities.ALLOW_FLYING);
                }
            }
        }
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand, ItemStack itemStack) {
        if (!world.isClient) {
            if (user.isHolding(this)){
                if (KING_COTTON.grants(user, VanillaAbilities.ALLOW_FLYING)) {
                    KING_COTTON.revokeFrom(user, VanillaAbilities.ALLOW_FLYING);
                } else {
                    KING_COTTON.grantTo(user, VanillaAbilities.ALLOW_FLYING);
                }
            }
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }




}
