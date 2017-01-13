package com.wifld.tfoc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;



public class Apply
implements CommandExecutor
{
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		String applyStaff = Main.getPlugin().getConfig().getString("ApplyStaff");
		String applyYoutuber = Main.getPlugin().getConfig().getString("ApplyYoutuber");
		String applyTwitcher = Main.getPlugin().getConfig().getString("ApplyTwitcher");
		String applyBuilder = Main.getPlugin().getConfig().getString("ApplyBuilder");
		String applyAlone = Main.getPlugin().getConfig().getString("ApplyAlone");
		if (cmd.getName().equalsIgnoreCase("apply")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', applyAlone));
				return true;
			}
			if (args[0].equalsIgnoreCase("staff")) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', applyStaff));
				return true;
			}
			if (args[0].equalsIgnoreCase("youtuber")) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', applyYoutuber));
				return true;
			}
			if (args[0].equalsIgnoreCase("twitcher")) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', applyTwitcher));
				return true;
			}
			if (args[0].equalsIgnoreCase("builder")) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', applyBuilder));
				return true;
			}
			if (args[0].equalsIgnoreCase("help")) {
				sender.sendMessage(ChatColor.YELLOW + "-------------------" + ChatColor.RED + "Apply" + ChatColor.YELLOW + "-------------------");
				sender.sendMessage(ChatColor.GOLD + "/apply staff - Tells you how to apply for staff.");
				sender.sendMessage(ChatColor.GOLD + "/apply youtuber - Tells you how to apply for Youtuber.");
				sender.sendMessage(ChatColor.GOLD + "/apply twitcher - Tells you how to apply for Twitcher.");
				sender.sendMessage(ChatColor.GOLD + "/apply builder - Tells you how to apply for builder");
				sender.sendMessage(ChatColor.YELLOW + "-------------------------------------------");
			}
			return true;
		}
		return true;
	}

}