package dev.vp.mods.impl.togglesprint;

import dev.vp.gui.hud.ScreenPosition;
import dev.vp.mods.ModDraggable;
import javafx.scene.paint.Color;

public class ToggleSprint extends ModDraggable {

    private ScreenPosition pos;

    //settings
    public boolean flyboost = true;
    public float flyBoosterFactor = 4;
    public int keyHoldTicks = 7;

    private String textToRender = "";


    @Override
    public int getWidth() {
        return font.getStringWidth(mc.thePlayer.movementInput.getDisplayText());
    }

    @Override
    public int getHeight() {
        return font.FONT_HEIGHT;
    }

    @Override
    public void render(ScreenPosition pos) {
        textToRender = mc.thePlayer.movementInput.getDisplayText();
        font.drawString(textToRender, pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
    }

    @Override
    public void renderDummy(ScreenPosition pos) {
        textToRender = "<Toggle Sprint>";
        font.drawString(textToRender, pos.getAbsoluteX(), pos.getAbsoluteY(), -1);
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
