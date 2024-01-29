package Decorator;

// Sword class that gives integrateDecor specific arraylist
public class Sword extends PlayerDecorator {
    public Sword(Player player) {
        super(player, "Decorator/sword.txt");
    }
}
