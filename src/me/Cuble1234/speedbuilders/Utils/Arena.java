package me.Cuble1234.speedbuilders.utils;

import org.bukkit.entity.Player;

public class Arena {
	
	private int id;
	private Platform[] platforms = new Platform[8];
	
	public int getID() {
		return id;
	} 
	
	public boolean getArena(Player p) {
		for (Platform pl : platforms) {
			if (pl.getPlayer() == p) return true;
		}
		return false;
	}

}
