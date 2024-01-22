package observer;
import java.util.ArrayList;
public class Sighting {

    private String location;
    private String details;
    private ArrayList<String> accomplices;
/*Initializes and creates a sighting object that takes in the location details 
and accomplices information andalso creates a arraylist to store the accomplices
*/
public Sighting(String location, String details, ArrayList<String> accomplices) {
        this.location = location;
        this.details = details;
        this.accomplices = new ArrayList<>(accomplices);
    }
//gets location of sighting
    public String getLocation() {
        return location;
    }
// gets details of sighting
    public String getDetails() {
        return details;
    }
//gets list of accomplices
    public ArrayList<String> getAccomplices() {
        return new ArrayList<>(accomplices);
    }
}
