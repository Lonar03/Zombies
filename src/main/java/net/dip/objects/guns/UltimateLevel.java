package net.dip.objects.guns;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class UltimateLevel {
    private final int level;
    private final Double damage;
    private final Integer maxAmmo;
    private final Integer maxClipAmmo;
    private final Double fireRate;
    private final Double reloadRate;

    @JsonCreator
    public UltimateLevel(@JsonProperty("level") int level, 
                        @JsonProperty("damage") Double damage, 
                        @JsonProperty("maxAmmo") Integer maxAmmo, 
                        @JsonProperty("maxClipAmmo") Integer maxClipAmmo, 
                        @JsonProperty("fireRate") Double fireRate, 
                        @JsonProperty("reloadRate") Double reloadRate) {
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
