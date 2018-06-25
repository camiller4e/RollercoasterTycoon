import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp() throws Exception {
        iceCreamStall = new IceCreamStall("The Iceman Cometh", "Jack Slushpants", 102, 3);
    }

    @Test
    public void canGetName() {
        assertEquals("The Iceman Cometh", iceCreamStall.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Jack Slushpants", iceCreamStall.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(102, iceCreamStall.getParkingSpot());
    }
}
