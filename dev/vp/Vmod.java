package dev.vp;

import dev.vp.event.Event;
import dev.vp.event.EventManager;
import dev.vp.event.EventTarget;
import dev.vp.event.impl.ClientTickEvent;
import dev.vp.gui.hud.HUDManager;
import dev.vp.mods.ModInstances;
import dev.vp.utils.RenderUtil;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;


public class Vmod {

    public static final Vmod INSTANCE = new Vmod();

    public static Vmod getInstance() {
        return INSTANCE;
    }

    private RenderUtil renderUtil;

    private DiscordRP discordRP = new DiscordRP();

    private HUDManager hudManager;


    public void init() {
        discordRP.start();
        EventManager.register(this);

        EventManager.register(new TestClass());

    }

    public void shutdown() {
        discordRP.shutdown();
    }

    public DiscordRP getDiscordRP() {
        return discordRP;
    }

    @EventTarget
    public void onTick(ClientTickEvent e) {
        if(Minecraft.getMinecraft().gameSettings.CLIENT_GUI_MOD_POS.isPressed()) {
            hudManager.openConfigScreen();
        }
    }



    private String clientName;
    private String clientAuthor;
    private String clientRel;
    private String clientVersion;

    public void start() {
        init();

        //Initialize
        clientName = "vMod";
        clientAuthor = "Vp";
        clientRel = " ";
        clientVersion = "1.0";

        renderUtil = new RenderUtil();

        hudManager = HUDManager.getInstance();
        ModInstances.register(hudManager);

        //Setting Title
        Display.setTitle(getClientName() + getClientRel() + getClientVersion() + " | by " + getClientAuthor());
    }


    public String getClientName() {
        return clientName;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public String getClientAuthor() {
        return clientAuthor;
    }

    public String getClientRel() {
        return clientRel;
    }

    public RenderUtil getRenderUtil() {
            return renderUtil;
        }



}
