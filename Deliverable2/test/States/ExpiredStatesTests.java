package States;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import booking.state.*;

public class ExpiredStatesTests {
	
	private ExpiredState state;
	private BookingContext context;

	private final ByteArrayOutputStream output = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@Before
	public void setUp() {
	    state = new ExpiredState();

	    context = new BookingContext();
	    context.setState(state);

	    System.setOut(new PrintStream(output));
	}

	@After
	public void resetMsg() {
	    System.setOut(originalOut);
	}
	
	//Output tests
		@Test
		public void testCorrectHandelerMessage() {
			System.setOut(new PrintStream(output));
			state.handleRequest();
			assertEquals("Expired state: this booking is expired" + System.lineSeparator(), output.toString());
		}
		
		@Test
		public void testCorrectCancelMessage() {
			System.setOut(new PrintStream(output));
			state.cancel(context);
			assertEquals("error: this booking is expired" + System.lineSeparator(), output.toString());
		}
		
		@Test
		public void testCorrectCompleteMessage() {
			System.setOut(new PrintStream(output));
			state.complete(context);
			assertEquals("error: this booking is expired" + System.lineSeparator(), output.toString());
		}
		
		@Test
		public void testCorrectExpireMessage() {
			System.setOut(new PrintStream(output));
			state.expire(context);
			assertEquals("error: this booking is already expired" + System.lineSeparator(), output.toString());
		}
		
		@Test
		public void testCorrectExtendMessage() {
			System.setOut(new PrintStream(output));
			state.extend(context);
			assertEquals("error: this booking is expired so it cannot be extended" + System.lineSeparator(), output.toString());
		}
		
		
		//State tests (make sure state stays expires)
		
		@Test
		public void testCancelState() {
			state.cancel(context);
		    assertTrue(context.getState() instanceof ExpiredState);
		}
		
		@Test
		public void testCompletedState() {
			state.complete(context);
		    assertTrue(context.getState() instanceof ExpiredState);
		}
		
		@Test
		public void testExpiredState() {
			state.expire(context);
		    assertTrue(context.getState() instanceof ExpiredState);
		}
		
		@Test
		public void testExtendedState() {
			state.extend(context);
		    assertTrue(context.getState() instanceof ExpiredState);
		}
		
		@Test
		public void testObjectsAreSame() {
			BookingState original = context.getState();
		    state.extend(context);
		    assertSame(original, context.getState());
		}
	
}
