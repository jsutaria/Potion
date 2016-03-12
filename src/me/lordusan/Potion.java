package me.lordusan;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Potion extends JavaPlugin {
	
	PotionEffect nightvision;
	@Override

	public void onEnable() {
		
	}
	@Override
	public void onDisable() {
		
	}
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		String perk = ChatColor.GRAY + "(" + ChatColor.DARK_PURPLE + "Potion" + ChatColor.GRAY + ")";
		if (cmd.getName().equalsIgnoreCase("potions") && sender instanceof Player) {
			Player player = (Player) sender;
			player.sendMessage(perk +  ChatColor.DARK_RED + 
					"Nightvision (/nv), Fire Resistance (/fr), Jump (/jb), Heal (/heal), Speed (/fast)");
			return true;
		}
		if (cmd.getName().equalsIgnoreCase("nv") && sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("potion.nv")) {
            if (args.length > 0)
            {
            	if (args[0].equalsIgnoreCase("on"))
            	{
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Night Vision has been enabled");
            		player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999999999, 2));
            	}
            	else if (args[0].equalsIgnoreCase("off"))
            	{
            		player.removePotionEffect(PotionEffectType.NIGHT_VISION);
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Night Vision has been removed");
            	}
            }
            else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Night Vision has been enabled");
                player.addPotionEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 999999999, 2));
            }
			} else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Upgrade your rank to get this perk!");
			}
			return true;

		}
		if (cmd.getName().equalsIgnoreCase("fr") && sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("potion.fr")) {
            if (args.length > 0)
            {
            	if (args[0].equalsIgnoreCase("on"))
            	{
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Fire Resistance has been enabled");
            		player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 999999999, 2));
            	}
            	else if (args[0].equalsIgnoreCase("off"))
            	{
            		player.removePotionEffect(PotionEffectType.FIRE_RESISTANCE);
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Fire Resistance has been removed");
            	}
            }
            else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Fire Resistance has been enabled");
                player.addPotionEffect(new PotionEffect(PotionEffectType.FIRE_RESISTANCE, 999999999, 2));
            }
			} else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Upgrade your rank to get this perk!");
			}
			return true;

		}
		if (cmd.getName().equalsIgnoreCase("jb") && sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("potion.jb")) {
            if (args.length > 0)
            {
            	if (args[0].equalsIgnoreCase("on"))
            	{
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Jump has been enabled");
            		player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 2));
            	}
            	else if (args[0].equalsIgnoreCase("off"))
            	{
            		player.removePotionEffect(PotionEffectType.JUMP);
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Jump has been removed");
            	}
            }
            else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Jump has been enabled");
                player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 999999999, 2));
            }
			} else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Upgrade your rank to get this perk!");
			}
			return true;

		}

		if (cmd.getName().equalsIgnoreCase("heal") && sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("potion.heal")) {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "You have been healed");
                player.addPotionEffect(new PotionEffect(PotionEffectType.HEAL, 1, 2));
			} else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Upgrade your rank to get this perk!");
			}
			return true;

		}
		if (cmd.getName().equalsIgnoreCase("fast") && sender instanceof Player) {
			Player player = (Player) sender;
			if (player.hasPermission("potion.speed")) {
            if (args.length > 0)
            {
            	if (args[0].equalsIgnoreCase("on"))
            	{
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Speed has been enabled");
            		player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 2));
            	}
            	else if (args[0].equalsIgnoreCase("off"))
            	{
            		player.removePotionEffect(PotionEffectType.SPEED);
            		player.sendMessage(perk +  ChatColor.DARK_RED + "Speed has been removed");
            	}
            }
            else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Speed has been enabled");
                player.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 999999999, 2));
            }
			} else {
        		player.sendMessage(perk +  ChatColor.DARK_RED + "Upgrade your rank to get this perk!");
			}
			return true;
		}
		
		return false;
	}
	

}

