package betterverse.flatBedrock;

import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.block.Block;
import org.bukkit.Location;
import org.bukkit.World;

public class FlatBedrockListener implements Listener{
	@EventHandler
	public void onPlayerMove(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		Location location = player.getLocation();
		World world = location.getWorld();
		location = player.getLocation();
		if (location.getY() <= 8.000){
			int x_start = location.getBlockX() - 20;     
			int y_start = location.getBlockY();
			int z_start = location.getBlockZ() - 20;   
			int x_length = x_start + 40; 
			int y_length = y_start - 40;
			int z_length = z_start + 40;

			for(int x_pos = x_start; x_pos <= x_length; x_pos++){ 
				for(int y_pos = y_start; y_pos >= y_length; y_pos--){
					for(int z_pos = z_start; z_pos <= z_length; z_pos++){
						Block block = world.getBlockAt(x_pos,y_pos,z_pos);
						if (y_pos >= 1){
							if (block.getTypeId() == 7){
								block.setTypeId(1); 
							}
						}    
					}
				}
			}
		}
	}
}