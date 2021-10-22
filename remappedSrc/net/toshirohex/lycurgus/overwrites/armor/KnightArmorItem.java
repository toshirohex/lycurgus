package net.toshirohex.lycurgus.overwrites.armor;

import io.github.ladysnake.pal.AbilitySource;
import io.github.ladysnake.pal.Pal;
import io.github.ladysnake.pal.VanillaAbilities;
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
    public static final AbilitySource FLIGHT_CHARM = Pal.getAbilitySource("lycurgus", "flight_charm");

    public KnightArmorItem(ArmorMaterial material, EquipmentSlot slot, Settings settings) {
        super(material, slot, settings);
    }

    //huge thanks to modmuss and the other techreborn devs for the implementation method.
    @Override
    public void tickArmor(ItemStack stack, PlayerEntity player, World world) {
        //if(!world.isClient){
            if (player.getEquippedStack(EquipmentSlot.CHEST).equals(ModArmors.KNIGHT[1])) {
                if (!FLIGHT_CHARM.grants(player, VanillaAbilities.ALLOW_FLYING)) {
                    FLIGHT_CHARM.grantTo(player, VanillaAbilities.ALLOW_FLYING);
                }
            }
        //}
//        switch (this.slot) {
//            case HEAD:
//                break;
//            case CHEST:
//                if(!FLIGHT_CHARM.grants(player, VanillaAbilities.ALLOW_FLYING))
//                    FLIGHT_CHARM.grantTo(player, VanillaAbilities.ALLOW_FLYING);
//                break;
//            case LEGS:
//                break;
//            case FEET:
//                break;
//        }

    }

    //again huge thanks to modmuss and the other techreborn devs.
    @Override
    public void onRemoved(PlayerEntity player){
        if(!player.getEquippedStack(EquipmentSlot.CHEST).equals(ModArmors.KNIGHT[1])){
            if(FLIGHT_CHARM.grants(player, VanillaAbilities.ALLOW_FLYING)){
                FLIGHT_CHARM.revokeFrom(player, VanillaAbilities.ALLOW_FLYING);
            }
        }
//        switch (this.slot){
//            case HEAD:
//                break;
//            case CHEST:
//                if(FLIGHT_CHARM.grants(player, VanillaAbilities.ALLOW_FLYING))
//                    FLIGHT_CHARM.revokeFrom(player, VanillaAbilities.ALLOW_FLYING);
//                break;
//            case LEGS:
//                break;
//            case FEET:
//                break;
//        }
    }
}
