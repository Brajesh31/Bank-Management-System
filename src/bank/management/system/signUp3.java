package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class signUp3 extends JFrame implements ActionListener {
    JButton s, c;
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    String formNO;

    signUp3(String formNO) {
        this.formNO = formNO;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(280, 70, 400, 40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 140, 200, 30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBounds(100, 180, 150, 30);
        r1.setBackground(new Color(215, 252, 252));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBounds(350, 180, 300, 30);
        r2.setBackground(new Color(215, 252, 252));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBounds(100, 220, 250, 30);
        r3.setBackground(new Color(215, 252, 252));
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBounds(350, 220, 300, 30);
        r4.setBackground(new Color(215, 252, 252));
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 300, 300, 30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Raleway", Font.BOLD, 12));
        l5.setBounds(100, 330, 400, 20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(330, 300, 350, 30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on ATM card/cheque Book and statements)");
        l7.setFont(new Font("Raleway", Font.BOLD, 12));
        l7.setBounds(330, 330, 400, 20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 370, 350, 30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(330, 370, 200, 30);
        add(l9);

        JLabel l10 = new JLabel("(4-Digit Password)");
        l10.setFont(new Font("Raleway", Font.BOLD, 12));
        l10.setBounds(100, 400, 400, 20);
        add(l10);

        JLabel l11 = new JLabel("Services Required:");
        l11.setFont(new Font("Raleway", Font.BOLD, 18));
        l11.setBounds(100, 450, 350, 30);
        add(l11);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        c1.setBackground(new Color(215, 252, 252));
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        c2.setBackground(new Color(215, 252, 252));
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        c3.setBackground(new Color(215, 252, 252));
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        c4.setBackground(new Color(215, 252, 252));
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        c5.setBackground(new Color(215, 252, 252));
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        c6.setBackground(new Color(215, 252, 252));
        add(c6);

        JCheckBox c7 = new JCheckBox(
                "I hereby declares that the above entered details correct to the best of my Knowledge", true);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 635, 600, 20);
        c7.setBackground(new Color(215, 252, 252));
        add(c7);

        JLabel l12 = new JLabel("Form No. : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 12));
        l12.setBounds(540, 10, 100, 30);
        add(l12);

        JLabel l13 = new JLabel(formNO);
        l13.setFont(new Font("Raleway", Font.BOLD, 12));
        l13.setBounds(600, 10, 100, 30);
        add(l13);

        s = new JButton("Submit");
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.addActionListener(this);
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBounds(420, 660, 100, 30);
        add(s);

        c = new JButton("Cancel");
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.addActionListener(this);
        c.setBounds(550, 660, 100, 30);
        add(c);

        getContentPane().setBackground(new Color(215, 252, 252));
        setSize(850, 850);
        setLayout(null);
        setLocation(400, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        } else if (r3.isSelected()) {
            atype = "Current Account";
        } else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000l) + 1409963000000000l;
        String cardNo = "" + Math.abs(first7);
        long first3 = (ran.nextLong() % 9000l) + 1000l;
        String pin = "" + Math.abs(first3);
        String fac = "";
        if (c1.isSelected()) {
            fac = fac + "ATM CARD";
        } else if (c2.isSelected()) {
            fac = fac + "Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac + "Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac + "Email Alerts";
        } else if (c5.isSelected()) {
            fac = fac + "Cheque Book";
        } else if (c6.isSelected()) {
            fac = fac + "E-Statement";
        }
        try {
            if ((e.getSource() == s)) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the Fields");
                } else {
                    conn c1 = new conn();
                    String q1 = "insert into signupthree values('" + formNO + "', '" + atype + "', '" + cardNo + "','"
                            + pin + "','" + fac + "')";
                    String q2 = "insert into login values('" + formNO + "','" + cardNo + "','" + pin + "')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardNo + "\n  PIN: " + pin);
                    new deposit(pin);
                    setVisible(false);
                }
            } else if (e.getSource() == c) {
                System.exit(0);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signUp3("");
    }
}
