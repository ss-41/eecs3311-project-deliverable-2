package gui;

import java.awt.GridLayout;

import javax.swing.*;

public class AdminPanel extends JPanel {

    public AdminPanel(){

        setLayout(new GridLayout(5,1,20,20));

        add(new JButton("Manage Rooms"));

        add(new JButton("Manage Users"));

        add(new JButton("Reports"));

        JButton logout = new JButton("Logout");

        add(logout);

        logout.addActionListener(e->{

            MainWindow.getInstance().showPage("LOGIN");

        });

    }

}