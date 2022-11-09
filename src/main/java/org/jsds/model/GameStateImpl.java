package org.jsds.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GameStateImpl {

    // Board of the game, CURRENTLY STAYS AS 9x9 WITH A VALID PATH FROM TOP TO BOTTOM
    Board board = new Board();

    // List of active towers on the board
    ArrayList<Tower> activeTowers = new ArrayList<>();

    // List of active projectiles on the board
    Map<Tower, ArrayList<Projectile>> activeProjectiles = new HashMap<>();

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
        updateProjectileMap();
    }

    // Function that adds a balloon to the state
    public void addActiveBalloon(int r, int c) {
        Balloon newBalloon = new Balloon(new Coordinate (r, c));
        this.activeBalloons.add(newBalloon);
    }

    // Function that adds a projectile to state
    public void addActiveProjectiles() {

        for(Map.Entry<Tower, ArrayList<Projectile>> set : activeProjectiles.entrySet()) {
            set.getValue().add(new Projectile(new Coordinate(set.getKey().getTowerPosition().getRow(),
                    set.getKey().getTowerPosition().getColumn())));
        }
    }

    // Function that checks if any projectile or balloon are on the same Coordinate
    public void checkIfProjectileHitBalloon() {
        for (Balloon b : activeBalloons) {
            for(Map.Entry<Tower, ArrayList<Projectile>> set : activeProjectiles.entrySet()) {
                for (Projectile p : set.getValue()) { // update as a for loop for a map
                    if (p.getProjectilePosition() == b.getCoordinate()) {
                        executeHit(b, p);
                    }
                }
            }
        }
    }

    // Function that executes what happens when  a projectile hits a balloon, update score positively
    public void executeHit(Balloon b, Projectile p) {
        b.updateHealth();
        if (b.getHealth() == 0) {
            this.activeBalloons.remove(b);
        }

        // remove projectile

        this.score += 5;
    }


    // Function that checks if the next movement any balloon will make will move it OFF the board, meaning it has gotten
    // across the valid path, update score negatively
    public void checkIfBalloonWillPass() {
        for (Balloon b : activeBalloons) {
            if (b.getCoordinate().getRow() - 1 < 0) {
                this.score -= 10;
            }
        }
    }

    // Updates the map of projectiles after adding a new tower, also resets the projectiles
    public void updateProjectileMap() {
        for(Tower t : this.activeTowers) {
            this.activeProjectiles.put(t, new ArrayList<Projectile>());
        }
    }

    //
}
