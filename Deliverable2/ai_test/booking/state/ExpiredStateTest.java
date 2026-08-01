package booking.state;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExpiredStateTest {

    private ExpiredState state;
    private BookingContext context;

    @Before
    public void setup() {

        state = new ExpiredState();
        context = new BookingContext();

        context.setState(state);
    }

    @Test
    public void testHandleRequest() {

        state.handleRequest();
    }

    @Test
    public void testCancelDoesNothing() {

        state.cancel(context);

        assertTrue(context.getState() instanceof ExpiredState);
    }

    @Test
    public void testCompleteDoesNothing() {

        state.complete(context);

        assertTrue(context.getState() instanceof ExpiredState);
    }

    @Test
    public void testExtendDoesNothing() {

        state.extend(context);

        assertTrue(context.getState() instanceof ExpiredState);
    }

    @Test
    public void testExpireDoesNothing() {

        state.expire(context);

        assertTrue(context.getState() instanceof ExpiredState);
    }
}