package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import controller.BookingController;
import dataModels.Booking;


public class MyBookingsPanel extends JPanel {


    private JTextArea bookingArea;


    private BookingController controller =
            new BookingController();



    public MyBookingsPanel(MainFrame frame) {


        setLayout(new BorderLayout());



        JLabel title =
                new JLabel(
                        "My Bookings",
                        SwingConstants.CENTER);



        add(title,BorderLayout.NORTH);



        bookingArea =
                new JTextArea();


        bookingArea.setEditable(false);



        add(
                new JScrollPane(bookingArea),
                BorderLayout.CENTER);



        JButton refresh =
                new JButton("Refresh");


        JButton back =
                new JButton("Back");



        JPanel buttons =
                new JPanel();


        buttons.add(refresh);

        buttons.add(back);



        add(buttons,BorderLayout.SOUTH);



        refresh.addActionListener(e ->
                loadBookings()
        );



        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );


    }




    private void loadBookings() {

        bookingArea.setText("");


        ArrayList<Booking> bookings =
                controller.getBookings();


        for(Booking booking : bookings) {


            bookingArea.append(
                    "Booking ID: "
                    + booking.getBookingID()

                    + "\nRoom ID: "
                    + booking.getRoomID()

                    + "\nDeposit: "
                    + booking.getDeposit()

                    + "\nStatus: "
                    + booking.getBookingStatus()

                    + "\nStart: "
                    + booking.getBookingTime()

                    + "\nEnd: "
                    + booking.getBookingEndTime()

                    + "\n\n"
            );

        }

    }

}