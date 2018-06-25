import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Captain Insanity's Death Buggies", 5, 10, 1);
        visitor1 = new Visitor("Jorp", 10, 90, 10);
        visitor2 = new Visitor("Clarn", 36, 190, 50);
    }

    @Test
    public void canGetName() {
        assertEquals("Captain Insanity's Death Buggies", dodgems.getName());
    }

    @Test
    public void canGetKidsPrice() {
        assertEquals(5, dodgems.getKidsPrice());
    }

    @Test
    public void canGetAdultPrice() {
        assertEquals(10, dodgems.getAdultPrice());
    }

    @Test
    public void canChargeKidsPrice() {
        dodgems.charge(visitor1, dodgems);
        assertEquals(5, visitor1.scrilla);
    }

    @Test
    public void canChargeAdultPrice() {
        dodgems.charge(visitor2, dodgems);
        assertEquals(40, visitor2.scrilla);
    }
}
