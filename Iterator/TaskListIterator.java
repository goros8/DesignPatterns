package Iterator;

import java.util.Iterator;

public class TaskListIterator implements Iterator<Ticket> {
    private Ticket[] tickets;
    private int position;
/**
     * Constructs a TaskListIterator with the specified array of tickets
     *  based on the param tickets to iterate over
     */
    public TaskListIterator(Ticket[] tickets) {
        this.tickets = tickets;
        this.position = 0;
    }
    /*
     * Checks if there are more tickets to iterate over
     * returns true or false
     */
    public boolean hasNext() {
        return position < tickets.length;
    }
    /*
     * returns the next ticket in the iteration
     * */
    public Ticket next() {
        if (hasNext()) {
            return tickets[position++];
        }
        return null;
    }
}
