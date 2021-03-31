package Quest;

import Enemies.Enemy;

import java.util.ArrayList;

public class Room {

    private ArrayList<Enemy> enemies;
    private int treasureChest;

    public Room(int treasureChest) {
        enemies = new ArrayList<>();
        this.treasureChest = treasureChest;
    }

    public int getTreasureChest() {
        return treasureChest;
    }



}
