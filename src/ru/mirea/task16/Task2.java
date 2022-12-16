package ru.mirea.task16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2 extends JFrame{
    JTextArea jta = new JTextArea("Off the record now, right?");
    JMenu menuFile = new JMenu("Choose the color");
    JMenu menuEdit = new JMenu("Choose the font");
    JMenuBar m1 = new JMenuBar();
    JMenuItem blue = new JMenuItem("Blue");
    JMenuItem red = new JMenuItem("Red");
    JMenuItem black = new JMenuItem("Black");
    JMenuItem tnr = new JMenuItem("Times new roman");
    JMenuItem sans = new JMenuItem("Sans serif");
    JMenuItem courier = new JMenuItem("Courier");

    Task2(){
        super("Task2");
        setLayout(new FlowLayout());
        setSize(500, 120);
        jta.setEditable(false);
        add(jta);
        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLACK);
            }
        });
        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.RED);
            }
        });
        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setForeground(Color.BLUE);
            }
        });
        tnr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("Times New Roman", Font.BOLD, 15));
            }
        });
        sans.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("MS Sans Serif", Font.BOLD, 15));
            }
        });
        courier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setFont(new Font("Courier New", Font.BOLD, 15));
            }
        });
        menuFile.add(black);
        menuFile.add(blue);
        menuFile.add(red);
        menuEdit.add(sans);
        menuEdit.add(tnr);
        menuEdit.add(courier);
        m1.add(menuFile);
        m1.add(menuEdit);
        setJMenuBar(m1);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Task2();
    }
}
