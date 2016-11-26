package org.skyquests.creativeprotection.listeners;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class CreativeInventory implements Listener {

    private HashMap<Player, ItemStack[]> survivalInventory = new HashMap<Player, ItemStack[]>();

    @EventHandler
    public void onPlayerGamemodeChangeEvent(PlayerGameModeChangeEvent event) {
        Player player = event.getPlayer();
        if (event.getNewGameMode() == GameMode.CREATIVE) {
            survivalInventory.put(player, player.getInventory().getContents());
            player.getInventory().clear();
        }
        if (event.getNewGameMode() == GameMode.SURVIVAL) {
            if (survivalInventory.containsKey(player)) {
                player.getInventory().setContents(survivalInventory.get(player));
            }
        }
    }
}
