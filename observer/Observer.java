package observer;
import java.util.ArrayList;
/*
 * methods to update observer with new information and retrives logs of the observers observations
 */
public interface Observer {
    public void update(String location, String description, ArrayList<String>accomplices);
    public String getLog();
}
