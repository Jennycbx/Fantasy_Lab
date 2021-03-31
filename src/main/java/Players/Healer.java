package Players;

import Behaviours.IHeal;

public abstract class Healer extends Player {

    protected IHeal healingTool;

    public Healer(String name, int bounty, IHeal healingTool) {
        super(name, bounty);
        this.healingTool = healingTool;
    }

    public void changeHealingTool(IHeal newHealingTool) {
        this.healingTool = newHealingTool;
    }

    public void healPlayer(Player player) {
        player.gainHealth(healingTool.heal());
    }

}
