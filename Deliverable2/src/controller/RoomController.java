package controller;

import java.io.*;
import java.util.ArrayList;

public class RoomController {


    private static final String FILE =
            "csv_files/room.csv";


    public ArrayList<String[]> getAvailableRooms() {

        ArrayList<String[]> rooms =
                new ArrayList<>();


        try(BufferedReader reader =
                new BufferedReader(
                        new FileReader(FILE))) {


            // skip header
            reader.readLine();


            String line;


            while((line = reader.readLine()) != null) {


                String[] data =
                        line.split(",");


                if(data.length >= 5
                        && data[4].equals("ACTIVE")) {


                    rooms.add(data);

                }

            }


        } catch(IOException e) {

            e.printStackTrace();

        }


        return rooms;

    }

}