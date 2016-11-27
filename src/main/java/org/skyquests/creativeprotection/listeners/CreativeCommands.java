package org.skyquests.creativeprotection.listeners;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CreativeCommands implements Listener {

    @EventHandler
    public void onPlayerCommandPreprocess(PlayerCommandPreprocessEvent event) {
        Player player = event.getPlayer();

        if (event.getMessage().contains("/sell") || event.getMessage().contains("/ah") || event.getMessage().contains("/echest") || event.getMessage().contains("/pv")) {
            player.sendMessage(ChatColor.RED + "You can not perform this command while in creative.");
            event.setCancelled(true);
        }
    }
}
