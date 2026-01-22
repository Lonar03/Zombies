package net.dip.objects.guns;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.bukkit.Material;
import org.bukkit.Particle;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class GunDefinition {
    private final String id;
    private final String name;
    private final Material item;
    private final Particle particle;
    private final GunStats baseStats;
    private final List<UltimateLevel> ultimates;

    @JsonCreator
    public GunDefinition(@JsonProperty("id") String id, 
                        @JsonProperty("name") String name, 
                        @JsonProperty("item") Material item, 
                        @JsonProperty("particle") Particle particle, 
                        @JsonProperty("baseStats") GunStats baseStats, 
                        @JsonProperty("ultimates") List<UltimateLevel> ultimates) {
        this.id = Objects.requireNonNull(id, "id cannot be null");
        this.name = Objects.requireNonNull(name, "name cannot be null");
        this.item = Objects.requireNonNull(item, "item cannot be null");
        this.particle = Objects.requireNonNull(particle, "particle cannot be null");
        this.baseStats = Objects.requireNonNull(baseStats, "baseStats cannot be null");
        this.ultimates = Collections.unmodifiableList(Objects.requireNonNull(ultimates, "ultimates cannot be null"));
    }

    public String id() { return id;}
    public String name() { return name;}
    public Material item() { return item; }
    public Particle particle() { return particle; }
    public GunStats baseStats() { return baseStats;}
    public List<UltimateLevel> ultimates() { return ultimates; }
}
