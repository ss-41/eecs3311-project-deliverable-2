package bookingStates;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import booking.state.*;

public class CancelledStatesTests {

	private CancelledState state;
	private BookingContext context;
	
	//For checking text/print outputs
	private final ByteArrayOutputStream output = new ByteArrayOutputStream(); //where we store the print msg
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setUp() {
		state = new CancelledState();
		context = new BookingContext();
		context.setState(state); //set state to be cancelled from the start
	}
	

	@After // reset the system msg back
	public void reset() {
	    System.setOut(originalOut);
	}
	
	//Output tests
	@Test
	public void testCorrectHandelerMessage() {
		System.setOut(new PrintStream(output));
		state.handleRequest();
		assertEquals("Cancelled state: this booking is cancelled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectCancelMessage() {
		System.setOut(new PrintStream(output));
		state.cancel(context);
		assertEquals("error: this booking is already cancelled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectCompleteMessage() {
		System.setOut(new PrintStream(output));
		state.complete(context);
		assertEquals("error: this booking is cancelled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectExpireMessage() {
		System.setOut(new PrintStream(output));
		state.expire(context);
		assertEquals("error: this booking is cancelled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectExtendMessage() {
		System.setOut(new PrintStream(output));
		state.extend(context);
		assertEquals("error: this booking is cancelled" + System.lineSeparator(), output.toString());
	}
	
	
	//State tests (make sure state stays cancelled)
	
	@Test
	public void testCancelState() {
		state.cancel(context);
	    assertTrue(context.getState() instanceof CancelledState);
	}
	
	@Test
	public void testCompletedState() {
		state.complete(context);
	    assertTrue(context.getState() instanceof CancelledState);
	}
	
	@Test
	public void testExpiredState() {
		state.expire(context);
	    assertTrue(context.getState() instanceof CancelledState);
	}
	
	@Test
	public void testExtendedState() {
		state.extend(context);
	    assertTrue(context.getState() instanceof CancelledState);
	}
	
	@Test
	public void testObjectsAreSame() {
		BookingState original = context.getState();
	    state.cancel(context);
	    assertSame(original, context.getState());
	}
	
	
}
