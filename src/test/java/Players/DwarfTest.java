package Players;

import Accessories.Axe;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;

    @Before
    public void before() {
        axe = new Axe();
        dwarf = new Dwarf("Danny", 2, axe, 0.8);
    }

    @Test
    public void canGetHeight() {
        assertEquals(0.8, dwarf.getHeight(), 0.0);
    }

}
