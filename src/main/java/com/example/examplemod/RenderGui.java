package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import org.lwjgl.opengl.GL11;
import com.mojang.blaze3d.systems.RenderSystem;


public class RenderGui {
    RenderGuiOverlayEvent RenderEvent;



    Double FPS;

    @SubscribeEvent
    void drawFPS(AttachCapabilitiesEvent<Entity> Event){
        FPS = Minecraft.getInstance().getFps();
    }


}