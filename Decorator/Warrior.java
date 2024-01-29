package Decorator;
import java.util.ArrayList;
// warrior class that extends Player
public class Warrior extends Player {
    // Constructor
    public Warrior(String name) {
        super(new ArrayList<>(), name);
        integrateOriginalLines();
    }

    // method to integrate the original warrior text
    private void integrateOriginalLines() {
        // add the ASCII art from "warrior.txt"
        ArrayList<String> warriorLines = FileReader.getLines("Decorator/warrior.txt");
        getLines().addAll(warriorLines);
    }
    
}
