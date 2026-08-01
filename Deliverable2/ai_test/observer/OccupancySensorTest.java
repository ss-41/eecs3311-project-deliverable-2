package observer;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import dataModels.Room;
import dataModels.RoomStatus;

public class OccupancySensorTest {

    private Room room;
    private OccupancySensor sensor;

    @Before
    public void setup() {

        room = new Room(
                1,
                "ACE101",
                25,
                "ACE",
                RoomStatus.AVAILABLE,
                new ArrayList<Observer>());

        sensor = new OccupancySensor(room);
    }

    @Test
    public void testAvailableRoomOccupancy() {

        room.setStatus(RoomStatus.AVAILABLE);

        sensor.sendOccupancyData();

        assertEquals(
                RoomStatus.AVAILABLE,
                room.getStatus());
    }

    @Test
    public void testClosedRoomOccupancy() {

        room.setStatus(RoomStatus.CLOSED);

        sensor.sendOccupancyData();

        assertEquals(
                RoomStatus.CLOSED,
                room.getStatus());
    }

    @Test
    public void testMaintenanceOccupancy() {

        room.setStatus(RoomStatus.MAINTENANCE);

        sensor.sendOccupancyData();

        assertEquals(
                RoomStatus.CLOSED,
                room.getStatus());
    }

    @Test
    public void testDisabledOccupancy() {

        room.setStatus(RoomStatus.DISABLED);

        sensor.sendOccupancyData();

        assertEquals(
                RoomStatus.CLOSED,
                room.getStatus());
    }
}