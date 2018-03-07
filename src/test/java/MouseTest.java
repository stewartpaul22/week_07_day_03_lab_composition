import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    private Mouse mouse;

    @Before
    public void setUp() throws Exception {
        mouse = new Mouse("Microsoft", "Ergomouse", "cordless");
    }

    @Test
    public void hasMake() {
        assertEquals("Microsoft", mouse.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("Ergomouse", mouse.getModel());
    }

    @Test
    public void hasConnectionType() {
        assertEquals("cordless", mouse.getConnectionType());
    }

    @Test
    public void canMove() {
        assertEquals("moving", mouse.move());
    }

    @Test
    public void canSendData() {
        assertEquals("button being clicked: right", mouse.sendData("right"));
    }
}
