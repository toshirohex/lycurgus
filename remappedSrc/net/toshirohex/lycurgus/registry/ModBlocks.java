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
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(3.0F, 30.0F));

    public static final Block STEEL_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(3.0f, 30.0f));

    public static final Block RAW_STEEL_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(3.0f, 30.0f));

    public static final Block HANDS_COLD_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(3.0F, 30.0F));

    public static final Block HANDS_COLD_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(3.0F, 30.0F));

    public static final Block RAW_HANDS_COLD_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(3.0f, 30.0f));

    public static final Block ENDIUM_ORE = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .strength(4.0F, 30.0F));

    public static final Block ENDIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.METAL)
            .breakByTool(FabricToolTags.PICKAXES, 3)
            .strength(4.0F, 60.0F));

    public static final Block RAW_ENDIUM_BLOCK = new Block(FabricBlockSettings
            .of(Material.STONE)
            .breakByTool(FabricToolTags.PICKAXES, 2)
            .strength(4.0f, 30.0f));

    public static void registerBlocks() {
        Block[] Blocks = {
                STEEL_ORE, STEEL_BLOCK, RAW_STEEL_BLOCK,
                HANDS_COLD_ORE, HANDS_COLD_BLOCK, RAW_HANDS_COLD_BLOCK,
                ENDIUM_BLOCK, ENDIUM_ORE, RAW_ENDIUM_BLOCK};
        String[] Names = {
                "steel_ore", "steel_block", "raw_steel_block",
                "hands_cold_ore", "hands_cold_block", "raw_hands_cold_block",
                "endium_block", "endium_ore", "raw_endium_block"};
        if(Blocks.length == Names.length){
            for(int i = 0; i<Blocks.length; i += 1) {
                Registry.register(Registry.BLOCK, new Identifier(MOD_ID, Names[i]), Blocks[i]);
            }
        }
    }
}
