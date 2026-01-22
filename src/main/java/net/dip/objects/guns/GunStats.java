package net.dip.objects.guns;

public class GunStats {
    private final double damage;
    private final int maxAmmo;
    private final int maxClipAmmo;
    private final double fireRate;
    private final double reloadRate;
    private final int pierce;

    public GunStats(double damage, int maxAmmo, int maxClipAmmo, double fireRate, double reloadRate, int pierce) {
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
