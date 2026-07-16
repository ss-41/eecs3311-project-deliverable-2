package gui;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainWindow extends JFrame {

    private static MainWindow instance;

    private CardLayout cardLayout;
    private JPanel container;

    public static MainWindow getInstance() {

        if (instance == null){
            instance = new MainWindow();
    }
        return instance;
    }

    private MainWindow() {

        super("YorkU Conference Room Scheduler");

        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        container = new JPanel(cardLayout);

        container.add(new LoginPanel(), "LOGIN");
        container.add(new RegisterPanel(), "REGISTER");
        container.add(new DashboardPanel(), "DASHBOARD");
        container.add(new BookingPanel(), "BOOKING");
        container.add(new PaymentPanel(), "PAYMENT");
        container.add(new AdminPanel(), "ADMIN");

        add(container);

    }

    public void showPage(String page){

        cardLayout.show(container,page);

    }

}