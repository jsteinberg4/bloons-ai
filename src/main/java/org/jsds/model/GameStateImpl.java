package org.jsds.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameStateImpl {

    // Board of the game, CURRENTLY STAYS AS 9x9 WITH A VALID PATH IN THE MIDDLE FROM TOP TO BOTTOM
    Board board = new Board();

    // List of active towers on the board
    ArrayList<Tower> activeTowers = new ArrayList<>();

    // List of active projectiles on the board
    Map activeProjectiles = new HashMap<>();

    // List of active balloons on the board
    ArrayList<Balloon> activeBalloons = new ArrayList<>();

    // integer showing our current score
    int score = 0;

    public GameStateImpl() {

    }

    // Function that adds tower to the state
    public void addActiveTower(int r, int c, int rot) {
        Tower newTower = new Tower(new Coordinate(r,c), rot);
        this.activeTowers.add(newTower);
    }

    // Function that adds a balloon to the state
    public void addActiveBalloon() {

    }

    // Function that adds a projectile to state
    public void addActiveProjectile(Tower t) {

    }

    // Function that checks if any projectile or balloon are on the same Coordinate
    public void checkIfProjectileHitBalloon() {

    }

    // Function that checks if the next movement any balloon will move it OFF the board, meaning it has gotten
    // across the valid path

    public void checkIfBalloonPassed() {

    }

    // Function to reset active projectiles ar end of a round
    public void resetProjectiles() {

    }

}
