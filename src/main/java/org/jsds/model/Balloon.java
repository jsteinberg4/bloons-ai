package org.jsds.model;

public class Balloon {

    // A balloons health when it first enters the game, it takes 2 hits to end a balloons path
    // Currently concrete at 2 for simplicity
    int health = 2;

    // A balloons ID which will allow the state to keep track of the health and position of specific balloons
    int id; // random number generator

    // A balloons current position on a 2D Board, ALWAYS initially the start point
    Coordinate balloonPosition;

    public Balloon(Coordinate pos) {
        if (pos == null) {
            throw new NullPointerException("Coordinate to Initialize Balloon is Null");
        }
        this.balloonPosition = pos;
    }

    // updates health of a balloon
    public void updateHealth() {
        int currentHealth = this.health;
        currentHealth--;
        this.health = currentHealth;
    }

    // Updates balloon position
    public void updateBalloonPosition(Coordinate pos) {
        this.balloonPosition = pos;
    }

    // checks if balloon has lost all of its health
    public Boolean checkIfDead() {
        return this.health == 0;
    }

    // Gets current position of balloon
    public Coordinate getCoordinate() {
        return this.balloonPosition;
    }

    // Gets health of balloon
    public int getHealth() {
        return this.health;
    }
}
