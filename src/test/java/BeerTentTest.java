import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerTentTest {

    BeerTent beerTent;

    @Before
    public void setUp() throws Exception {
        beerTent = new BeerTent("BEER", "Jim Drinkbutt", 100);
    }

    @Test
    public void canGetName() {
        assertEquals("BEER", beerTent.getName());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Jim Drinkbutt", beerTent.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals(100, beerTent.getParkingSpot());
    }
}
