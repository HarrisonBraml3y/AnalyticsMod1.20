package com.example.examplemod;

import com.example.examplemod.ScreenHud;
import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.settings.KeyConflictContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.lwjgl.glfw.GLFW;


public class Translation{
    public static final class Display() {
        public static final string FPS = "fps.display.fps";
    }

}

public class Components{
    public static final class FPS{
        public static final String TOGGLE_FPS = "fps.settings.components.fps.toggle_fps";
        public static final String COLOUR = "fps.settings.components.fps.color";
    }
}







public class Keybinds {
    static KeyMapping ToggleFPS;


    @SubscribeEvent
    void RegisterKeys(RegisterKeyMappingsEvent Event){
        ToggleFPS = new KeyMapping("fps.display.fps", KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_DONT_CARE, AnalyticsMod.MODID);
        
        Event.register(ToggleFPS);


    }



}
