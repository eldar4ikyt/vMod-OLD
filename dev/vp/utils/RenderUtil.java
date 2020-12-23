package dev.vp.utils;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;

public class RenderUtil {

    public void drawString(final double scale, final String text, final int xPos, final int yPos, final int color) {

        GlStateManager.pushMatrix();
        GlStateManager.scale(scale, scale, scale);
        Minecraft.getMinecraft().fontRendererObj.drawString(text, xPos, yPos, color);
        GlStateManager.popMatrix();
    }

    public void drawStringWithShadow(final double scale, final String text, final int xPos, final int yPos, final int color) {

        GlStateManager.pushMatrix();
        GlStateManager.scale(scale, scale, scale);
        Minecraft.getMinecraft().fontRendererObj.drawString(text, xPos, yPos, color);
        GlStateManager.popMatrix();
    }

}
