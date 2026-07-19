package gui;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import payment.strategy.CreditCard;
import payment.strategy.DebitCard;
import payment.strategy.InstitutionalBilling;
import payment.strategy.Payment;
import payment.strategy.PaymentStrategy;

public class PaymentPanel extends JPanel {

    private JComboBox<String> paymentMethodBox;
    private JTextField numberField;
    private JTextField cardHolderField;
    private JTextField amountField;

    public PaymentPanel() {

        setLayout(new GridLayout(6, 2, 10, 10));

        add(new JLabel("Payment Method:"));

        paymentMethodBox = new JComboBox<>(
                new String[] {
                        "Credit Card",
                        "Debit Card",
                        "Institutional Billing"
                }
        );

        add(paymentMethodBox);

        add(new JLabel("Card/Institution Number:"));

        numberField = new JTextField();
        add(numberField);

        add(new JLabel("Cardholder Name:"));

        cardHolderField = new JTextField();
        add(cardHolderField);

        add(new JLabel("Amount:"));

        amountField = new JTextField();
        add(amountField);

        JButton payButton = new JButton("Pay");
        JButton backButton = new JButton("Back");

        add(payButton);
        add(backButton);

        payButton.addActionListener(e -> processPayment());

    
        backButton.addActionListener(e ->
                MainWindow.getInstance().showPage("DASHBOARD")
        );

       
        paymentMethodBox.addActionListener(e ->
                updateFieldsForPaymentMethod()
        );
    }

    private void processPayment() {

        String selectedMethod =
                (String) paymentMethodBox.getSelectedItem();

        String number = numberField.getText().trim();
        String cardHolderName = cardHolderField.getText().trim();

        double amount;

     
        try {
            amount = Double.parseDouble(
                    amountField.getText().trim()
            );
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(
                    this,
                    "Enter a valid payment amount.",
                    "Invalid Amount",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        if (amount <= 0) {
            JOptionPane.showMessageDialog(
                    this,
                    "Amount must be greater than zero.",
                    "Invalid Amount",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        if (number.isBlank()) {
            JOptionPane.showMessageDialog(
                    this,
                    "Enter a card or institution number.",
                    "Incomplete information",
                    JOptionPane.ERROR_MESSAGE
            );

            return;
        }

        PaymentStrategy strategy;
        switch (selectedMethod) {

            case "Credit Card":

                if (cardHolderName.isBlank()) {
                    showCardholderError();
                    return;
                }

                strategy = new CreditCard(
                        number,
                        cardHolderName
                );

                break;

            case "Debit Card":

                if (cardHolderName.isBlank()) {
                    showCardholderError();
                    return;
                }

                strategy = new DebitCard(
                        number,
                        cardHolderName
                );

                break;

            case "Institutional Billing":

                strategy = new InstitutionalBilling(number);

                break;

            default:

                JOptionPane.showMessageDialog(
                        this,
                        "Choose a payment method.",
                        "Payment Method Required",
                        JOptionPane.ERROR_MESSAGE
                );

                return;
        }

        
        int paymentID = 1;
        int userID = 1;

        Payment payment = new Payment(
                paymentID,
                userID,
                amount,
                strategy
        );

        boolean successful = payment.processPayment();

        if (successful) {
            JOptionPane.showMessageDialog(
                    this,
                    "Payment of $"
                            + String.format("%.2f", amount)
                            + " was successful.",
                    "Payment Successful",
                    JOptionPane.INFORMATION_MESSAGE
            );

            clearFields();

        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "The payment could not be processed.",
                    "Payment Failed",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }

    private void showCardholderError() {
        JOptionPane.showMessageDialog(
                this,
                "Enter the cardholder's name.",
                "Incomplete Information",
                JOptionPane.ERROR_MESSAGE
        );
    }

    private void updateFieldsForPaymentMethod() {

        String selectedMethod =
                (String) paymentMethodBox.getSelectedItem();

        boolean cardPayment =
                "Credit Card".equals(selectedMethod)
                || "Debit Card".equals(selectedMethod);

        cardHolderField.setEnabled(cardPayment);

        if (!cardPayment) {
            cardHolderField.setText("");
        }
    }

    private void clearFields() {
        numberField.setText("");
        cardHolderField.setText(""); 
        amountField.setText("");
    }
}