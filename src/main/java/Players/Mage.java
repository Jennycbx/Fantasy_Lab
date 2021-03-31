package Players;

import Behaviours.IDefend;
import Behaviours.ISpell;
import Enemies.Enemy;

public abstract class Mage extends Player {

    private IDefend creature;
    private ISpell spell;

    public Mage(String name, int bounty, IDefend creature, ISpell spell) {
        super(name, bounty);
        this.creature = creature;
        this.spell = spell;
    }

    public void changeCreature(IDefend newCreature) {
        this.creature = newCreature;
    }

    public void changeSpell(ISpell newSpell) {
        this.spell = newSpell;
    }

    public void castSpell(Enemy enemy) {
        enemy.takeDamage(spell.castSpell());
    }
}
