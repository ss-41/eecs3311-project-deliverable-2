package room.state;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class AvailableStateTest {

    private AvailableState state;
    private RoomContext context;

    @Before
    public void setup() {

        state = new AvailableState();
        context = new RoomContext();

        context.setState(state);
    }

    @Test
    public void testHandleRequest() {

        state.handleRequest();
    }

    @Test
    public void testEnableKeepsAvailable() {

        state.enable(context);

        assertTrue(context.getState() instanceof AvailableState);
    }

    @Test
    public void testDisable() {

        state.disable(context);

        assertTrue(context.getState() instanceof DisabledState);
    }

    @Test
    public void testMaintenance() {

        state.startMaintenance(context);

        assertTrue(context.getState() instanceof MaintenanceState);
    }
}