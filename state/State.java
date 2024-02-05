package state;

import java.util.ArrayList;
import java.util.Random;

//represents abstract class of spelling list
public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    protected Random rand;
/**
     * Constructs a state with a reference to the pelling list and initializes other parameters
     *
     * the parameter spelling list is the spelling list associated with this state
     */
    public State(SpellingList spellingList) {
        this.spellingList = spellingList;
        this.rand = new Random();
    }
/**
     * Abstract method to get the next word based on the current state
     *
     * returns the next word
     */
    public abstract String getNextWord();
/**
     * Abstract method to increase the grade level and change the state
     */
    public abstract void increaseGrade();
/**
     * Abstract method to decrease the grade level and change the state
     */
    public abstract void decreaseGrade();
}


