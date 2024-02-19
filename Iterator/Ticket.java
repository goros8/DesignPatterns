package Iterator;

class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;
//constructs ticket based on parameters
    public Ticket(String name, String teamMember, int difficulty) {
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }
//returns name of ticket
    public String getName() {
        return name;
    }

    public String toString() {
        return "- " + name + "(" + difficulty + ") - " + teamMember;
    }
}
