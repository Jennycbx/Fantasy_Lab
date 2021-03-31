package Players;

import Behaviours.IWeapon;
import Enemies.Enemy;

public abstract class Fighter extends Player {

    private IWeapon weapon;

    public Fighter(String name, int bounty, IWeapon weapon) {
        super(name, bounty);
        this.weapon = weapon;
    }

    public void changeWeapon(IWeapon newWeapon) {
        this.weapon = newWeapon;
    }

    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(weapon.attack());
    }
}
