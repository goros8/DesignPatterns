package strategy;
public class ShootBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "shoots at the goal";
    }
}