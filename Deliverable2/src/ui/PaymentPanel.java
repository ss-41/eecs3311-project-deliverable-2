package ui;

import payment.strategy.CreditCard;
import payment.strategy.DebitCard;
import payment.strategy.InstitutionalBilling;
import payment.strategy.Payment;
import payment.strategy.PaymentStrategy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class PaymentPanel extends JPanel {

    public PaymentPanel(MainFrame frame) {

        setLayout(new BorderLayout());

        JLabel title =
                new JLabel(
                        "Payment",
                        SwingConstants.CENTER
                );

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        24
                )
        );

        add(title, BorderLayout.NORTH);

        JPanel panel =
                new JPanel(
                        new GridLayout(0, 2, 10, 10)
                );

        // Amount
        JLabel amountLabel = new JLabel("Payment Amount ($):");
        JTextField amountField = new JTextField("20.00"); // Change to actual amount later

        // Payment Methods
        JRadioButton credit =
                new JRadioButton("Credit Card");

        JRadioButton debit =
                new JRadioButton("Debit Card");

        JRadioButton billing =
                new JRadioButton("Institutional Billing");

        ButtonGroup group = new ButtonGroup();
        group.add(credit);
        group.add(debit);
        group.add(billing);

        // Card Details
        JLabel cardNumberLabel = new JLabel("Card Number:");
        JTextField cardNumberField = new JTextField();

        JLabel cardHolderLabel = new JLabel("Card Holder:");
        JTextField cardHolderField = new JTextField();

        // Institutional Billing
        JLabel institutionLabel = new JLabel("Institution Number:");
        JTextField institutionField = new JTextField();

        institutionLabel.setVisible(false);
        institutionField.setVisible(false);

        // Buttons
        JButton confirm =
                new JButton("Confirm Payment");

        JButton back =
                new JButton("Back");

        // Layout
        panel.add(amountLabel);
        panel.add(amountField);

        panel.add(credit);
        panel.add(new JLabel());

        panel.add(debit);
        panel.add(new JLabel());

        panel.add(billing);
        panel.add(new JLabel());

        panel.add(cardNumberLabel);
        panel.add(cardNumberField);

        panel.add(cardHolderLabel);
        panel.add(cardHolderField);

        panel.add(institutionLabel);
        panel.add(institutionField);

        panel.add(confirm);
        panel.add(back);

        add(panel, BorderLayout.CENTER);

        // Show/Hide fields depending on payment type
        ActionListener paymentSelection = e -> {

            boolean cardSelected =
                    credit.isSelected() || debit.isSelected();

            cardNumberLabel.setVisible(cardSelected);
            cardNumberField.setVisible(cardSelected);

            cardHolderLabel.setVisible(cardSelected);
            cardHolderField.setVisible(cardSelected);

            institutionLabel.setVisible(billing.isSelected());
            institutionField.setVisible(billing.isSelected());

            revalidate();
            repaint();
        };

        credit.addActionListener(paymentSelection);
        debit.addActionListener(paymentSelection);
        billing.addActionListener(paymentSelection);

        // Confirm Payment
        confirm.addActionListener(e -> {

            try {

                double amount =
                        Double.parseDouble(amountField.getText());

                if (amount <= 0) {
                    throw new NumberFormatException();
                }

                PaymentStrategy strategy;

                String method;

                if (credit.isSelected()) {

                    strategy = new CreditCard(
                            cardNumberField.getText(),
                            cardHolderField.getText());

                    method = "Credit Card";

                } else if (debit.isSelected()) {

                    strategy = new DebitCard(
                            cardNumberField.getText(),
                            cardHolderField.getText());

                    method = "Debit Card";

                } else if (billing.isSelected()) {

                    strategy = new InstitutionalBilling(
                            institutionField.getText());

                    method = "Institutional Billing";

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Please select a payment method.");

                    return;
                }

                Payment payment =
                        new Payment(
                                1,          // paymentID
                                1,          // userID
                                amount,
                                strategy
                        );

                if (payment.processPayment()) {

                    JOptionPane.showMessageDialog(
                            this,
                            "Payment successful using "
                                    + method
                    );

                } else {

                    JOptionPane.showMessageDialog(
                            this,
                            "Payment failed."
                    );
                }

            } catch (NumberFormatException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please enter a valid payment amount."
                );
            }

        });

        back.addActionListener(e ->
                frame.showPanel("DASHBOARD")
        );
    }
}