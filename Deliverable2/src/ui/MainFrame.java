package ui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;


    public MainFrame() {

        setTitle("YorkU Conference Room Scheduler");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);


        LoginPanel loginPanel = new LoginPanel(this);
        DashboardPanel dashboardPanel = new DashboardPanel(this);
        RegisterPanel registerPanel = new RegisterPanel(this);

        mainPanel.add(registerPanel,"REGISTER");
        mainPanel.add(loginPanel, "LOGIN");
        mainPanel.add(dashboardPanel, "DASHBOARD");


        add(mainPanel);

        cardLayout.show(mainPanel, "LOGIN");
    }


    public void showPanel(String panelName) {
        cardLayout.show(mainPanel, panelName);
    }


    public void addPanel(String name, JPanel panel) {
        mainPanel.add(panel, name);
    }

    
    public void showLogin() {
        cardLayout.show(mainPanel, "LOGIN");
    }
    
    public void showRegister() {
        cardLayout.show(mainPanel, "REGISTER");
    }

    public void showDashboard() {
        cardLayout.show(mainPanel, "DASHBOARD");
    }
}