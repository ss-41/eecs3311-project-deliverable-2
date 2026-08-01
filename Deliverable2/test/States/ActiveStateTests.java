package States;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;
import org.junit.Assert.*;

import booking.state.ActiveState;
import booking.state.BookingContext;
import booking.state.CancelledState;
import booking.state.CompletedState;
import booking.state.ExpiredState;

public class ActiveStateTests {
	
	
	private ActiveState state;
	private BookingContext context;
	
	@Before
	public void setUp() {
		state = new ActiveState();
		context = new BookingContext();
	}
	
	
	@Test
	public void testHandleRequests() {
		state.handleRequest();
	    Assert.assertTrue(true);
	}
	
	@Test
	public void testHandleRequestOutput() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(output));
	    
		state.handleRequest();
	    Assert.assertEquals("Active state: this booking is active" + System.lineSeparator(),output.toString());
	}
	
	@Test
    public void testCancel() {

        state.cancel(context);
        Assert.assertTrue(context.getState() instanceof CancelledState);

    }
	
	@Test
    public void testComplete() {

        state.complete(context);
        Assert.assertTrue(context.getState() instanceof CompletedState);

    }
	
	@Test
    public void testExpired() {

        state.expire(context);
        Assert.assertTrue(context.getState() instanceof ExpiredState);

    }
	
	@Test
    public void testExtendActiveBooking() {

        state.extend(context);
        Assert.assertTrue(context.getState() instanceof ActiveState);

    }
	
	@Test
    public void testCancelChangesState() {

        state.cancel(context);
        Assert.assertFalse(context.getState() instanceof ActiveState);

    }
	
	@Test
    public void testCompleteChangesState() {

        state.complete(context);
        Assert.assertFalse(context.getState() instanceof ActiveState);

    }
	
	@Test
    public void testExpireChangesState() {

        state.expire(context);
        Assert.assertFalse(context.getState() instanceof ActiveState);

    }
	
	@Test
    public void testMultipleStateChanges() {

        state.cancel(context);

        state.complete(context);

        Assert.assertTrue(context.getState() instanceof CompletedState);

    }


    @Test
    public void testMutipleStatesAreUnique() {

        ActiveState anotherState = new ActiveState();

        Assert.assertNotSame(state, anotherState);

    }
}
