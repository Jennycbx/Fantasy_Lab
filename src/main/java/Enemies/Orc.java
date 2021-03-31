package Enemies;

public class Orc extends Enemy {

    private int hissFrequency;

    public Orc() {
        super(20, 10);
        this.hissFrequency = 200;
    }

    public int getHissFrequency() {
        return hissFrequency;
    }
}
