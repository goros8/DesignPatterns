package strategy;

public class Defenceman extends Player {
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenceBehavior();
    }

    public void setOffenseBehavior() {
        // 90% of the time set offence behavior to pass b the other 10% set it to SlapShotBehavior
        if (Math.random() < 0.9) {
            offenseBehavior = new PassBehavior();
        } else {
            offenseBehavior = new SlapShotBehavior();
        }
    }

    public void setDefenceBehavior() {
        // 90% of the time set defence behavior to block b the other 10% set it to chase
        if (Math.random() < 0.9) {
            defenceBehavior = new BlockBehavior();
        } else {
            defenceBehavior = new ChasePuckBehavior();
        }
    }

    public String play(boolean possession) {
        String offenseResult = offenseBehavior.play();
        String defenceResult = defenceBehavior.play();
        if (possession) {
            return  "Defenceman: " + offenseResult;
        } else {
            return  "Defenceman: " + defenceResult;
        }
    }
}
