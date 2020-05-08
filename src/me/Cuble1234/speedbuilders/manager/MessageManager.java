package me.Cuble1234.speedbuilders.manager;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MessageManager {
	
	private MessageManager() { }
	
	private static MessageManager instance = new MessageManager();

	public static MessageManager getInstance() {
		return instance;
	}
	
	private String SpeedBuildersPrefix = ChatColor.RED + ""+ ChatColor.BOLD + "[" + ChatColor.GOLD + "" 
			+ ChatColor.BOLD + "SpeedBuilders" 
			+ ChatColor.RED + "" + ChatColor.BOLD + "] ";
	
	private String BuildPrefix = ChatColor.BLUE + "Build> ";
	
	private void msg(Player p, String prefix, ChatColor c, String msg) {
		p.sendMessage(prefix + " " + c + msg);
	}
	
	public void severe(Player p, String msg) {
		msg(p, SpeedBuildersPrefix, ChatColor.RED, msg);
	}
	
	public void info(Player p, String msg) {
		msg(p, SpeedBuildersPrefix, ChatColor.YELLOW, msg);
	}
	
	public void good(Player p, String msg) {
		msg(p, SpeedBuildersPrefix, ChatColor.GREEN, msg);
	}
	
	public void PerfectMutch(Player p, String time) {
		msg(p, BuildPrefix, ChatColor.YELLOW, p.getName() + ChatColor.GRAY + 
				" got a perfect build in " + ChatColor.GREEN + time + " Seconds" + ChatColor.GRAY +"!");
	}
	
	public void Join(Player p) {
		msg(p, ChatColor.DARK_GRAY + "Join> ", ChatColor.GRAY, p.getName());
	}
	
	public void Quit(Player p) {
		msg(p, ChatColor.DARK_GRAY + "Quit> ", ChatColor.GRAY, p.getName());
	}
	
	public void Chat(Player p, String msg) {
		msg(p, ChatColor.BLUE + "Chat> ", ChatColor.GRAY, msg);
	}
	
	public void Build(Player p, String msg) {
		msg(p, BuildPrefix , ChatColor.GRAY, msg);
	}
	
	public void Game(Player p, String msg) {
		msg(p, ChatColor.BLUE + "Game> ", ChatColor.GRAY, msg);
	}
}
