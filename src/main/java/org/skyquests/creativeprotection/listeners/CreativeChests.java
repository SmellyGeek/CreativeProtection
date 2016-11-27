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

        if (player.hasPermission("creativedisable.bypass")) {
            return;
        }
        if (block.getType() == Material.CHEST || block.getType() == Material.ENDER_CHEST || block.getType() == Material.HOPPER || block.getType() == Material.FURNACE || block.getType() == Material.DISPENSER || block.getType() == Material.MINECART || block.getType() == Material.ENCHANTMENT_TABLE) {
            if (player.getGameMode() == GameMode.CREATIVE) {
                player.sendMessage(ChatColor.RED + "You cannot open chests in creative");
                event.setCancelled(true);
            }
        }
    }
}
