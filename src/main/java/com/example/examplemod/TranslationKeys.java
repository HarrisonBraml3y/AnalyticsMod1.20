package com.example.examplemod;

public class TranslationKeys {
    public static final class Display {
        public static final String FPS = "fps.display.fps";
    }

    public static final class Key {
        public static final String FPS = "fps.key.toggle_fps";

    }

    public static final class Settings {
        public static final class Display {
            public static final String DISPLAY_POS_X = "fps.settings.display.display_pos_x";
            public static final String DISPLAY_POS_Y = "fps.settings.display.display_pos_y";
            public static final String TEXT_TRANSPARENCY = "fps.settings.display.text_transparency";
            public static final String HAS_TEXT_SHADOW = "fps.settings.display.has_text_shadow";
            public static final String GAME_WINDOW_INFO = "fps.settings.display.game_window_info";
        }


        public static final class Components {
            public static String Fps;

            public static final class Fps {
                public static final String TOGGLE_FPS = "fps.settings.components.fps.toggle_fps";
                public static final String COLOR = "fps.settings.components.fps.color";
            }

        }
    }

}
