package observer;

import java.util.ArrayList;
/*
 * Allows for the observers to register remove and notify the other observers about a change
 */
public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(String location, String description,
    ArrayList<String> accomplices);

}
