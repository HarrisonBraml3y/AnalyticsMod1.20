package com.example.examplemod;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.commons.lang3.tuple.Pair;

import com.example.examplemod.TranslationKeys;




public class Settings {

    public static final ForgeConfigSpec ConficSpec;
    public static final Settings.ClientSettings clientSettings;


    public static class ClientSettings{
        private final ForgeConfigSpec.ConfigValue<Integer> PosX;
        private final ForgeConfigSpec.ConfigValue<Integer> PosY;
        //private final ForgeConfigSpec.ConfigValue<Boolean> Shadow;
        //private final ForgeConfigSpec.ConfigValue<Integer> Transparency;
        //private final ForgeConfigSpec.ConfigValue<Boolean> GameWindowInfo;

        public Integer getPosX(){
            return PosX.get();
        }
        public Integer getPosY(){
            return PosY.get();
        }
        /*
        public Integer getTransparency() {
            return Transparency.get();
        }

        public Boolean getShadow() {
            return Shadow.get();
        }

        public Boolean getGameWindowInfo() {
            return GameWindowInfo.get();
        }
        */

        public final ForgeConfigSpec.ConfigValue<Boolean> ToggleFPS;
        public Boolean GetToggleFPS(){
            return ToggleFPS.get();
        }

        ClientSettings(ForgeConfigSpec.Builder SpecBuilder){
            SpecBuilder.comment("FPS - Settings file");
            SpecBuilder.push("Display");
            this.PosX = SpecBuilder.comment("Display Pos - Horizontal [0 = LEFT]").translation(TranslationKeys.Settings.Display.DISPLAY_POS_X).define("display_pos_x", 2);
            this.PosY = SpecBuilder.comment("Display Pos - Vertical [0 = TOP]").translation(TranslationKeys.Settings.Display.DISPLAY_POS_Y).define("display_pos_y", 2);

            SpecBuilder.pop();
            SpecBuilder.push("Components");
            SpecBuilder.push("FPS");
            this.ToggleFPS = SpecBuilder.comment("Toggle FPS").translation(TranslationKeys.Settings.Components.Fps).define("toggle_fps", true);



        }




    }




}
