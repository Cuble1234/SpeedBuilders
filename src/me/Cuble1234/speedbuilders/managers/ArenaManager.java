package me.Cuble1234.speedbuilders.managers;

import java.util.ArrayList;

import org.bukkit.entity.Player;

import me.Cuble1234.speedbuilders.utils.Arena;

public class ArenaManager {
private ArenaManager() { }
	
	private static ArenaManager instance = new ArenaManager();

	public static ArenaManager getInstance() {
		return instance;
	}
	
	ArrayList<Arena> arenas = new ArrayList<Arena>();
	
	public void setup() {
		
	}
	
	public Arena getArena(int id) {
		for(Arena a : arenas) {
			if(a.getID() == id) return a;
		}
		return null;
	}
	
	public Arena getArena(Player p) {
		for(Arena a : arenas) {
			if(a.getArena(p)) return a;
		}
		return null;
	}
}
