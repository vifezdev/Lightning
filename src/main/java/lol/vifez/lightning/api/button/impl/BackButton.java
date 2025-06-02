package lol.vifez.lightning.api.button.impl;

import lol.vifez.lightning.api.button.Button;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class BackButton extends Button {
    private final Runnable backAction;

    public BackButton(Runnable backAction) {
        this.backAction = backAction;
    }

    @Override
    public ItemStack getItem(Player player) {
        ItemStack item = new ItemStack(Material.BARRIER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Back");
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public void onClick(Player player, ClickType clickType) {
        backAction.run();
    }
}