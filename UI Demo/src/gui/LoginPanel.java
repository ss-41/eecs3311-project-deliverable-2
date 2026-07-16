package gui;

import java.awt.GridLayout;

import javax.swing.*;

public class LoginPanel extends JPanel {

    public LoginPanel(){

        setLayout(new GridLayout(6,1,10,10));

        JLabel title = new JLabel("YorkU Conference Room Scheduler",SwingConstants.CENTER);

        JTextField email = new JTextField();

        JPasswordField password = new JPasswordField();

        JButton login = new JButton("Login");

        JButton register = new JButton("Create Account");

        add(title);
        add(new JLabel("Email"));
        add(email);
        add(new JLabel("Password"));
        add(password);

        JPanel buttons = new JPanel();

        buttons.add(login);
        buttons.add(register);

        add(buttons);

        login.addActionListener(e->{

            MainWindow.getInstance().showPage("DASHBOARD");

        });

        register.addActionListener(e->{

            MainWindow.getInstance().showPage("REGISTER");

        });

    }

}