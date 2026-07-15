package gui;

import java.awt.GridLayout;

import javax.swing.*;

public class BookingPanel extends JPanel {

    public BookingPanel(){

        setLayout(new GridLayout(8,2,10,10));

        add(new JLabel("Building"));
        add(new JComboBox<>());

        add(new JLabel("Room"));
        add(new JComboBox<>());

        add(new JLabel("Date"));
        add(new JTextField());

        add(new JLabel("Start Time"));
        add(new JTextField());

        add(new JLabel("Duration"));
        add(new JTextField());

        JButton book = new JButton("Book");

        JButton back = new JButton("Back");

        add(book);
        add(back);

        back.addActionListener(e->{

            MainWindow.getInstance().showPage("DASHBOARD");

        });

    }

}