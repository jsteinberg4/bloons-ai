package org.jsds.model;

import java.util.ArrayList;

public class Board {

    // Arraylist of coordinates that represent a board
    // For simplicity, will be initilaized to a 9x9
    ArrayList<Coordinate> board = new ArrayList<>();

    // Coordinate showing start of valid_path, randomly chosen
    int colStart;

    // Coordinate showing end of valid_path/ randomly chosen
    int colEnd;

    // Arraylist of Coordinates representing the valid path
    ArrayList<Coordinate> validPath = new ArrayList<>();

   public Board() {

   }

}
