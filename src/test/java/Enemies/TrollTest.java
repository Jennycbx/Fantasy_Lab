package Enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrollTest {

    Troll troll;

    @Before
    public void before() {
        troll = new Troll();
    }

    @Test
    public void canGetEarDiameter() {
        assertEquals(120, troll.getEarDiameter());
    }
}