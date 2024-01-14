package strategy;
import java.util.random;
public class Forward extends Player {
    private OffenceBehavior offenceBehavior;
    private DefenceBehavior defenceBehavior;

    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
        // Half the time set offence behavior to PassBehavior, the other half set it to ShootBehavior
        if (Math.random() < 0.5) {
            this.offenceBehavior = new PassBehavior();
        } else {
            this.offenceBehavior = new ShootBehavior();
        }
        // Half the time set defence behavior to ChasePuckBehavior, the other half set it to BlockBehavior
        if (Math.random() < 0.5) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }
    }

    public String play(boolean possession) {
        return super.toString() + " plays the position: Forward\n" +
                "Offence: " + offenceBehavior.performOffence() + "\n" +
                "Defence: " + defenceBehavior.performDefence();
    }
}
