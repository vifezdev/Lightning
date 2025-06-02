package lol.vifez.lightning.api.button.impl;

import lol.vifez.lightning.api.button.Button;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class EasyButton extends Button {
    private final Function<Player, ItemStack> itemFunction;
    private final BiConsumer<Player, ClickType> clickAction;

    public EasyButton(Function<Player, ItemStack> itemFunction, BiConsumer<Player, ClickType> clickAction) {
        this.itemFunction = itemFunction;
        this.clickAction = clickAction;
    }

    @Override
    public ItemStack getItem(Player player) {
        return itemFunction.apply(player);
    }

    @Override
    public void onClick(Player player, ClickType clickType) {
        clickAction.accept(player, clickType);
    }
}