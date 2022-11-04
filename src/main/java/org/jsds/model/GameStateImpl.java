package org.jsds.model;

import java.util.ArrayList;

public class GameStateImpl {

    // Board of the game, CURRENTLY STAYS AS 9x9 WITH A VALID PATH IN THE MIDDLE FROM TOP TO BOTTOM
    Board board;

    // List of active towers on the board
    ArrayList<Tower> activeTowers;

    // List of active projectiles on the board
    ArrayList<Projectile> activeProjectiles;

    // List of active balloons on the board
    ArrayList<Balloon> activeBalloons;
}
