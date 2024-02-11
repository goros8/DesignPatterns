package Singleton;

public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    // Constructor to initialize a Word object with given parameters
    public Word(String word, String type, String definition, String sentence) {
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }
    // Getter method to retrieve the word
    public String getWord() {
        return word;
    }
//Getter method to format the string for the word and its definition
    public String getDescription() {
        return "Type: " + type + "\nDefinition: " + definition + "\nSentence: " + sentence;
    }
}
