package dev.iredstonne.mod.common.items;

import dev.iredstonne.mod.SpaceMod;
import dev.iredstonne.mod.common.ModItemGroups;
import dev.iredstonne.mod.common.blocks.ModBlocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;

import net.minecraft.item.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final BlockItem MOON_SAND = new BlockItem(ModBlocks.MOON_SAND, new FabricItemSettings().group(ModItemGroups.NATURALS));
    public static final BlockItem MOON_STONE = new BlockItem(ModBlocks.MOON_STONE, new FabricItemSettings().group(ModItemGroups.NATURALS));
    public static final BlockItem MOON_COBBLESTONE = new BlockItem(ModBlocks.MOON_COBBLESTONE, new FabricItemSettings().group(ModItemGroups.NATURALS));

    public static final BlockItem MARS_SAND = new BlockItem(ModBlocks.MARS_SAND, new FabricItemSettings().group(ModItemGroups.NATURALS));
    public static final BlockItem MARS_STONE = new BlockItem(ModBlocks.MARS_STONE, new FabricItemSettings().group(ModItemGroups.NATURALS));
    public static final BlockItem MARS_COBBLESTONE = new BlockItem(ModBlocks.MARS_COBBLESTONE, new FabricItemSettings().group(ModItemGroups.NATURALS));

    public static void initialize() {
        Registry.register(Registry.ITEM, new Identifier(SpaceMod.MOD_ID, "moon_sand"), ModItems.MOON_SAND);
        Registry.register(Registry.ITEM, new Identifier(SpaceMod.MOD_ID, "moon_stone"), ModItems.MOON_STONE);
        Registry.register(Registry.ITEM, new Identifier(SpaceMod.MOD_ID, "moon_cobblestone"), ModItems.MOON_COBBLESTONE);

        Registry.register(Registry.ITEM, new Identifier(SpaceMod.MOD_ID, "mars_sand"), ModItems.MARS_SAND);
        Registry.register(Registry.ITEM, new Identifier(SpaceMod.MOD_ID, "mars_stone"), ModItems.MARS_STONE);
        Registry.register(Registry.ITEM, new Identifier(SpaceMod.MOD_ID, "mars_cobblestone"), ModItems.MARS_COBBLESTONE);
    }

}
