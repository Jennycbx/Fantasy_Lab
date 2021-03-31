package Accessories;

import Behaviours.IHeal;

public class Potion implements IHeal {

    private int healValue;

    public Potion() {
        this.healValue = 69;
    }

    public int heal() {
        return this.healValue;
    }
}
