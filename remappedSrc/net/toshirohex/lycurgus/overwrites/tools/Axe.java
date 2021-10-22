package net.toshirohex.lycurgus.overwrites.tools;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class Axe extends AxeItem {
    public Axe(ToolMaterial material, float attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}
