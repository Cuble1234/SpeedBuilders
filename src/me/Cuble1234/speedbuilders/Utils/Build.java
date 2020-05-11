package me.Cuble1234.speedbuilders.utils;

import org.bukkit.Location;
import org.bukkit.Material;

public class Build {
	private Material[][][] blocks = new Material[7][7][7];
	private Material[][] floor = new Material[7][7];

	public void build(Location center) {
		Location loc;
		for (int x = (-3); x <= 3; x++) {
			for (int z = (-3); z <= 3; z++) {
				loc = new Location(center.getWorld(), center.getX(), center.getY(), center.getZ());
				center.add(x, 0, z);
				center.getBlock().setType(floor[x][z]);
				center = new Location(loc.getWorld(), loc.getX(), loc.getY(), loc.getZ());
			}
		}
		for (int x = (-3); x <= 3; x++) {
			for (int y = 1; y < 8; y++) {
				for (int z = (-3); z <= 3; z++) {
					loc = new Location(center.getWorld(), center.getX(), center.getY(), center.getZ());
					center.add(x, y, z);
					center.getBlock().setType(blocks[x][y][z]);
					center = new Location(loc.getWorld(), loc.getX(), loc.getY(), loc.getZ());
				}
			}
		}
	}
	
	public Build() {
		
	}
}
