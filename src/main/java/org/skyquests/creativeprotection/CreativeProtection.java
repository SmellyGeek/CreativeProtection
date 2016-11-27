package org.skyquests.creativeprotection;

import org.bukkit.plugin.java.JavaPlugin;
import org.skyquests.creativeprotection.listeners.CreativeBlocks;
import org.skyquests.creativeprotection.listeners.CreativeChests;
import org.skyquests.creativeprotection.listeners.CreativeDropItem;
import org.skyquests.creativeprotection.listeners.CreativeInventory;

public class CreativeProtection extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new CreativeInventory(), this);
        this.getServer().getPluginManager().registerEvents(new CreativeDropItem(), this);
        this.getServer().getPluginManager().registerEvents(new CreativeBlocks(), this);
        this.getServer().getPluginManager().registerEvents(new CreativeChests(), this);
    }
}
