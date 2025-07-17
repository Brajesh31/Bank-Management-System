package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class mini extends JFrame implements ActionListener {
    String pin;
    JButton b1;

    mini(String pin) {
        this.pin = pin;
        JLabel label1 = new JLabel();
        label1.setBounds(20, 100, 450, 450);
        add(label1);

        JLabel label2 = new JLabel("Bank of Vidisha");
        label2.setFont(new Font("System", Font.BOLD, 15));
        label2.setBounds(200, 20, 200, 20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setFont(new Font("System", Font.BOLD, 15));
        label3.setBounds(20, 50, 300, 20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setFont(new Font("System", Font.BOLD, 15));
        label4.setBounds(20, 550, 300, 20);
        add(label4);

        try {
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from login where PIN = '" + pin + "'");
            while (resultSet.next()) {
                label3.setText("Card Number: " + resultSet.getString("card_no").substring(0, 4) + "XXXXXXXXXXXX"
                        + resultSet.getString("card_no").substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int balance = 0;
            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from deposit where pin ='" + pin + "'");
            while (resultSet.next()) {
                label1.setText(label1.getText() + "<html>" + resultSet.getString("date")
                        + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type")
                        + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                } else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs. " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }
        b1 = new JButton("Exit");
        b1.setBounds(20, 600, 100, 25);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        getContentPane().setBackground(new Color(255, 204, 204));
        setSize(500, 700);
        setLayout(null);
        setLocation(350, 5);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");
    }
}
