package room.state;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OccupiedStateTest {

    private OccupiedState state;
    private RoomContext context;

    @Before
    public void setup() {

        state = new OccupiedState();
        context = new RoomContext();

        context.setState(state);
    }

    @Test
    public void testHandleRequest() {

        state.handleRequest();
    }

    @Test
    public void testEnableDoesNothing() {

        state.enable(context);

        assertTrue(context.getState() instanceof OccupiedState);
    }

    @Test
    public void testDisable() {

        state.disable(context);

        assertTrue(context.getState() instanceof DisabledState);
    }

    @Test
    public void testMaintenanceDoesNothing() {

        state.startMaintenance(context);

        assertTrue(context.getState() instanceof OccupiedState);
    }
}