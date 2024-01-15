package strategy;
public class SlapShotBehavior implements OffenseBehavior {
    @Override
    public String play() {
        return "shoots the puck from the blue line";
    }
}