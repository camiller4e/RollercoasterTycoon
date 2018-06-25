import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() throws Exception {
        park = new Park("Regular Park", 3);
    }

    @Test
    public void canGetName() {
        assertEquals("Regular Park", park.getName());
    }
}
