package strategy;

public class Defenceman extends Player {
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenceBehavior();
    }

    @Override
    public void setOffenseBehavior() {
        // 90% of the time set offence behavior to PassBehavior, the other 10% set it to SlapShotBehavior
        if (Math.random() < 0.9) {
            offenseBehavior = new PassBehavior();
        } else {
            offenseBehavior = new SlapShotBehavior();
        }
    }

    @Override
    public void setDefenceBehavior() {
        // 90% of the time set defence behavior to BlockBehavior, the other 10% set it to ChasePuckBehavior
        if (Math.random() < 0.9) {
            defenceBehavior = new BlockBehavior();
        } else {
            defenceBehavior = new ChasePuckBehavior();
        }
    }

    @Override
    public String play(boolean possession) {
        String offenseResult = offenseBehavior.play();
        String defenceResult = defenceBehavior.play();
        if (possession) {
            return toString() + "Defenceman: " + offenseResult;
        } else {
            return toString() + "Defenceman: " + defenceResult;
        }
    }
}
