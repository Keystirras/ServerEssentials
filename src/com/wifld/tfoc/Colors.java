package com.wifld.tfoc;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class Colors 
implements CommandExecutor{
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (cmd.getName().equalsIgnoreCase("colors")) {
			sender.sendMessage(ChatColor.GOLD + "-_-_- Color Codes -_-_-");
			sender.sendMessage(ChatColor.BLACK + "     Black: &0" + ChatColor.DARK_GRAY + "          Gray: &8");
			sender.sendMessage(ChatColor.DARK_BLUE + "     Dark Blue: &1" + ChatColor.BLUE + "    Blue: &9");
			sender.sendMessage(ChatColor.DARK_GREEN + "     Green: &2" + ChatColor.GREEN + "         Light Green: &a");
			sender.sendMessage(ChatColor.DARK_AQUA + "     Teal: &3" + ChatColor.LIGHT_PURPLE + "           Pink: &d");
			sender.sendMessage(ChatColor.DARK_RED + "     Maroon: &4" + ChatColor.AQUA + "       Aqua: &b");
			sender.sendMessage(ChatColor.DARK_PURPLE + "     Purple: &5" + ChatColor.RED + "        Red: &c");
			sender.sendMessage(ChatColor.GOLD + "     Gold: &6" + ChatColor.YELLOW + "           Yellow: &e");
			sender.sendMessage(ChatColor.GRAY + "     Silver: &7" + ChatColor.WHITE + "         White: &f");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("formats")) {
			sender.sendMessage(ChatColor.GOLD + "-_-_- Chat Formats -_-_-");
			sender.sendMessage("         Bold: " + ChatColor.BOLD + "&l");
			sender.sendMessage("         Underline: " + ChatColor.UNDERLINE + "&n");
			sender.sendMessage("         Italic: " + ChatColor.ITALIC + "&o");
			sender.sendMessage("         Magic: &k");
			sender.sendMessage("         Strike: " + ChatColor.BOLD + "&m");
			sender.sendMessage("         Reset: " + ChatColor.RESET + "&r");
			return true;
		}
		return true;
	}

}
