package booking.state;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CancelledStateTest {

    private CancelledState state;
    private BookingContext context;

    @Before
    public void setup() {

        state = new CancelledState();
        context = new BookingContext();

        context.setState(state);
    }

    @Test
    public void testHandleRequest() {

        state.handleRequest();
    }

    @Test
    public void testCancelDoesNotChangeState() {

        state.cancel(context);

        assertTrue(context.getState() instanceof CancelledState);
    }

    @Test
    public void testCompleteDoesNotChangeState() {

        state.complete(context);

        assertTrue(context.getState() instanceof CancelledState);
    }

    @Test
    public void testExtendDoesNotChangeState() {

        state.extend(context);

        assertTrue(context.getState() instanceof CancelledState);
    }

    @Test
    public void testExpireDoesNotChangeState() {

        state.expire(context);

        assertTrue(context.getState() instanceof CancelledState);
    }
}