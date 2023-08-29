package com.example.examplemod;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.screens.Screen;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

import org.lwjgl.opengl.GL11;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.GuiGraphics;

import java.awt.*;


public class RenderGui() {


    @SubscribeEvent
    void onRender(RenderGuiOverlayEvent RenderEvent){
        if(RenderEvent.getOverlay() != VanillaGuiOverlay.DEBUG_TEXT.type()){
            Render(RenderEvent.getGuiGraphics());
        }



    }

    void Render(GuiGraphics Stack){
        Minecraft Mc = Minecraft.getInstance();
        if(Mc.options.renderDebug){
            return;
        }
        Settings.ClientSettings Setting = Settings.CLIENT_SETTINGS;


    }

    RenderGuiOverlayEvent RenderEvent;

    RenderSystem.setShaderTexture(0, "Hi");


    Double FPS;

    @SubscribeEvent
    void drawFPS(AttachCapabilitiesEvent<Entity> Event){
        FPS = Minecraft.getInstance().getFps();
    }


}

