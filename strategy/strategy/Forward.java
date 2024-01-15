package strategy;

public class Forward extends Player {
    private OffenseBehavior offenseBehavior;
    private DefenceBehavior defenceBehavior;

    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenceBehavior();
    }

    @Override
    public void setOffenseBehavior() {
        if (Math.random() < 0.5) {
            this.offenseBehavior = new PassBehavior();
        } else {
            this.offenseBehavior = new ShootBehavior();
        }    }

    @Override
    public void setDefenceBehavior() {
        if (Math.random() < 0.5) {
            this.defenceBehavior = new ChasePuckBehavior();
        } else {
            this.defenceBehavior = new BlockBehavior();
        }    }

    @Override
    public String play(boolean possession) {
        return super.toString() + " plays the position: Forward\n" +
                "Offense: " + offenseBehavior.play() + "\n" +
                "Defence: " + defenceBehavior.play();
    }
}
