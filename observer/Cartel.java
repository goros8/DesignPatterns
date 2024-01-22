package observer;
import java.util.ArrayList;

public class Cartel implements Observer {

    private Subject cook;
    private ArrayList<Sighting> sightings;
/*
 * ititializes cartel object with cook subject creates the array lists
 */
    public Cartel(Subject cook) {
        this.cook = cook;
        this.cook.registerObserver(this);
        this.sightings = new ArrayList<>();
    }

    
    public void update(String location, String description, ArrayList<String> accomplices) {
        Sighting newSighting = new Sighting(location, description, accomplices);
        sightings.add(newSighting);
        
    }

    public String getLog() {
        
        if (sightings.isEmpty()) {
        return "No sightings logged.";
    }
    
    String log = "";
        for (Sighting sighting : sightings) {
            log +=sighting.getLocation()
                + " (" + sighting.getDetails()+")"
                + ", with " + sighting.getAccomplices() + "\n";
            }
    
            return log;
        }
    }

