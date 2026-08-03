package controller;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.User;
import database.singleton.Database;

public class PaymentControllerTest {

    private static final Path BOOKING_CSV_FILE =
            Paths.get("csv_files/booking.csv");

    private static final Path USER_CSV_FILE =
            Paths.get("csv_files/user.csv");

    private static byte[] originalBookingCSVFile;
    private static byte[] originalUserCSVFile;

    private Database database;
    private PaymentController controller;

    @BeforeClass
    public static void saveOriginalCSVFiles() throws Exception {
        originalBookingCSVFile =
                Files.readAllBytes(BOOKING_CSV_FILE);

        originalUserCSVFile =
                Files.readAllBytes(USER_CSV_FILE);
    }

    @AfterClass
    public static void restoreOriginalCSVFiles() throws Exception {
        Files.write(
                BOOKING_CSV_FILE,
                originalBookingCSVFile
        );

        Files.write(
                USER_CSV_FILE,
                originalUserCSVFile
        );

        Database database = Database.getInstance();
        database.loadBookings();
        database.loadUsers();
    }

    @Before
    public void setUp() throws Exception {
        database = Database.getInstance();
        controller = new PaymentController();

        database.bookings.clear();
        database.users.clear();

        database.storeBookings();
        database.storeUsers();
    }
    
    @Test
    public void testProcessPaymentForBooking() throws Exception {
    	LocalDateTime start = LocalDateTime.of(2026, 3, 10, 9, 0); 
    	Booking booking = new Booking (200, 10, 100, 40, 
    					  BookingStatus.ACTIVE, start, start.plusHours(2));
    	database.bookings.add(booking); 
    	database.storeBookings();
    	assertTrue(controller.processPayment(200)); 
    }
    
    @Test
    public void testForUnknownBooking() throws Exception {
    	assertFalse(controller.processPayment(300)); 
    }
    
    @Test
    public void testCalculateFeeForOneHourStaffBooking() throws Exception {
    	AccountType staff = new AccountType(3, "Staff", 40.00); 
    	User user = new User (1000, "Wendy Micheals", "wendy@email.com", 
    				"wendymicheals", "O101", staff); 
    	LocalDateTime start = LocalDateTime.of(2026, 7, 3, 12, 0); 
    	Booking booking = new Booking (201, 1000, 104, 40, 
    					  BookingStatus.ACTIVE, start, start.plusHours(1)); 
    	database.users.add(user);
        database.bookings.add(booking);

        database.storeUsers();
        database.storeBookings();
        assertEquals(40, controller.calculateFee(201), 0.001); 
    }
    
    @Test
    public void testCalculateFeeForTwoHourStudentBooking() throws Exception {
        AccountType student = new AccountType (1, "Student", 20.00);

        User user = new User(1001,  "Luke Andrews", "luke@email.com", "luke123",
                	"S574", student );
        LocalDateTime start = LocalDateTime.of(2026, 2, 21, 11, 0);
        Booking booking = new Booking(202, 1001, 2101, 20, 
        				  BookingStatus.ACTIVE, start, start.plusHours(2));
           
        database.users.add(user);
        database.bookings.add(booking);

        database.storeUsers();
        database.storeBookings();

        assertEquals(40, controller.calculateFee(202), 0.001);
        
    }
    
    @Test
    public void testCalculateFeeForFourHourFacultyBooking() throws Exception {
        AccountType faculty = new AccountType (2, "Faculty", 30.00);

        User user = new User(1002,  "Corey Williams", "corey@email.com", "corey123",
                	"O846", faculty);
        LocalDateTime start = LocalDateTime.of(2026, 4, 3, 10, 0);
        Booking booking = new Booking(203, 1002, 1003, 30, 
        				  BookingStatus.ACTIVE, start, start.plusHours(4));
           
        database.users.add(user);
        database.bookings.add(booking);

        database.storeUsers();
        database.storeBookings();

        assertEquals(120, controller.calculateFee(203), 0.001);
        
    }
    
    @Test
    public void testCalculateFeeForTwoHourPartnerBooking() throws Exception {
    	AccountType partner = new AccountType (4, "Partner", 50.00);

        User user = new User(1003, "Sanda Russell", "sandra@email.com", "sandra123",
                	"O384", partner);
        LocalDateTime start = LocalDateTime.of(2026, 6, 15, 9, 0);
        Booking booking = new Booking(204, 1003, 1111, 50, 
        				  BookingStatus.ACTIVE, start, start.plusHours(2));
           
        database.users.add(user);
        database.bookings.add(booking);

        database.storeUsers();
        database.storeBookings();

        assertEquals(100, controller.calculateFee(204), 0.001);
    }
    
    @Test
    public void testCalculateFeeForZeroHoursUsedBooking() throws Exception {
    	AccountType staff = new AccountType (3, "Staff", 40.00);

        User user = new User(1004, "Will Russo", "will@email.com", "will123",
                	"O946", staff);
        LocalDateTime start = LocalDateTime.of(2026, 5, 26, 12, 0);
        Booking booking = new Booking(205, 1004, 1010, 40, 
        				  BookingStatus.ACTIVE, start, start);
           
        database.users.add(user);
        database.bookings.add(booking);

        database.storeUsers();
        database.storeBookings();

        assertEquals(40, controller.calculateFee(205), 0.001);
    }
    
    @Test
    public void testCalculateFeeForInvalidUserIDReturnsZero() throws Exception {
    	 LocalDateTime start = LocalDateTime.of(2026, 3, 18, 9, 0);
         Booking booking = new Booking(206, 8596, 1010, 30, 
         				  BookingStatus.ACTIVE, start, start.plusHours(2));
            
         database.bookings.add(booking);
         database.storeBookings();
         assertEquals(0.00, controller.calculateFee(206), 0.001); 
    }
    
    @Test
    public void testCalculateFeeForInvalidBookingIDReturnsZero() throws Exception {
    	assertEquals(0.00, controller.calculateFee(787), 0.001); 
    }
    
    @Test
    public void testCalculateFeeForOneAndHalfHourBookingIsChargedOneHour() throws Exception {
    	AccountType faculty = new AccountType(2, "Faculty", 30.00); 
    	User user = new User (1005, "Larry Wilks", "larry@email.com", "larry123",
    				"O937", faculty); 
    	 LocalDateTime start = LocalDateTime.of(2026, 7, 5, 10, 0);
    	 Booking booking = new Booking(207, 1005, 1212, 30, 
				  BookingStatus.ACTIVE, start, start.plusMinutes(90));
    	 
    	 database.users.add(user);
    	 database.bookings.add(booking);

    	 database.storeUsers();
    	 database.storeBookings();
    	 assertEquals(30, controller.calculateFee(207), 0.001);  
    }
    
    
}