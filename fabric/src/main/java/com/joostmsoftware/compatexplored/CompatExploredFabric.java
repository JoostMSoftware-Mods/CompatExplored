package com.joostmsoftware.compatexplored;

import com.joostmsoftware.CompatExplored.CompatExplored;
import net.fabricmc.api.ModInitializer;

public class CompatExploredFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CompatExplored.init();
    }
}
