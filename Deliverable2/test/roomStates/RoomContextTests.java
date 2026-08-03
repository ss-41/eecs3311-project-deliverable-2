package roomStates;

import static org.junit.Assert.*;
import org.junit.*;
import room.state.*;

public class RoomContextTests {
	
	private static class DemoState implements RoomState {

	    boolean handleCalled = false;
	    boolean enableCalled = false;
	    boolean disableCalled = false;
	    boolean maintenanceCalled = false;

	    @Override
	    public void handleRequest() {
	        handleCalled = true;
	    }

	    @Override
	    public void enable(RoomContext context) {
	        enableCalled = true;
	    }

	    @Override
	    public void disable(RoomContext context) {
	        disableCalled = true;
	    }

	    @Override
	    public void startMaintenance(RoomContext context) {
	        maintenanceCalled = true;
	    }
	}
	
	@Test
	public void testInitialStateDisabled() {
	    RoomContext context = new RoomContext();
	    assertTrue(context.getState() instanceof DisabledState);
	}
	
	@Test
	public void testSetState() {
	    RoomContext context = new RoomContext();
	    context.setState(new AvailableState());
	    assertTrue(context.getState() instanceof AvailableState);
	}
	
	@Test
	public void testGetState() {
	    RoomContext context = new RoomContext();
	    RoomState state = new MaintenanceState();
	    context.setState(state);
	    assertEquals(state, context.getState());
	}
	
	
	
	@Test
	public void testHandelRequestIsCalled() {
	    RoomContext context = new RoomContext();
	    DemoState demo = new DemoState();

	    context.setState(demo);
	    context.request();

	    assertTrue(demo.handleCalled);
	}
	
	@Test
	public void testEnableWorks() {
		RoomContext context = new RoomContext();
		DemoState demo = new DemoState();

	    context.setState(demo);
	    context.enable();

	    assertTrue(demo.enableCalled);
	}
	
	@Test
	public void testDisableWorks() {
		RoomContext context = new RoomContext();
		DemoState demo = new DemoState();

	    context.setState(demo);
	    context.disable();

	    assertTrue(demo.disableCalled);
	}
	
	@Test
	public void testStartMaintenance() {
		RoomContext context = new RoomContext();
		DemoState demo = new DemoState();

	    context.setState(demo);
	    context.startMaintenance();

	    assertTrue(demo.maintenanceCalled);
	}
	
	@Test
	public void testMultipleStateChanges() {
	    RoomContext context = new RoomContext();

	    context.setState(new AvailableState());
	    context.setState(new MaintenanceState());
	    context.setState(new OccupiedState());

	    assertTrue(context.getState() instanceof OccupiedState);
	}
	
	@Test
	public void testSetStateToDisabled() {
	    RoomContext context = new RoomContext();
	    context.setState(new DisabledState());
	    assertTrue(context.getState() instanceof DisabledState);
	}
	
	@Test
	public void testSetStateReplacesPreviousState() {
	    RoomContext context = new RoomContext();

	    RoomState first = new AvailableState();
	    RoomState second = new MaintenanceState();

	    context.setState(first);
	    context.setState(second);
	    assertSame(second, context.getState());
	}
	
	

}
