package Decorator;
// Shield class that gives integrateDecor specific arraylist

public class Shield extends PlayerDecorator {
    public Shield(Player player) {
        super(player, "Decorator/shield.txt");
    }
}
