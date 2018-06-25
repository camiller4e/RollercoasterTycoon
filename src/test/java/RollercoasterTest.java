import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        rollercoaster = new Rollercoaster("Chunder Mountain", 150, 5);
        visitor = new Visitor("Clunt", 36, 120, 50);
    }

    @Test
    public void canGetName(){
        assertEquals("Chunder Mountain", rollercoaster.getName());
    }

    @Test
    public void canGetMinHeight() {
        assertEquals(150, rollercoaster.getMinHeight());
    }

    @Test
    public void canGetPrice() {
        assertEquals(5, rollercoaster.getPrice());
    }

    @Test
    public void canCheckHeight() {
        assertEquals(false, rollercoaster.checkHeight(visitor));
    }
}
