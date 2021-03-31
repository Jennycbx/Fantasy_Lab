package Players;

import Accessories.Dragon;
import Accessories.Fireball;
import Accessories.Potion;
import Accessories.Unicorn;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClericTest {

    Cleric cleric;
    Potion potion;
    Wizard player1;
    Dragon dragon;
    Fireball fireball;

    @Before
    public void before() {
        potion = new Potion();
        cleric = new Cleric("Casper", 6, potion, 20);
        dragon = new Dragon();
        fireball = new Fireball();
        player1 = new Wizard("Willy", 22, dragon, fireball, 13);
    }

    @Test
    public void canGetCauldronWeight() {
        assertEquals(20, cleric.getCauldronWeight());
    }

    @Test
    public void canHealPlayer() {
        cleric.healPlayer(player1);
        assertEquals(169, player1.getHealth());
    }

}