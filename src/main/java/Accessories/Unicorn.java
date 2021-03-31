package Accessories;

import Behaviours.IDefend;

public class Unicorn implements IDefend {

    private int defendValue;

    public Unicorn() {
        this.defendValue = 80;
    }

    public int defend() {
        return this.defendValue;
    }
}
