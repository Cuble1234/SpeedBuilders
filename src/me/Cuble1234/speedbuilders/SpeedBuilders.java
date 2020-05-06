package me.Cuble1234.speedbuilders;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class SpeedBuilders extends JavaPlugin{
	
	@Override
	public void onEnable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("d")) {
			
		}
		return true;
	}

}
