package net.dip.objects.perks;

public abstract class Perk {
    public String name;
    public int cost;
    public String[] description;

    public Perk(String name, int cost, String[] description){
        this.name = name;
        this.cost = cost;
        this.description = description;
    }
}
