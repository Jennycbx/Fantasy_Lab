package Accessories;

import Behaviours.ISpell;

public class LightningStrike implements ISpell {

    private int damageValue;

    public LightningStrike() {
        this.damageValue = 40;
    }

    public int castSpell() {
        return this.damageValue;
    }

}
