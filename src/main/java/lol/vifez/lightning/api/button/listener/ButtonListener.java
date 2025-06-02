package lol.vifez.lightning.api.button.listener;

import lol.vifez.lightning.api.button.Button;

import java.util.HashMap;
import java.util.Map;

public class ButtonListener {
    private static final Map<Integer, Button> buttonMap = new HashMap<>();

    public static void registerButton(int slot, Button button) {
        buttonMap.put(slot, button);
    }

    public static Button getButton(int slot) {
        return buttonMap.get(slot);
    }
}