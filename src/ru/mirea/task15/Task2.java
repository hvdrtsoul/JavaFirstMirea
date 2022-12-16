package ru.mirea.task15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 extends JFrame {
    String[] items = {"Russia", "Turkey", "China", "England"};

    Task2(){
        super("Task2");
        setLayout(new FlowLayout());
        setSize(720, 480);

        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox comboBox = (JComboBox) e.getSource();
                String item = (String) comboBox.getSelectedItem();

                switch (item){
                    case "Russia":
                        JOptionPane.showMessageDialog(null, "You're in Russia.", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "Turkey":
                        JOptionPane.showMessageDialog(null, "Ben türk. Sakin ol!", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "China":
                        JOptionPane.showMessageDialog(null, "You are in China! ++Social credit", "Alert", JOptionPane.INFORMATION_MESSAGE);
                        break;
                    case "England":
                        JOptionPane.showMessageDialog(null, "You're in England! It's time to drink tea! Is it?...", "Alert", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        };
        JComboBox comboBox = new JComboBox(items);
        comboBox.addActionListener(actionListener);
        add(comboBox);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}


