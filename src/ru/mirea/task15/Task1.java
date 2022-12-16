package ru.mirea.task15;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Task1 extends JFrame{
    JTextField textField1 = new JFormattedTextField();
    JTextField textField2 = new JFormattedTextField();

    JButton button1 = new JButton("Sum");
    JButton button2 = new JButton("Substract");
    JButton button3 = new JButton("Divide");
    JButton button4 = new JButton("Multiply");

    Task1(){
        super("Task1");
        setLayout(new FlowLayout());
        setSize(720, 480);

        add(new JLabel("A"));
        add(textField1);

        add(new JLabel("B"));
        add(textField2);

        add(button1);
        add(button2);
        add(button3);
        add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "Result is " + (a + b), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Error " + exception.getLocalizedMessage(), "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "Result is " + (a - b), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Error " + exception.getLocalizedMessage(), "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "Result is " + (a / b), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Error " + exception.getLocalizedMessage(), "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double a = Double.parseDouble(textField1.getText());
                    double b = Double.parseDouble(textField2.getText());

                    JOptionPane.showMessageDialog(null, "Result is " + (a * b), "Alert", JOptionPane.INFORMATION_MESSAGE);
                } catch(Exception exception){
                    JOptionPane.showMessageDialog(null, "Error " + exception.getLocalizedMessage(), "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task1();
    }
}
