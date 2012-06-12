package me.Ladzboy65;

import java.util.Random;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

public class InArena {
	private DhmcArena plugin;
	private DhmcArena arena;
	Random r = new Random();

	public void JoinArena(Player player) {
		World world = (World) plugin.getConfig().get("DhmcArena.getArena.world");
			Location l = new Location (world, r.nextInt(arena.x1 - arena.x2 + 1) + arena.x2, arena.y1, r.nextInt(arena.z1 - arena.z2 + 1) + arena.z2);
			plugin.saveInventory(player);
			player.teleport(l);
		
	}


}
