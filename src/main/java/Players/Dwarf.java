package Players;

import Behaviours.IWeapon;

public class Dwarf extends Fighter {

    private double height;

    public Dwarf(String name, int bounty, IWeapon weapon, double height) {
        super(name, bounty, weapon);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
