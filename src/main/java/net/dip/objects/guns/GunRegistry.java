package net.dip.objects.guns;

import java.util.HashMap;
import java.util.Map;

public class GunRegistry {

    private final Map<String, GunDefinition> definitions = new HashMap<>();

    public void register(GunDefinition def) {
        definitions.put(def.id(), def);
    }

    public Gun create(String id) {
        GunDefinition def = definitions.get(id);
        if (def == null) {
            throw new IllegalArgumentException("Unknown gun: " + id);
        }
        return new Gun(def);
    }
}