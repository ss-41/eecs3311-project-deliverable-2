package gui;

import java.awt.GridLayout;

import javax.swing.*;

public class RegisterPanel extends JPanel {

    public RegisterPanel(){

        setLayout(new GridLayout(9,2,10,10));

        add(new JLabel("Name"));
        add(new JTextField());

        add(new JLabel("Email"));
        add(new JTextField());

        add(new JLabel("Password"));
        add(new JPasswordField());

        add(new JLabel("Confirm Password"));
        add(new JPasswordField());

        add(new JLabel("Account Type"));

        JComboBox<String> type =
                new JComboBox<>(new String[]{
                        "Student",
                        "Faculty",
                        "Staff",
                        "Partner"
                });

        add(type);

        JButton register = new JButton("Register");
        JButton back = new JButton("Back");

        add(register);
        add(back);

        back.addActionListener(e->{

            MainWindow.getInstance().showPage("LOGIN");

        });

    }

}