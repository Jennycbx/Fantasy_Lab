package Players;

import Accessories.Axe;
import Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BarbarianTest {

    Barbarian barbarian;
    Axe axe;
    Troll troll;

    @Before
    public void before() {
        axe = new Axe();
        barbarian = new Barbarian("Barry", 11, axe, 8);
        troll = new Troll();
    }

    @Test
    public void canGetFerocity() {
        assertEquals(8, barbarian.getFerocity());
    }

    @Test
    public void canAttackEnemy() {
        barbarian.attackEnemy(troll);
        assertEquals( 80, troll.getHealthPoints());
    }

}
