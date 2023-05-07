package dev.iredstonne.mod.common.world.biomes;

import dev.iredstonne.mod.SpaceMod;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

import net.minecraft.world.biome.Biome;

public class ModBiomes {

    public static final RegistryKey<Biome> MOON = RegistryKey.of(Registry.BIOME_KEY, new Identifier(SpaceMod.MOD_ID, "moon"));
    public static final RegistryKey<Biome> MARS = RegistryKey.of(Registry.BIOME_KEY, new Identifier(SpaceMod.MOD_ID, "mars"));

}
