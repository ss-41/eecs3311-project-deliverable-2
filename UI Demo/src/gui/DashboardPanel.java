package gui;

import java.awt.GridLayout;

import javax.swing.*;

public class DashboardPanel extends JPanel {

    public DashboardPanel(){

        setLayout(new GridLayout(5,1,20,20));

        JButton booking = new JButton("Book Room");

        JButton myBookings = new JButton("My Bookings");

        JButton payment = new JButton("Payments");

        JButton logout = new JButton("Logout");

        add(new JLabel("Welcome!",SwingConstants.CENTER));
        add(booking);
        add(myBookings);
        add(payment);
        add(logout);

        booking.addActionListener(e->{

            MainWindow.getInstance().showPage("BOOKING");

        });

        payment.addActionListener(e->{

            MainWindow.getInstance().showPage("PAYMENT");

        });

        logout.addActionListener(e->{

            MainWindow.getInstance().showPage("LOGIN");

        });

    }

}