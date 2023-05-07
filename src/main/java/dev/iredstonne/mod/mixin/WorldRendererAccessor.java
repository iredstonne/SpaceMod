package dev.iredstonne.mod.mixin;

import net.minecraft.client.world.ClientWorld;
import net.minecraft.client.render.WorldRenderer;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(WorldRenderer.class)
public class WorldRendererAccessor {

    @Accessor
    public static ClientWorld getWorld() { throw new AssertionError(); }



}
