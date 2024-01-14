public class Defenceman extends Player {
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    @Override
    public void setOffenceBehavior() {
        if (rand.nextDouble() < 0.9) {
            offenceBehavior = new PassBehavior();
        } else {
            offenceBehavior = new SlapShotBehavior();
        }
    }

    @Override
    public void setDefenceBehavior() {
        if (rand.nextDouble() < 0.5) {
            defenceBehavior = new ChasePuckBehavior();
        } else {
            defenceBehavior = new BlockBehavior();
        }
    }

    @Override
    public String play(boolean possession) {
        String offenceResult = offenceBehavior.play();
        String defenceResult = defenceBehavior.play();

        return toString() + "\n" + offenceResult + "\n" + defenceResult;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
