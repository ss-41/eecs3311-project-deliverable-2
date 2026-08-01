package booking.state;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ActiveStateTest {

    private ActiveState state;
    private BookingContext context;

    @Before
    public void setup() {

        state = new ActiveState();
        context = new BookingContext();
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
    public void testComplete() {

        state.complete(context);

        assertTrue(context.getState() instanceof CompletedState);
    }

    @Test
    public void testExpire() {

        state.expire(context);

        assertTrue(context.getState() instanceof ExpiredState);
    }

    @Test
    public void testExtendRemainsActive() {

        state.extend(context);

        assertTrue(context.getState() instanceof ActiveState);
    }
}