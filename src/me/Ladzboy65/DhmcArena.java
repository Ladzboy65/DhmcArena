package me.Ladzboy65;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public class DhmcArena extends JavaPlugin{
	
	protected Logger log = Logger.getLogger("Minecraft");
	
	int x2 = getConfig().getInt("DhmcArena.getArena.x2");
	int y2 = getConfig().getInt("DhmcArena.getArena.y2");
	int z2 = getConfig().getInt("DhmcArena.getArena.z2");
	int x1 = getConfig().getInt("DhmcArena.getArena.x1");
	int y1 = getConfig().getInt("DhmcArena.getArena.y1");
	int z1 = getConfig().getInt("DhmcArena.getArena.z1");
	
	
public void onEnable(){
		
		this.log("This plugin has been enabled!");
}

public void onDisable(){
	
	this.log("This plugin has been disabled!");
}

public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
	Player player = (Player) sender;
	if(cmd.getName().equalsIgnoreCase("ma")){
		if(args[0].equalsIgnoreCase("join") );{
 
			InArena ia = new InArena();
			ia.JoinArena(player);
	}

	}
	return false;
}

		/**
		 * 
		 * @param message
		 */
		public void log(String message){
			log.info("[dhmcArena]: " + message);
		}

		public void saveInventory(Player player) {
			Map<Player, Inventory> playerInv = new HashMap<Player, Inventory>();
			Inventory inv = player.getInventory();
			playerInv.put(player, inv);
			player.getInventory().clear();
			player.updateInventory();
			
		}
		public void giveClassInventory(Player player){
			
			
		}
		public void giveBackInventory(Player player){
			
			
		}
}
