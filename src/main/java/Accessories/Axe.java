package Accessories;

import Behaviours.IWeapon;

public class Axe implements IWeapon {

    private int damageValue;

    public Axe() {
        this.damageValue = 50;
    }

    public int attack() {
        return this.damageValue;
    }

}
