import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgems;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Captain Insanity's Death Buggies", 5, 10);
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
}
