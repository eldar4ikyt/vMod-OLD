package dev.vp.mods;

import dev.vp.gui.hud.HUDManager;
import dev.vp.mods.impl.*;
import dev.vp.mods.impl.togglesprint.ToggleSprint;

public class ModInstances {

    private static WelcomerMod welcomerMod;
    private static ArmorStatusMod armorStatusMod;
    private static FPSMod fpsMod;
    private static TPSMod tpsMod;
    private static XYZMod xyzMod;
    private static KeystrokesMod keystrokesMod;
    private static ToggleSprint toggleSprint;

    public static void register(HUDManager api) {
        welcomerMod = new WelcomerMod();
        api.register(welcomerMod);

        armorStatusMod = new ArmorStatusMod();
        api.register(armorStatusMod);

        fpsMod = new FPSMod();
        api.register(fpsMod);

        tpsMod = new TPSMod();
        api.register(tpsMod);

        xyzMod = new XYZMod();
        api.register(xyzMod);

        keystrokesMod = new KeystrokesMod();
        api.register(keystrokesMod);

        toggleSprint = new ToggleSprint();
        api.register((toggleSprint));
    }

    public static WelcomerMod getTestMod() {
        return welcomerMod;
    }

    public static ToggleSprint getToggleSprint() {
        return toggleSprint;
    }

}
