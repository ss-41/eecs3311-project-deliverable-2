package room.state;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class DisabledStateTest {

    private DisabledState state;
    private RoomContext context;

    @Before
    public void setup() {

        state = new DisabledState();
        context = new RoomContext();

        context.setState(state);
    }

    @Test
    public void testHandleRequest() {

        state.handleRequest();
    }

    @Test
    public void testEnable() {

        state.enable(context);

        assertTrue(context.getState() instanceof AvailableState);
    }

    @Test
    public void testDisableDoesNothing() {

        state.disable(context);

        assertTrue(context.getState() instanceof DisabledState);
    }

    @Test
    public void testMaintenanceDoesNothing() {

        state.startMaintenance(context);

        assertTrue(context.getState() instanceof DisabledState);
    }
}