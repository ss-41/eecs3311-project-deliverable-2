package roomStates;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;
import org.junit.Assert.*;

import room.state.*;

public class DisabledStateTests {

	private RoomContext context;
	private DisabledState state;
	
	//For checking text/print outputs
	private final ByteArrayOutputStream output = new ByteArrayOutputStream(); //where we store the print msg
	private final PrintStream originalOut = System.out;
		
	@Before
    public void setUp() {
        state = new DisabledState();
        context = new RoomContext();

        context.setState(state);
    }
	
	@After // reset the system msg back
	public void reset() {
	    System.setOut(originalOut);
	}
	
	
	@Test
	public void testHandelRequestOutput() {
		System.setOut(new PrintStream(output));
	    state.handleRequest();
	    Assert.assertEquals("Disabled state: this room is disabled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testEnableOutput() {
		System.setOut(new PrintStream(output));
	    state.enable(context);
	    Assert.assertEquals("this room is now enabled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testDisableOutput() {
		System.setOut(new PrintStream(output));
	    state.disable(context);
	    Assert.assertEquals("error: this room is already disabled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testStartMaintenanceOutput() {
		System.setOut(new PrintStream(output));
	    state.startMaintenance(context);
	    Assert.assertEquals(
	            "error: this room is disabled so it cannot be temporarily closed"
	            + "\n"+ "for maintenance"+ System.lineSeparator(),
	            output.toString());
	}
	
	@Test
	public void testEnableChangesState() {
	    state.enable(context);

	    Assert.assertTrue(context.getState() instanceof AvailableState);
	}

	@Test
	public void testEnableStateNotDisabled() {
	    state.enable(context);

	    Assert.assertFalse(context.getState() instanceof DisabledState);
	}

	@Test
	public void testDisableState() {
	    state.disable(context);

	    Assert.assertTrue(context.getState() instanceof DisabledState);
	}

	@Test
	public void testStartMaintenanceState() {
	    state.startMaintenance(context);

	    Assert.assertTrue(context.getState() instanceof DisabledState);
	}

	@Test
	public void testEnableThenDisable() {
	    state.enable(context);

	    context.disable();

	    Assert.assertTrue(context.getState() instanceof DisabledState);
	}

	@Test
	public void testMultipleStatesAreDifferentObjects() {
	    DisabledState anotherState = new DisabledState();

	    Assert.assertNotSame(state, anotherState);
	}
}
