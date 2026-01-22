package net.dip.listeners;

import net.dip.Main;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class EPlayerConnection implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event){
        //TODO to handle later
        Main.getUserManager().createUser(event.getPlayer());
    }
}