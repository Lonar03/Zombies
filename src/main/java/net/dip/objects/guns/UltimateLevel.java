package net.dip.objects.guns;

public class UltimateLevel {
    private final int level;
    private final Double damage;
    private final Integer maxAmmo;
    private final Integer maxClipAmmo;
    private final Double fireRate;
    private final Double reloadRate;

    public UltimateLevel(int level, Double damage, Integer maxAmmo, Integer maxClipAmmo, Double fireRate, Double reloadRate) {
        this.level = level;
        this.damage = damage;
        this.maxAmmo = maxAmmo;
        this.maxClipAmmo = maxClipAmmo;
        this.fireRate = fireRate;
        this.reloadRate = reloadRate;
    }

    // Add getters if needed
    public int Level() { return level; }
    public Double Damage() { return damage; }
    public Integer MaxAmmo() { return maxAmmo; }
    public Integer MaxClipAmmo() { return maxClipAmmo; }
    public Double FireRate() { return fireRate; }
    public Double ReloadRate() { return reloadRate; }
}
