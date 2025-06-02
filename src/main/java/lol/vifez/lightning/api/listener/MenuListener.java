package lol.vifez.lightning.api.listener;

import lol.vifez.lightning.api.Menu;
import lol.vifez.lightning.api.button.Button;
import lol.vifez.lightning.api.button.listener.ButtonListener;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class MenuListener implements Listener {
    @EventHandler
    public void onClick(InventoryClickEvent e) {
        if (e.getInventory().getHolder() instanceof Menu) {
            e.setCancelled(true);
            Menu menu = (Menu) e.getInventory().getHolder();
            Button button = ButtonListener.getButton(e.getRawSlot());
            if (button != null) button.onClick((org.bukkit.entity.Player) e.getWhoClicked(), e.getClick());
        }
    }
}