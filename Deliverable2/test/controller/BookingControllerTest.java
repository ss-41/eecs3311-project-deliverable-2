package controller;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import database.singleton.Database;

public class BookingControllerTest {

    private static final Path BOOKING_CSV_FILE = Paths.get("csv_files/booking.csv");

    private static final Path ROOM_CSV_FILE = Paths.get("csv_files/room.csv");

    private static byte[] originalBookingCSVFile;
    private static byte[] originalRoomCSVFile;

    private Database database;
    private BookingController controller;

    @BeforeClass
    public static void saveOriginalCSVFiles() throws Exception {
        originalBookingCSVFile = Files.readAllBytes(BOOKING_CSV_FILE);
        originalRoomCSVFile = Files.readAllBytes(ROOM_CSV_FILE);
    }

    @AfterClass
    public static void restoreOriginalCSVFiles() throws Exception {
        Files.write(BOOKING_CSV_FILE, originalBookingCSVFile);
        Files.write(ROOM_CSV_FILE, originalRoomCSVFile);

        Database database = Database.getInstance();
        database.loadBookings();
        database.loadRooms();
    }

    @Before
    public void setUp() throws Exception {
        database = Database.getInstance();
        controller = new BookingController();

        database.bookings.clear();
        database.rooms.clear();

        database.storeBookings();
        database.storeRooms();
    }

    
    @Test
    public void testCreateBookingForAvailableRoom() throws Exception {
    	Room availableRoom = new Room(100, "CB100", 50, "CB", RoomStatus.AVAILABLE, 
    						 new ArrayList<>());
    	database.rooms.add(availableRoom); 
    	LocalDateTime start = LocalDateTime.of(2026, 6, 12, 12, 0); 
    	boolean booking = controller.createBooking(10, 110, 100, 30, start, start.plusHours(1)); 
    	assertTrue(booking); 		
    }
    
    @Test
    public void testCreateBookingStoresBookingInDatabase() throws Exception {
    	Room availableRoom = new Room(101, "ACW100", 40, "ACW", RoomStatus.AVAILABLE, 
				 new ArrayList<>());
    	database.rooms.add(availableRoom); 
    	LocalDateTime start = LocalDateTime.of(2026, 3, 22, 10, 0); 
    	boolean booking = controller.createBooking(11, 111, 101, 20, start, start.plusHours(1)); 
    	assertTrue(booking);
    	database.loadBookings();
    	assertEquals(1, database.bookings.size()); 
    	assertEquals(11, database.bookings.get(0).getBookingID()); 
    	assertEquals(111, database.bookings.get(0).getUserID());
    	assertEquals(101, database.bookings.get(0).getRoomID());
    	assertEquals(BookingStatus.ACTIVE, database.bookings.get(0).getBookingStatus());
    	
    }
    
    @Test
    public void testCreateBookingForDisabledRoomFails() throws Exception {
    	Room disabledRoom = new Room(102, "LAS1001", 30, "Lassonde", RoomStatus.DISABLED, 
				 new ArrayList<>());
    	database.rooms.add(disabledRoom); 
    	LocalDateTime start = LocalDateTime.of(2026, 7, 15, 9, 0); 
    	boolean booking = controller.createBooking(12, 112, 102, 50, start, start.plusHours(2)); 
    	assertFalse(booking);
    	assertTrue(database.bookings.isEmpty()); 
    }
    
    @Test
    public void testCreateBookingForInvalidRoomIDFails() throws Exception {
    	Room room = new Room(103, "LAS1001", 30, "Lassonde", RoomStatus.AVAILABLE, 
				 new ArrayList<>());
    	database.rooms.add(room); 
    	LocalDateTime start = LocalDateTime.of(2026, 2, 15, 11, 0); 
    	boolean booking = controller.createBooking(13, 113, 456, 20, start, start.plusHours(2)); 
    	assertFalse(booking);
    	assertTrue(database.bookings.isEmpty()); 
    }
    
    @Test
    public void testGetBookingsReturnsBookings() throws Exception {
    	LocalDateTime start = LocalDateTime.of(2026, 5, 27, 10, 0); 
    	Booking booking = new Booking(14, 114, 104, 40, BookingStatus.ACTIVE, 
    					  start, start.plusHours(2));
    	database.bookings.add(booking); 
    	database.storeBookings();
    	assertEquals(1, controller.getBookings().size()); 
    	assertEquals(14, controller.getBookings().get(0).getBookingID());
    	
    }
    
    @Test 
    public void testExtendBookingForActiveBookingReturnsTrue() throws Exception {
    	LocalDateTime start = LocalDateTime.of(2026, 7, 20, 10, 0);
        LocalDateTime end = start.plusHours(1);
        LocalDateTime newEnd = start.plusHours(2);
        Booking booking = new Booking(15, 115, 105, 30, BookingStatus.ACTIVE, 
				  start, end);
        database.bookings.add(booking);
        database.storeBookings();
        assertTrue(controller.extendBooking(15, newEnd));
        database.loadBookings();
        assertEquals(newEnd, database.bookings.get(0).getBookingEndTime()); 
    }
    
    @Test
    public void testExtendBookingToEarlierEndTimeFails() throws Exception {
    	LocalDateTime start = LocalDateTime.of(2026, 8, 10, 9, 0);
        LocalDateTime end = start.plusHours(2);
        LocalDateTime earlierEnd = start.plusHours(1);
        Booking booking = new Booking(16, 116, 106, 40, BookingStatus.ACTIVE, 
				  start, end);
      database.bookings.add(booking);
      database.storeBookings();
      assertFalse(controller.extendBooking(16, earlierEnd));
    }
    
    @Test
    public void testExtendCompletedBookingFails() throws Exception {
    	LocalDateTime start = LocalDateTime.of(2026, 1, 12, 10, 0);
    	Booking booking = new Booking(17, 117, 107, 20, BookingStatus.COMPLETED, 
				  start, start.plusHours(2)); 
      database.bookings.add(booking);
      database.storeBookings();
      assertFalse(controller.extendBooking(17, start.plusHours(3))); 
    }
    
    @Test
    public void testCancelBookingReturnsTrue() throws Exception {
    	LocalDateTime start = LocalDateTime.now().plusDays(5);
        LocalDateTime end = start.plusHours(1);
        Booking booking = new Booking(18, 118, 108, 30, BookingStatus.ACTIVE, 
				  start, end);
      database.bookings.add(booking);
      database.storeBookings();
      assertTrue(controller.cancelBooking(18, 118));
      database.loadBookings();
      assertEquals(BookingStatus.CANCELLED, database.bookings.get(0).getBookingStatus());
    } 
    
    @Test
    public void testCancelBookingWithIncorrectBookingIDFails() throws Exception {
    	 LocalDateTime start = LocalDateTime.now().plusDays(10);
    	 Booking booking = new Booking(19, 119, 109, 50, BookingStatus.ACTIVE, 
				  start, start.plusHours(2));
    	 database.bookings.add(booking);
    	 database.storeBookings();
    	 assertFalse(controller.cancelBooking(25, 119));
    	 database.loadBookings();
    	 assertEquals(BookingStatus.ACTIVE, database.bookings.get(0).getBookingStatus());
    }
    
}