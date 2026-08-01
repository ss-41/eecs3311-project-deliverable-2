package room.state;

import static org.junit.Assert.*;
import org.junit.Test;

public class RoomContextTest {

    @Test
    public void testDefaultStateIsDisabled() {

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
    public void testEnableTransition() {

        RoomContext context = new RoomContext();

        context.enable();

        assertTrue(context.getState() instanceof AvailableState);
    }

    @Test
    public void testDisableTransition() {

        RoomContext context = new RoomContext();

        context.enable();
        context.disable();

        assertTrue(context.getState() instanceof DisabledState);
    }

    @Test
    public void testMaintenanceTransition() {

        RoomContext context = new RoomContext();

        context.enable();
        context.startMaintenance();

        assertTrue(context.getState() instanceof MaintenanceState);
    }

    @Test
    public void testRequest() {

        RoomContext context = new RoomContext();

        context.request();
    }
}