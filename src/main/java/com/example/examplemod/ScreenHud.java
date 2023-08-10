package com.example.examplemod;


import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.apache.logging.log4j.core.pattern.TextRenderer;

public class ScreenHud extends Screen {

    protected ScreenHud(Component Hud){
        super(Hud);

    }

    @Override
    public void render(int mouseX, int mouseY, float partialTicks){
        super.render(mouseX, mouseY, partialTicks);
    }



    protected void Init(){
        super.init();
        this.addRenderableOnly(new EditBox(font, 10, 10, 20, 20, Component.literal"Test"));

    }

}
