package betterverse.flatBedrock;

import org.bukkit.plugin.java.JavaPlugin;

public class FlatBedrock extends JavaPlugin{
	public void onEnable(){
		getServer().getPluginManager().registerEvents(new FlatBedrockListener(), this);
	}
}
