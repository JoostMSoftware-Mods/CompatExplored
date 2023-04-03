package com.joostmsoftware.compatexplored;

import com.joostmsoftware.CompatExplored.CompatExploredExpectPlatform;
import net.fabricmc.loader.api.FabricLoader;

import java.nio.file.Path;

public class CompatExploredExpectPlatformImpl {
    /**
     * This is our actual method to {@link CompatExploredExpectPlatform#getConfigDirectory()}.
     */
    public static Path getConfigDirectory() {
        return FabricLoader.getInstance().getConfigDir();
    }
}
