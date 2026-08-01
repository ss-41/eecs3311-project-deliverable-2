package booking.state;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookingContextTest {

    @Test
    public void testDefaultStateIsActive() {

        BookingContext context = new BookingContext();

        assertTrue(context.getState() instanceof ActiveState);
    }

    @Test
    public void testSetState() {

        BookingContext context = new BookingContext();

        context.setState(new CompletedState());

        assertTrue(context.getState() instanceof CompletedState);
    }

    @Test
    public void testCancelTransition() {

        BookingContext context = new BookingContext();

        context.cancel();

        assertTrue(context.getState() instanceof CancelledState);
    }

    @Test
    public void testCompleteTransition() {

        BookingContext context = new BookingContext();

        context.complete();

        assertTrue(context.getState() instanceof CompletedState);
    }

    @Test
    public void testExpireTransition() {

        BookingContext context = new BookingContext();

        context.expire();

        assertTrue(context.getState() instanceof ExpiredState);
    }

    @Test
    public void testExtendFromCompletedReturnsToActive() {

        BookingContext context = new BookingContext();

        context.complete();

        context.extend();

        assertTrue(context.getState() instanceof ActiveState);
    }

    @Test
    public void testRequestDoesNotThrowException() {

        BookingContext context = new BookingContext();

        context.request();
    }
}