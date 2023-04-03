package com.joostmsoftware.compatexplored;

import dev.architectury.platform.forge.EventBuses;
import com.joostmsoftware.CompatExplored.CompatExplored;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CompatExplored.MOD_ID)
public class CompatExploredForge {
    public CompatExploredForge() {
        // Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(CompatExplored.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        CompatExplored.init();
    }
}
