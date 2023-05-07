package dev.iredstonne.mod.common.blocks;

import dev.iredstonne.mod.SpaceMod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final FallingBlock MOON_SAND = new FallingBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(0.1f).requiresTool().sounds(BlockSoundGroup.SAND));
    public static final Block MOON_STONE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool().sounds(BlockSoundGroup.STONE));
    public static final Block MOON_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool().sounds(BlockSoundGroup.STONE));

    public static final FallingBlock MARS_SAND = new FallingBlock(FabricBlockSettings.of(Material.AGGREGATE).strength(0.1f).requiresTool().sounds(BlockSoundGroup.SAND));
    public static final Block MARS_STONE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool().sounds(BlockSoundGroup.STONE));
    public static final Block MARS_COBBLESTONE = new Block(FabricBlockSettings.of(Material.STONE).strength(0.5f).requiresTool().sounds(BlockSoundGroup.STONE));

    public static void initialize() {
        Registry.register(Registry.BLOCK, new Identifier(SpaceMod.MOD_ID, "moon_sand"), ModBlocks.MOON_SAND);
        Registry.register(Registry.BLOCK, new Identifier(SpaceMod.MOD_ID, "moon_stone"), ModBlocks.MOON_STONE);
        Registry.register(Registry.BLOCK, new Identifier(SpaceMod.MOD_ID, "moon_cobblestone"), ModBlocks.MOON_COBBLESTONE);

        Registry.register(Registry.BLOCK, new Identifier(SpaceMod.MOD_ID, "mars_sand"), ModBlocks.MARS_SAND);
        Registry.register(Registry.BLOCK, new Identifier(SpaceMod.MOD_ID, "mars_stone"), ModBlocks.MARS_STONE);
        Registry.register(Registry.BLOCK, new Identifier(SpaceMod.MOD_ID, "mars_cobblestone"), ModBlocks.MARS_COBBLESTONE);
    }

}
