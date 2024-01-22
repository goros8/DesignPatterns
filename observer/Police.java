package observer;

import java.util.ArrayList;

public class Police implements Observer {

    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;
/*
 * ititializes police object with cook subject creates the array lists
 */
    public Police(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.locations = new ArrayList<>();
        this.notes = "";
        this.people = new ArrayList<>();
    }

/*
 * updates the dea list with location description and the accomplices list
 * checks to see if there are any dupes in the accomplices list
 */
    public void update(String location, String description, ArrayList<String> accomplices) {
        locations.add(location);
        notes+="- " + description+ "\n";
        for (String accomplice : accomplices) {
            if (!people.contains(accomplice)) {
                people.add(accomplice);
            }
        }
    }
/*
 * formulates the expected format for presenting the information
 */
    public String getLog() {
            String log = "Locations:\n";
            for (String location : locations) {
                log += "- " + location + "\n";
            }
        
            log += "Notes:\n" + notes + "\n";
        
            log += "Accomplices:\n";
            for (String person : people) {
                log += "- " + person + "\n";
            }
        
            return log;
        }
        
}


