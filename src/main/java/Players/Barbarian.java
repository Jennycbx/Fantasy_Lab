package Players;

import Behaviours.IWeapon;

public class Barbarian extends Fighter {

    private int ferocity;

    public Barbarian(String name, int bounty, IWeapon weapon, int ferocity) {
        super(name, bounty, weapon);
        this.ferocity = ferocity;
    }

    public int getFerocity() {
        return ferocity;
    }

}
