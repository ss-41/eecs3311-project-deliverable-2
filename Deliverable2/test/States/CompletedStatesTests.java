package States;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.*;
import org.junit.Assert.*;

import booking.state.ActiveState;
import booking.state.BookingContext;
import booking.state.BookingState;
import booking.state.CancelledState;
import booking.state.CompletedState;
import booking.state.ExpiredState;

public class CompletedStatesTests {

	private CompletedState state;
	private BookingContext context;
	
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	@Before
	public void setup() {
		state = new CompletedState();
	    context = new BookingContext();
	    context.setState(state); // all start as completed
	}
	
	@After //reset msg
	public void reset() {
	    System.setOut(originalOut);
	}
	
	@Test
	public void testCorrectHandelerMessage() {
		System.setOut(new PrintStream(output));
		state.handleRequest();
		assertEquals("Completed state: this booking is completed" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectCancelMessage() {
		System.setOut(new PrintStream(output));
		state.cancel(context);
		assertEquals("This booking is now cancelled" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectCompleteMessage() {
		System.setOut(new PrintStream(output));
		state.complete(context);
		assertEquals("error: this booking is already completed" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectExpireMessage() {
		System.setOut(new PrintStream(output));
		state.expire(context);
		assertEquals("This booking is now expired" + System.lineSeparator(), output.toString());
	}
	
	@Test
	public void testCorrectExtendMessage() {
		System.setOut(new PrintStream(output));
		state.extend(context);
		assertEquals("This booking is extended and now active again" + System.lineSeparator(), output.toString());
	}
	
	
	@Test
	public void testCancelState() {
		state.cancel(context);
	    assertTrue(context.getState() instanceof CancelledState);
	}
	@Test
	public void testCompletedState() {
		state.complete(context);
	    assertTrue(context.getState() instanceof CompletedState);
	}
	@Test
	public void testExpiredState() {
		state.expire(context);
	    assertTrue(context.getState() instanceof ExpiredState);
	}
	@Test
	public void testExtendedState() {
		state.extend(context);
	    assertTrue(context.getState() instanceof ActiveState);
	}
	
	
	@Test
	public void testObjectsStatesChange() {
		BookingState original = context.getState();
	    state.cancel(context);
	    Assert.assertNotSame(original, context.getState());
	}
	
}
