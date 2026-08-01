package booking.state;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CompletedStateTest {

    private CompletedState state;
    private BookingContext context;

    @Before
    public void setup() {

        state = new CompletedState();
        context = new BookingContext();

        context.setState(state);
    }

    @Test
    public void testHandleRequest() {

        state.handleRequest();
    }

    @Test
    public void testCancel() {

        state.cancel(context);

        assertTrue(context.getState() instanceof CancelledState);
    }

    @Test
    public void testCompleteStaysCompleted() {

        state.complete(context);

        assertTrue(context.getState() instanceof CompletedState);
    }

    @Test
    public void testExtendReturnsToActive() {

        state.extend(context);

        assertTrue(context.getState() instanceof ActiveState);
    }

    @Test
    public void testExpire() {

        state.expire(context);

        assertTrue(context.getState() instanceof ExpiredState);
    }
}