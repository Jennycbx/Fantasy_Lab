package Enemies;

public class Troll extends Enemy {

    private int earDiameter;

    public Troll() {
        super(130, 22);
        this.earDiameter = 120;
    }

    public int getEarDiameter() {
        return earDiameter;
    }
}
