package lol.vifez.lightning.api;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;

public class MenuUtils {
    public static Inventory createInventory(Menu menu) {
        return Bukkit.createInventory(menu, menu.getSize(), menu.getTitle());
    }
}