package controller;

import java.util.ArrayList;

import dataModels.Room;
import database.singleton.Database;
import dataModels.RoomStatus;

public class RoomController {

    private final Database database;


    public RoomController() {
        database = Database.getInstance();
    }


    public ArrayList<Room> getAvailableRooms() {

        try {
            database.loadRooms();

        } catch(Exception e) {
            e.printStackTrace();
        }


        ArrayList<Room> availableRooms =
                new ArrayList<>();


        for(Room room : database.rooms) {

            if(room.getStatus() == RoomStatus.AVAILABLE) {
                availableRooms.add(room);
            }

        }


        return availableRooms;
    }
    
    public boolean addRoom(Room room) {

        database.rooms.add(room);

        try {

            database.storeRooms();
            return true;

        } catch(Exception e) {

            e.printStackTrace();
            return false;
        }

    }


    public boolean deleteRoom(Room room) {

        try {

            database.deleteRoom(room);
            return true;

        } catch(Exception e) {

            e.printStackTrace();
            return false;
        }

    }

}