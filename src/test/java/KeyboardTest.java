import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyboardTest {

    private Keyboard keyboard;

    @Before
    public void setUp() throws Exception {
        keyboard = new Keyboard("Logitec", "ST101", "ergonomic");
    }

    @Test
    public void hasMake() {
        assertEquals("Logitec", keyboard.getMake());
    }
}
