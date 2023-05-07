package dev.iredstonne.mod.common;

import dev.iredstonne.mod.SpaceMod;
import dev.iredstonne.mod.common.items.ModItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup NATURALS = FabricItemGroupBuilder.build(new Identifier(SpaceMod.MOD_ID, "naturals"), () -> new ItemStack(ModItems.MOON_STONE));

}
