package state;

public class FirstGradeState extends State {

    public FirstGradeState(SpellingList spellingList) {
        super(spellingList);
        this.words = FileReader.getWords("state/first.txt");
    }

    @Override
    public String getNextWord() {
        // Implement logic for getting the next word in the first grade
        return words.get(rand.nextInt(words.size()));
    }

    @Override
    public void increaseGrade() {
        // Implement logic for increasing grade if needed
        spellingList.setState(spellingList.getSecondGradeState());
    }

    @Override
    public void decreaseGrade() {
        System.out.println("Cannot go any lower");
    }
}

// Similarly, update other grade states...

