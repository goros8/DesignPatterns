public class Goalie extends Player {
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    @Override
    public void setOffenceBehavior() {
        offenceBehavior = new BlockGoalBehavior();
    }

    @Override
    public void setDefenceBehavior() {
        defenceBehavior = new BlockGoalBehavior();
    }

    @Override
    public String play(boolean possession) {
        String offenceResult = offenceBehavior.play();
        String defenceResult = defenceBehavior.play();
        if(possession){
            return toString() "Goalie: " + offenceResult;
        }else{
            return toString() "Goalie: " + defenceResult;
        }
    }


}