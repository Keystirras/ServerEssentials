package com.wifld.tfoc;

import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Kill
implements CommandExecutor
{
	Random random = new Random();
	public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
		
		List<String> killMsg = Main.getPlugin().getConfig().getStringList("KillMessage");
		int pick = random.nextInt(killMsg.size());
		if (cmd.getName().equalsIgnoreCase("kill")) {
			if (!sender.hasPermission("se.kill")) {
				sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
			}
			if (args.length == 0) {
				sender.sendMessage(ChatColor.RED + "Please specify a player you would like to kill.");
				return true;
			}
			Player target = Bukkit.getServer().getPlayer(args[0]);
			if (target == null) {
				sender.sendMessage(ChatColor.RED + "Could not find player!");
				return true;
			}
			if (sender instanceof Player) {
				  Player p = (Player) sender;
				  Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', p.getDisplayName() + " " + killMsg.get(pick) + " " + target.getDisplayName()));
				  target.setHealth(0);
				} else {
					Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&4Console" + " " + killMsg.get(pick) + " " + target.getDisplayName()));
					target.setHealth(0);
				}
		}
		return true;
	}
	
}
