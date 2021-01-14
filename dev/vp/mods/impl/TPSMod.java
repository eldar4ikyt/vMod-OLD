package dev.vp.mods.impl;

import dev.vp.gui.hud.ScreenPosition;
import dev.vp.mods.ModDraggable;


public class TPSMod extends ModDraggable {

    @Override
    public int getWidth() {
        return 50;
    }

    @Override
    public int getHeight() {
        return font.FONT_HEIGHT;
    }

    @Override
    public void render(ScreenPosition pos) {
        font.drawString("TPS: " + mc.getDebugTPS(), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
    }

}


