package mcpe.popkechupki.helloworld;

import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.player.PlayerJoinEvent;
import cn.nukkit.plugin.PluginBase;

public class HelloWorld extends PluginBase implements Listener {

    @Override
    public void onEnable () {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin (PlayerJoinEvent event) {
        event.getPlayer().sendMessage("Hello, World.");
    }
}