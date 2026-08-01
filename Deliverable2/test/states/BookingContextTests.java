package states;

import org.junit.*;

import booking.state.ActiveState;
import booking.state.BookingContext;
import booking.state.BookingState;
import booking.state.CancelledState;

public class BookingContextTests {
	
	static class DemoState implements BookingState {

        boolean requestCalled;
        boolean cancelCalled;
        boolean completeCalled;
        boolean extendCalled;
        boolean expireCalled;

        @Override
        public void handleRequest() {
            requestCalled = true;
        }

        @Override
        public void cancel(BookingContext context) {
            cancelCalled = true;
        }

        @Override
        public void complete(BookingContext context) {
            completeCalled = true;
        }

        @Override
        public void extend(BookingContext context) {
            extendCalled = true;
        }

        @Override
        public void expire(BookingContext context) {
            expireCalled = true;
        }
    }
	
	private BookingContext context;
	
	@Before
	public void setUp() {
		
		context = new BookingContext();
	}
	
	@Test
	public void testConstructorInitializesActiveState() {
	    Assert.assertTrue(context.getState() instanceof ActiveState);
	}
	@Test
	public void testConstructorInitializesCancelledState() {
	    Assert.assertTrue(context.getState() instanceof CancelledState);
	}
	
	@Test
	public void testGetStateReturnsState() {
		
		BookingState state = context.getState();
		Assert.assertNotNull(state);
		
	}
	
	@Test
	public void testChangingStates() {

	    DemoState demo = new DemoState();
	    context.setState(demo);
	    Assert.assertEquals(demo, context.getState());

	}
	
	@Test
	public void testHandleRequest() {
		DemoState demo = new DemoState();
	    context.setState(demo);
	    context.request();
	    Assert.assertTrue(demo.requestCalled);
	}
	
	@Test
	public void testCancelation() {
		DemoState demo = new DemoState();
	    context.setState(demo);
	    context.request();
	    context.cancel();
	    Assert.assertTrue(demo.cancelCalled);
	}
	
	@Test
	public void testCompletion() {
		DemoState demo = new DemoState();
	    context.setState(demo);
	    context.request();
	    context.complete();
	    Assert.assertTrue(demo.completeCalled);
	}
	
	@Test
	public void testExtension() {
		DemoState demo = new DemoState();
	    context.setState(demo);
	    context.request();
	    context.extend();
	    Assert.assertTrue(demo.extendCalled);
	}
	
	@Test
	public void testExpiration() {
		DemoState demo = new DemoState();
	    context.setState(demo);
	    context.request();
	    context.expire();
	    Assert.assertTrue(demo.expireCalled);
	}
	
	
	@Test
	public void testMutipleStateChanges() {
		DemoState stateOne = new DemoState();
        DemoState stateTwo = new DemoState();
        
        context.setState(stateTwo);
        context.setState(stateTwo);
        
        Assert.assertTrue(stateTwo == context.getState());
	}
	
	@Test
	public void testDifferentRecieveRequests() {
		DemoState stateOne = new DemoState();
        DemoState stateTwo = new DemoState();
        
        context.setState(stateTwo);
        context.request();
        
        context.setState(stateTwo);
        context.request();
        
        Assert.assertTrue(stateOne.requestCalled);
        Assert.assertTrue(stateTwo.requestCalled);
	}
}
