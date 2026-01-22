package net.dip.objects.shops;

import net.dip.objects.User;
import org.bukkit.Location;

public interface IShop {

    int getCost();
    Location getLocation();
    void purchase(User user);
}