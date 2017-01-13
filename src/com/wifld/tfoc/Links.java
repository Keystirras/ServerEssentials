package com.wifld.tfoc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
public class Links
implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		String linksFacebook = Main.getPlugin().getConfig().getString("Facebook");
		String linksTwitter = Main.getPlugin().getConfig().getString("Twitter");
		String linksYoutube = Main.getPlugin().getConfig().getString("Youtube");
		String linksYourWebsite = Main.getPlugin().getConfig().getString("Website");
		String linksSteam = Main.getPlugin().getConfig().getString("Steam");
		String linksHead = Main.getPlugin().getConfig().getString("LinksTitle");
		if (cmd.getName().equalsIgnoreCase("links")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksHead));
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksYourWebsite));
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksSteam));
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksYoutube));
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksTwitter));
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksFacebook));
				return true;
			}
			if (args[0].equalsIgnoreCase("help")) {
				sender.sendMessage(ChatColor.YELLOW + "-------------------" + ChatColor.RED + "Links" + ChatColor.YELLOW + "--------------------");
				sender.sendMessage(ChatColor.GOLD + "/links - Displays all the links.");
				sender.sendMessage(ChatColor.GOLD + "/website - Displays the website.");
				sender.sendMessage(ChatColor.GOLD + "/youtube - Displays the server youtube channel.");
				sender.sendMessage(ChatColor.GOLD + "/facebook - Displays the server's facebook page.");
				sender.sendMessage(ChatColor.GOLD + "/twitter - Displays the server's twitter page");
				sender.sendMessage(ChatColor.GOLD + "/steam - Displays the steam community group.");
				sender.sendMessage(ChatColor.YELLOW + "---------------------------------------------");
				return true;
			}
		}
		if (cmd.getName().equalsIgnoreCase("website")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksYourWebsite));
			}
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("steam")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksSteam));
			}
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("youtube")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksYoutube));
			}
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("facebook")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksFacebook));
			}
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("twitter")) {
			if (args.length == 0) {
				sender.sendMessage(ChatColor.translateAlternateColorCodes('&', linksTwitter));
			}
			return true;
		}
		return true;
	}
}
