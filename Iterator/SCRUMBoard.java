package Iterator;

public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;
/**
     * Constructs a SCRUMBoard with the specified project name
     *
     * takes projectName which is just the name of the scrum board project
     */
    public SCRUMBoard(String projectName) {
        this.projectName = projectName;
        this.todo = new TaskList("ToDo");
        this.doing = new TaskList("Doing");
        this.done = new TaskList("Done");
    }

/**
     * Adds a new ticket to the ToDo list
     *
     * Takes the name of the ticket
     * the team member assigned to the ticket
     * and the difficulty level of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty) {
        Ticket ticket = new Ticket(name, teamMember, difficulty);
        todo.addTicket(ticket);
    }
/**
     * Moves a ticket from ToDo to Doing
     *
     * Takes the name of the ticket to be started.
     * returns true if the ticket was successfully started and false otherwiseSSS
     */
    public boolean startTicket(String name) {
        Ticket ticket = todo.getTicket(name);
        if (ticket != null) {
            todo.removeTicket(ticket);
            doing.addTicket(ticket);
            return true;
        }
        return false;
    }
/**
     * Moves a ticket from Doing to DOne
     *
     * Takes the name of the ticket in doing.
     * returns true if the ticket was successfully done and false otherwiseSSS
     */
    public boolean finishTicket(String name) {
        Ticket ticket = doing.getTicket(name);
        if (ticket != null) {
            doing.removeTicket(ticket);
            done.addTicket(ticket);
            return true;
        }
        return false;
    }
/*
 * creates the string representation of the scrum board
 */
    public String toString() {
        String result = "***** " + projectName + " *****\n";
        result += "ToDo:\n" + todo + "\n";
        result += "Doing:\n" + doing + "\n";
        result += "Done:\n" + done;
        return result;
    }
}