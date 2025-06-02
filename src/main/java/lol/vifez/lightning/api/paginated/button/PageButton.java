package lol.vifez.lightning.api.paginated.button;

import lol.vifez.lightning.api.button.Button;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class PageButton extends Button {
    private final boolean next;

    public PageButton(boolean next) {
        this.next = next;
    }

    @Override
    public ItemStack getItem(Player player) {
        ItemStack item = new ItemStack(next ? Material.ARROW : Material.BARRIER);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(next ? "Next Page" : "Previous Page");
        item.setItemMeta(meta);
        return item;
    }

    @Override
    public void onClick(Player player, ClickType clickType) {
        if (menu instanceof lol.vifez.lightning.api.paginated.PaginatedMenu) {
            if (next) ((lol.vifez.lightning.api.paginated.PaginatedMenu) menu).nextPage();
            else ((lol.vifez.lightning.api.paginated.PaginatedMenu) menu).previousPage();
        }
    }
}