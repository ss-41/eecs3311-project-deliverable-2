package utils;

import java.io.FileWriter;
import java.io.IOException;
import dataModels.Booking;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class BookingCSVManager {


    private static final String FILE =
            "src/csv files/booking.csv";


    public static boolean saveBooking(Booking booking) {


        try(FileWriter writer =
                new FileWriter(FILE,true)) {


            writer.write(
                    booking.getBookingID()
                    + ","
                    + booking.getDeposit()
                    + ","
                    + booking.getStatus()
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


            // skip header
            reader.readLine();


            String line;


            while((line = reader.readLine()) != null) {


                bookings.add(
                        line.split(",")
                );

            }


        } catch(IOException e) {

            e.printStackTrace();

        }


        return bookings;
    }

}