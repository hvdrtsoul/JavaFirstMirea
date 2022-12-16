package ru.mirea.task16;

import javax.swing.*;

public class Task3 extends JFrame {
    JLabel label1 = new JLabel("Service: ");
    JLabel label2 = new JLabel("User name: ");
    JLabel label3 = new JLabel("Password: ");

    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();

    Task3(){
        super("Password application");
        setLayout(null);
        setSize(300, 170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        label1.setBounds(10, 10, 100, 20);
        label2.setBounds(10, 40, 100, 20);
        label3.setBounds(10, 70, 100, 20);

        textField1.setBounds(120, 10, 150, 20);
        textField2.setBounds(120, 40, 150, 20);
        textField3.setBounds(120, 70, 150, 20);

        add(label1);
        add(label2);
        add(label3);
        add(textField1);
        add(textField2);
        add(textField3);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task3();
    }
}
