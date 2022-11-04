package org.jsds.model;

import java.util.ArrayList;

/**
 * A tower attempts to deal damage to balloons by shooting projectiles every so often in an attempt to stop them from
 * getting to other side
 */
public class Tower {

    // Represents the row and column position of the tower and can only be placed outside the path
    Coordinate towerPosition;

    // determines the orientation of the tower as it has a limited side to side range
    int rotation;


    int[] valid_rotations = new int[]{0, 90, 180, 270};

    public Tower(Coordinate pos, int rot) {
        if (pos == null) {
            throw new NullPointerException("Position to initialize Tower is null");
        }

        this.towerPosition = pos;

        this.rotation = rot;
    }

    // gets the position of the tower
    public Coordinate getTowerPosition() {
        return this.towerPosition;
    }
}
