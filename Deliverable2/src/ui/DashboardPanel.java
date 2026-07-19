package ui;

import javax.swing.*;
import java.awt.*;

public class DashboardPanel extends JPanel {

    public DashboardPanel(MainFrame frame) {

        setLayout(new BorderLayout());

        JLabel title = new JLabel(
                "YorkU Conference Room Scheduler",
                SwingConstants.CENTER);

        title.setFont(new Font("Arial", Font.BOLD, 24));

        add(title, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(3,2,20,20));

        JButton bookRoom = new JButton("Book Room");
        JButton myBookings = new JButton("My Bookings");
        JButton payments = new JButton("Payments");
        JButton admin = new JButton("Admin");
        JButton logout = new JButton("Logout");

        buttonPanel.add(bookRoom);
        buttonPanel.add(myBookings);
        buttonPanel.add(payments);
        buttonPanel.add(admin);
        buttonPanel.add(logout);

        add(buttonPanel, BorderLayout.CENTER);

        logout.addActionListener(e -> frame.showPanel("LOGIN"));

        bookRoom.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Booking page coming soon!"));

        myBookings.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Bookings page coming soon!"));

        payments.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Payment page coming soon!"));

        admin.addActionListener(e ->
                JOptionPane.showMessageDialog(this,
                        "Admin page coming soon!"));

    }
}