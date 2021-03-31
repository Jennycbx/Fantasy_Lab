package Accessories;

import Behaviours.IHeal;

public class Herbs implements IHeal {

    private int healValue;

    public Herbs() {
        this.healValue = 42;
    }

    public int heal() {
        return this.healValue;
    }

}
