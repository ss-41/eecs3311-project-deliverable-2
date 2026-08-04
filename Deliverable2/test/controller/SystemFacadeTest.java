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

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;
import database.singleton.Database;

public class SystemFacadeTest {

    private static final Path USER_CSV_FILE = Paths.get("csv_files/user.csv");

    private static final Path BOOKING_CSV_FILE = Paths.get("csv_files/booking.csv");

    private static final Path ROOM_CSV_FILE = Paths.get("csv_files/room.csv");

    private static byte[] originalUserCSVFile;
    private static byte[] originalBookingCSVFile;
    private static byte[] originalRoomCSVFile;

    private Database database;
    private SystemFacade systemFacade;

    @BeforeClass
    public static void saveOriginalCSVFiles() throws Exception {
        originalUserCSVFile = Files.readAllBytes(USER_CSV_FILE);
        originalBookingCSVFile = Files.readAllBytes(BOOKING_CSV_FILE);
        originalRoomCSVFile = Files.readAllBytes(ROOM_CSV_FILE);
    }

    @AfterClass
    public static void restoreOriginalCSVFiles() throws Exception {
        Files.write(USER_CSV_FILE, originalUserCSVFile);
        Files.write(BOOKING_CSV_FILE, originalBookingCSVFile);
        Files.write(ROOM_CSV_FILE, originalRoomCSVFile);

        Database database = Database.getInstance();
        database.loadUsers();
        database.loadBookings();
        database.loadRooms();
    }

    @Before
    public void setUp() throws Exception {
        database = Database.getInstance();
        systemFacade = new SystemFacade();

        database.users.clear();
        database.bookings.clear();
        database.rooms.clear();

        database.storeUsers();
        database.storeBookings();
        database.storeRooms();
    }
    
    @Test
    public void testSystemFacadeRegisterUserReturnsTrue() throws Exception {
    	AccountType student = new AccountType(1, "Student", 20);
    	boolean user = systemFacade.registerUser("Ruth Henry", "ruth@email.com", "ruth123", 
    				   "S375", student);
    	assertTrue(user); 
    	
    }
    
    @Test
    public void testSystemFacadeLoginReturnsCorrectUser() throws Exception {
    	AccountType student = new AccountType(1, "Student", 20);
    	systemFacade.registerUser("Finn Isak", "finn@email.com", "finn123", "S924", student);
    	User user = systemFacade.login("finn@email.com", "finn123");
    	assertNotNull(user); 
    	assertEquals("finn@email.com", user.getEmail()); 
    }
    
    @Test
    public void testSystemFacadeCreateAdminReturnsTrue() throws Exception {
    	boolean admin = systemFacade.createAdmin("Omar Hassan", "omar@email.com", "omar123", "O919");
    	assertTrue(admin); 
    }
    
    @Test
    public void testSystemFacadeBookRoomReturnsTrueForAvailableRooms() throws Exception {
    	Room availableRoom = new Room(100, "LAS100", 70, "Lassonde", RoomStatus.AVAILABLE, new ArrayList<>()); 
    	database.rooms.add(availableRoom); 
    	LocalDateTime start = LocalDateTime.of(2026, 4, 7, 12, 0);
    	boolean booking = systemFacade.bookRoom(10, 110, 100, 40, start, start.plusHours(2)); 
    	assertTrue(booking); 
    }
    
    @Test
    public void testSystemFacadeBookRoomFailsForUnavailableRooms() throws Exception {
    	Room room = new Room(101, "ACE101", 50, "ACE", RoomStatus.MAINTENANCE, new ArrayList<>()); 
    	database.rooms.add(room); 
    	LocalDateTime start = LocalDateTime.of(2026, 5, 13, 10, 0);
    	boolean booking = systemFacade.bookRoom(11, 111, 101, 20, start, start.plusHours(1)); 
    	assertFalse(booking); 
    }
    
    @Test
    public void testSystemFacadeCancelBookingReturnsTrue() throws Exception {
    	LocalDateTime start = LocalDateTime.now().plusDays(10);
    	Booking booking = new Booking(12, 112, 102, 40, BookingStatus.ACTIVE, start, start.plusHours(2)); 
    	database.bookings.add(booking);
        database.storeBookings();
        assertTrue(systemFacade.cancelBooking(12, 112)); 
        database.loadBookings();
        assertEquals(BookingStatus.CANCELLED, database.bookings.get(0).getBookingStatus());
    }
    
    @Test
    public void testSystemFacadeExtendBookingReturnsTrue() throws Exception {
    	LocalDateTime start = LocalDateTime.of(2026, 2, 8, 10, 0);
    	Booking booking = new Booking(13, 113, 103, 30, BookingStatus.ACTIVE, start, start.plusHours(1)); 
    	database.bookings.add(booking);
        database.storeBookings();
        assertTrue(systemFacade.extendBooking(13, start.plusHours(2))); 

    }
    
    @Test
    public void testSystemFacadeGetBookings() throws Exception {
    	LocalDateTime start = LocalDateTime.of(2026, 3, 29, 9, 0);
    	Booking booking = new Booking(14, 114, 104, 20, BookingStatus.ACTIVE, start, start.plusHours(1)); 
    	database.bookings.add(booking);
        database.storeBookings();
        assertEquals(1, systemFacade.getBookings().size()); 
        assertEquals(14, systemFacade.getBookings().get(0).getBookingID()); 
    }
    
    @Test
    public void testSystemFacadeGetAvailableRooms() throws Exception {
    	Room availableRoom = new Room(105, "CB101", 50, "CB", RoomStatus.AVAILABLE, new ArrayList<>()); 
    	database.rooms.add(availableRoom); 
    	database.storeRooms();
    	assertEquals(1, systemFacade.getAvailableRooms().size());
    	assertEquals(105, systemFacade.getAvailableRooms().get(0).getRoomID()); 
    	assertEquals(RoomStatus.AVAILABLE, systemFacade.getAvailableRooms().get(0).getStatus()); 
    }
    
    @Test 
    public void testSystemFacadeAddAndDeleteRoom() throws Exception {
    	Room room = new Room(106, "DB1006", 50, "DB", RoomStatus.AVAILABLE, new ArrayList<>()); 
    	assertTrue(systemFacade.addRoom(room)); 
    	assertEquals(1, database.rooms.size());
        assertTrue(systemFacade.deleteRoom(room));
        database.loadRooms();
        assertTrue(database.rooms.isEmpty());
    }
    
    @Test 
    public void testSystemFacadeCalculateFeeAndPayForBooking() throws Exception {
    	AccountType student = new AccountType(1, "Student", 20); 
    	User user = new User(115, "Will Nelson", "will@email.com", "will123", "S351", student);
    	LocalDateTime start = LocalDateTime.of(2026, 5, 10, 12, 0);
    	Booking booking = new Booking(15, 115, 105, 20, BookingStatus.ACTIVE, start, start.plusHours(1));
    	database.users.add(user); 
    	database.bookings.add(booking); 
    	database.storeUsers();
    	database.storeBookings();
    	assertEquals(20, systemFacade.calculateFee(15), 0.001); 
    	assertTrue(systemFacade.payForBooking(15)); 
    }
    
}