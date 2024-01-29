package Decorator;


// Armor class that gives integrateDecor specific arraylist
public class Armor extends PlayerDecorator {
    public Armor(Player player) {
        super(player, "Decorator/armor.txt");
    }
}

