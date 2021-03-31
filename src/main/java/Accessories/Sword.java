package Accessories;

import Behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword() {
        this.damageValue = 65;
    }

    public int attack() {
        return this.damageValue;
    }
}
