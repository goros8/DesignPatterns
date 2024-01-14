
public abstract class Player {
    private String firstName;
    private String lastName;
    protected OffenceBehavior offenceBehavior;
    protected DefenceBehavior defenceBehavior;
    protected Random rand;

    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        rand = new Random();
    }

    public abstract void setOffenceBehavior();

    public abstract void setDefenceBehavior();

    public abstract String play(boolean possession);

    @Override
    public String toString() {
        return firstName + " " + lastName + " plays the position: ";
    }

  
}