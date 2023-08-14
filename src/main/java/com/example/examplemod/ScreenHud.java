package com.example.examplemod;


import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import org.apache.logging.log4j.core.pattern.TextRenderer;

import com.mojang.blaze3d.vertex.PoseStack;


public class ScreenHud extends Screen {

    protected ScreenHud(Component Hud){
        super(Hud);

    }

    @Override
    public void render(GuiGraphics Graphics, int mouseX, int mouseY, float partialTicks){
        super.render(Graphics, mouseX, mouseY, partialTicks);

        //GuiGraphics GuiGraphics = new GuiGraphics(Stack);

    }



    protected void Init(){
        super.init();
        this.addRenderableOnly(new EditBox(font, 10, 10, 20, 20, ));

    }

}
