package lol.vifez.lightning.api.button;

import lol.vifez.lightning.api.Menu;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public abstract class Button {
    protected Menu menu;
    public abstract ItemStack getItem(Player player);
    public abstract void onClick(Player player, ClickType clickType);
    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}