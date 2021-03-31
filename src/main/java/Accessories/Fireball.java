package Accessories;

import Behaviours.ISpell;

public class Fireball implements ISpell {

    private int damageValue;

    public Fireball() {
        this.damageValue = 55;
    }

    public int castSpell() {
        return this.damageValue;
    }

}
