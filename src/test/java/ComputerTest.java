import behaviours.IInput;
import behaviours.IOutput;
import device_management.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ComputerTest {
    Computer computer;
    Monitor monitor;
    Mouse mouse;

    @Before
    public void before() {
        monitor = new Monitor(22, 786432);
        mouse = new Mouse("Microsoft", "Ergomouse", "wired");
        computer = new Computer(8, 512, monitor, mouse, null);
    }

    @Test
    public void hasRam() {
        assertEquals(8, computer.getRam());
    }

    @Test
    public void hasHddSize() {
        assertEquals(512, computer.getHddSize());
    }

    @Test
    public void hasOutputDevice() {
        IOutput outputDevice = computer.getOutputDevice();
        assertNotNull(outputDevice);
    }

    @Test
    public void canOutputData() {
        assertEquals("space invaders is now on screen", computer.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaPrinter() {
        Printer printer = new Printer("Epsom", "Sylus", 120, 4);
        Computer computer2 = new Computer(8, 512, printer, mouse, null);
        assertEquals("printing: space invaders", computer2.outputData("space invaders"));
    }

    @Test
    public void canOutputDataViaSpeaker() {
        Speaker speaker = new Speaker(11);
        Computer computer2 = new Computer(8, 512, speaker, mouse, null);
        assertEquals("playing: Beep!", computer2.outputData("Beep!"));

    }

    @Test
    public void canSetOutputDevice() {
        Printer printer = new Printer("Epsom", "Sylus", 120, 4);
        computer.setOutputDevice(printer);
        assertEquals("printing: space invaders", computer.outputData("space invaders"));
    }

    @Test
    public void hasInputDevice() {
        IInput inputDevice = computer.getInputDevice();
        assertNotNull(inputDevice);
    }

    @Test
    public void canReceiveData() {
        Computer computer2 = new Computer(8, 512, monitor, mouse, null);
        assertEquals("button being clicked: right", computer2.receiveData("right"));
    }

    @Test
    public void canSetInputDevice() {
        computer.setInputDevice(mouse);
        assertEquals("button being clicked: right", computer.receiveData("right"));
    }

    @Test
    public void hasDataStream() {
        assertEquals(null, computer.getDataStream());
    }
}
