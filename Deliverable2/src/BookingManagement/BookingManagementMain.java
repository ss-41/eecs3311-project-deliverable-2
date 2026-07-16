package BookingManagement;

/*
 * Client code for BookingManagement
 */
public class BookingManagementMain {

	public static void main(String[] args) {
		BookingContext bookingContext = new BookingContext();
		BookingContext bookingContext2 = new BookingContext();
		
		bookingContext.request(); // initial state is active
		System.out.println();
		
		bookingContext.extend(); // active booking cannot be extended as it already active
		bookingContext.request();
		System.out.println();
		
		bookingContext.complete(); // active state to completed state
		bookingContext.request();
		System.out.println();
		
		bookingContext.extend(); // completed state to active state
		bookingContext.request();
		System.out.println();
		
		bookingContext.cancel(); // active state to cancelled state
		bookingContext.request();
		System.out.println();
		
		bookingContext.extend(); // cancelled booking cannot be extended as it is finished
		bookingContext.request();
		System.out.println();
		
		System.out.println("-------------------------------------------------------");
		bookingContext2.request(); // initial state is active
		System.out.println();
		
		bookingContext2.expire(); // active state to expired state
		bookingContext2.request();
		System.out.println();
		
		bookingContext2.extend(); // expired booking cannot be extended
		bookingContext2.request();
		System.out.println();
	}

}
