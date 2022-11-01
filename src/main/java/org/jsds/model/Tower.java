package org.jsds.model;

/**
 * A tower attempts to deal damage to balloons by shooting projectiles every so often in an attempt to stop them from
 * getting to other side
 */
public class Tower {

    // Represents the row and column position of the tower and can only be placed outside the path
    Coordinate towerPosition;

    public Tower(Coordinate pos) {
        if (pos == null) {
            throw new NullPointerException("Position to initialize Tower is null");
        }

        this.towerPosition = pos;
    }

    // gets the position of the tower
    public Coordinate getTowerPosition() {
        return this.towerPosition;
    }
}
