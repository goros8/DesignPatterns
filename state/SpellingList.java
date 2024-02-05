package state;

/**
 * represents a spelling list that manages the state of the word grades
 */
public class SpellingList extends State {
    private State currentState;

    /**
     * constructs a SpellingList and initializes it with the default state first grade
     */
    public SpellingList() {
        super(null);
        currentState = new FirstGradeState(this);
    }

    /**
     * Gets the next word based on the current state
     *
     * return The next word.
     */
    public String getNextWord() {
        return currentState.getNextWord();
    }

    /**
     * Increases the grade level and changes the state accordingly
     */
    public void increaseGrade() {
        currentState.increaseGrade();
    }

    /**
     * Decreases the grade level and changes the state accordingly
     */
    public void decreaseGrade() {
        currentState.decreaseGrade();
    }

    /**
     * Returns an instance of the state representing the first grade
     *
     * return First grade state.
     */
    public State getFirstGradeState() {
        return new FirstGradeState(this);
    }

    /**
     * Returns an instance of the state representing the second grade
     *
     * return Second grade state.
     */
    public State getSecondGradeState() {
        return new SecondGradeState(this);
    }

    /**
     * Returns an instance of the state representing the third grade
     *
     * return Third grade state.
     */
    public State getThirdGradeState() {
        return new ThirdGradeState(this);
    }

    /**
     * Sets the current state of the SpellingList
     */
    public void setState(State state) {
        this.currentState = state;
    }
}
