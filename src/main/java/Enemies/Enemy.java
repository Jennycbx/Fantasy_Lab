package Enemies;

public abstract class Enemy {

    private int healthPoints;
    private int attackStrength;

    public Enemy(int healthPoints, int attackStrength) {
        this.healthPoints = healthPoints;
        this.attackStrength = attackStrength;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int attackPlayer() {
        return this.attackStrength;
    }

    public void takeDamage(int hp) {
        this.healthPoints -= hp;
    }

}
