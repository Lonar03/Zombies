package net.dip.objects.guns;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GunStats {
    private final double damage;
    private final int maxAmmo;
    private final int maxClipAmmo;
    private final double fireRate;
    private final double reloadRate;
    private final int pierce;

    @JsonCreator
    public GunStats(@JsonProperty("damage") double damage, 
                    @JsonProperty("maxAmmo") int maxAmmo, 
                    @JsonProperty("maxClipAmmo") int maxClipAmmo, 
                    @JsonProperty("fireRate") double fireRate, 
                    @JsonProperty("reloadRate") double reloadRate, 
                    @JsonProperty("pierce") int pierce) {
        this.damage = damage;
        this.maxAmmo = maxAmmo;
        this.maxClipAmmo = maxClipAmmo;
        this.fireRate = fireRate;
        this.reloadRate = reloadRate;
        if (pierce <= 0) {
            this.pierce = 1;
        } else {
            this.pierce = pierce;
        }
    }

    public double damage() {    return damage;  }
    public int maxAmmo() {  return maxAmmo;}
    public int maxClipAmmo() {  return maxClipAmmo; }
    public double fireRate() { return fireRate; }
    public double reloadRate() { return reloadRate; }
    public int pierce() { return pierce; }
}
