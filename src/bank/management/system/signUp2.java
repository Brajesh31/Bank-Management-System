package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class signUp2 extends JFrame implements ActionListener {
    @SuppressWarnings("rawtypes")
    JComboBox comboBox, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAdh;
    JRadioButton r1, r2;
    JButton next;
    String formNo;

    signUp2(String formNO) {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formNo = formNO;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(300, 30, 600, 60);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 60, 600, 60);
        add(l2);

        JLabel l3 = new JLabel("Religion: ");
        l3.setFont(new Font("Raleway", Font.BOLD, 18));
        l3.setBounds(100, 120, 100, 30);
        add(l3);

        String religion[] = { "Hindu", "Muslim", "Sikh", "Chirstian", "Other" };
        comboBox = new JComboBox<>(religion);
        comboBox.setBackground(new Color(252, 208, 208, 76));
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(350, 120, 320, 30);
        add(comboBox);

        JLabel l4 = new JLabel("Category: ");
        l4.setFont(new Font("Raleway", Font.BOLD, 18));
        l4.setBounds(100, 170, 100, 30);
        add(l4);

        String category[] = { "General", "OBC", "ST", "SC", "Other" };
        comboBox2 = new JComboBox<>(category);
        comboBox2.setBackground(new Color(252, 208, 208, 76));
        comboBox2.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox2.setBounds(350, 170, 320, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income: ");
        l5.setFont(new Font("Raleway", Font.BOLD, 18));
        l5.setBounds(100, 220, 100, 30);
        add(l5);

        String income[] = { "Null", "Less than 1 Lakh", "More than 1 Lakh", "More than 5 Lakh", "More than 10 Lakh",
                "More than 15 Lakh" };
        comboBox3 = new JComboBox<>(income);
        comboBox3.setBackground(new Color(252, 208, 208, 76));
        comboBox3.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox3.setBounds(350, 220, 320, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education: ");
        l6.setFont(new Font("Raleway", Font.BOLD, 18));
        l6.setBounds(100, 270, 100, 30);
        add(l6);

        String education[] = { "Null", "10th Pass", "12th Pass", "Graduation", "Post Graduation" };
        comboBox4 = new JComboBox<>(education);
        comboBox4.setBackground(new Color(252, 208, 208, 76));
        comboBox4.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox4.setBounds(350, 270, 320, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Ocupation: ");
        l7.setFont(new Font("Raleway", Font.BOLD, 18));
        l7.setBounds(100, 320, 140, 30);
        add(l7);

        String ocupation[] = { "Null", "Salaried", "Self-Employed", "Bussiness", "Agriculture", "Other" };
        comboBox5 = new JComboBox<>(ocupation);
        comboBox5.setBackground(new Color(252, 208, 208, 76));
        comboBox5.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox5.setBounds(350, 320, 320, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("Pan Number: ");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
        l8.setBounds(100, 370, 140, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 18));
        textPan.setBounds(350, 370, 320, 30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number: ");
        l9.setFont(new Font("Raleway", Font.BOLD, 18));
        l9.setBounds(100, 420, 180, 30);
        add(l9);

        textAdh = new JTextField();
        textAdh.setFont(new Font("Raleway", Font.BOLD, 18));
        textAdh.setBounds(350, 420, 320, 30);
        add(textAdh);

        JLabel l10 = new JLabel("Existing Account: ");
        l10.setFont(new Font("Raleway", Font.BOLD, 18));
        l10.setBounds(100, 470, 180, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 18));
        r1.setBackground(new Color(252, 208, 76));
        r1.setBounds(390, 470, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 18));
        r2.setBackground(new Color(252, 208, 76));
        r2.setBounds(490, 470, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Form No. : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 12));
        l11.setBounds(540, 10, 100, 30);
        add(l11);

        JLabel l13 = new JLabel(formNo);
        l13.setFont(new Font("Raleway", Font.BOLD, 12));
        l13.setBounds(600, 10, 100, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570, 540, 100, 30);
        next.addActionListener(this);
        add(next);

        setLayout(null);
        setSize(850, 700);
        setLocation(350, 10);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();
        String pan = textPan.getText();
        String adh = textAdh.getText();
        String eAccount = " ";
        if ((r1.isSelected())) {
            eAccount = "Yes";
        } else if ((r2.isSelected())) {
            eAccount = "No";
        }

        try {
            if (textPan.getText().equals("") || textAdh.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the Fields");
            } else {
                conn c1 = new conn();
                String q = "insert into SignUpTwo values('" + formNo + "', '" + rel + "','" + cate + "','" + inc + "','"
                        + edu + "', '" + occ + "','" + pan + "','" + adh + "','" + eAccount + "')";
                c1.statement.executeUpdate(q);
                new signUp3(formNo);
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new signUp2("");
    }
}
