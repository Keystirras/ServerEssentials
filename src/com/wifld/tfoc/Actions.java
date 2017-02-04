package com.wifld.tfoc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;


public class Actions
implements CommandExecutor
{
	
    public boolean onCommand(CommandSender sender, Command cmd, String label, String [] args) {
        Player p = (Player) sender;
        Player t = Bukkit.getServer().getPlayer(args[0]);
        
        List<String> actionsPrefix = Main.getPlugin().getConfig().getStringList("ActionsPrefix");
        List<String> actionsFacedesk = Main.getPlugin().getConfig().getStringList("ActionsFacedesk");
        List<String> actionsKiss = Main.getPlugin().getConfig().getStringList("ActionsKiss");
        List<String> actionsFacepalm = Main.getPlugin().getConfig().getStringList("ActionsFacepalm");
        List<String> actionsHug = Main.getPlugin().getConfig().getStringList("ActionsHug");
        List<String> actionsPoke = Main.getPlugin().getConfig().getStringList("ActionsPoke");
        List<String> actionsAntiPoke = Main.getPlugin().getConfig().getStringList("ActionsAntiPoke");
        
        if (cmd.getName().equalsIgnoreCase("kiss")) {
            if (!sender.hasPermission("serveressentials.kiss")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        	if (args.length == 0) {
        		sender.sendMessage(ChatColor.RED + "Could not find the player specified!");
        		return true;
        	}
            Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', actionsPrefix + " " + p.getDisplayName + " " + actionsKiss + " " + t.getDisplayName));
			
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("facedesk")) {
            if (!sender.hasPermission("serveressentials.facedesk")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        	if (args.length == 0) {
        		sender.sendMessage(ChatColor.RED + "Could not find the player specified!");
        		return true;
        	}
        	Bukkit.getServer().broadcastMessage(ChatColor.translateAlternateColorCodes('&', actionsPrefix + " " + p.getDisplayName + " " + actionsFacedesk));
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("facepalm")) {
            if (!sender.hasPermission("serveressentials.facepalm")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        	if (args.length == 0) {
        		sender.sendMessage(ChatColor.RED + "Could not find the player specified!");
        		return true;
        	}
            Bukkit.getServer().broadcastMessage(ChatColor.TranslateAlternateColorCodes('&', actionsPrefix + " " + p.getDisplayName + " " + actionsFacepalm));
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("hug")) {
            if (!sender.hasPermission("serveressentials.hug")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        	if (args.length == 0) {
        		sender.sendMessage(ChatColor.RED + "Could not find the player specified!");
        		return true;
        	}
        	Bukkit.getServer().broadcastMessage(ChatColor.TranslateAlternateColorCodes('&', actionsPrefix + " " + p.getDisplayName + " " + actionsHug + " " + t.getDisplayName));
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("poke")) {
            if (!sender.hasPermission("serveressentials.poke")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        	if (args.length == 0) {
        		sender.sendMessage(ChatColor.RED + "Could not find the player specified!");
        		return true;
        	}
        	Bukkit.getServer().broadcastMessage(ChatColor.TranslateAlternateColorCodes('&', actionsPrefix + " " + p.getDisplayName + " " + actionsPoke + " " + t.getDisplayName));
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("antipoke")) {
            if (!sender.hasPermission("serveressentials.antipoke")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
        	if (args.length == 0) {
        		sender.sendMessage(ChatColor.RED + "Could not find the player specified!");
        		return true;
        	}
        	Bukkit.getServer().broadcastMessage(ChatColor.TranslateAlternateColorCodes('&', actionsPrefix + " " + p.getDisplayName + " " + actionsAntiPoke + " " + t.getDisplayName));" );
            return true;
        }  
        if (cmd.getName().equalsIgnoreCase("slap")){
            if (!sender.hasPermission("serveressentials.slap")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Please specify a player you would like to slap.");
                return true;
            }
            if (t == null) {
                sender.sendMessage(ChatColor.RED + "Could not find player specified.");
                return true;
            }
            if (sender instanceof Player) {
                t.getWorld().playSound(t.getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1.0F, 1.0F);
                t.setVelocity(new Vector(0.0D, 2.5D, 0.0D));
                Bukkit.getServer().broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + "C" + ChatColor.BLUE + "r" + ChatColor.GREEN + "a" + ChatColor.DARK_PURPLE + "f" + ChatColor.GOLD + "t" + ChatColor.WHITE + "-" + ChatColor.DARK_BLUE + "O" + ChatColor.WHITE + "-" + ChatColor.AQUA + "Bot" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + p.getDisplayName() + " slapped " + t.getDisplayName() + " into the air!");
                return true;
            }
        }
        if (cmd.getName().equalsIgnoreCase("punch")){
            if (!sender.hasPermission("serveressentials.punch")) {
                sender.sendMessage(ChatColor.RED + "You do not have permission to use this command!");
            }
            if (args.length == 0) {
                sender.sendMessage(ChatColor.RED + "Please specify a player you would like to punch.");
                return true;
            }
            if (t == null) {
                sender.sendMessage(ChatColor.RED + "Could not find player specified.");
                return true;
            }
            if (sender instanceof Player) {
                t.getWorld().playSound(t.getLocation(), Sound.ENTITY_LIGHTNING_THUNDER, 1.0F, 1.0F);
                t.setVelocity(new Vector(2.0D, 2.5D, 0.0D));
                Bukkit.getServer().broadcastMessage(ChatColor.DARK_GRAY + "[" + ChatColor.RED + "C" + ChatColor.BLUE + "r" + ChatColor.GREEN + "a" + ChatColor.DARK_PURPLE + "f" + ChatColor.GOLD + "t" + ChatColor.WHITE + "-" + ChatColor.DARK_BLUE + "O" + ChatColor.WHITE + "-" + ChatColor.AQUA + "Bot" + ChatColor.DARK_GRAY + "] " + ChatColor.YELLOW + p.getDisplayName() + " punched " + t.getDisplayName() + " into the air!");
                return true;
            }
           
        }
       
    return true;
    }
}
