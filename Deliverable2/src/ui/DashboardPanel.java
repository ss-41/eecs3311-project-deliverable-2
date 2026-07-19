package ui;

import javax.swing.*;
import java.awt.*;

import dataModels.User;

public class DashboardPanel extends JPanel {


    private JLabel welcomeLabel;
    private JLabel userInfoLabel;
    private JButton admin;


    public DashboardPanel(MainFrame frame) {


        setLayout(new BorderLayout());


        JPanel topPanel = new JPanel(
                new GridLayout(3,1)
        );


        JLabel title = new JLabel(
                "YorkU Conference Room Scheduler",
                SwingConstants.CENTER
        );

        title.setFont(
                new Font("Arial",
                Font.BOLD,
                24)
        );


        welcomeLabel = new JLabel(
                "Welcome!",
                SwingConstants.CENTER
        );


        userInfoLabel = new JLabel(
                "",
                SwingConstants.CENTER
        );


        topPanel.add(title);
        topPanel.add(welcomeLabel);
        topPanel.add(userInfoLabel);


        add(topPanel, BorderLayout.NORTH);



        JPanel buttonPanel =
                new JPanel(
                new GridLayout(3,2,20,20));


        JButton bookRoom =
                new JButton("Book Room");


        JButton myBookings =
                new JButton("My Bookings");


        JButton payments =
                new JButton("Payments");


        admin = new JButton("Admin");
        admin.setVisible(false);


        JButton logout =
                new JButton("Logout");



        buttonPanel.add(bookRoom);
        buttonPanel.add(myBookings);
        buttonPanel.add(payments);
        buttonPanel.add(admin);
        buttonPanel.add(logout);


        add(buttonPanel, BorderLayout.CENTER);



        logout.addActionListener(e -> {

            frame.setCurrentUser(null);

            frame.showPanel("LOGIN");

        });



        bookRoom.addActionListener(e ->
                frame.showPanel("BOOKING"));



        myBookings.addActionListener(e ->
        		frame.showPanel("MY_BOOKINGS"));



        payments.addActionListener(e ->
                frame.showPanel("PAYMENT"));



        admin.addActionListener(e ->
                frame.showPanel("ADMIN"));

    }



    public void refreshUser(User user) {

        if(user != null) {

            welcomeLabel.setText(
                    "Welcome, "
                    + user.getName()
            );


            userInfoLabel.setText(
                    user.getEmail()
                    + " | "
                    + user.getStud_OR_orgID()
            );

            admin.setVisible(user.isAdmin());

        }

    }

}