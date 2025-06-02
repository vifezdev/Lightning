package lol.vifez.lightning.api.task;

import lol.vifez.lightning.MenuAPI;
import lol.vifez.lightning.api.Menu;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class MenuUpdateTask extends BukkitRunnable {
    private final Menu menu;

    public MenuUpdateTask(Menu menu) {
        this.menu = menu;
    }

    @Override
    public void run() {
        menu.setup();
    }

    public static void schedule(Menu menu, long delay, long period) {
        new MenuUpdateTask(menu).runTaskTimer(MenuAPI.getInstance(), delay, period);
    }
}