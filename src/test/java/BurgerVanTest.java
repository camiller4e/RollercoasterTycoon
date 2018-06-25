import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BurgerVanTest{

    BurgerVan burgerVan;

    @Before
    public void setUp() throws Exception {
        burgerVan = new BurgerVan("The Meat Retreat", "Jenny Burgervan", 101, 3);
    }

    @Test
    public void canGetName() {
        assertEquals("The Meat Retreat", burgerVan.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Jenny Burgervan", burgerVan.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(101, burgerVan.getParkingSpot());
    }

}
