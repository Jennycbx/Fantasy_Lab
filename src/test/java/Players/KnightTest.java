package Players;

import Accessories.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KnightTest {

    Knight knight;
    Sword sword;

    @Before
    public void before() {
        sword = new Sword();
        knight = new Knight("Sir Lancelot", 20, sword, 7);
    }

    @Test
    public void canGetJoustingSkill() {
        assertEquals(7, knight.getJoustingSkill());
    }

}