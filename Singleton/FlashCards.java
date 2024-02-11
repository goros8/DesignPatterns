package Singleton;
import java.util.ArrayList;
import java.util.Random;

public class FlashCards {
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Random rand;
    private Word currentWord;
//constructer of the flashcards instance
    private FlashCards() {
        this.words = FileReader.getWords();
        this.rand = new Random();
    }
/*Public method to get the singleton instance of FlashCards and is static
allows for the singleton instance to happen
 */
    public static FlashCards getInstance() {
        if (flashCards == null) {
            flashCards = new FlashCards();
        }
        return flashCards;
    }
/*
public method to retrieve a random Word flashcard from the collection
returns a word
*/

    public Word getWord() {
        if (!words.isEmpty()) {
            int randomIndex = rand.nextInt(words.size());
            currentWord = words.remove(randomIndex);
            return currentWord;
        } else {
            System.out.println("no more flashcards");
            return null;
        }
    }

    public Word getCurrentWord() {
        return currentWord;
    }
}
