package utils;


import java.io.*;
import java.util.ArrayList;

import dataModels.Booking;



public class BookingCSVManager {


    private static final String FILE = "csv_files/booking.csv";



    public static boolean saveBooking(Booking booking) {


        try(FileWriter writer =
                new FileWriter(FILE,true)) {



            writer.write(
                    booking.getBookingID()
                    + ","
                    + booking.getRoomID()
                    + ","
                    + booking.getDeposit()
                    + ","
                    + booking.getBookingStatus()
                    + ","
                    + booking.getBookingTime()
                    + ","
                    + booking.getBookingEndTime()
                    + "\n"
            );


            return true;


        } catch(IOException e) {

            e.printStackTrace();

            return false;
        }

    }




    public static ArrayList<String[]> loadBookings() {


        ArrayList<String[]> bookings =
                new ArrayList<>();


        try(BufferedReader reader =
                new BufferedReader(
                        new FileReader(FILE))) {



            reader.readLine();



            String line;


            while((line = reader.readLine()) != null) {


                if(!line.isBlank()) {

                    bookings.add(
                            line.split(",")
                    );

                }

            }



        } catch(IOException e) {

            e.printStackTrace();

        }



        return bookings;

    }

}