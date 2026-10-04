package com.lmc.orange.redhands;

import net.fabricmc.api.ClientModInitializer;
import com.lmc.orange.redhands.config.RedHandsConfig;

public class RedHandsClient implements ClientModInitializer {
    public static final String MOD_ID = "redhands";
    public static RedHandsConfig CONFIG = new RedHandsConfig();
    public static boolean hurtEffect = false;

    @Override
    public void onInitializeClient() {
        // Client initialization
        // Damage overlay rendering is handled by the mixin.
    }
}
