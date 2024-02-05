package state;
/**
 * Represents the state for the first grade in the SpellingList application (same as others)
 */
public class FirstGradeState extends State {
/**(same for the others)
     * Constructs a FirstGradeState with a reference to the spelling list and initializes the list of words
     *
     * takes the spelling list associated with this state
     */
    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/first.txt");
    }

    public String getNextWord() {
        return words.get(rand.nextInt(words.size()));
    }

    public void increaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }

    
    public void decreaseGrade() {
        System.out.println("Cannot go any lower");
    }
}


