package roomStates;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;
import org.junit.Assert.*;

import room.state.*;

public class MaintenanceStateTests {

	private MaintenanceState state;
	private RoomContext context;
	
	//For checking text/print outputs
	private final ByteArrayOutputStream output = new ByteArrayOutputStream(); //where we store the print msg
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp() {
		state = new MaintenanceState();
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
	    Assert.assertEquals(
	    		"Maintenance state: this room is closed temporarily"+ "\n"+ "for repairs or maintenance."
	            + System.lineSeparator(),
	            output.toString());
	}

	@Test
	public void testEnableOutput() {
	    System.setOut(new PrintStream(output));
	    state.enable(context);
	    Assert.assertEquals("This room is now enabled again and is no longer temporarily closed"+ System.lineSeparator(),output.toString());
	}

	@Test
	public void testDisableOutput() {
	    System.setOut(new PrintStream(output));
	    state.disable(context);
	    Assert.assertEquals("This room is now disabled" + System.lineSeparator(),output.toString());
	}

	@Test
	public void testStartMaintenanceOutput() {
	    System.setOut(new PrintStream(output));
	    state.startMaintenance(context);
	    Assert.assertEquals("error: this room already closed for maintenance"+ System.lineSeparator(),output.toString());
	}
	
	@Test
	public void testEnableChangesState() {
	    state.enable(context);
	    Assert.assertTrue(context.getState() instanceof AvailableState);
	}

	@Test
	public void testDisableChangesState() {
	    state.disable(context);
	    Assert.assertTrue(context.getState() instanceof DisabledState);
	}

	@Test
	public void testStartMaintenanceState() {
	    state.startMaintenance(context);
	    Assert.assertTrue(context.getState() instanceof MaintenanceState);
	}

	@Test
	public void testEnableNoLongerMaintenance() {
	    state.enable(context);
	    Assert.assertFalse(context.getState() instanceof MaintenanceState);
	}

	@Test
	public void testDisableNoLongerMaintenance() {
	    state.disable(context);
	    Assert.assertFalse(context.getState() instanceof MaintenanceState);
	}

	@Test
	public void testMultipleStatesAreDifferentObjects() {
	    MaintenanceState anotherState = new MaintenanceState();
	    Assert.assertNotSame(state, anotherState);
	}
}
