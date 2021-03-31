package Players;

import Behaviours.IDefend;
import Behaviours.ISpell;

public class Warlock extends Mage {

    private int broomstickLength;

    public Warlock(String name, int bounty, IDefend creature, ISpell spell, int broomstickLength) {
        super(name, bounty, creature, spell);
        this.broomstickLength = broomstickLength;
    }

    public int getBroomstickLength() {
        return this.broomstickLength;
    }

}
