package Players;

import Behaviours.IWeapon;

public class Knight extends Fighter {

    private int joustingSkill;

    public Knight(String name, int bounty, IWeapon weapon, int joustingSkill) {
        super(name, bounty, weapon);
        this.joustingSkill = joustingSkill;
    }

    public int getJoustingSkill() {
        return joustingSkill;
    }

}
