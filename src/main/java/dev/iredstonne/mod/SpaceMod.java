package dev.iredstonne.mod;

import dev.iredstonne.mod.common.blocks.ModBlocks;
import dev.iredstonne.mod.common.items.ModItems;

import net.fabricmc.api.ModInitializer;

public class SpaceMod implements ModInitializer {

    public static final String MOD_ID = "space";

    @Override
    public void onInitialize() {
        ModBlocks.initialize();
        ModItems.initialize();
    }

}
