package Players;

public abstract class Player {

    private String name;
    private int health;
    private int bounty;

    public Player(String name, int bounty) {
        this.name = name;
        this.health = 100;
        this.bounty = bounty;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getBounty() {
        return bounty;
    }

    public void gainHealth(int hp) {
        this.health += hp;
    }

    public void loseHealth(int hp) {
        this.health -= hp;
    }

    public void addBounty(int coins) {
        this.bounty += coins;
    }

}
