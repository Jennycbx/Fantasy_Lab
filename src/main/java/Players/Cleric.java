package Players;

import Behaviours.IHeal;

public class Cleric extends Healer{

    private int cauldronWeight;

    public Cleric(String name, int bounty, IHeal healingTool, int cauldronWeight) {
        super(name, bounty, healingTool);
        this.cauldronWeight = cauldronWeight;
    }

    public int getCauldronWeight() {
        return cauldronWeight;
    }

}
