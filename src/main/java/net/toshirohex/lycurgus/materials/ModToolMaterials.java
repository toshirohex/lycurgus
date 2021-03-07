package net.toshirohex.lycurgus.materials;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.toshirohex.lycurgus.registry.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.toshirohex.lycurgus.registry.ModItems;

import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    STEEL(1561, 8.0F, 3.0F, 3, 20, () -> Ingredient.ofItems(ModItems.Ingots[0])),
    HANDS_COLD(2031, 8.5F, 3.0F, 3, 20, () -> Ingredient.ofItems(ModItems.Ingots[1])),
    ENDIUM(2031, 10.0F, 4.0F, 4, 30, () -> Ingredient.ofItems(ModItems.Ingots[2])),
    KNIGHT(-1, 16.0F, 3.0F, 10, 50, () -> null);

    private final int durability;
    private final float miningSpeedMultiplier;
    private final float attackDamage;
    private final int miningLevel;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ModToolMaterials(int durability, float miningSpeedMultiplier, float attackDamage, int miningLevel, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.durability = durability;
        this.miningSpeedMultiplier = miningSpeedMultiplier;
        this.attackDamage = attackDamage;
        this.miningLevel = miningLevel;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return durability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return miningSpeedMultiplier;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return miningLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return repairIngredient.get();
    }
}
