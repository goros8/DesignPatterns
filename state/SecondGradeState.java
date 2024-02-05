package state;

public class SecondGradeState extends State{
    public SecondGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/second.txt");
    }

    @Override
    public String getNextWord() {
        // Implement logic for getting the next word in the first grade
        return words.get(rand.nextInt(words.size()));
    }

    @Override
    public void increaseGrade() {
        // Implement logic for increasing grade if needed
        spellingList.setState(spellingList.getThirdGradeState());
    }

    @Override
    public void decreaseGrade() {
        spellingList.setState(spellingList.getFirstGradeState());
    }
}
