package Accessories;

import Behaviours.IDefend;

public class Dragon implements IDefend {

    private int defendValue;

    public Dragon() {
        this.defendValue = 15;
    }

    public int defend() {
        return this.defendValue;
    }

}
