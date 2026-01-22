package net.dip.objects.guns;

// import net.dip.objects.User;
import org.bukkit.Material;
import org.bukkit.Particle;
// import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Superclass object to represent all guns
 */
public abstract class Gun {

    protected final String name;
    protected final Material item;
    protected String[] description;
    protected final Particle particle;

    protected final int gunRange;
    protected double damage;
    protected int ammo;
    protected int maxAmmo;
    protected int clipAmmo;
    protected int maxClipAmmo;
    protected double fireRate;
    protected double reloadRate;

    /**
     * Constructor to create a basic gun
     *
     * @param name THe name of the gun
     * @param item The type of item the gun is
     * @param particle The particle the gun displays when shot
     * @param gunRange The maximum number of blocks the gun shoots for
     * @param damage The damage the gun does
     * @param ammo The ammo the gun currently has
     * @param maxAmmo The maximum ammo of the gun
     * @param clipAmmo The clip ammo of the gun
     * @param maxClipAmmo The maximum clip ammo of the gun
     * @param fireRate The fire rate of the gun
     * @param reloadRate The reload rate of the gun
     */
    Gun(String name, Material item, Particle particle, int gunRange, double damage, int ammo, int maxAmmo, int clipAmmo, int maxClipAmmo, double fireRate, double reloadRate){
        this.name = name;
        this.item = item;

        this.gunRange = gunRange;
        this.damage = damage;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
        this.clipAmmo = clipAmmo;
        this.maxClipAmmo = maxClipAmmo;
        this.fireRate = fireRate;
        this.reloadRate = reloadRate;
        this.particle = particle;
    }

    /**
     * Sets the description of the Gun.
     *
     * @param description String list to represent Gun description
     */
    protected void setDescription(String... description){
        this.description = description;
    }

    /**
     * Gets the lore of the Gun.
     *
     * @return a List of Strings containing the lore of the Gun
     */
    public List<String> getLore() {
        List<String> lore = new ArrayList<>();

        //TODO color
        Collections.addAll(lore, description);
        lore.add("");
        lore.add("Damage: " + getDamage() + " HP");
        lore.add("Ammo: " + getAmmo());
        lore.add("Clip Ammo: " + getClipAmmo());
        lore.add("Fire Rate: " + getFireRate() + "s");
        lore.add("Reload: " + getReloadRate() + "s");
        lore.add("");
        lore.add("LEFT-CLICK to reload.");
        lore.add("RIGHT-CLICK to shoot.");

        return lore;
    }
    private void decreaseAmmo() {
        // TODO:
    }

    public abstract void shoot(Player player);

    public abstract void reload();

    /* Appropriate accessor methods below */

    public String getName() {
        return name;
    }

    public Material getItem() {
        return item;
    }

    public double getDamage() {
        return damage;
    }

    public int getAmmo() {
        return ammo;
    }

    public int getClipAmmo() {
        return clipAmmo;
    }

    public double getFireRate() {
        return fireRate;
    }

    public double getReloadRate() {
        return reloadRate;
    }
}
