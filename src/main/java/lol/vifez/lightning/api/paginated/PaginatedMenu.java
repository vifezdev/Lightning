package lol.vifez.lightning.api.paginated;

import lol.vifez.lightning.api.Menu;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;

public abstract class PaginatedMenu extends Menu {
    protected int page;
    protected final List<ItemStack> content = new ArrayList<>();

    public PaginatedMenu(Player player) {
        super(player);
    }

    public abstract void addContent();
    public abstract void applyButtons();

    @Override
    public void setup() {
        addContent();
        applyButtons();
    }

    public void nextPage() {
        page++;
        open();
    }

    public void previousPage() {
        page = Math.max(0, page - 1);
        open();
    }

    public List<ItemStack> getPageContent() {
        int start = page * getMaxItemsPerPage();
        int end = Math.min(start + getMaxItemsPerPage(), content.size());
        return content.subList(start, end);
    }

    public int getMaxItemsPerPage() {
        return getSize() - 9;
    }
}