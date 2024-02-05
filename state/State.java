package state;

import java.util.ArrayList;
import java.util.Random;


public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    protected Random rand;

    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.rand = new Random();
    }

    public abstract String getNextWord();

    public abstract void increaseGrade();

    public abstract void decreaseGrade();
}


