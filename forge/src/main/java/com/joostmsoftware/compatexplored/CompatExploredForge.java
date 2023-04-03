package com.joostmsoftware.compatexplored;

import com.joostmsoftware.CompatExplored.CompatExplored;
import net.minecraftforge.fml.common.Mod;

@Mod(CompatExplored.MOD_ID)
public class CompatExploredForge {
    public CompatExploredForge() {
        CompatExplored.init();
    }
}
