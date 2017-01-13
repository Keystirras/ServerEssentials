package com.wifld.tfoc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ServerEssentials 
implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("serveressentials")) {
			sender.sendMessage(ChatColor.RED + "            ServerEssentials Help (1/3)");
			sender.sendMessage(ChatColor.RED + "/apply <staff/youtuber/builder>.");
			sender.sendMessage(ChatColor.RED + "/staffchat A chat for Staff.");
			sender.sendMessage(ChatColor.RED + "/ownerchat A chat for Owners.");
			sender.sendMessage(ChatColor.RED + "/builderchat A chat for builders.");
			sender.sendMessage(ChatColor.RED + "/colors Displays the chat color codes.");
			return true;
		}
		if (args[0].equalsIgnoreCase("help")) {
			sender.sendMessage(ChatColor.RED + "            ServerEssentials Help (1/3)");
			sender.sendMessage(ChatColor.RED + "/apply <staff/youtuber/builder>.");
			sender.sendMessage(ChatColor.RED + "/staffchat A chat for Staff.");
			sender.sendMessage(ChatColor.RED + "/ownerchat A chat for Owners.");
			sender.sendMessage(ChatColor.RED + "/builderchat A chat for builders.");
			sender.sendMessage(ChatColor.RED + "/colors Displays the chat color codes.");
			return true;
		}
		if (args[1].equalsIgnoreCase("2")){
			sender.sendMessage(ChatColor.RED + "            ServerEssentials Help (2/3)");
			sender.sendMessage(ChatColor.RED + "/formats Displays the chat format.");
			sender.sendMessage(ChatColor.RED + "/website Displays your server website.");
			sender.sendMessage(ChatColor.RED + "/steam Displays the steam page.");
			sender.sendMessage(ChatColor.RED + "/twitter Displays your twitter page.");
			sender.sendMessage(ChatColor.RED + "/facebook Displays your server's Facebook page.");
			return true;
		}
		if (args[1].equalsIgnoreCase("3")){
			sender.sendMessage(ChatColor.RED + "            ServerEssentials Help (3/3)");
			sender.sendMessage(ChatColor.RED + "/youtube Displays your Youtube channel.");
			sender.sendMessage(ChatColor.RED + "/serveressentials reload Reloads the ServerEssentials configuration.");
		}
		if (args[0].equalsIgnoreCase("reload")) {
			Main.getPlugin().reloadConfig();
			return true;
		}
		return true;
	}

}