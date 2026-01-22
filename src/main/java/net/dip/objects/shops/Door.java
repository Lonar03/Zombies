package net.dip.objects.shops;

import net.dip.objects.User;
import org.bukkit.Location;

public class Door implements IShop {

    private String name;
    private int cost;
    private Location location;

    public Door(String name, int cost, Location location){
        this.name = name;
        this.cost = cost;
        this.location = location;
    }

    public int getCost(){
        return cost;
    }

    public Location getLocation(){
        return location;
    }

    public void purchase(User user){
        //TODO

        /*
        pseudocode
        - check gold
        - open if enough gold and broadcast
        - send message if not enough gold
         */

        if(user.getGold() >= this.getCost()){
            user.takeGold(cost);
            //open door
            //broadcast message
        } else {
            user.getPlayer().sendMessage("Not enough gold!");
        }

    }
}