package net.toshirohex.lycurgus.registry;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.toshirohex.lycurgus.Lycurgus;

public class ModBlocks {
    public static final String MOD_ID = Lycurgus.MOD_ID;

    public static final Block STEEL_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0F, 30.0F));
    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0f, 30.0f));

    public static final Block HANDS_COLD_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0F, 30.0F));
    public static final Block HANDS_COLD_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .requiresTool()
            .strength(5.0F, 30.0F));

    public static final Block ENDIUM_ORE = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(5.0F, 30.0F));
    public static final Block ENDIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .requiresTool()
            .strength(5.0F, 30.0F));


    public static void registerBlocks() {
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "steel_ore"), STEEL_ORE);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "steel_block"), STEEL_BLOCK);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hands_cold_block"), HANDS_COLD_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "hands_cold_ore"), HANDS_COLD_ORE);

        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "endium_block"), ENDIUM_BLOCK);
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "endium_ore"), ENDIUM_ORE);

    }
}
