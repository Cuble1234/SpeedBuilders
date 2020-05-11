package me.Cuble1234.speedbuilders.managers;

import java.util.ArrayList;
import java.util.Arrays;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.Cuble1234.speedbuilders.cmds.SubCommand;


public class CommandManager implements CommandExecutor{
	
	private ArrayList<SubCommand> commands = new ArrayList<SubCommand>();
	
	public void setup() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		MessageManager msg = MessageManager.getInstance();
		if (!(sender instanceof Player)) {
			msg.severe(sender, "Only player can use SpeedBuilders commands");
			return true;
		}
		
		Player p = (Player) sender;
		
		if(!p.hasPermission("SpeedBuilder.Commands")) {
			msg.severe(p, "You not have permission to perform SpeedBuilder's command!");
			return true;
		}
		
		if(cmd.getName().equalsIgnoreCase("sb")) {
			if (args.length == 0) {
				for (SubCommand c : commands) {
					msg.info(p, "/pb " + c.name() + "(" + aliases(c) + ")" + " . " + c.info());
					return true;
				}
			}
			
			SubCommand target = getCommand(args[0]);
			
			if(target == null) {
				msg.severe(p, "There is no /pb " + args[0] + " command!");
				return true;
			}
			
			ArrayList<String> a = new ArrayList<String>();
			a.addAll(Arrays.asList(args));
			a.remove(0);
			args = a.toArray(new String[a.size()]);
			
			try {
				target.onCommand(p, args);
				return true;
			}
			catch(Exception e) {
				e.printStackTrace();
				return true;
			}
		}
		return true;
	}
	
	private SubCommand getCommand(String name) {
		for (SubCommand cmd : commands) {
			if(cmd.name() .equalsIgnoreCase(name)) return cmd;
			for (String alias : cmd.aliases()) if (name.equalsIgnoreCase(alias)) return cmd;
		}
		return null;
	}
	
	private String aliases(SubCommand cmd) {
		String fin = "";
		
		for(String a : cmd.aliases()) {
			fin += a + " | ";
		}
		
		return fin.substring(0, fin.lastIndexOf("! "));
	}

}
