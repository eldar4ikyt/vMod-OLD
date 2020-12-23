package dev.vp.mods.impl;

import dev.vp.gui.hud.ScreenPosition;
import dev.vp.mods.ModDraggable;

public class WelcomerMod extends ModDraggable {

    private ScreenPosition pos;

    @Override
    public int getWidth() {
        return font.getStringWidth("Welcome! " + mc.thePlayer.getName());
    }

    @Override
    public int getHeight() {
        return font.FONT_HEIGHT;
    }

    @Override
    public void render(ScreenPosition pos) {
        font.drawString( "Welcome! " + mc.thePlayer.getName(), pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, 0xFF00FF00);
    }

    @Override
    public void renderDummy(ScreenPosition pos) {
        font.drawString("Welcome! " + mc.thePlayer.getName(), pos.getAbsoluteX() + 1, pos.getAbsoluteY() + 1, 0xFF00FF00);
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
