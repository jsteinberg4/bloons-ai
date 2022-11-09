package org.jsds.model;

/**
 * A projectile is an object shot out of a tower that travels at a specified rate and deals damage to a balloon
 * if it is at the same point on the valid path at the same time
 */
public class Projectile {

    // damage dealt by a projectile
    int damage = 1;

    // position of projectile which is initialized as
    Coordinate projectilePosition;

    public Projectile(Coordinate pos) {
        if(pos == null) {
            throw new NullPointerException("Coordinate used to initialize projectile is null");
        }
        this.projectilePosition = pos;
    }


    // Get damage that will be dealt by projectile
    public int getDamage() {
        return this.damage;
    }

    // Get projectile position
    public Coordinate getProjectilePosition() {
        return this.projectilePosition;
    }
}
