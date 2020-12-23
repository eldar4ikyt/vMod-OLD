package dev.vp;

import dev.vp.event.EventTarget;
import dev.vp.event.impl.ClientTickEvent;

public class TestClass {

    @EventTarget
    public void kek(ClientTickEvent e) {

        System.out.println("Tick Tick");

    }

}
