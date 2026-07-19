package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import controller.BookingController;


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



        ArrayList<String[]> bookings =
                controller.getBookings();



        for(String[] booking : bookings) {


            bookingArea.append(
                    "Booking ID: "
                    + booking[0]

                    + "\nRoom ID: "
                    + booking[1]

                    + "\nDeposit: "
                    + booking[2]

                    + "\nStatus: "
                    + booking[3]

                    + "\nStart: "
                    + booking[4]

                    + "\nEnd: "
                    + booking[5]

                    + "\n\n"
            );

        }

    }

}