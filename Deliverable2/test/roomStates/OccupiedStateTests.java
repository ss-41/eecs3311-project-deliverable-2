package roomStates;

import java.io.*;
import org.junit.*;
import room.state.*;

public class OccupiedStateTests {
	private OccupiedState state;
	private RoomContext context;
	
	//For checking text/print outputs
	private final ByteArrayOutputStream output = new ByteArrayOutputStream(); //where we store the print msg
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp() {
		state = new OccupiedState();
		context = new RoomContext();
		context.setState(state);
	}
	

	@After // reset the system msg back
	public void reset() {
	    System.setOut(originalOut);
	}
	
	@Test
	public void testHandleRequestOutput() {
	    System.setOut(new PrintStream(output));
	    state.handleRequest();
	    Assert.assertEquals("Available state: this room is occupied"+ System.lineSeparator(),output.toString());
	}

	@Test
	public void testEnableOutput() {
	    System.setOut(new PrintStream(output));
	    state.enable(context);
	    Assert.assertEquals("error: this room is occupied so it cannot be made available for others yet" + System.lineSeparator(),output.toString());
	}

	@Test
	public void testDisableOutput() {
	    System.setOut(new PrintStream(output));
	    state.disable(context);
	    Assert.assertEquals("This room is now disabled"+ System.lineSeparator(),output.toString());
	}

	@Test
	public void testStartMaintenanceOutput() {
	    System.setOut(new PrintStream(output));
	    state.startMaintenance(context);
	    Assert.assertEquals(
	            "error: this room is occupied so it cannot be temporarily closed for repairs or maintenance"
	            + System.lineSeparator(),
	            output.toString());
	}
	
	@Test
	public void testDisableChangesState() {
	    state.disable(context);
	    Assert.assertTrue(context.getState() instanceof DisabledState);
	}

	@Test
	public void testDisableNoLongerOccupied() {
	    state.disable(context);
	    Assert.assertFalse(context.getState() instanceof OccupiedState);
	}

	@Test
	public void testEnableKeepsOccupiedState() {
	    state.enable(context);
	    Assert.assertTrue(context.getState() instanceof OccupiedState);
	}

	@Test
	public void testStartMaintenanceKeepsOccupiedState() {
	    state.startMaintenance(context);
	    Assert.assertTrue(context.getState() instanceof OccupiedState);
	}

	@Test
	public void testEnableThenDisable() {
	    state.enable(context);
	    context.disable();
	    Assert.assertTrue(context.getState() instanceof DisabledState);
	}

	@Test
	public void testMultipleStatesAreDifferentObjects() {
	    OccupiedState anotherState = new OccupiedState();
	    Assert.assertNotSame(state, anotherState);
	}
	
	

}
