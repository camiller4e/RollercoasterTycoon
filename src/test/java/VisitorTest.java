import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        visitor = new Visitor("Goji", 24, 170, 50);
    }

    @Test
    public void canGetName() {
        assertEquals("Goji", visitor.getName());
    }

    @Test
    public void canGetAge() {
        assertEquals(24, visitor.getAge());
    }

    @Test
    public void canGetHeight() {
        assertEquals(170, visitor.getHeight());
    }

    @Test
    public void canGetScrillaAmount() {
        assertEquals(50, visitor.getScrilla());
    }
}
