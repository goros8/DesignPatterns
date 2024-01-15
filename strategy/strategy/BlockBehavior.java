package strategy;

import java.util.Random;

public class BlockBehavior implements DefenceBehavior, OffenseBehavior {

    public String play() {
        Random random = new Random();
        int choice = random.nextInt(4); 
        if (choice == 0) {
            return "hand blocks the puck";
        } else if (choice == 1) {
            return "catches the puck";
        } else if (choice == 2) {
            return "blocks puck with knee pads";
        } else {
            return "blocks puck with stick";
        }
    }
}
