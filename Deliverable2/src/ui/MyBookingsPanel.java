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


    private MainFrame frame;



    public MyBookingsPanel(MainFrame frame) {


        this.frame = frame;


        setLayout(new BorderLayout());



        JLabel title =
                new JLabel(
                        "My Bookings",
                        SwingConstants.CENTER
                );


        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );



        add(title, BorderLayout.NORTH);



        bookingArea = new JTextArea();

        bookingArea.setEditable(false);



        add(
                new JScrollPane(bookingArea),
                BorderLayout.CENTER
        );



        JPanel buttons =
                new JPanel();



        JButton refresh =
                new JButton("Refresh");


        JButton back =
                new JButton("Back");



        buttons.add(refresh);

        buttons.add(back);



        add(buttons, BorderLayout.SOUTH);



        refresh.addActionListener(e ->
                loadBookings()
        );



        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );


    }




    private void loadBookings() {


        bookingArea.setText("");



        if(frame.getCurrentUser() == null) {

            bookingArea.append(
                    "Please login first."
            );

            return;

        }




        ArrayList<Booking> bookings =
                controller.getBookings();



        boolean found = false;




        for(Booking booking : bookings) {



            if(booking.getUserID()
                    == frame.getCurrentUser().getUserID()) {



                bookingArea.append(
                        booking.toString()
                        + "\n\n"
                );



                found = true;


            }


        }




        if(!found) {


            bookingArea.append(
                    "No bookings found."
            );


        }


    }


}