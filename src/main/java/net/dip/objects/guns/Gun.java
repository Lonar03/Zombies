package net.dip.objects.guns;

import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;
import org.bukkit.Particle;

/**
 * Superclass object to represent all guns
 */
public class Gun {

    protected final GunDefinition def;

    protected int ammo;
    protected int clipAmmo;
    protected int ultimateLevel;
    protected Particle particle;

    public Gun(GunDefinition def) {
        this.def = def;
        this.ultimateLevel = 0;
        this.particle = def.particle();

        GunStats stats = getCurrentStats();
        this.ammo = stats.maxAmmo();
        this.clipAmmo = stats.maxClipAmmo();
    }

    public GunStats getCurrentStats() {
        double damage = def.baseStats().damage();
        int maxAmmo = def.baseStats().maxAmmo();
        int maxClipAmmo = def.baseStats().maxClipAmmo();
        double fireRate = def.baseStats().fireRate();
        double reloadRate = def.baseStats().reloadRate();
        int pierce = def.baseStats().pierce();

        if (def.ultimates() != null) {
            for (UltimateLevel ult : def.ultimates()) {
                if (ult.Level() <= ultimateLevel) {
                    if (ult.Damage() != null) damage = ult.Damage();
                    if (ult.MaxAmmo() != null) maxAmmo = ult.MaxAmmo();
                    if (ult.MaxClipAmmo() != null) maxClipAmmo = ult.MaxClipAmmo();
                    if (ult.FireRate() != null) fireRate = ult.FireRate();
                    if (ult.ReloadRate() != null) reloadRate = ult.ReloadRate();
                }
            }
        }

        return new GunStats(damage, maxAmmo, maxClipAmmo, fireRate, reloadRate, pierce);
    }

    public void Ultimate() {
        this.ultimateLevel++;
    }
}