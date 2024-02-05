package state;
public class ThirdGradeState extends State{
    public ThirdGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/third.txt");
    }

    public String getNextWord() {
        // Implement logic for getting the next word in the first grade
        return words.get(rand.nextInt(words.size()));
    }

    public void increaseGrade() {
System.out.println("Cannot go any higher");
}

    public void decreaseGrade() {
        spellingList.setState(spellingList.getSecondGradeState());
    }
}