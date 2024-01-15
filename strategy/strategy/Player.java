package strategy;
import java.util.Random;

public abstract class Player {
    private String firstName;
    private String lastName;
    protected OffenseBehavior offenseBehavior;
    protected DefenceBehavior defenceBehavior;
    protected Random rand;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
    }

    public abstract void setOffenseBehavior();

    public abstract void setDefenceBehavior();

    public String play(boolean possession) {
        if (possession) {
            return toString() + "Offense: " + offenseBehavior.play();
        } else {
            return toString() + "Defence: " + defenceBehavior.play();
        }
    }

    
    public String toString() {
        return firstName + " " + lastName + " plays the position: ";
    }
}
