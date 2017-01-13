package com.wifld.tfoc;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Chats
  implements CommandExecutor
{
  public static void sendToPermission(String permission, String messageBody)
  {
    for (Player loopPlayer : Bukkit.getServer().getOnlinePlayers()) {
      if (loopPlayer.hasPermission(permission)) {
        loopPlayer.sendMessage(messageBody);
      }
    }
  }
  
  public boolean onCommand(CommandSender sender, Command command, String label, String[] args)
  {
    String staffChat = Main.getPlugin().getConfig().getString("StaffChatPrefix");
    String ownerChat = Main.getPlugin().getConfig().getString("OwnerChatPrefix");
    String builderChat = Main.getPlugin().getConfig().getString("BuilderChatPrefix");
    String staffChatColor = Main.getPlugin().getConfig().getString("StaffChatColor");
    String ownerChatColor = Main.getPlugin().getConfig().getString("OwnerChatColor");
    String builderChatColor = Main.getPlugin().getConfig().getString("BuilderChatColor");
    StringBuilder message = new StringBuilder();
    for (int i = 0; i < args.length; i++)
    {
      message.append(args[i]);
      message.append(" ");
    }
    if (command.getName().equalsIgnoreCase("staffchat"))
    {
      if (sender.hasPermission("staffchat.use"))
      {
        if (args.length == 0)
        {
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', staffChat + "Send a message to staff. /" + command.getName() + " <message>"));
          return true;
        }
        String senderMessage = ChatColor.translateAlternateColorCodes('&', sender.getName());
        sendToPermission("staffchat.listen", ChatColor.translateAlternateColorCodes('&', staffChat + senderMessage + ChatColor.GRAY + ": " + 
          ChatColor.translateAlternateColorCodes('&', staffChatColor) + message));
        System.out.println("[SC] " + senderMessage + ": " + message);
        return true;
      }
      sender.sendMessage(ChatColor.RED + "You cannot use that command.");
      return true;
    }
    if (command.getName().equalsIgnoreCase("ownerchat"))
    {
      if (sender.hasPermission("ownerchat.use"))
      {
        if (args.length == 0)
        {
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', ownerChat + "Send a message to owners. /" + command.getName() + " <message>"));
          return true;
        }
        String senderMessage = sender.getName();
        sendToPermission("ownerchat.listen", ChatColor.translateAlternateColorCodes('&', ownerChat + senderMessage + ChatColor.DARK_RED + ": " + 
          ChatColor.translateAlternateColorCodes('&', ownerChatColor) + message));
        System.out.println("[OC] " + senderMessage + ": " + message);
        return true;
      }
      sender.sendMessage(ChatColor.RED + "You cannot use that command.");
      return true;
    }
    if (command.getName().equalsIgnoreCase("builderchat"))
    {
      if (sender.hasPermission("builderchat.use"))
      {
        if (args.length == 0)
        {
          sender.sendMessage(ChatColor.translateAlternateColorCodes('&', builderChat + "Send a message to builders. /" + command.getName() + " <msg>"));
          return true;
        }
        String senderMessage = sender.getName();
        sendToPermission("builderchat.listen", ChatColor.translateAlternateColorCodes('&', builderChat + senderMessage + ChatColor.DARK_AQUA + ": " + 
          ChatColor.translateAlternateColorCodes('&', builderChatColor) + message));
        System.out.println("[BC] " + senderMessage + ": " + message);
        return true;
      }
      sender.sendMessage(ChatColor.RED + "You cannot use that command.");
      return true;
    }
    return false;
  }
}