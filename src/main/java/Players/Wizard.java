package Players;

import Behaviours.IDefend;
import Behaviours.IHeal;
import Behaviours.ISpell;

public class Wizard extends Mage {

    private int beardLength;


    public Wizard(String name, int bounty, IDefend defend, ISpell spell, int beardLength) {
        super(name, bounty, defend, spell);
        this.beardLength = beardLength;
    }

    public int getBeardLength() {
        return beardLength;
    }
}
