package state;

public class SpellingList extends State{
    private State currentState;

    public SpellingList() {
                super(null); // Pass an instance of SpellingList as an argument
currentState = new FirstGradeState(this);

    }

    public String getNextWord() {
        return currentState.getNextWord();
    }

    public void increaseGrade() {
        currentState.increaseGrade();
    }

    public void decreaseGrade() {
        currentState.decreaseGrade();
    }

    public State getFirstGradeState() {
        return new FirstGradeState(this);
    }

    public State getSecondGradeState() {
        return new SecondGradeState(this);
    }

    public State getThirdGradeState() {
        return new ThirdGradeState(this);
    }

    public void setState(State state) {
        this.currentState = state;
    }
}