package net.dip.objects.guns;

import net.dip.objects.guns.gunbeams.LinearBeam;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Vector;

import java.util.HashSet;
import java.util.Set;

public class LinearGun extends Gun {

    public LinearGun(GunDefinition def) {
        super(def);
        // why tf do i need to write this again bruhhhhhhh
    }

    public void shoot(Player player){
        World world = player.getWorld();
        Vector eyeLocation = player.getEyeLocation().toVector().clone();
        Vector eyeDirection = player.getEyeLocation().getDirection().clone();
        Vector targetBlockVector = getTargetBlockVector(player, eyeLocation, eyeDirection);

        sendShot(world, eyeLocation, eyeDirection, targetBlockVector);
    }

    public void reload() {
        // TODO: Reload

    }

    private void sendShot(World world, Vector particleLocation, Vector particleDirection, Vector targetBlockVector) {
        LinearBeam beam = new LinearBeam(world, particle, particleLocation, particleDirection, targetBlockVector, getCurrentStats().pierce());
        beam.send();
    }

    private Vector getTargetBlockVector(Player player, Vector eyeLocation, Vector eyeDirection) {
        Set<Material> materials = new HashSet<>();

        materials.add(Material.AIR);
        materials.add(Material.CAVE_AIR);

        // TODO: Add slab blocks

        BoundingBox targetedBlockBoundingBox = player.getTargetBlock(materials, 1000).getBoundingBox();

        return targetedBlockBoundingBox.rayTrace(eyeLocation, eyeDirection, 1000).getHitPosition();
    }
}
