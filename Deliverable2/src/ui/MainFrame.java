package ui;

import javax.swing.*;
import java.awt.*;
import dataModels.User;

public class MainFrame extends JFrame {

    private CardLayout cardLayout;
    private JPanel mainPanel;
    private User currentUser;
    private DashboardPanel dashboardPanel;
    private MyBookingsPanel myBookingsPanel;

    public MainFrame() {

        setTitle("YorkU Conference Room Scheduler");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initializeDatabase();


        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);


        LoginPanel loginPanel = new LoginPanel(this);
        dashboardPanel = new DashboardPanel(this);
        RegisterPanel registerPanel = new RegisterPanel(this);
        BookingPanel bookingPanel = new BookingPanel(this);
        PaymentPanel paymentPanel = new PaymentPanel(this);
        AdminPanel adminPanel = new AdminPanel(this);
        myBookingsPanel = new MyBookingsPanel(this);

        mainPanel.add(registerPanel,"REGISTER");
        mainPanel.add(loginPanel, "LOGIN");
        mainPanel.add(dashboardPanel, "DASHBOARD");
        mainPanel.add(bookingPanel,"BOOKING");
        mainPanel.add(paymentPanel,"PAYMENT");
        mainPanel.add(adminPanel,"ADMIN");
        mainPanel.add(myBookingsPanel,"MY_BOOKINGS");


        add(mainPanel);

        cardLayout.show(mainPanel, "LOGIN");
    }


    public void showPanel(String panelName) {
        if(panelName.equals("DASHBOARD")) {
            dashboardPanel.refreshUser(currentUser);
        }
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
    
    
    //User getters
    public void setCurrentUser(User user) {
        this.currentUser = user;
    }

    public User getCurrentUser() {
        return currentUser;
    }
    
    
    public DashboardPanel getDashboardPanel() {
        return dashboardPanel;
    }
    
    private void initializeDatabase() {

        try {

            database.singleton.Database db =
                    database.singleton.Database.getInstance();

            db.loadUsers();
            db.loadRooms();
            db.loadBookings();

        } catch(Exception e) {

            e.printStackTrace();

        }

    }
    
    
}