package org.jsds.model;

public class Coordinate {

    // row of current position of object
    private int row;

    // column of current position of object
    private int column;

    public Coordinate(int r, int c) {
        this.row = r;
        this.column = c;
    }

    // Gets row of Coordinate
    public int getRow() {
        return this.row;
    }

    // Gets column of coordinate
    public int getColumn() {
        return this.column;
    }
}
