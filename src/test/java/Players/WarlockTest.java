package Players;

import Accessories.Dragon;
import Accessories.Fireball;
import Enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WarlockTest {

    Dragon dragon;
    Fireball fireball;
    Warlock warlock;
    Orc orc;

    @Before
    public void before() {
        dragon = new Dragon();
        fireball = new Fireball();
        warlock = new Warlock("Willy", 22, dragon, fireball, 13);
        orc = new Orc();
    }

    @Test
    public void hasBroomstickLength() {
        assertEquals(13, warlock.getBroomstickLength());
    }

    @Test
    public void canCastSpell() {
        warlock.castSpell(orc);
        assertEquals(-35, orc.getHealthPoints());
    }

    @Test
    public void canDefend() {
        warlock.defend(orc);
        assertEquals(5, orc.getHealthPoints());
    }
}
