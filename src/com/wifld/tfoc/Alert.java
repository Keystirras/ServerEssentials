package com.wifld.tfoc;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;

public class Alert implements CommandExecutor{
	
	   public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		   String alertPrefix = Main.getPlugin().getConfig().getString("AlertPrefix");
		   
		    StringBuilder message = new StringBuilder();
		    for (int i = 0; i < args.length; i++)
		    {
		      message.append(args[i]);
		      message.append(" ");
		    }
		    if (cmd.getName().equalsIgnoreCase("alert"))
		    {
		      if (sender.hasPermission("serveressentials.alert"))
		      {
		        if (args.length == 0)
		        {
		            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "Alert a message to other players. /alert <message>"));
		          return true;
		        }
		        Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', alertPrefix + message));
		        return true;
		      }
		      sender.sendMessage(ChatColor.RED + "You cannot use that command.");
		      return true;
		    }
	   return true;
	   
}
}
