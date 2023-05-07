package dev.iredstonne.mod.mixin;

import net.minecraft.client.render.WorldRenderer;
import net.minecraft.client.util.math.MatrixStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(WorldRenderer.class)
public class WorldRendererMixin {

    @Inject(method = "renderClouds*", at = @At("HEAD"), cancellable = true)
    public void renderClouds(MatrixStack matrices, float tickDelta, double cameraX, double cameraY, double cameraZ, CallbackInfo ci) {
        if(!WorldRendererAccessor.getWorld().isClient()) return;

        ci.cancel();
    }

}
