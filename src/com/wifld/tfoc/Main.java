package com.wifld.tfoc;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.RegisteredServiceProvider;
import org.bukkit.plugin.java.JavaPlugin;

import net.milkbowl.vault.economy.Economy;

public final class Main
  extends JavaPlugin
{
  public static Plugin plugin;
  FileConfiguration config;
  File cfile;
  public static Economy econ = null;
  public void onEnable()
  {
	Metrics metrics = new Metrics(this);
    config = getConfig();
    getConfig().options().copyDefaults(true);
    saveDefaultConfig();
    cfile = new File(getDataFolder(), "config.yml");
    plugin = this;
    getCommand("apply").setExecutor(new Apply());
    getCommand("staffchat").setExecutor(new Chats());
    getCommand("ownerchat").setExecutor(new Chats());
    getCommand("builderchat").setExecutor(new Chats());
    getCommand("colors").setExecutor(new Colors());
    getCommand("formats").setExecutor(new Colors());
    getCommand("links").setExecutor(new Links());
    getCommand("website").setExecutor(new Links());
    getCommand("youtube").setExecutor(new Links());
    getCommand("twitter").setExecutor(new Links());
    getCommand("facebook").setExecutor(new Links());
    getCommand("steam").setExecutor(new Links());
    getCommand("serveressentials").setExecutor(new ServerEssentials());
    getCommand("kill").setExecutor(new Kill());
    getCommand("alert").setExecutor(new Alert());
    if (!setupEconomy() ) {
        Bukkit.getServer().getLogger().severe(String.format("[%s] - Disabled due to no Vault dependency found!", getDescription().getName()));
        getServer().getPluginManager().disablePlugin(this);
        return;}
  }
  
  public void onDisable()
  {
  }
  private boolean setupEconomy() {
	    if (getServer().getPluginManager().getPlugin("Vault") == null) {
	        return false;
	    }
	    RegisteredServiceProvider<Economy> rsp = getServer().getServicesManager().getRegistration(Economy.class);
	    if (rsp == null) {
	        return false;
	    }
	    econ = rsp.getProvider();
	    return econ != null;
	}
  public static void registerEvents(Plugin plugin, Listener... listeners)
  {
    Listener[] arrayOfListener;
    int j = (arrayOfListener = listeners).length;
    for (int i = 0; i < j; i++)
    {
      Listener listener = arrayOfListener[i];
      
      Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);
    }
  }
  
  public static Plugin getPlugin()
  {
    return plugin;
  }
}
