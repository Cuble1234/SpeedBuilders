package me.Cuble1234.speedbuilders.events;

import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import me.Cuble1234.speedbuilders.utils.Platform;

public class DestroyPlatformEvent extends Event{

	Platform pl;
	
	public DestroyPlatformEvent(Platform pl) {
		this.pl = pl;
	}
	
	public Platform getPlatform() {
		return pl;
	}
	
	private static final HandlerList handlers = new HandlerList();
	
	@Override
	public HandlerList getHandlers() {
	    return handlers;
	}

	public static HandlerList getHandlerList() {
	    return handlers;
	}

}
