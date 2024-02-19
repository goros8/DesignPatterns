package Iterator;
import java.util.ArrayList;
class TaskList {
    private ArrayList<Ticket> tickets;
    private String name;

    public TaskList(String name) {
        this.name = name;
        this.tickets = new ArrayList<>();
    }
//adds a  ticket with the given parameters name, teamMember, and difficulty
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        addTicket(ticket);
    }
//Adds the Ticket ticket to the array list tickets
    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }
/**
     * gets a ticket from the task list based on its name
     *
     * takes the name of the ticket to be retrieved
     * returns the Ticket object if found or null otherwise
     */
    public Ticket getTicket(String name) {
        for (Ticket ticket : tickets) {
            if (ticket.getName().equals(name)) {
                return ticket;
            }
        }
        return null;
    }
/*
 * removes the given ticket from the task list
 */
    public void removeTicket(Ticket ticket) {
        tickets.remove(ticket);
    }
/**
     * Creates an iterator for iterating over the tickets in the task list
     *
     * returns a TaskListIterator for iterating over the tickets
     */
    public TaskListIterator createIterator() {
        return new TaskListIterator(tickets.toArray(new Ticket[0]));
    }

    public String toString() {
        String result = "";
        for (Ticket ticket : tickets) {
            result += "  - " + ticket + "\n";
        }
        return result;
    }
}
