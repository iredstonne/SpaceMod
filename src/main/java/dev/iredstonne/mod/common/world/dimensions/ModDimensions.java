package dev.iredstonne.mod.common.world.dimensions;

import dev.iredstonne.mod.SpaceMod;

import net.minecraft.world.World;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModDimensions {

    public static final RegistryKey<World> MOON = RegistryKey.of(Registry.WORLD_KEY, new Identifier(SpaceMod.MOD_ID, "moon"));
    public static final RegistryKey<World> MARS = RegistryKey.of(Registry.WORLD_KEY, new Identifier(SpaceMod.MOD_ID, "mars"));

}
