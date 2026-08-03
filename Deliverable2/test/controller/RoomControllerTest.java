package controller;

import static org.junit.Assert.*;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import dataModels.Room;
import dataModels.RoomStatus;
import database.singleton.Database;

public class RoomControllerTest {

	private static final Path ROOM_CSV_FILE =
            Paths.get("csv_files/room.csv");

    private static byte[] originalRoomCSVFile;

    private Database database;
    private RoomController controller;

    @BeforeClass
    public static void saveOriginalRoomFile() throws Exception {
        originalRoomCSVFile = Files.readAllBytes(ROOM_CSV_FILE);
    }

    @AfterClass
    public static void restoreOriginalRoomFile() throws Exception {
        Files.write(ROOM_CSV_FILE, originalRoomCSVFile);

        Database database = Database.getInstance();
        database.loadRooms();
    }

    @Before
    public void setUp() throws Exception {
        database = Database.getInstance();
        controller = new RoomController();

        database.rooms.clear();
        database.storeRooms();
    }
     
    @Test
    public void testGetAvailableRooms() throws Exception {
    	Room available = new Room (102, "D102A", 50, "DB Building", 
    					  RoomStatus.AVAILABLE, new ArrayList<>()); 
    	database.rooms.add(available); 
    	database.storeRooms();
    	
    	ArrayList<Room> availableRooms = controller.getAvailableRooms();
    	assertEquals(1, availableRooms.size());
    	assertEquals("D102A", availableRooms.get(0).getRoomNum()); 
    }
    
    @Test
    public void testGetAvailableRoomsDoesNotReturnClosedRooms () throws Exception {
    	Room closed = new Room (103, "A0101", 20, "ACW E", 
    			      RoomStatus.CLOSED, new ArrayList<>()); 
    	
    	database.rooms.add(closed);
    	database.storeRooms();
    	
    	ArrayList<Room> availableRooms = controller.getAvailableRooms();
    	assertTrue(availableRooms.isEmpty()); 
    }
    
    @Test
    public void testAddRoom() throws Exception {
    	Room room = new Room (104, "C101", 40, "CB", 
    			    RoomStatus.AVAILABLE, new ArrayList<>());
    	assertTrue(controller.addRoom(room)); 
    }
    
    @Test
    public void testDeleteRoomDeletesExistingRoom() throws Exception {
    	Room room = new Room (105, "VHA", 100, "Vari Hall", 
    				RoomStatus.AVAILABLE, new ArrayList<>()); 
    	database.rooms.add(room); 
    	database.storeRooms();
    	assertTrue(controller.deleteRoom(room)); 
    	database.loadRooms();
    	assertTrue(database.rooms.isEmpty()); 
    }
    
    @Test
    public void testAddedRoomIsInDatabase() throws Exception {
    	Room room = new Room (106, "LAS1001", 40, "Lassonde",
    				RoomStatus.AVAILABLE, new ArrayList<>()); 
    	controller.addRoom(room);
    	database.loadRooms();
    	assertEquals(1, database.rooms.size()); 
    	assertEquals(106, database.rooms.get(0).getRoomID()); 
    			
    	
    }
    
    @Test 
    public void testGetAvailableRoomsEmptyList() throws Exception {
    	ArrayList<Room> available = controller.getAvailableRooms();
    	assertNotNull(available);
    	assertTrue(available.isEmpty()); 
    }
    
    @Test
    public void testGetAvailableRoomsDoesNotReturnDisabledRooms () throws Exception {
    	Room disabled = new Room (107, "WSC100", 20, "WSC", 
    			      RoomStatus.DISABLED, new ArrayList<>()); 
    	
    	database.rooms.add(disabled);
    	database.storeRooms();
    	ArrayList<Room> available = controller.getAvailableRooms();
    	assertTrue(available.isEmpty()); 
    }
    
    @Test
    public void testDeletingRoomDoesNotDeleteOtherRooms() throws Exception {
    	Room delete = new Room (108, "RS101", 60, "Ross South", 
    				  RoomStatus.AVAILABLE, new ArrayList<>()); 
    	Room room = new Room (109, "RS102", 50, "Ross South", 
				    RoomStatus.AVAILABLE, new ArrayList<>()); 
    	database.rooms.add(delete); 
    	database.rooms.add(room); 
    	database.storeRooms();
    	assertTrue(controller.deleteRoom(delete)); 
    	database.loadRooms();
    	assertEquals(1, database.rooms.size()); 
    	assertEquals(109, database.rooms.get(0).getRoomID()); 
    }
    
    @Test
    public void testGetAvailableRoomsDoesNotReturnMaintenanceRooms() throws Exception {
    	Room maintenance = new Room(110, "A201", 70, "ACW", 
    			           RoomStatus.MAINTENANCE, new ArrayList<>());
        database.rooms.add(maintenance);
        database.storeRooms();
        ArrayList<Room> available = controller.getAvailableRooms();
        assertTrue(available.isEmpty());
    }
    
    @Test
    public void testGetAvailableRoomsReturnsOnlyAvailableRooms() throws Exception {

        database.rooms.add(new Room(111, "VHA", 100, "Vari Hall",
                RoomStatus.AVAILABLE, new ArrayList<>()));

        database.rooms.add(new Room(112, "CB101", 40, "CB",
                RoomStatus.CLOSED, new ArrayList<>()));

        database.rooms.add(new Room(113, "LSB101", 50, "LSB",
                RoomStatus.DISABLED, new ArrayList<>()));

        database.rooms.add(new Room(114, "A101", 30, "ACW",
                RoomStatus.MAINTENANCE, new ArrayList<>()));

        database.storeRooms();
        ArrayList<Room> available = controller.getAvailableRooms();

        assertEquals(1, available.size());
        assertEquals(111, available.get(0).getRoomID());
        assertEquals(RoomStatus.AVAILABLE,
                     available.get(0).getStatus());
    }
     

}
