package strategy;

public class Goalie extends Player {
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenseBehavior();
        setDefenceBehavior();
    }

    
    public void setOffenseBehavior() {
        offenseBehavior = new BlockBehavior();
    }

    public void setDefenceBehavior() {
        defenceBehavior = new BlockBehavior();
    }

    public String play(boolean possession) {
        String offenseResult = offenseBehavior.play();
        String defenceResult = defenceBehavior.play();
        if (possession) {
            return   "Goalie: " + offenseResult;
        } else {
            return   "Goalie: " + defenceResult;
        }
    }
}
