package lol.vifez.lightning.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public abstract class Menu implements InventoryHolder {
    protected final Player player;
    protected Inventory inventory;

    public Menu(Player player) {
        this.player = player;
        this.inventory = createInventory();
    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }

    public abstract String getTitle();
    public abstract int getSize();
    public abstract void setup();

    public void open() {
        setup();
        player.openInventory(inventory);
    }

    protected Inventory createInventory() {
        return MenuUtils.createInventory(this);
    }
}