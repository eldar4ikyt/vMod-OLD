package dev.vp.mods.impl;

import dev.vp.gui.hud.ScreenPosition;
import dev.vp.mods.ModDraggable;

public class FPSMod extends ModDraggable {

    private ScreenPosition pos;

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
        font.drawString("FPS: " + mc.getDebugFPS(), pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
    }

    @Override
    public void save(ScreenPosition pos) {
        this.pos = pos;
    }

    @Override
    public ScreenPosition load() {
        return pos;
    }
}
