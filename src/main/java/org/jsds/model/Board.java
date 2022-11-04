package org.jsds.model;

import java.util.ArrayList;

public class Board {

    // Arraylist of coordinates that represent a board
    // For simplicity, will be initilaized to a 9x9
    ArrayList<Coordinate> board = new ArrayList<>();

    // Coordinate showing start of valid_path, will eventually be randomly chosen
    // For simplicity will be chosen by us for testing
    int colStart = 4;

    // Coordinate showing end of valid_path, will eventually be randomly chosen
    // For simplicity will be chosen by us for testing
    int colEnd = 4;

    // Arraylist of Coordinates representing the valid path
    // Balloon travels from bottom to top
    // (0,4), (1,4), (2,4), (3,4), (4,4), (5,4), (6,4), (7,4), (8,4)
    ArrayList<Coordinate> validPath = new ArrayList<Coordinate>(5);




   public Board() {

       // initialize whole board
       for (int r = 0; r < 9; r++) {
           for (int c = 0; c < 9; c++) {
               this.board.add(new Coordinate(r, c));
           }
       }

       // initialize valid path
       this.validPath.add(new Coordinate(0, 4));
       this.validPath.add(new Coordinate(1, 4));
       this.validPath.add(new Coordinate(2, 4));
       this.validPath.add(new Coordinate(3, 4));
       this.validPath.add(new Coordinate(4, 4));
       this.validPath.add(new Coordinate(5, 4));
       this.validPath.add(new Coordinate(6, 4));
       this.validPath.add(new Coordinate(7, 4));
       this.validPath.add(new Coordinate(8, 4));

   }

   // Gets the game board itself
   public ArrayList<Coordinate> getBoard() {
       return this.board;
   }

   // gets the valid path
    public ArrayList<Coordinate> getValidPath() {
       return this.validPath;
    }

   // gets the start position
    public Coordinate getStartCoordinate() {
       return new Coordinate(8,4);
    }

    // gets the end position
    public Coordinate getEndCoordinate() {
       return new Coordinate(0, 4);
    }


}
