package net.dip.listeners;

import net.dip.Main;
import net.dip.enums.GameState;
import net.dip.enums.UserStatus;
import net.dip.objects.User;
// import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import static net.dip.managers.GameManager.getGameState;

public class EPlayerClick implements Listener {

    @EventHandler
    public void onClick(PlayerInteractEvent event){

        if (event.getItem().getType() != null) {
            // Material item = event.getItem().getType();
            User user = Main.getUserManager().getUser(event.getPlayer());

            if(user.getStatus().equals(UserStatus.ALIVE)) {

                //placeholder TODO
                boolean nearLocation = true;
                if (nearLocation && getGameState().equals(GameState.INGAME)) {
                    //something like shop.purchase(u)
                } else if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                    // TODO: Shoot
                } else if (event.getAction().equals(Action.LEFT_CLICK_AIR) || event.getAction().equals(Action.LEFT_CLICK_BLOCK)) {
                    // TODO: Reload
                }
            }
        }
    }
}
