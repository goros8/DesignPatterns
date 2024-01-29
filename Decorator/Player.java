package Decorator;

import java.util.ArrayList;

// overall player class
public class Player {
    protected String name;
    protected ArrayList<String> lines;

    // Constructor
    public Player(ArrayList<String> lines, String name) {
        this.lines = lines;
        this.name = name;
    }

    // getter for name
    public String getName() {
        return name;
    }

    // getter for lines
    public ArrayList<String> getLines() {
        return lines;
    }

    // toString method to represent the object as a string
    public String toString() {
        // concatenates the lines with newline characters
        return String.join("\n", lines);
    }
}

