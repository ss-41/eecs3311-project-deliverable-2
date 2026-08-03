package roomStates;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;
import org.junit.Assert.*;

import room.state.*;

public class AvailableStateTests {

    private AvailableState state;
    private RoomContext context;

    @Before
    public void setUp() {
        state = new AvailableState();
        context = new RoomContext();

        context.setState(state);
    }

    @Test
    public void testHandleRequest() {
        state.handleRequest();
        Assert.assertTrue(true);
    }

    @Test
    public void testHandleRequestOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        state.handleRequest();
        Assert.assertEquals("Available state: this room is available" + System.lineSeparator(),output.toString());
    }

    @Test
    public void testEnableKeepsAvailableState() {
        state.enable(context);

        Assert.assertTrue(context.getState() instanceof AvailableState);
    }

    @Test
    public void testEnableOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        state.enable(context);
        Assert.assertEquals("error: this room is already available so it cannot be enabled" + System.lineSeparator(), output.toString());
    }

    @Test
    public void testDisableChangesState() {
        state.disable(context);
        Assert.assertTrue(context.getState() instanceof DisabledState);
    }

    @Test
    public void testDisableState() {
        state.disable(context);
        Assert.assertFalse(context.getState() instanceof AvailableState);
    }

    @Test
    public void testStartMaintenanceChangesState() {
        state.startMaintenance(context);
        Assert.assertTrue(context.getState() instanceof MaintenanceState);
    }

    @Test
    public void testStartMaintenanceState() {
        state.startMaintenance(context);
        Assert.assertFalse(context.getState() instanceof AvailableState);
    }

    @Test
    public void testDisableOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        state.disable(context);
        Assert.assertEquals("This room is now disabled" + System.lineSeparator(),output.toString());
    }

    @Test
    public void testStartMaintenanceOutput() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        state.startMaintenance(context);
        Assert.assertEquals("This room is now closed temporarily for repairs or maintenance"+ System.lineSeparator(),output.toString());
    }
}