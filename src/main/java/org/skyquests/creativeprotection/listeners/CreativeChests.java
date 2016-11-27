package org.skyquests.creativeprotection.listeners;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

public class CreativeChests implements Listener {

    @EventHandler
    public void onInventoryInteract(PlayerInteractEvent event) {
        Player player = event.getPlayer();
        Block block = event.getClickedBlock();

        if (block.getType() == Material.CHEST) {
            if (player.getGameMode() == GameMode.CREATIVE) {
                player.sendMessage(ChatColor.RED + "You cannot open chests in creative");
                event.setCancelled(true);
            }
        }
    }
}
